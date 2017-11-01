package trabalho3;

public class SaidaParser {

    StringBuffer conteudo;
    boolean modificado;

    public SaidaParser() {
        conteudo = new StringBuffer();
        modificado = false;
    }

    public void println(String texto) {
        if(!modificado) modificado = true;
        conteudo.append(texto);
    }
    
    public boolean isModificado() {
        return modificado;
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}