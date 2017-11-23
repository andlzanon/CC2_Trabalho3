// Generated from Grafos.g4 by ANTLR 4.7
package trabalho3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrafosParser}.
 */
public interface GrafosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrafosParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(GrafosParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(GrafosParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GrafosParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GrafosParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GrafosParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GrafosParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#mais_variavel}.
	 * @param ctx the parse tree
	 */
	void enterMais_variavel(GrafosParser.Mais_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#mais_variavel}.
	 * @param ctx the parse tree
	 */
	void exitMais_variavel(GrafosParser.Mais_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrafosParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrafosParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(GrafosParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(GrafosParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes(GrafosParser.InstrucoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#instrucoes}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes(GrafosParser.InstrucoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#int_ou_ident}.
	 * @param ctx the parse tree
	 */
	void enterInt_ou_ident(GrafosParser.Int_ou_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#int_ou_ident}.
	 * @param ctx the parse tree
	 */
	void exitInt_ou_ident(GrafosParser.Int_ou_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#instrucoes_com_retorno}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#instrucoes_com_retorno}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#instrucoes_de_vetores}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#instrucoes_de_vetores}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#vetores_para}.
	 * @param ctx the parse tree
	 */
	void enterVetores_para(GrafosParser.Vetores_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#vetores_para}.
	 * @param ctx the parse tree
	 */
	void exitVetores_para(GrafosParser.Vetores_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#var_ou_cadeia}.
	 * @param ctx the parse tree
	 */
	void enterVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#var_ou_cadeia}.
	 * @param ctx the parse tree
	 */
	void exitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(GrafosParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(GrafosParser.Senao_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrafosParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrafosParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(GrafosParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(GrafosParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrafosParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrafosParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(GrafosParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(GrafosParser.Outros_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GrafosParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GrafosParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(GrafosParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(GrafosParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(GrafosParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(GrafosParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(GrafosParser.Op_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(GrafosParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(GrafosParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrafosParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(GrafosParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrafosParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(GrafosParser.Op_adicaoContext ctx);
}