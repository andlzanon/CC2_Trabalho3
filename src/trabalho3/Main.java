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
        SaidaParser saida = new SaidaParser();

        /*caminho do arquivo*/
        File file = new File("C:\\CC2_Trabalho3\\src\\CasosDeTeste\\caso1.txt");

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));

        GrafosLexer lexer = new GrafosLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrafosParser parser = new GrafosParser(tokens);
        parser.addErrorListener(new T3SyntaxErrorListener(saida));

        System.out.println(saida);
        System.out.println("Fim da compilacao");

    }
}
