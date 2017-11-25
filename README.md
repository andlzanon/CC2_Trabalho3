# CC2_Trabalho3

## Trabalho 3 da Disciplina de Constru��o de Compiladores 2 da UFSCar (Universidade Federal de S�o Carlos)

Compilador respons�vel por fazer as an�lises sint�ticas e sem�nticas de uma linguagem criada para manipula��o e aprendizado de Teoria dos Grafos.

Refer�ncia a Biblioteca [ANTLR](http://www.antlr.org/).

## Apresenta��o

Este trabalho consiste na implementa��o de um compilador para a linguagem de manipula��o de Grafos, capaz de realizar an�lise l�xica, sint�tica, sem�ntica da linguagem, e quando estes c�digos escritos em linguagem estiverem corretos, realizar gera��o de c�digo em linguagem Python, ou exibir mensagens de erro, no caso de estar incorreto.

### Erros Sint�ticos

 A an�lise l�xica e sint�tica deve ser feita de acordo com a especifica��o da gram�tica. Dessa maniera os seguintes erros l�xicos e sintaticos foram tratados:
 
 * Declara��o de variaveis;
 * Digita��o de comandos e de seus respectivos par�metros;
 * Instancia��o de comandos com retorno void em atribui��o;
 * Impossibilidade de utiliza��o de n�meros reais;
 * Em for (para) somente � poss�vel iterar sobre vetores
 * Coment�rio n�o fechado;
 * Tokens n�o permitidos;
 
 ### Erros Sem�nticos
 
 J� os erros semanticos tratados foram:
 
 * Vari�vel e identificador n�o declarado;
 * Vari�vel e identificador declarado mais de uma vez;
 * Compatibilidade de par�metros com fun��es pr� definidas (ex: busca em largura, busca em profundidade e dijkstra);
 * Custo de aresta e v�rtice n�o pode ser negativo;
 * Compatibilidade de tipos(grafo, lista, vertice, int) em atribui��es;
 * Vari�vel int nao inicializada; 
 * No tipo de dados vetor somente � possivel adicionar o tipo de dados relativo ao primeiro, mesmo que depois tenha sido limpada a lista;
 * Um grafo n�o pode ser desconexo


Para o desenvolvimento do trabalho, foi utilizado a IDE IntelliJ IDEA 2017.2.2, linguagem JAVA, e o gerador autom�tico ANTLR (ANother Tool for Language Recognition). Como Sistema Operacional, os testes foram realizados no Windows 10.

## Instala��o do ANTLR
Para instalar o ANTLR, basta fazer o download do mesmo no site: http://www.antlr.org/download.html

## Configura��o do ANTLR no IntelliJ 

1 - Abra o IntelliJ IDEA.

2 - No windows: entre no menu File -> Settings -> Plugins -> Procure pelo Antlr V4 grammar plugin e instale-o.

3 - Reinicie o IntelliJ IDEA.

## Instru��es de uso

Para compilar, somente � necess�rio clicar em Run no IntelliJ.

Caso o contribuidor tenha feito modificacoes no Grafos.g4 usar o seguinte comando dentro da pasta src do projeto:
java -jar antlr-4.7-complete.jar -package trabalho3 -visitor Grafos.g4

## Alunos e Professores
Autores: 
Andr� Levi Zanon, 619922; 

Rodrigo Ferrari de Souza, 619795; 

Victor Hugo Domingos de Abreu, 619841; 

Victor Santos Ferrari, 552437.

Professores: Helena Caseli e Daniel Lucr�dio
