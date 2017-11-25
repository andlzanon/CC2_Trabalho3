grammar Grafos;

@members{
    String grupo = "<619922_619795_619841_552437>";
    private final int ERRO_COMENT = 11;
    private final int ERRO_TOKEN = 10;
}

algoritmo :	'declaracoes' declaracao 'inicio' codigo 'fim' ;

declaracao : variavel declaracao | ;

variavel : tipo IDENT mais_variavel ;

mais_variavel : ',' IDENT mais_variavel | ;

tipo :	'grafo'     |
		'vertice'   |
		'int'	    |
        'vetor'		;

codigo : (instrucoes)* ;

                //cria aresta em um grafo, delimitado por dois veritices e um peso
instrucoes :	'aresta' '(' pa_grafo=IDENT ',' pa_vertice1=IDENT ',' pa_vertice2=IDENT ',' int_ou_ident')'	        //grafo,vertice,vertice,peso
                // remove de um grafo o vertice
				| 'remove_vert' '(' pr_grafo=IDENT ',' pr_vertice= IDENT ')'					                    //grafo,vertice
                //define-se em um grafo, o custo para chegar no vertice
				| 'set_custo_para_vertice' '(' ps_grafo=IDENT ',' ps_vertice=IDENT ',' int_ou_ident ')'             //grafo, vertice, int
	            //imprime uma variavel ou cadeia
				| 'imprime' '(' var_ou_cadeia ')'						                                            //grafo, vertice, lista, etc
				| 'empilha' '(' pem_vetor=IDENT ',' int_ou_ident ')'                                                          //vetor, vertice grafo ou inteiro
				| 'enfileira' '(' pen_vetor=IDENT ',' int_ou_ident ')'                                                        //vetor, vertice grafo ou inteiro
				//lacos e comandos condicionais
				| 'se' expressao 'entao' codigo senao_opcional 'fim_se'
				| 'para' para=IDENT 'em' vetores_para 'faca' codigo 'fim_para'
				| 'enquanto' expressao 'faca' codigo 'fim_enquanto'
				//chamada de atribuicao
				| atribuicao=IDENT '<-' expressao
				//funcao dijktra pre-implementada, retorna um grafo
				| 'dijkstra' '(' pd_grafo=IDENT ',' pd_vertice=IDENT ')'                                            //grafo, verice inicial
				//funcao prim pre-implementada, retorna um grafo
				| 'prim' '(' pp_grafo=IDENT ',' pp_vertice=IDENT ')'                                                //grafo, verice inicial
				//funcao dfs pre-implementada, retorna um grafo
				| 'dfs' '(' pdfs_grafo=IDENT ',' pdfs_vertice=IDENT ')'							                    //grafo, verice inicial
				//funcao bfs pre-implementada, retorna um grafo
				| 'bfs' '(' pbfs_grafo=IDENT ',' pbfs_vertice=IDENT ')'						                        //grafo, verice inicial
                | instrucoes_com_retorno
                | instrucoes_de_vetores
                ;

int_ou_ident : INTEIRO | IDENT;

instrucoes_com_retorno :
                //retorna em um grafo o peso de uma aresta
                'get_peso' '(' pgp_grafo=IDENT ',' pgp_vertice1=IDENT ',' pgp_vertice2=IDENT ')'        //grafo,vertice,vertice
                //retorna o custo para chegar em um vertice
                | 'get_custo_para_vertice' '(' pgc_grafo=IDENT ',' pgc_vertice=IDENT')'                 //grafo, vertice
                //retorna a quantidade de vertices em um grafo
                | 'qtde_vert' '(' pqv_grafo=IDENT ')' //grafo
                //retorna o vertice desempilhado
                | 'desempilha''(' pdem_vetor=IDENT ')' //vetor
                //retorna o vertice desenfileirado
                | 'desenfila' '(' pden_vetor=IDENT ')' //vetor
                ;

instrucoes_de_vetores :
                //retorna um vetor de vizinhos a partir de um grafo e um vertice
                'vizinhos' '(' pv_grafo=IDENT ',' pv_vertice=IDENT ')'  //grafo,vertice
                //retorna um vetor de todos os vertices do grafo
                | 'vertices' '(' pver_grafo=IDENT ')' //grafo (retorna lista com vertices)
                ;

vetores_para : instrucoes_de_vetores | IDENT ;

var_ou_cadeia : CADEIA | IDENT ;

senao_opcional : 'senao' codigo | ;

expressao : exp_aritmetica op_opcional;

exp_aritmetica : termo outros_termos;

outros_termos : (op_adicao termo)*;

termo : fator outros_fatores;

outros_fatores: (op_multiplicacao fator)* ;

fator : parcela outras_parcelas;

outras_parcelas : ('%' parcela)*;

parcela : IDENT | INTEIRO | instrucoes_com_retorno | instrucoes_de_vetores |'(' expressao ')';

op_opcional : op_relacional exp_aritmetica | ;

op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';

op_multiplicacao : '*' | '/';

op_adicao : '+' | '-';


/*Tokens: */
IDENT      : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

INTEIRO    : ('+' | '-')? ('0'..'9')('0'..'9')* | 'INFINITO' | 'infinito';

CADEIA     : '"' ~('\n' | '\r' | '\'' | '\t')* '\'' | '"' ~('\n' | '\r' | '"' | '\t')* '"';

COMENTARIO : '{' ~('\n'|'}')* '}' {skip();};

WS	       :	(' ' | '\t' | '\r' | '\n') {skip();};

/* Tokens errados: para tratarmos os mesmos foram setados tipos especificos(setType(int)) para cada um
 * assim para os tokens nao declarados foi setado o inteiro ERRO_TOKEN que possui por valor 10 e para os
 * os comentarios incompletos foi declarado ERRO_COMENT com o valor 11. Ambos os valores foram escolhidos
 * de forma parcial
 */
NAO_DECL   : ('@'| '|' | '!' | '"') {setType(ERRO_TOKEN);};

COMENTARIO_INCOMPLETO : '{' ~('\n'|'}')*'\n' {setType(ERRO_COMENT);};