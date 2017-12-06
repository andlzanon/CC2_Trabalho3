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
        File arquivo_entrada = new File(args[0]);
        String nome = arquivo_entrada.getName();
        int pos = nome.lastIndexOf(".");
        if (pos > 0) {
            nome = nome.substring(0, pos);
        }

        //File arquivo_entrada = new File("C:\\CC2_Trabalho3\\CasosDeTeste\\entrada\\entrada_sem_erros\\bfs_dfs.txt");
        //File arquivo_saida = new File("D:\\Rodrigo\\Desktop" + arquivo_entrada.getName() + ".py");

        //inicio da compilacao dos casos de teste sintaticos
        System.out.println("------------ Casos de Teste Sintaticos ------------\n");
        //para todos os arquivos

        SaidaParser saida = new SaidaParser();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(arquivo_entrada));

        GrafosLexer lexer = new GrafosLexer(input);
        lexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrafosParser parser = new GrafosParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new T3SyntaxErrorListener(saida));
        parser.algoritmo();

        /** analisador sintatico **/

        if(T3SyntaxErrorListener.erros == 0) {
            //mostra tambem no console para verificacao
            System.out.println(arquivo_entrada.getName());
            System.out.println(saida);
            System.out.println("Fim da Analise Sintatica\n");

            System.out.println("------------ Casos de Teste Semanticos ------------\n");

            SaidaParser saida2 = new SaidaParser();
            ANTLRInputStream input2 = new ANTLRInputStream(new FileInputStream(arquivo_entrada));

            GrafosLexer lexer2 = new GrafosLexer(input2);
            lexer2.removeErrorListeners();
            CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
            GrafosParser parser2 = new GrafosParser(tokens2);
            parser2.removeErrorListeners();
            parser2.addErrorListener(new T3SyntaxErrorListener(saida2));
            GrafosParser.AlgoritmoContext arvore = parser2.algoritmo();

             /*analisador semantico */
            GrafosSemantico grafosSemantico = new GrafosSemantico(saida2);
            grafosSemantico.visitAlgoritmo(arvore);

            if(grafosSemantico.erros == 0){
                //mostra tambem no console para verificacao
                System.out.println(arquivo_entrada.getName());
                System.out.println(saida2);
                System.out.println("Fim da Analise Semantica\n");

                System.out.println("------------ Casos de Teste Geracao de Codigo ------------\n");

                File arquivo_saida = new File(args[1] + nome + ".py");
                PrintWriter pw = new PrintWriter(new FileWriter(arquivo_saida));
                arquivo_saida.createNewFile();

                SaidaParser saida3 = new SaidaParser();
                ANTLRInputStream input3 = new ANTLRInputStream(new FileInputStream(arquivo_entrada));

                GrafosLexer lexer3 = new GrafosLexer(input3);
                lexer3.removeErrorListeners();
                CommonTokenStream tokens3 = new CommonTokenStream(lexer3);
                GrafosParser parser3 = new GrafosParser(tokens3);
                parser3.removeErrorListeners();
                parser3.addErrorListener(new T3SyntaxErrorListener(saida3));
                GrafosParser.AlgoritmoContext arvore3 = parser3.algoritmo();

                //analisador geracao
                GrafosGeracao grafosGeracao = new GrafosGeracao(saida3);
                grafosGeracao.visitAlgoritmo(arvore3);

                pw.println(saida3);
                pw.println(grafosGeracao.codigo);
                pw.println("#Fim da compilacao");
                pw.close();
                pw.flush();

                //mostra tambem no console para verificacao
                System.out.println(arquivo_entrada.getName());
                System.out.println(saida3);
                System.out.println("Fim da compilacao\n");

            }
            else{
                //mostra tambem no console para verificacao
                System.out.println(arquivo_entrada.getName());
                System.out.println(saida2);
                System.out.println("Arquivo com erros Semanticos\n");
            }


        }
        else{
            //mostra tambem no console para verificacao
            System.out.println(arquivo_entrada.getName());
            System.out.println(saida);
            System.out.println("Arquivo com erros sintaticos\n");
        }

    }
}