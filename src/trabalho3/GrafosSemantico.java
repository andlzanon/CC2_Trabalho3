package trabalho3;

import org.antlr.v4.runtime.Token;

/**
 * Created by Andre on 20/11/2017.
 */
public class GrafosSemantico extends GrafosBaseVisitor<String> {

    String grupo;
    static PilhaDeTabelas pilhaDeTabelas;
    //declaracao global de tipo para facilitar em momentos como em declaracoes de funcoes e procediemntos
    String tipo;
    SaidaParser sp;
    Mensagens errosSemanticos;

    public GrafosSemantico(SaidaParser sp){
        this.sp = sp;
        grupo = "<619922_619795_619841_552437>";
        errosSemanticos = new Mensagens(sp);
        pilhaDeTabelas = new PilhaDeTabelas();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
    }

    // algoritmo :	'declaracoes' declaracao 'inicio' codigo 'fim' ;
    @Override
    public String visitAlgoritmo(GrafosParser.AlgoritmoContext ctx) {
        if(ctx.children != null){
            visitDeclaracao(ctx.declaracao());
            visitCodigo(ctx.codigo());
        }
        return null;
    }

    //declaracao : variavel declaracao | ;
    @Override
    public String visitDeclaracao(GrafosParser.DeclaracaoContext ctx) {
        if(ctx.children != null){
            visitVariavel(ctx.variavel());
            visitDeclaracao(ctx.declaracao());
        }
        return null;
    }

    // variavel : tipo IDENT mais_variavel ;
    @Override
    public String visitVariavel(GrafosParser.VariavelContext ctx) {
        if(ctx.children != null){
            tipo = visitTipo(ctx.tipo());

            //verifica se variavel esta na tabela de simbolos. se nao esta adiciona na tabela
            if(pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                errosSemanticos.erroVariavelJaDeclarada(ctx.start.getLine(), ctx.IDENT().getText());
            else
                pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENT().getText(), tipo, tipo);

            visitMais_variavel(ctx.mais_variavel());
        }
        return null;
    }

    // mais_variavel : ',' IDENT mais_variavel |  ;
    @Override
    public String visitMais_variavel(GrafosParser.Mais_variavelContext ctx) {
        if(ctx.children != null){

            //verifica se varivel esta na tabela de simbolos. se nao esta adiciona na tabela
            if(pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText())){
                Token token = ctx.IDENT().getSymbol();
                int line = token.getLine();
                errosSemanticos.erroVariavelJaDeclarada(line, ctx.IDENT().getText());
            }

            else
                pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENT().getText(), tipo, tipo);

            visitMais_variavel(ctx.mais_variavel());
        }

        return null;
    }

    /* tipo :	'grafo'     |
		        'vertice'   |
                'int'	    |
                'vetor'		; */
    @Override
    public String visitTipo(GrafosParser.TipoContext ctx) {
        return ctx.getText();
    }

    // codigo : (instrucoes)* ;
    @Override
    public String visitCodigo(GrafosParser.CodigoContext ctx) {
        for(int i = 0; i < ctx.instrucoes().size(); i++){
            GrafosParser.InstrucoesContext instrucoesContext = ctx.instrucoes().get(i);
            visitInstrucoes(instrucoesContext);
        }
        return null;
    }

    /*
    instrucoes :
                'aresta' '(' IDENT ',' IDENT ',' IDENT ',' INTEIRO ')'	        //grafo,vertice,vertice,peso
				| 'remove_vert' '(' IDENT ',' IDENT ')'					        //grafo,vertice
				| 'set_peso' '(' IDENT ',' IDENT ',' IDENT ')'			        //grafo,vertice,vertice
				| 'set_custo_para_vertice' '(' IDENT ',' IDENT ',' INTEIRO ')'  //grafo, vertice, valor
				| 'imprime' '(' var_ou_cadeia ')'						        //grafo, vertice, lista, etc
				| 'se' expressao 'entao' codigo senao_opcional 'fim_se'
				| 'para' IDENT 'em' vetores_para 'faca' codigo 'fim_para'
				| 'enquanto' expressao 'faca' codigo 'fim_enquanto'
				| IDENT '<-' expressao
				| 'dijkstra' '(' IDENT ',' IDENT ')'                            //grafo, verice inicia
				| 'prim' '(' IDENT ',' IDENT ')'                                //grafo, verice inicial
				| 'dfs' '(' IDENT ',' IDENT ')'							        //grafo, verice inicial
				| 'bfs' '(' IDENT ',' IDENT ')'						            //grafo, verice inicial
                | instrucoes_com_retorno
                | instrucoes_de_vetores
                ;
     */
    @Override
    public String visitInstrucoes(GrafosParser.InstrucoesContext ctx) {
        if(ctx.getText().startsWith("aresta")){

            //verifica se os parametros existem na tabela de simbolos
            if(!pilhaDeTabelas.existeSimbolo(ctx.pa_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pa_grafo.getLine(), ctx.pa_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pa_vertice1.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pa_vertice1.getLine(), ctx.pa_vertice1.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pa_vertice2.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pa_vertice2.getLine(), ctx.pa_vertice2.getText());

            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("remove_vert")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pr_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pr_grafo.getLine(), ctx.pr_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pr_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pr_vertice.getLine(), ctx.pr_vertice.getText());
        }
        else if(ctx.getText().startsWith("set_custo_para_vertice")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.ps_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.ps_grafo.getLine(), ctx.pr_vertice.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pr_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.pr_vertice.getLine(), ctx.pr_vertice.getText());

            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("imprime")){
            visitVar_ou_cadeia(ctx.var_ou_cadeia());
        }
        else if(ctx.getText().startsWith("empilha")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pem_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pem_grafo.getText());

            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("enfileira")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pen_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pen_grafo.getText());

            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("se")){
            visitExpressao(ctx.expressao());
            visitCodigo(ctx.codigo());
            visitSenao_opcional(ctx.senao_opcional());
        }
        else if(ctx.getText().startsWith("para")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.para.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.para.getText());

            visitVetores_para(ctx.vetores_para());
            visitCodigo(ctx.codigo());
        }
        else if(ctx.getText().startsWith("enquanto")){
            visitExpressao(ctx.expressao());
            visitCodigo(ctx.codigo());
        }
        else if (ctx.atribuicao != null) {

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.atribuicao.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.atribuicao.getText());

            visitExpressao(ctx.expressao());
        }
        else if (ctx.getText().startsWith("dijkstra")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pd_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pd_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pd_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pd_vertice.getText());

        }
        else if(ctx.getText().startsWith("prim")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pp_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pp_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pp_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pp_vertice.getText());
        }
        else if(ctx.getText().startsWith("dfs")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pdfs_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pdfs_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pdfs_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pdfs_vertice.getText());
        }
        else if(ctx.getText().startsWith("bfs")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pbfs_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pbfs_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pbfs_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pbfs_vertice.getText());
        }
        else if(ctx.instrucoes_com_retorno() != null){
            visitInstrucoes_com_retorno(ctx.instrucoes_com_retorno());
        }
        else if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }

        return null;
    }

    //int_ou_ident : INTEIRO | IDENT;
    @Override
    public String visitInt_ou_ident(GrafosParser.Int_ou_identContext ctx) {
        if(ctx.INTEIRO() != null)
            return ctx.INTEIRO().getText();
        else{
            if(!pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.IDENT().getText());
            return ctx.IDENT().getText();
        }
    }

    /*
        instrucoes_com_retorno :
                     //retorna em um grafo o peso de uma aresta
                    'get_peso' '(' IDENT ',' IDENT ',' IDENT ')' //grafo,vertice,vertice
                    //retorna o custo para chegar em um vertice
                    | 'get_custo_para_vertice' '(' IDENT ',' IDENT')' //grafo, vertice
                    //retorna a quantidade de vertices em um grafo
                    | 'qtde_vert' '(' IDENT ')' //grafo
                    //retorna o vertice desempilhado
                    | 'desempilha''(' IDENT ')' //vetor
                    //retorna o vertice desenfileirado
                    | 'desenfila' '(' IDENT ')' //vetor
                    ;
    */
    @Override
    public String visitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx) {
        if(ctx.getText().startsWith("get_peso")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pgp_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pgp_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pgp_vertice1.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pgp_vertice1.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pgp_vertice2.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pgp_vertice2.getText());
        }
        else if(ctx.getText().startsWith("get_custo_para_vertice")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pgc_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pgc_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pgc_vertice.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pgc_vertice.getText());
        }
        else if(ctx.getText().startsWith("qtde_vert")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pqv_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pqv_grafo.getText());

        }
        else if(ctx.getText().startsWith("desempilha")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pdem_vetor.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pdem_vetor.getText());
        }
        else if(ctx.getText().startsWith("desenfila")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pden_vetor.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pden_vetor.getText());
        }

        return null;
    }

    /*
    instrucoes_de_vetores :
                'vizinhos' '(' IDENT ',' IDENT ')'  //grafo,vertice
                | 'vertices' '(' IDENT ')' //grafo (retorna lista com vertices)
                ;
     */
    @Override
    public String visitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx) {
        if(ctx.getText().startsWith("vizinhos")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pv_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pv_grafo.getText());
            else if(!pilhaDeTabelas.existeSimbolo(ctx.pv_vertice.getText()))
                    errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pv_vertice.getText());
        }
        else if(ctx.getText().startsWith("vertices")){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.pver_grafo.getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.pver_grafo.getText());
        }
        return null;
    }

    // vetores_para : instrucoes_de_vetores | IDENT ;
    @Override
    public String visitVetores_para(GrafosParser.Vetores_paraContext ctx) {
        if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }
        else if(ctx.IDENT() != null){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.IDENT().getText());
        }

        return super.visitVetores_para(ctx);
    }

    // var_ou_cadeia : CADEIA | IDENT ;
    @Override
    public String visitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx) {
        if(ctx.IDENT() != null){
            if(!pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.IDENT().getText());
        }
        else if(ctx.CADEIA() != null){
            return ctx.CADEIA().getText();
        }

        return null;
    }

    // senao_opcional : 'senao' codigo | ;
    @Override
    public String visitSenao_opcional(GrafosParser.Senao_opcionalContext ctx) {
        if(ctx.children != null){
            if(ctx.getText().startsWith("senao")){
                visitCodigo(ctx.codigo());
            }
        }

        return null;
    }

    // expressao : exp_aritmetica op_opcional;
    @Override
    public String visitExpressao(GrafosParser.ExpressaoContext ctx) {
        if(ctx.children != null){
            visitExp_aritmetica(ctx.exp_aritmetica());
            visitOp_opcional(ctx.op_opcional());
        }

        return null;
    }

    // exp_aritmetica : termo outros_termos;
    @Override
    public String visitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx) {
        if(ctx.children != null){
            visitTermo(ctx.termo());
            visitOutros_termos(ctx.outros_termos());
        }
        return null;
    }

    // outros_termos : op_adicao termo outros_termos | ;
    @Override
    public String visitOutros_termos(GrafosParser.Outros_termosContext ctx) {
        if(ctx.children != null){
            visitOp_adicao(ctx.op_adicao());
            visitTermo(ctx.termo());
            visitOutros_termos(ctx.outros_termos());
        }

        return null;
    }

    // termo : fator outros_fatores;
    @Override
    public String visitTermo(GrafosParser.TermoContext ctx) {
        if(ctx.children != null){
            visitFator(ctx.fator());
            visitOutros_fatores(ctx.outros_fatores());
        }

        return null;
    }

    // outros_fatores: op_multiplicacao fator outros_fatores | ;
    @Override
    public String visitOutros_fatores(GrafosParser.Outros_fatoresContext ctx) {
        if(ctx.children != null){
            visitOp_multiplicacao(ctx.op_multiplicacao());
            visitFator(ctx.fator());
            visitOutros_fatores(ctx.outros_fatores());
        }

        return null;
    }

    // fator : parcela outras_parcelas;
    @Override
    public String visitFator(GrafosParser.FatorContext ctx) {
        if(ctx.children != null){
            visitParcela(ctx.parcela());
            visitOutras_parcelas(ctx.outras_parcelas());
        }

        return null;
    }

    // outras_parcelas : '%' parcela outras_parcelas | ;
    @Override
    public String visitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx) {
        if(ctx.children != null){
            visitParcela(ctx.parcela());
            visitOutras_parcelas(ctx.outras_parcelas());
        }
        return super.visitOutras_parcelas(ctx);
    }

    // parcela : IDENT | INTEIRO | instrucoes_com_retorno | '(' expressao ')';
    @Override
    public String visitParcela(GrafosParser.ParcelaContext ctx) {
        if(ctx.IDENT() != null){

            //verifica se os parametros foram declarados
            if(!pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                errosSemanticos.erroVariavelNaoExiste(ctx.start.getLine(), ctx.IDENT().getText());
        }
        else if(ctx.INTEIRO() != null){

        }
        else if(ctx.instrucoes_com_retorno() != null){
            visitInstrucoes_com_retorno(ctx.instrucoes_com_retorno());
        }
        else if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }
        else if(ctx.getText().startsWith("(")){
            visitExpressao(ctx.expressao());
        }

        return null;
    }

    // op_opcional : op_relacional exp_aritmetica | ;
    @Override
    public String visitOp_opcional(GrafosParser.Op_opcionalContext ctx) {
        if(ctx.children != null){
            visitOp_relacional(ctx.op_relacional());
            visitExp_aritmetica(ctx.exp_aritmetica());
        }

        return null;
    }

    // op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';
    @Override
    public String visitOp_relacional(GrafosParser.Op_relacionalContext ctx) {
        return ctx.getText();
    }

    // op_multiplicacao : '*' | '/';
    @Override
    public String visitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx) {
        return ctx.getText();
    }

    // op_adicao : '+' | '-';
    @Override
    public String visitOp_adicao(GrafosParser.Op_adicaoContext ctx) {
        return ctx.getText();
    }
}
