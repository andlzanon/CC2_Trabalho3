package trabalho3;

import java.util.ArrayList;

public class GrafosGeracao extends GrafosBaseVisitor<String>{

    String grupo;
    static PilhaDeTabelas pilhaDeTabelas;
    //declaracao global de tipo para facilitar em momentos como em declaracoes de funcoes e procediemntos
    String tipo;
    SaidaParser sp;

    ArrayList<GrafosNaTabela> grafosNaTabela;

    public GrafosGeracao(SaidaParser sp){
        this.sp = sp;
        grupo = "<619922_619795_619841_552437>";
        pilhaDeTabelas = new PilhaDeTabelas();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        //lista de grafos na tabela de simbolos. Ira guardar o numero de vertices e arestas
        grafosNaTabela  = new ArrayList<GrafosNaTabela>();
    }

    @Override
    public String visitAlgoritmo(GrafosParser.AlgoritmoContext ctx) {
        return super.visitAlgoritmo(ctx);
    }

    @Override
    public String visitDeclaracao(GrafosParser.DeclaracaoContext ctx) {
        return super.visitDeclaracao(ctx);
    }

    @Override
    public String visitVariavel(GrafosParser.VariavelContext ctx) {
        return super.visitVariavel(ctx);
    }

    @Override
    public String visitMais_variavel(GrafosParser.Mais_variavelContext ctx) {
        return super.visitMais_variavel(ctx);
    }

    @Override
    public String visitTipo(GrafosParser.TipoContext ctx) {
        return super.visitTipo(ctx);
    }

    @Override
    public String visitCodigo(GrafosParser.CodigoContext ctx) {
        return super.visitCodigo(ctx);
    }

    @Override
    public String visitInstrucoes(GrafosParser.InstrucoesContext ctx) {
        return super.visitInstrucoes(ctx);
    }

    @Override
    public String visitInt_ou_ident(GrafosParser.Int_ou_identContext ctx) {
        return super.visitInt_ou_ident(ctx);
    }

    @Override
    public String visitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx) {
        return super.visitInstrucoes_com_retorno(ctx);
    }

    @Override
    public String visitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx) {
        return super.visitInstrucoes_de_vetores(ctx);
    }

    @Override
    public String visitVetores_para(GrafosParser.Vetores_paraContext ctx) {
        return super.visitVetores_para(ctx);
    }

    @Override
    public String visitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx) {
        return super.visitVar_ou_cadeia(ctx);
    }

    @Override
    public String visitSenao_opcional(GrafosParser.Senao_opcionalContext ctx) {
        return super.visitSenao_opcional(ctx);
    }

    @Override
    public String visitExpressao(GrafosParser.ExpressaoContext ctx) {
        return super.visitExpressao(ctx);
    }

    @Override
    public String visitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx) {
        return super.visitExp_aritmetica(ctx);
    }

    @Override
    public String visitOutros_termos(GrafosParser.Outros_termosContext ctx) {
        return super.visitOutros_termos(ctx);
    }

    @Override
    public String visitTermo(GrafosParser.TermoContext ctx) {
        return super.visitTermo(ctx);
    }

    @Override
    public String visitOutros_fatores(GrafosParser.Outros_fatoresContext ctx) {
        return super.visitOutros_fatores(ctx);
    }

    @Override
    public String visitFator(GrafosParser.FatorContext ctx) {
        return super.visitFator(ctx);
    }

    @Override
    public String visitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx) {
        return super.visitOutras_parcelas(ctx);
    }

    @Override
    public String visitParcela(GrafosParser.ParcelaContext ctx) {
        return super.visitParcela(ctx);
    }

    @Override
    public String visitOp_opcional(GrafosParser.Op_opcionalContext ctx) {
        return super.visitOp_opcional(ctx);
    }

    @Override
    public String visitOp_relacional(GrafosParser.Op_relacionalContext ctx) {
        return super.visitOp_relacional(ctx);
    }

    @Override
    public String visitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx) {
        return super.visitOp_multiplicacao(ctx);
    }

    @Override
    public String visitOp_adicao(GrafosParser.Op_adicaoContext ctx) {
        return super.visitOp_adicao(ctx);
    }
}
