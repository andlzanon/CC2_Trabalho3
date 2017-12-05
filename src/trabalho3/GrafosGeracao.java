package trabalho3;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class GrafosGeracao extends GrafosBaseVisitor<String>{

    String grupo;
    static PilhaDeTabelas pilhaDeTabelas;

    //declaracao global de tipo para facilitar em momentos como em declaracoes de funcoes e procediemntos
    String tipo;
    SaidaParser sp;

    StringBuffer geraCodigo = new StringBuffer();
    String codigo;
    String tab = "";

    int bfs = 0;
    int dfs = 0;
    int k = 0;
    int l = 0;

    ArrayList<GrafosNaTabela> grafosNaTabela;

    public void incrementaTab(){
        tab += "\t";
    }

    public void decrementaTab(){
        tab = tab.substring(0,(tab.length()-1));
    }

    public GrafosGeracao(SaidaParser sp){
        this.sp = sp;
        grupo = "<619922_619795_619841_552437>";
        pilhaDeTabelas = new PilhaDeTabelas();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));

        //lista de grafos na tabela de simbolos. Ira guardar o numero de vertices e arestas
        grafosNaTabela  = new ArrayList<GrafosNaTabela>();

        // Import de biblioteca
        geraCodigo.append(tab + "import numpy as np\r\n" + "import networkx as nx\r\n" + "import matplotlib.pyplot as plt\r\n");
    }

    @Override
    public String visitAlgoritmo(GrafosParser.AlgoritmoContext ctx) {
        if(ctx.children != null){
            visitDeclaracao(ctx.declaracao());
            visitCodigo(ctx.codigo());
            codigo = geraCodigo.toString();
            return codigo;
        }
        return null;
    }

    @Override
    public String visitDeclaracao(GrafosParser.DeclaracaoContext ctx) {
        if(ctx.children != null){
            visitVariavel(ctx.variavel());
            visitDeclaracao(ctx.declaracao());
        }
        return null;
    }

    @Override
    public String visitVariavel(GrafosParser.VariavelContext ctx) {

        if (ctx.children != null) {
            tipo = visitTipo(ctx.tipo());

            //verifica se variavel esta na tabela de simbolos. se nao esta adiciona na tabela
            if (!pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText()))
                switch (tipo) {
                    case "grafo":
                        geraCodigo.append(tab + ctx.IDENT().getText() + " = nx.Graph()\r\n");
                        break;
                    case "vetor":
                        geraCodigo.append(tab + ctx.IDENT().getText() + " = []" + "\r\n");
                        break;
                    case "vertice":
                        break;
                    case "int":
                        //geraCodigo.append(tab + ctx.IDENT().getText() + " = 0" + "\r\n");
                        break;

                }

        visitMais_variavel(ctx.mais_variavel());

        }

        return null;
    }

    @Override
    public String visitMais_variavel(GrafosParser.Mais_variavelContext ctx) {

        if(ctx.children != null){

            //verifica se variavel esta na tabela de simbolos. se nao esta adiciona na tabela
            if(pilhaDeTabelas.existeSimbolo(ctx.IDENT().getText())){
                Token token = ctx.IDENT().getSymbol();
                int line = token.getLine();
            }

            else
                switch(tipo){
                    case "grafo" :
                        geraCodigo.append(tab + ctx.IDENT().getText() + " = nx.Graph()\r\n");
                        break;
                    case "vetor" :
                        geraCodigo.append(tab + ctx.IDENT().getText() + " = []" + "\r\n");
                        break;
                    case "vertice" :
                        break;
                    case "int":
                        //geraCodigo.append(tab + ctx.IDENT().getText() + " = 0" + "\r\n");
                        break;

                }

            visitMais_variavel(ctx.mais_variavel());
        }

        return null;
    }

    @Override
    public String visitTipo(GrafosParser.TipoContext ctx) {

        return ctx.getText();
    }

    @Override
    public String visitCodigo(GrafosParser.CodigoContext ctx) {
        for(int i = 0; i < ctx.instrucoes().size(); i++){
            GrafosParser.InstrucoesContext instrucoesContext = ctx.instrucoes().get(i);
            visitInstrucoes(instrucoesContext);
        }
        return null;
    }

    @Override
    public String visitInstrucoes(GrafosParser.InstrucoesContext ctx) {

        if(ctx.getText().startsWith("aresta")){
            geraCodigo.append(tab + ctx.pa_grafo.getText() + "." + "add_edge('" + ctx.pa_vertice1.getText() + "', '");
            geraCodigo.append(tab + ctx.pa_vertice2.getText() + "', " + "weight = " + ctx.a_int.getText() + ")\r\n");
        }
        else if(ctx.getText().startsWith("remove_vert")){
            geraCodigo.append(tab + ctx.pr_grafo.getText() + "." + "remove_node('" + ctx.pr_vertice.getText() + "')\r\n");;
        }
        else if(ctx.getText().startsWith("set_custo_para_vertice")){
            geraCodigo.append(tab + ctx.ps_grafo.getText() + ".node['" + ctx.ps_vertice.getText() + "']['weight'] = ");
            visitInt_ou_ident(ctx.int_ou_ident());
            geraCodigo.append(tab + ctx.int_ou_ident().getText() + "\r\n");
        }
        else if(ctx.getText().startsWith("imprime")){
            visitVar_ou_cadeia(ctx.var_ou_cadeia());
            geraCodigo.append("\r\n");
            geraCodigo.append(tab + "pos = nx.spring_layout(");
            geraCodigo.append(tab + ctx.var_ou_cadeia().getText() + ", k = 1, iterations=30)\r\n");
            geraCodigo.append(tab + "nx.draw_networkx(" + ctx.var_ou_cadeia().getText() + ", pos)\r\n");
            geraCodigo.append(tab + "plt.show()\r\n");
        }
        else if(ctx.getText().startsWith("listar")){
            visitVar_ou_cadeia(ctx.var_ou_cadeia());
            geraCodigo.append("\r\n");
            geraCodigo.append(tab + "print (" + ctx.var_ou_cadeia().getText() + ")\r\n");
        }
        else if(ctx.getText().startsWith("empilha")){
            geraCodigo.append(tab + ctx.pem_vetor.getText() + ".append(");
            visitInt_ou_ident(ctx.int_ou_ident());
            geraCodigo.append(ctx.int_ou_ident().getText() + ")\r\n");
        }
        else if(ctx.getText().startsWith("enfileira")){
            geraCodigo.append(tab + ctx.pen_vetor.getText() + ".append(");
            visitInt_ou_ident(ctx.int_ou_ident());
            geraCodigo.append(ctx.int_ou_ident().getText() + ")\r\n");
        }
        else if(ctx.getText().startsWith("se")){
            geraCodigo.append(tab + "if(");
            visitExpressao(ctx.expressao());
            geraCodigo.append(ctx.expressao().getText() + "): \r\n");
            incrementaTab();
            visitCodigo(ctx.codigo());
            decrementaTab();
            visitSenao_opcional(ctx.senao_opcional());

        }
        else if(ctx.getText().startsWith("para")){
            geraCodigo.append(tab + "for ");
            visitVetores_para(ctx.vetores_para());
            geraCodigo.append(ctx.para.getText() + " in " + ctx.vetores_para().getText() + " :\r\n");
            incrementaTab();
            visitCodigo(ctx.codigo());
            decrementaTab();
        }
        else if(ctx.getText().startsWith("enquanto")){
            geraCodigo.append(tab + "while (");
            visitExpressao(ctx.expressao());
            geraCodigo.append(ctx.expressao().getText() + "):\r\n");
            incrementaTab();
            visitCodigo(ctx.codigo());
            decrementaTab();
        }
        else if (ctx.atribuicao != null) {
            geraCodigo.append(tab + ctx.atribuicao.getText() + " = " );
            visitExpressao(ctx.expressao());
            geraCodigo.append(ctx.expressao().getText() + "\r\n" );
        }
        else if (ctx.getText().startsWith("dijkstra")) {
            geraCodigo.append("\r\nCopiaGrcopy" + l +" = nx.Graph()\r\n");
            geraCodigo.append("CopiaGrcopy" + l + " = " + ctx.pd_grafo.getText() + "\r\n");
            geraCodigo.append("\r\ndef Dijkstra(G, CopiaG, R1):\r\n");
            geraCodigo.append("\tfor i in G.nodes():\r\n");
            geraCodigo.append("\t\tG.node[i]['peso'] = np.inf\r\n");
            geraCodigo.append("\tG.node[R1]['peso'] = 0\r\n");
            geraCodigo.append("\tPredecessor = {}\r\n");
            geraCodigo.append("\r\n\tfor i in G.nodes():\r\n");
            geraCodigo.append("\t\tPredecessor[i] = None\r\n");
            geraCodigo.append("\r\n\twhile G.number_of_nodes() > 0:\r\n");
            geraCodigo.append("\t\tpesoMinimo = np.inf\r\n");
            geraCodigo.append("\r\n\t\tfor i in G.nodes():\r\n");
            geraCodigo.append("\t\t\tif G.node[i]['peso'] <= pesoMinimo:\r\n");
            geraCodigo.append("\t\t\t\tverticePesoMinimo = i\r\n");
            geraCodigo.append("\t\t\t\tpesoMinimo = G.node[i]['peso']\r\n");
            geraCodigo.append("\r\n\t\tfor i in G.neighbors(verticePesoMinimo):\r\n");
            geraCodigo.append("\t\t\tif G.node[i]['peso']>G.get_edge_data(verticePesoMinimo, i)['weight']+G.node[verticePesoMinimo]['peso']:\r\n");
            geraCodigo.append("\t\t\t\tG.node[i]['peso'] =G.get_edge_data(verticePesoMinimo, i)['weight']+G.node[verticePesoMinimo]['peso']\r\n");
            geraCodigo.append("\t\t\t\tPredecessor[i] = verticePesoMinimo\r\n");
            geraCodigo.append("\t\tG.remove_node(verticePesoMinimo)\r\n");
            geraCodigo.append("\r\n\tfor key in Predecessor:\r\n");
            geraCodigo.append("\t\t" + "print(" + "\"" + "predecessor de \"" + ", key, " + "\"e = \"" + ", Predecessor[key])\r\n");
            geraCodigo.append("\r\n" + "\t" + "vertice = []\r\n");
            geraCodigo.append("\t" + "arestas = []\r\n");
            geraCodigo.append("\r\n" + "\t" + "for key in Predecessor:\r\n");
            geraCodigo.append("\t" + "\t" + "vertice.append(key)\r\n");
            geraCodigo.append("\r\n" + "\t" + "for key in Predecessor:\r\n");
            geraCodigo.append("\t" + "\t" + "arestas.append((key, Predecessor[key]))\r\n");
            geraCodigo.append("\r\n" + "\t" + "newGdij" + " = nx.Graph()\r\n" + "\t" + "newGdij" + ".add_nodes_from(vertice)\r\n" + "\t" + "newGdij" + ".add_edges_from(arestas)\r\n");
            geraCodigo.append("\t" + "pos = nx.spring_layout(newGdij" + ", k = 1, iterations=30)\r\n" + "\t" + "nx.draw_networkx(newGdij" + ", pos)\r\n" + "\t" + "plt.show()\r\n");
            geraCodigo.append("\r\nDijkstra(" + ctx.pd_grafo.getText() + ", " + "CopiaGrcopy" + l + ", '" + ctx.pd_vertice.getText() + "')\r\n");
            l++;
        }
        else if(ctx.getText().startsWith("prim")){
            geraCodigo.append("\r\nCopiaGcopy" + k +" = nx.Graph()\r\n");
            geraCodigo.append("CopiaGcopy" + k + " = " + ctx.pp_grafo.getText() + "\r\n");
            geraCodigo.append("\r\ndef Prim(G, CopiaG, R):\r\n");
            geraCodigo.append("\tfor i in G.nodes():\r\n");
            geraCodigo.append("\t\tG.node[i]['peso'] = np.inf\r\n");
            geraCodigo.append("\r\n" + "\t" + "G.node[R]['peso'] = 0\r\n");
            geraCodigo.append("\tPredecessor = {}\r\n");
            geraCodigo.append("\r\n" + "\tfor i in G.nodes():\r\n");
            geraCodigo.append("\t\t" + "Predecessor[i] = None\r\n");
            geraCodigo.append("\r\n" + "\t" + "while G.number_of_nodes() > 0:\r\n");
            geraCodigo.append("\t\t" + "pesoMinimo = np.inf\r\n");
            geraCodigo.append("\t\t" + "for i in G.nodes():\r\n");
            geraCodigo.append("\t\t\t" + "if G.node[i]['peso'] <= pesoMinimo:\r\n");
            geraCodigo.append("\t\t\t\t" + "verticePesoMinimo = i\r\n");
            geraCodigo.append("\t\t\t\t" + "pesoMinimo = G.node[i]['peso']\r\n");
            geraCodigo.append("\r\n\t\t" + "for i in G.neighbors(verticePesoMinimo):\r\n");
            geraCodigo.append("\t\t\t" + "if G.node[i]['peso'] > G.get_edge_data(verticePesoMinimo, i)['weight']:\r\n");
            geraCodigo.append("\t\t\t\t" + "G.node[i]['peso'] = G.get_edge_data(verticePesoMinimo, i)['weight']\r\n");
            geraCodigo.append("\t\t\t\t" + "Predecessor[i] = verticePesoMinimo\r\n");
            geraCodigo.append("\t\t" + "G.remove_node(verticePesoMinimo)\r\n");
            geraCodigo.append("\r\n\t" + "for key in Predecessor:\r\n");
            geraCodigo.append("\t\t" + "print(" + "\"" + "predecessor de \"" + ", key, " + "\"e = \"" + ", Predecessor[key])\r\n");
            geraCodigo.append("\r\n\t" + "vertice = []\r\n");
            geraCodigo.append("\r\n\t" + "arestas = []\r\n");
            geraCodigo.append("\r\n\t" + "for key in Predecessor:\r\n");
            geraCodigo.append("\t\t" + "vertice.append(key)\r\n");
            geraCodigo.append("\r\n\t" + "for key in Predecessor:\r\n");
            geraCodigo.append("\t\t" + "arestas.append((key, Predecessor[key]))\r\n");
            geraCodigo.append("\r\n\t" + "newGprim" + " = nx.Graph()\r\n");
            geraCodigo.append("\t" + "newGprim" + ".add_nodes_from(vertice)\r\n");
            geraCodigo.append("\t" + "newGprim" + ".add_edges_from(arestas)\r\n");
            geraCodigo.append("\t" + "pos = nx.spring_layout(newGprim" + ", k = 1, iterations=30) \r\n");
            geraCodigo.append("\t" + "nx.draw_networkx(newGprim" + ", pos)\r\n");
            geraCodigo.append("\t" + "plt.show()\r\n");
            geraCodigo.append("\r\nPrim(" + ctx.pp_grafo.getText() + ", " + "CopiaGcopy" + k + ", '" + ctx.pp_vertice.getText() + "')\r\n");
            k++;
        }
        else if(ctx.getText().startsWith("dfs")){
            if(dfs == 0) {
                geraCodigo.append("\r\ndef dfs(grafo, raiz):\r\n");
                geraCodigo.append("\tT = nx.Graph()\r\n");
                geraCodigo.append("\tT.add_node(raiz)\r\n");
                geraCodigo.append("\tT.add_edges_from(nx.dfs_edges(grafo, raiz))" + "\r\n");
                geraCodigo.append("\r\n\tpos = nx.spring_layout(T, k = 1, iterations=30)\r\n");
                geraCodigo.append("\tnx.draw_networkx(T, pos)\r\n");
                geraCodigo.append("\tplt.show()\r\n");
                geraCodigo.append("\treturn T\r\n");
                geraCodigo.append("\r\ndfs(" + ctx.pdfs_grafo.getText() + ", '" + ctx.pdfs_vertice.getText() + "')\r\n");
                dfs++;
            }
            else {
                geraCodigo.append("\r\ndfs(" + ctx.pdfs_grafo.getText() + ", '" + ctx.pdfs_vertice.getText() + "')\r\n");
            }
        }
        else if(ctx.getText().startsWith("bfs")){
            if(bfs == 0) {
                geraCodigo.append("\r\ndef bfs(grafo,raiz):\r\n");
                geraCodigo.append("\tT = nx.Graph()\r\n");
                geraCodigo.append("\tT.add_node(raiz)\r\n");
                geraCodigo.append("\tT.add_edges_from(nx.bfs_edges(grafo,raiz))" + "\r\n");
                geraCodigo.append("\r\n\tpos = nx.spring_layout(T, k = 1, iterations=30)\r\n");
                geraCodigo.append("\tnx.draw_networkx(T, pos)\r\n");
                geraCodigo.append("\tplt.show()\r\n");
                geraCodigo.append("\treturn T\r\n");
                geraCodigo.append("\r\nbfs(" + ctx.pbfs_grafo.getText() + ", '" + ctx.pbfs_vertice.getText() + "')\r\n");
                bfs ++;
            }
            else{
                geraCodigo.append("\r\nbfs(" + ctx.pbfs_grafo.getText() + ", '" + ctx.pbfs_vertice.getText() + "')\r\n");
            }
        }
        else if(ctx.instrucoes_com_retorno() != null){
            visitInstrucoes_com_retorno(ctx.instrucoes_com_retorno());
        }
        else if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }

        return null;
    }

    @Override
    public String visitInt_ou_ident(GrafosParser.Int_ou_identContext ctx) {

        if(ctx.INTEIRO() != null)
            return ctx.INTEIRO().getText();

        else{
            return ctx.IDENT().getText();
        }
    }

    @Override
    public String visitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx) {
        if(ctx.getText().startsWith("get_peso")){
            geraCodigo.append(tab + "print(" + ctx.pgp_grafo.getText() + ".get_edge_data('" + ctx.pgp_vertice1.getText() + "', '");
            geraCodigo.append(tab + ctx.pgp_vertice2.getText() + "'))\r\n");
        }
        else if(ctx.getText().startsWith("get_custo_para_vertice")){
            geraCodigo.append(tab + "print(" +ctx.pgc_grafo.getText() + ".node['" + ctx.pgc_vertice.getText() + "']['weight'])\r\n");
        }
        else if(ctx.getText().startsWith("qtde_vert")){
            geraCodigo.append(tab + "print("+ ctx.pqv_grafo.getText() + ".number_of_nodes())\r\n");
        }
        else if(ctx.getText().startsWith("desempilha")){
            geraCodigo.append(tab + ctx.pdem_vetor.getText() + ".pop()\r\n");
        }
        else if(ctx.getText().startsWith("desenfila")){
            geraCodigo.append(tab + ctx.pden_vetor.getText() + ".pop(0)\r\n");
        }
        else if(ctx.getText().startsWith("tamanho_vetor")){
            geraCodigo.append(tab + "len(" + ctx.ptam_vetor.getText() + ")\r\n");
        }

        return null;
    }

    @Override
    public String visitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx) {
        if(ctx.getText().startsWith("vizinhos")){
            geraCodigo.append(tab + "print([n for n in " + ctx.pv_grafo.getText() + ".neighbors('" + ctx.pv_vertice.getText() + "')])\r\n");
        }
        else if(ctx.getText().startsWith("vertices")){
            geraCodigo.append(tab + "print(" + ctx.pver_grafo.getText() + ".nodes())\r\n");
        }
        return null;
    }

    @Override
    public String visitVetores_para(GrafosParser.Vetores_paraContext ctx) {

        if(ctx.instrucoes_de_vetores() != null){
            visitInstrucoes_de_vetores(ctx.instrucoes_de_vetores());
        }
        else if(ctx.IDENT() != null){
            return ctx.IDENT().getText();
        }

        return super.visitVetores_para(ctx);
    }

    @Override
    public String visitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx) {

        if(ctx.IDENT() != null){
            return ctx.IDENT().getText();
        }
        else if(ctx.CADEIA() != null){
            return ctx.CADEIA().getText();
        }
        else
            return null;
    }

    @Override
    public String visitSenao_opcional(GrafosParser.Senao_opcionalContext ctx) {

        if(ctx.children != null){
            if(ctx.getText().startsWith("senao")){
                geraCodigo.append(tab + "else:\r\n");
                incrementaTab();
                visitCodigo(ctx.codigo());
                geraCodigo.append(tab + "\r\n");
                decrementaTab();
            }
        }

        return null;
    }

    @Override
    public String visitExpressao(GrafosParser.ExpressaoContext ctx) {

        if(ctx.children != null){
            visitExp_aritmetica(ctx.exp_aritmetica());
            visitOp_opcional(ctx.op_opcional());

        }

        return null;
    }

    @Override
    public String visitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx) {

        if(ctx.children != null){
            visitTermo(ctx.termo());
            visitOutros_termos(ctx.outros_termos());
        }
        return null;
    }

    @Override
    public String visitOutros_termos(GrafosParser.Outros_termosContext ctx) {

        if(ctx.children != null){
            for (int i = 0; i < ctx.termo().size(); i++) {
                visitOp_adicao(ctx.op_adicao().get(i));
                visitTermo(ctx.termo().get(i));
            }
        }

        return null;
    }

    @Override
    public String visitTermo(GrafosParser.TermoContext ctx) {

        if(ctx.children != null){
            visitFator(ctx.fator());
            visitOutros_fatores(ctx.outros_fatores());
        }

        return null;
    }

    @Override
    public String visitOutros_fatores(GrafosParser.Outros_fatoresContext ctx) {

        if(ctx.children != null){
            for (int i = 0; i < ctx.fator().size(); i++) {
                visitOp_multiplicacao(ctx.op_multiplicacao().get(i));
                visitFator(ctx.fator().get(i));
            }
        }

        return null;
    }

    @Override
    public String visitFator(GrafosParser.FatorContext ctx) {

        if(ctx.children != null){
            visitParcela(ctx.parcela());
            visitOutras_parcelas(ctx.outras_parcelas());
        }

        return null;
    }

    @Override
    public String visitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx) {
        if(ctx.children != null){
            for (int i = 0; i < ctx.parcela().size(); i++) {
                GrafosParser.ParcelaContext parcelaContext = ctx.parcela().get(i);
                visitParcela(parcelaContext);
            }
        }
        return null;
    }

    @Override
    public String visitParcela(GrafosParser.ParcelaContext ctx) {

        if(ctx.IDENT() != null){
            return ctx.IDENT().getText();
        }
        else if(ctx.INTEIRO() != null){
            return ctx.INTEIRO().getText();
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

    @Override
    public String visitOp_opcional(GrafosParser.Op_opcionalContext ctx) {
        if(ctx.children != null){
            visitOp_relacional(ctx.op_relacional());
            visitExp_aritmetica(ctx.exp_aritmetica());
        }
        return null;
    }

    @Override
    public String visitOp_relacional(GrafosParser.Op_relacionalContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOp_adicao(GrafosParser.Op_adicaoContext ctx) {
        return ctx.getText();
    }
}
