# CC2_Trabalho3

## Trabalho 3 da Disciplina de Constru��o de Compiladores 2 da UFSCar (Universidade Federal de S�o Carlos)

Compilador respons�vel por fazer as an�lises sint�ticas e sem�nticas de uma linguagem criada para manipula��o e aprendizado de Teoria dos Grafos.

Refer�ncia a Biblioteca [ANTLR](http://www.antlr.org/).

## Apresenta��o

Este trabalho consiste na implementa��o de um compilador para a linguagem de manipula��o de Grafos, capaz de realizar an�lise l�xica, sint�tica, sem�ntica da linguagem, e quando estes c�digos escritos em linguagem estiverem corretos, realizar gera��o de c�digo em linguagem Python, ou exibir mensagens de erro, no caso de estar incorreto. A an�lise l�xica e sint�tica deve ser feita de acordo com a especifica��o da gram�tica. Dessa maniera os seguintes erros l�xicos e sintaticos foram tratados:
 * Declara��o de variaveis;
 * Digita��o de comandos e de seus respectivos par�metros;
 * Instancia��o de comandos com retorno void em atribui��o;
 * Impossibilidade de utiliza��o de n�meros reais;
 * Coment�rio n�o fechado;
 * Tokens n�o permitidos;

Para o desenvolvimento do trabalho, foi utilizado a IDE IntelliJ IDEA 2017.2.2, linguagem JAVA, e o gerador autom�tico ANTLR (ANother Tool for Language Recognition). Como Sistema Operacional, os testes foram realizados no Windows 10.

# Instala��o do ANTLR
Para instalar o ANTLR, basta fazer o download do mesmo no site: http://www.antlr.org/download.html

# Configura��o do ANTLR no IntelliJ 

1 - Abra o IntelliJ IDEA.

2 - No windows: entre no menu File -> Settings -> Plugins -> Procure pelo Antlr V4 grammar plugin e instale-o.

3 - Reinicie o IntelliJ IDEA.

# Instru��es de uso

Antes de rodar o comando para compilar s�o necessarias duas ac�es:

1- Da maneira que o nosso programa foi desenvolvido, s� � poss�vel rodar os testes de casos sint�ticos e casos sem�nticos, para isso o compilador vem por padr�o preparado para rodar os casos sint�ticos a partir do comando java para corre��o sint�tica. Caso deseje rodar os casos de teste sem�nticos descomente os comandos de an�lise sem�ntica e adicione como coment�rios os comandos para an�lise sint�tica. 

2- Abrir o projeto no IntelliJ e entrar na barra superior em Build >> Build Artifacts... >> Rebuild.

Ent�o usar o comando: java -jar local do corretor do ava.jar "java -jar local do LAT1.jar" gcc (necessario colocar o MINGW como variavel de ambiente) local_da_pasta_temp local_dos_casos_de_teste "RA's" correcao<sintatico, semantico ou tudo>

ex: java -jar C:\Users\Andr�\Documents\BCC\017.2\CC2\T1\CorretorTrabalho1\CorretorTrabalho1.jar "java -jar C:\Users\Andr�\Documents\GitHub\CC2_Trabalho1\out\artifacts\LAT1_jar\LAT1.jar" gcc C:\Users\Andr�\Documents\GitHub\CC2_Trabalho1\temp C:\Users\Andr�\Documents\GitHub\CC2_Trabalho1\src\trabalho1\casosDeTesteT1\casosDeTesteT1 "619922" sintatico
Caso o contribuidor tenha feito modificacoes no LA.g4 usar o comando na pasta src do projeto: java -jar antlr-4.7-complete.jar -package trabalho1 LA.g4

Caso o contribuidor tenha feito modificacoes no LA.g4 usar o seguinte comando dentro da pasta src do projeto:
java -jar antlr-4.7-complete.jar -package trabalho1 LA.g4

# Alunos e Professores
Autores: 
Andr� Levi Zanon, 619922; 

Rodrigo Ferrari de Souza, 619795; 

Victor Hugo Domingos de Abreu, 619841; 

Victor Santos Ferrari, 552437.

Professores: Helena Caseli e Daniel Lucr�dio
