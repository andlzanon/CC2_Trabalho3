package trabalho3;

import trabalho3.GrafosParser.*;

import static trabalho3.GrafosSemantico.pilhaDeTabelas;

/**
 * A classe MergeTipos atua como se fosse um visitor para a verificacao de tipos
 * Assim, começanco da expressao, ele desce na árvore ate achar o tipo unico em caso de atribuicao x<-y ou x<-4
 * Quando existem mais de um fator faz-se um merge dos mesmo por meio do metodo regraTipos
 */
public class MergeTipos {

    //comeca pela expressao
    public static String mergeTipos(ExpressaoContext ctx){
        String tipo = "erro";

        //se existe um >, < , = o tipo sera logico e conseguentemente sera um tipo erro
        //ja que a gramtica nao suporta valores logicos
        if(ctx.op_opcional() != null){
            if(ctx.op_opcional().op_relacional()!=null){
                tipo = "logico";
            }
            else{
                tipo = mergeTipos(ctx.exp_aritmetica());
            }
        }
        else
            tipo = mergeTipos(ctx.exp_aritmetica());

        return tipo;
    }

    public static String mergeTipos(Exp_aritmeticaContext ctx) {

        String tipo = mergeTipos(ctx.termo());

        //se nao existir outros termos retorna o tipo
        if(ctx.outros_termos() == null){
            return tipo;
        }
        else{
            //se existir e necessario juntar a String tipo com o tipo da regra termo dentro de outros_termos
            for(int i = 0; i < ctx.outros_termos().termo().size(); i++){
                tipo = regraTipos(tipo, mergeTipos(ctx.outros_termos().termo().get(i)));
            }

        }

        return tipo;
    }

    //analogo a anteriores
    public static String mergeTipos(TermoContext ctx){

        String tipo = mergeTipos(ctx.fator());

        if(ctx.outros_fatores() != null)
            return tipo;
        else{
            for(int i = 0; i < ctx.outros_fatores().fator().size(); i++){
                tipo = regraTipos(tipo, mergeTipos(ctx.outros_fatores().fator().get(i)));
            }
        }

        return tipo;
    }

    public static String mergeTipos(FatorContext ctx){
        String tipo = mergeTipos(ctx.parcela());

        if(ctx.outras_parcelas() == null) {
            return tipo;
        }
        else {
            for(int i = 0; i < ctx.outras_parcelas().parcela().size(); i++) {
                tipo = regraTipos(tipo, mergeTipos(ctx.outras_parcelas().parcela().get(i)));
            }
        }

        return tipo;
    }

    public static String mergeTipos(ParcelaContext ctx){
        //incia tipo
        String tipo =  "";
        //se inteiro nao e null o tipo e int
        if(ctx.INTEIRO() != null)
            tipo = "int";
        //se houver um identificador entao o tipo e o do identificador
        else if(ctx.IDENT() != null){
            tipo = pilhaDeTabelas.topo().gettipoVar(ctx.IDENT().getText());
            //se identificador e do tipo vetor, entao na vdd seu tipo e o tipo dos seus elementos
            //entretanto, se nao foi setado, seu tipo e vetor
            //try para caso de variavel nao delcarada e que consequentemente nao tera tipo na pilhaDeTabelas
            try{
                if(tipo.equals("vetor") && !pilhaDeTabelas.topo().getTipo(ctx.IDENT().getText()).equals("")){
                    tipo = pilhaDeTabelas.topo().getTipo(ctx.IDENT().getText());
                }
            }catch (Exception e){

            }

        }

        //caso existir instrucao com retorno
        else if(ctx.instrucoes_com_retorno() != null){
            // se for get_peso, get_custo_ou qtade_vert entao o tipo e inteiro
            if(ctx.getText().startsWith("get_peso") || ctx.getText().startsWith("get_custo_para_vertice") ||
                    ctx.getText().startsWith("qtde_vert"))
                tipo = "int";
            //senao e o tipo dos elementos do vetor do desempilha e desenfila
            else if(ctx.getText().startsWith("desempilha"))
                tipo = pilhaDeTabelas.topo().getTipo(ctx.instrucoes_com_retorno().pdem_vetor.getText());
            else if(ctx.getText().startsWith("desenfila"))
                tipo = pilhaDeTabelas.topo().getTipo(ctx.instrucoes_com_retorno().pden_vetor.getText());
            else if(ctx.getText().startsWith("tamanho_vetor"))
                tipo = "int";
        }
        // instrcao de vetores retorna um vetor
        else if(ctx.instrucoes_de_vetores() != null)
            tipo = "vetor";
        //tipo e valor da expressao
        else
            tipo = mergeTipos(ctx.expressao());

        return tipo;
    }

    public static String regraTipos(String tipo1, String tipo2) {
        //try para caso de atribuicao em variavel nao declarada que da NullPointerException
        try{
            if(tipo1.equals(tipo2)){
                return tipo1;
            }
            else {
                return "erro";
            }
        }catch (Exception e){

        }

        return "erro";

    }

}
