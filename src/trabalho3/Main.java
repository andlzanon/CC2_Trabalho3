package trabalho3;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException, RecognitionException {

        /*caminho do arquivo*/
        final String CAMINHO_CASOS_TESTE = "C:\\CC2_Trabalho3\\CasosDeTeste";
        //diretorio de entrada dos casos de teste sintaticos
        File diretorioCasosTesteSintatico = new File(CAMINHO_CASOS_TESTE + "\\entrada\\entrada_sintatico");
        //vetor com a lista de arquivos sintaticos
        File[] casosTesteSintatico = diretorioCasosTesteSintatico.listFiles();

        //inicio da compilacao dos casos de teste sintaticos
        System.out.println("------------ Casos de Teste Sintaticos ------------\n");
        //para todos os arquivos
        for(File file : casosTesteSintatico){
            SaidaParser saida = new SaidaParser();
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));

            GrafosLexer lexer = new GrafosLexer(input);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrafosParser parser = new GrafosParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new T3SyntaxErrorListener(saida));
            parser.algoritmo();

            /** analisador sintatico **/
            //cria um arquivo de saida
            File saidaCasoTeste = new File(CAMINHO_CASOS_TESTE + "\\saida\\saida_sintatico\\" + file.getName());
            saidaCasoTeste.createNewFile();
            PrintWriter pw = new PrintWriter(new FileWriter(saidaCasoTeste));
            //escreve a saida e o fim da compilacao
            pw.println(saida);
            pw.println("Fim da compilacao");
            pw.close();
            pw.flush();

            //mostra tambem no console para verificacao
            System.out.println(file.getName());
            System.out.println(saida);
            System.out.println("Fim da compilacao\n");
        }


        System.out.println("------------ Casos de Teste Semanticos ------------\n");
        //diretorio de entrada dos casos de teste sintaticos
        File diretorioCasosTesteSemantico = new File(CAMINHO_CASOS_TESTE + "\\entrada\\entrada_semantico");
        //vetor com a lista de arquivos sintaticos
        File[] casosTesteSemantico = diretorioCasosTesteSemantico.listFiles();

        for(File file : casosTesteSemantico){

            SaidaParser saida = new SaidaParser();
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));

            GrafosLexer lexer = new GrafosLexer(input);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrafosParser parser = new GrafosParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new T3SyntaxErrorListener(saida));
            GrafosParser.AlgoritmoContext arvore = parser.algoritmo();

             /*analisador semantico */
            GrafosSemantico grafosSemantico = new GrafosSemantico(saida);
            grafosSemantico.visitAlgoritmo(arvore);
            PrintWriter pws = new PrintWriter(CAMINHO_CASOS_TESTE + "\\saida\\saida_semantico\\" + file.getName());
            pws.println(saida);
            pws.println("Fim da compilacao");
            pws.close();
            pws.flush();

            //mostra tambem no console para verificacao
            System.out.println(file.getName());
            System.out.println(saida);
            System.out.println("Fim da compilacao\n");
        }


        System.out.println("------------ Casos de Teste Geracao de Codigo ------------\n");
        //diretorio de entrada dos casos de teste sintaticos
        File diretorioCasosTesteGeracao = new File(CAMINHO_CASOS_TESTE + "\\entrada\\entrada_sem_erros");
        //vetor com a lista de arquivos sintaticos
        File[] casosTesteGeracao = diretorioCasosTesteGeracao.listFiles();

        for(File file : casosTesteGeracao){

            SaidaParser saida = new SaidaParser();
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));

            GrafosLexer lexer = new GrafosLexer(input);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrafosParser parser = new GrafosParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new T3SyntaxErrorListener(saida));
            GrafosParser.AlgoritmoContext arvore = parser.algoritmo();

             //analisador geracao
            GrafosGeracao grafosGeracao = new GrafosGeracao(saida);
            grafosGeracao.visitAlgoritmo(arvore);
            PrintWriter pws = new PrintWriter(CAMINHO_CASOS_TESTE + "\\saida\\saida_sem_erros\\" + file.getName());
            pws.println(saida);
            pws.println(grafosGeracao.codigo);
            pws.println("#Fim da compilacao");
            pws.close();
            pws.flush();

            //mostra tambem no console para verificacao
            System.out.println(file.getName());
            System.out.println(saida);
            System.out.println("Fim da compilacao\n");
        }

    }
}
