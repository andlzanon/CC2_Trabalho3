package trabalho3;

/**
 * Created by Andre on 20/11/2017.
 */
public class GrafosSemantico extends GrafosBaseVisitor {

    String grupo;
    static PilhaDeTabelas pilhaDeTabelas;
    //declaracao global de tipo para facilitar em momentos como em declaracoes de funcoes e procediemntos
    String tipo;

    public void GrafosSemantico(){
        grupo = "<619922_619795_619841_552437>";
        pilhaDeTabelas = new PilhaDeTabelas();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
    }

    // algoritmo :	'declaracoes' declaracao 'inicio' codigo 'fim' ;
    @Override
    public Object visitAlgoritmo(GrafosParser.AlgoritmoContext ctx) {
        if(ctx.children != null){
            visitDeclaracao(ctx.declaracao());
            visitCodigo(ctx.codigo());
        }
        return null;
    }

    //declaracao : variavel declaracao | ;
    @Override
    public Object visitDeclaracao(GrafosParser.DeclaracaoContext ctx) {
        if(ctx.children != null){
            visitVariavel(ctx.variavel());
            visitDeclaracao(ctx.declaracao());
        }
        return null;
    }

    // variavel : tipo IDENT mais_variavel ;
    @Override
    public Object visitVariavel(GrafosParser.VariavelContext ctx) {
        if(ctx.children != null){
            visitTipo(ctx.tipo());
            visitMais_variavel(ctx.mais_variavel());
        }
        return null;
    }

    // mais_variavel : ',' IDENT mais_variavel |  ;
    @Override
    public Object visitMais_variavel(GrafosParser.Mais_variavelContext ctx) {
        if(ctx.children != null){
            visitMais_variavel(ctx.mais_variavel());
        }
        return null;
    }

    /* tipo :	'grafo'     |
		        'vertice'   |
                'int'	    |
                'vetor'		; */
    @Override
    public Object visitTipo(GrafosParser.TipoContext ctx) {
        return ctx.getText();
    }

    // codigo : (instrucoes)* ;
    @Override
    public Object visitCodigo(GrafosParser.CodigoContext ctx) {
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
    public Object visitInstrucoes(GrafosParser.InstrucoesContext ctx) {
        if(ctx.getText().startsWith("aresta")){
            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("remove_vert")){

        }
        else if(ctx.getText().startsWith("set_peso")){

        }
        else if(ctx.getText().startsWith("set_custo_para_vertice")){
            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("imprime")){
            visitVar_ou_cadeia(ctx.var_ou_cadeia());
        }
        else if(ctx.getText().startsWith("empilha")){
            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("enfileira")){
            visitInt_ou_ident(ctx.int_ou_ident());
        }
        else if(ctx.getText().startsWith("se")){
            visitExpressao(ctx.expressao());
            visitCodigo(ctx.codigo());
            visitSenao_opcional(ctx.senao_opcional());
        }
        else if(ctx.getText().startsWith("para")){
            visitVetores_para(ctx.vetores_para());
            visitCodigo(ctx.codigo());
        }
        else if(ctx.getText().startsWith("enquanto")){
            visitExpressao(ctx.expressao());
            visitCodigo(ctx.codigo());
        }
        else if (ctx.IDENT() != null) {
            visitExpressao(ctx.expressao());
        }
        else if (ctx.getText().startsWith("dijkstra")){

        }
        else if(ctx.getText().startsWith("prim")){

        }
        else if(ctx.getText().startsWith("dfs")){

        }
        else if(ctx.getText().startsWith("bfs")){

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
    public Object visitInt_ou_ident(GrafosParser.Int_ou_identContext ctx) {
        if(ctx.INTEIRO() != null)
            return ctx.INTEIRO().getText();
        else{
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
    public Object visitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx) {
        if(ctx.getText().startsWith("get_peso")){

        }
        else if(ctx.getText().startsWith("get_custo_para_vertice")){

        }
        else if(ctx.getText().startsWith("qtde_vert")){

        }
        else if(ctx.getText().startsWith("desempilha")){

        }
        else if(ctx.getText().startsWith("desenfila")){

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
    public Object visitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx) {
        if(ctx.getText().startsWith("vizinhos")){

        }
        else if(ctx.getText().startsWith("vertices")){

        }
        return null;
    }

    // vetores_para : instrucoes_de_vetores | IDENT ;
    @Override
    public Object visitVetores_para(GrafosParser.Vetores_paraContext ctx) {
        if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }
        else if(ctx.IDENT() != null){

        }

        return super.visitVetores_para(ctx);
    }

    // var_ou_cadeia : CADEIA | IDENT ;
    @Override
    public Object visitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx) {
        if(ctx.IDENT() != null){

        }
        else if(ctx.CADEIA() != null){
            return ctx.CADEIA().getText();
        }

        return null;
    }

    // senao_opcional : 'senao' codigo | ;
    @Override
    public Object visitSenao_opcional(GrafosParser.Senao_opcionalContext ctx) {
        if(ctx.children != null){
            if(ctx.getText().startsWith("senao")){
                visitCodigo(ctx.codigo());
            }
        }

        return null;
    }

    // expressao : exp_aritmetica op_opcional;
    @Override
    public Object visitExpressao(GrafosParser.ExpressaoContext ctx) {
        if(ctx.children != null){
            visitExp_aritmetica(ctx.exp_aritmetica());
            visitOp_opcional(ctx.op_opcional());
        }

        return null;
    }

    // exp_aritmetica : termo outros_termos;
    @Override
    public Object visitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx) {
        if(ctx.children != null){
            visitTermo(ctx.termo());
            visitOutros_termos(ctx.outros_termos());
        }
        return null;
    }

    // outros_termos : op_adicao termo outros_termos | ;
    @Override
    public Object visitOutros_termos(GrafosParser.Outros_termosContext ctx) {
        if(ctx.children != null){
            visitOp_adicao(ctx.op_adicao());
            visitTermo(ctx.termo());
            visitOutros_termos(ctx.outros_termos());
        }

        return null;
    }

    // termo : fator outros_fatores;
    @Override
    public Object visitTermo(GrafosParser.TermoContext ctx) {
        if(ctx.children != null){
            visitFator(ctx.fator());
            visitOutros_fatores(ctx.outros_fatores());
        }

        return null;
    }

    // outros_fatores: op_multiplicacao fator outros_fatores | ;
    @Override
    public Object visitOutros_fatores(GrafosParser.Outros_fatoresContext ctx) {
        if(ctx.children != null){
            visitOp_multiplicacao(ctx.op_multiplicacao());
            visitFator(ctx.fator());
            visitOutros_fatores(ctx.outros_fatores());
        }

        return null;
    }

    // fator : parcela outras_parcelas;
    @Override
    public Object visitFator(GrafosParser.FatorContext ctx) {
        if(ctx.children != null){
            visitParcela(ctx.parcela());
            visitOutras_parcelas(ctx.outras_parcelas());
        }

        return null;
    }

    // outras_parcelas : '%' parcela outras_parcelas | ;
    @Override
    public Object visitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx) {
        if(ctx.children != null){
            visitParcela(ctx.parcela());
            visitOutras_parcelas(ctx.outras_parcelas());
        }
        return super.visitOutras_parcelas(ctx);
    }

    // parcela : IDENT | INTEIRO | instrucoes_com_retorno | '(' expressao ')';
    @Override
    public Object visitParcela(GrafosParser.ParcelaContext ctx) {
        if(ctx.IDENT() != null){

        }
        else if(ctx.INTEIRO() != null){

        }
        else if(ctx.instrucoes_com_retorno() != null){
            visitInstrucoes_com_retorno(ctx.instrucoes_com_retorno());
        }
        else if(ctx.getText().startsWith("(")){
            visitExpressao(ctx.expressao());
        }

        return null;
    }

    // op_opcional : op_relacional exp_aritmetica | ;
    @Override
    public Object visitOp_opcional(GrafosParser.Op_opcionalContext ctx) {
        if(ctx.children != null){
            visitOp_relacional(ctx.op_relacional());
            visitExp_aritmetica(ctx.exp_aritmetica());
        }

        return null;
    }

    // op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';
    @Override
    public Object visitOp_relacional(GrafosParser.Op_relacionalContext ctx) {
        return ctx.getText();
    }

    // op_multiplicacao : '*' | '/';
    @Override
    public Object visitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx) {
        return ctx.getText();
    }

    // op_adicao : '+' | '-';
    @Override
    public Object visitOp_adicao(GrafosParser.Op_adicaoContext ctx) {
        return ctx.getText();
    }
}
