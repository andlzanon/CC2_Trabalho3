package trabalho3;

public class Mensagens {

    public static boolean primeiro;
    SaidaParser sp;

    public Mensagens(SaidaParser sp){
        this.sp = sp;
        primeiro = true;
    }

    public void erroVariavelNaoExiste(int numLinha, String variavel) {
        //string do erro cometido
        String erro = "Linha " +numLinha + ": identificador " +variavel + " nao declarado";
        //verifica se e necessario pular uma linha antes de escrever a string para
        //nao pular uma linha no comeco ou antes do "Fim da compilacao"
        if (!primeiro){
            erro = "\n" + erro;
        }
        //primeiro igual a false, ou seja, apos a primeira string todas pulam uma linha
        //antes de escrever na saida
        primeiro = false;
        //escreve o erro
        sp.println(erro);
    }

    public void erroVariavelJaDeclarada(int numLinha, String variavel){
        String erro = "Linha " +numLinha + ": identificador " +variavel + " ja declarado anteriormente";

        if (!primeiro){
            erro = "\n" + erro;
        }
        primeiro = false;
        sp.println(erro);
    }

    public void incompatibilidadeDeParametros(int numLinha, String variavel, String tipoEsperado){
        String erro = "Linha " +numLinha + ": tipo da variavel " +variavel +  " nao corresponde com o parâmetro respectivo de tipo " +
                tipoEsperado;

        if (!primeiro){
            erro = "\n" + erro;
        }
        primeiro = false;

        sp.println(erro);
    }

    public void pesoNegativo(int numLinha, String variavel){
        String erro = "Linha " +numLinha + ": peso nao pode ser negativo do identificador " +variavel;

        if (!primeiro){
            erro = "\n" + erro;
        }
        primeiro = false;

        sp.println(erro);
    }


    public void incompatibilidadeDeTipos(int numLinha, String variavel){
        String erro = "Linha " +numLinha + ": atribuicao nao compativel para " +variavel;

        if (!primeiro){
            erro = "\n" + erro;
        }
        primeiro = false;

        sp.println(erro);
    }

    public void intNaoAtribuido(int numLinha, String variavel) {
        String erro = "Linha " +numLinha + ": variavel " +variavel + " inteira nao inicializada";

        if (!primeiro){
            erro = "\n" + erro;
        }
        primeiro = false;

        sp.println(erro);
    }
}
