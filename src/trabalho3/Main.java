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
        File diretorioCasosTeste = new File(CAMINHO_CASOS_TESTE + "\\entrada\\entrada_sintatico");
        //vetor com a lista de arquivos sintaticos
        File[] casosTeste = diretorioCasosTeste.listFiles();

        //para todos os arquivos
        for(File file : casosTeste){
            //analise sintatica
            SaidaParser saida = new SaidaParser();
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));

            GrafosLexer lexer = new GrafosLexer(input);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrafosParser parser = new GrafosParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new T3SyntaxErrorListener(saida));
            parser.algoritmo();

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
    }
}
