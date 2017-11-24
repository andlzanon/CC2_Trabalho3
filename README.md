# CC2_Trabalho3

## Trabalho 3 da Disciplina de Construção de Compiladores 2 da UFSCar (Universidade Federal de São Carlos)

Compilador responsável por fazer as análises sintáticas e semânticas de uma linguagem criada para manipulação e aprendizado de Teoria dos Grafos.

Referência a Biblioteca [ANTLR](http://www.antlr.org/).

## Apresentação

Este trabalho consiste na implementação de um compilador para a linguagem de manipulação de Grafos, capaz de realizar análise léxica, sintática, semântica da linguagem, e quando estes códigos escritos em linguagem estiverem corretos, realizar geração de código em linguagem Python, ou exibir mensagens de erro, no caso de estar incorreto. A análise léxica e sintática deve ser feita de acordo com a especificação da gramática. Dessa maniera os seguintes erros léxicos e sintaticos foram tratados:
 * Declaração de variaveis;
 * Digitação de comandos e de seus respectivos parâmetros;
 * Instanciação de comandos com retorno void em atribuição;
 * Impossibilidade de utilização de números reais;
 * Em for (para) somente é possível iterar sobre vetores
 * Comentário não fechado;
 * Tokens não permitidos;

Para o desenvolvimento do trabalho, foi utilizado a IDE IntelliJ IDEA 2017.2.2, linguagem JAVA, e o gerador automático ANTLR (ANother Tool for Language Recognition). Como Sistema Operacional, os testes foram realizados no Windows 10.

# Instalação do ANTLR
Para instalar o ANTLR, basta fazer o download do mesmo no site: http://www.antlr.org/download.html

# Configuração do ANTLR no IntelliJ 

1 - Abra o IntelliJ IDEA.

2 - No windows: entre no menu File -> Settings -> Plugins -> Procure pelo Antlr V4 grammar plugin e instale-o.

3 - Reinicie o IntelliJ IDEA.

# Instruções de uso

Para compilar, somente é necessário clicar em Run no IntelliJ.

Caso o contribuidor tenha feito modificacoes no LA.g4 usar o seguinte comando dentro da pasta src do projeto:
java -jar antlr-4.7-complete.jar -package trabalho3 -visitor Grafos.g4

# Alunos e Professores
Autores: 
André Levi Zanon, 619922; 

Rodrigo Ferrari de Souza, 619795; 

Victor Hugo Domingos de Abreu, 619841; 

Victor Santos Ferrari, 552437.

Professores: Helena Caseli e Daniel Lucrédio
