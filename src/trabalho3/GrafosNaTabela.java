package trabalho3;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by Andre on 25/11/2017.
 */
public class GrafosNaTabela {

    //O Objeto Grafos na tabela tem nome, que e o nome do grafo
    private String nome;
    //lista de arestas
    private ArrayList<Pair> listaDeArestas;
    //listas dos vertices
    private ArrayList<String> todosOsVertices;

    public GrafosNaTabela(String nome){
        this.nome = nome;
        listaDeArestas = new ArrayList<Pair>();
        todosOsVertices = new ArrayList<>();
    }

    //comando que sempre sera chamado no aresta(grafo, v1, v2, peso)
    public void adicionaNaListaDeArestas(String v1, String v2){
        //adiciona na lista de arestas
        listaDeArestas.add(new Pair(v1, v2));
        //se a lista de vertices contem v1 ou v2 nao adiciona na lista
        //caso contrario adiciona
        if(!todosOsVertices.contains(v1))
            todosOsVertices.add(v1);
        if(!todosOsVertices.contains(v2))
            todosOsVertices.add(v2);
    }

    //comando que sempre sera chamdo quando o usuario chamar remove_vert
    public void removeNaListaDeArestas(String v1){
        //remove o vertice da lista de vertice
        todosOsVertices.remove(v1);
        //para o vetor inteiro de arestas
        //se o valor da chave ou o valor do valor for o vertice
        //remove o par inteiro
        for(int i = 0; i < listaDeArestas.size(); i++){
            if(listaDeArestas.get(i).getValue().equals(v1) || listaDeArestas.get(i).getKey().equals(v1))
                listaDeArestas.remove(listaDeArestas.get(i));
        }
    }


    //verifica se e conexo por meio da formula E >= (V-2 , 2) em que
    // (V2, 2) e uma binomial de Newton
    public boolean eConexo(){

        int vertices = todosOsVertices.size();
        int arestas = listaDeArestas.size();
        int fator = vertices - 1;
        int numerador = fatorial(fator);
        int teste = fator -2;
        int denominador = 2 * fatorial(teste);
        int valor = numerador/denominador;

        if(arestas > valor){
            /*para debug: System.out.println("valor " +valor);
            System.out.println("aresta " +arestas);
            System.out.println("vertice " +vertices); */
            return true;
        }

        else{
             /*para debug: System.out.println("valor " +valor);
            System.out.println("aresta " +arestas);
            System.out.println("vertice " +vertices); */
            return false;
        }

    }

    //funcao que verifica se o objeto GrafoNaTabela e o Grafo instanciado no programa
    public boolean equals(String nome){
        if(this.nome.equals(nome))
            return true;
        else
            return false;
    }


    public String getNome() {
        return nome;
    }

    //funcao fatorial, nao funciona por recursao nao sei pq. Dá erro de StackOVerflow e o StackOverflow nao me ajudo nisso
    private int fatorial(int x){
        int resp = 1;

        for(int i = 1; i <= x; i++)
            resp *= i;

        return resp;
    }
}
