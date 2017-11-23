// Generated from Grafos.g4 by ANTLR 4.7
package trabalho3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrafosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrafosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrafosParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(GrafosParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GrafosParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GrafosParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#mais_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_variavel(GrafosParser.Mais_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GrafosParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(GrafosParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#instrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes(GrafosParser.InstrucoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#int_ou_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_ou_ident(GrafosParser.Int_ou_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#instrucoes_com_retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_com_retorno(GrafosParser.Instrucoes_com_retornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#instrucoes_de_vetores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_de_vetores(GrafosParser.Instrucoes_de_vetoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#vetores_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVetores_para(GrafosParser.Vetores_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#var_ou_cadeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_ou_cadeia(GrafosParser.Var_ou_cadeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#senao_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao_opcional(GrafosParser.Senao_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GrafosParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(GrafosParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#outros_termos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_termos(GrafosParser.Outros_termosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GrafosParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#outros_fatores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_fatores(GrafosParser.Outros_fatoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(GrafosParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#outras_parcelas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutras_parcelas(GrafosParser.Outras_parcelasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(GrafosParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#op_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_opcional(GrafosParser.Op_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(GrafosParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_multiplicacao(GrafosParser.Op_multiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrafosParser#op_adicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_adicao(GrafosParser.Op_adicaoContext ctx);
}