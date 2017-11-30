// Generated from Grafos.g4 by ANTLR 4.7
package trabalho3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrafosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, IDENT=51, INTEIRO=52, 
		CADEIA=53, COMENTARIO=54, WS=55, NAO_DECL=56, COMENTARIO_INCOMPLETO=57;
	public static final int
		RULE_algoritmo = 0, RULE_declaracao = 1, RULE_variavel = 2, RULE_mais_variavel = 3, 
		RULE_tipo = 4, RULE_codigo = 5, RULE_instrucoes = 6, RULE_int_ou_ident = 7, 
		RULE_instrucoes_com_retorno = 8, RULE_instrucoes_de_vetores = 9, RULE_vetores_para = 10, 
		RULE_var_ou_cadeia = 11, RULE_senao_opcional = 12, RULE_expressao = 13, 
		RULE_exp_aritmetica = 14, RULE_outros_termos = 15, RULE_termo = 16, RULE_outros_fatores = 17, 
		RULE_fator = 18, RULE_outras_parcelas = 19, RULE_parcela = 20, RULE_op_opcional = 21, 
		RULE_op_relacional = 22, RULE_op_multiplicacao = 23, RULE_op_adicao = 24;
	public static final String[] ruleNames = {
		"algoritmo", "declaracao", "variavel", "mais_variavel", "tipo", "codigo", 
		"instrucoes", "int_ou_ident", "instrucoes_com_retorno", "instrucoes_de_vetores", 
		"vetores_para", "var_ou_cadeia", "senao_opcional", "expressao", "exp_aritmetica", 
		"outros_termos", "termo", "outros_fatores", "fator", "outras_parcelas", 
		"parcela", "op_opcional", "op_relacional", "op_multiplicacao", "op_adicao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declaracoes'", "'inicio'", "'fim'", "','", "'grafo'", "'vertice'", 
		"'int'", "'vetor'", "'aresta'", "'('", "')'", "'remove_vert'", "'set_custo_para_vertice'", 
		"'imprime'", "'empilha'", "'enfileira'", "'se'", "'entao'", "'fim_se'", 
		"'para'", "'em'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
		"'<-'", "'dijkstra'", "'prim'", "'dfs'", "'bfs'", "'get_peso'", "'get_custo_para_vertice'", 
		"'qtde_vert'", "'desempilha'", "'desenfila'", "'tamanho_vetor'", "'vizinhos'", 
		"'vertices'", "'senao'", "'%'", "'='", "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IDENT", "INTEIRO", "CADEIA", "COMENTARIO", "WS", "NAO_DECL", 
		"COMENTARIO_INCOMPLETO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grafos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    String grupo = "<619922_619795_619841_552437>";
	    private final int ERRO_COMENT = 11;
	    private final int ERRO_TOKEN = 10;

	public GrafosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AlgoritmoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			declaracao();
			setState(52);
			match(T__1);
			setState(53);
			codigo();
			setState(54);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				variavel();
				setState(57);
				declaracao();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public Mais_variavelContext mais_variavel() {
			return getRuleContext(Mais_variavelContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			tipo();
			setState(63);
			match(IDENT);
			setState(64);
			mais_variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_variavelContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public Mais_variavelContext mais_variavel() {
			return getRuleContext(Mais_variavelContext.class,0);
		}
		public Mais_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterMais_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitMais_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitMais_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_variavelContext mais_variavel() throws RecognitionException {
		Mais_variavelContext _localctx = new Mais_variavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mais_variavel);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__3);
				setState(67);
				match(IDENT);
				setState(68);
				mais_variavel();
				}
				break;
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoContext extends ParserRuleContext {
		public List<InstrucoesContext> instrucoes() {
			return getRuleContexts(InstrucoesContext.class);
		}
		public InstrucoesContext instrucoes(int i) {
			return getRuleContext(InstrucoesContext.class,i);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_codigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << IDENT))) != 0)) {
				{
				{
				setState(74);
				instrucoes();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucoesContext extends ParserRuleContext {
		public Token pa_grafo;
		public Token pa_vertice1;
		public Token pa_vertice2;
		public Token a_int;
		public Token pr_grafo;
		public Token pr_vertice;
		public Token ps_grafo;
		public Token ps_vertice;
		public Token pem_vetor;
		public Token pen_vetor;
		public Token para;
		public Token atribuicao;
		public Token pd_grafo;
		public Token pd_vertice;
		public Token pp_grafo;
		public Token pp_vertice;
		public Token pdfs_grafo;
		public Token pdfs_vertice;
		public Token pbfs_grafo;
		public Token pbfs_vertice;
		public List<TerminalNode> IDENT() { return getTokens(GrafosParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrafosParser.IDENT, i);
		}
		public TerminalNode INTEIRO() { return getToken(GrafosParser.INTEIRO, 0); }
		public Int_ou_identContext int_ou_ident() {
			return getRuleContext(Int_ou_identContext.class,0);
		}
		public Var_ou_cadeiaContext var_ou_cadeia() {
			return getRuleContext(Var_ou_cadeiaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public Vetores_paraContext vetores_para() {
			return getRuleContext(Vetores_paraContext.class,0);
		}
		public Instrucoes_com_retornoContext instrucoes_com_retorno() {
			return getRuleContext(Instrucoes_com_retornoContext.class,0);
		}
		public Instrucoes_de_vetoresContext instrucoes_de_vetores() {
			return getRuleContext(Instrucoes_de_vetoresContext.class,0);
		}
		public InstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterInstrucoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitInstrucoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitInstrucoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucoesContext instrucoes() throws RecognitionException {
		InstrucoesContext _localctx = new InstrucoesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrucoes);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__8);
				setState(81);
				match(T__9);
				setState(82);
				((InstrucoesContext)_localctx).pa_grafo = match(IDENT);
				setState(83);
				match(T__3);
				setState(84);
				((InstrucoesContext)_localctx).pa_vertice1 = match(IDENT);
				setState(85);
				match(T__3);
				setState(86);
				((InstrucoesContext)_localctx).pa_vertice2 = match(IDENT);
				setState(87);
				match(T__3);
				setState(88);
				((InstrucoesContext)_localctx).a_int = match(INTEIRO);
				setState(89);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__11);
				setState(91);
				match(T__9);
				setState(92);
				((InstrucoesContext)_localctx).pr_grafo = match(IDENT);
				setState(93);
				match(T__3);
				setState(94);
				((InstrucoesContext)_localctx).pr_vertice = match(IDENT);
				setState(95);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__12);
				setState(97);
				match(T__9);
				setState(98);
				((InstrucoesContext)_localctx).ps_grafo = match(IDENT);
				setState(99);
				match(T__3);
				setState(100);
				((InstrucoesContext)_localctx).ps_vertice = match(IDENT);
				setState(101);
				match(T__3);
				setState(102);
				int_ou_ident();
				setState(103);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__13);
				setState(106);
				match(T__9);
				setState(107);
				var_ou_cadeia();
				setState(108);
				match(T__10);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__14);
				setState(111);
				match(T__9);
				setState(112);
				((InstrucoesContext)_localctx).pem_vetor = match(IDENT);
				setState(113);
				match(T__3);
				setState(114);
				int_ou_ident();
				setState(115);
				match(T__10);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__15);
				setState(118);
				match(T__9);
				setState(119);
				((InstrucoesContext)_localctx).pen_vetor = match(IDENT);
				setState(120);
				match(T__3);
				setState(121);
				int_ou_ident();
				setState(122);
				match(T__10);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				match(T__16);
				setState(125);
				expressao();
				setState(126);
				match(T__17);
				setState(127);
				codigo();
				setState(128);
				senao_opcional();
				setState(129);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(T__19);
				setState(132);
				((InstrucoesContext)_localctx).para = match(IDENT);
				setState(133);
				match(T__20);
				setState(134);
				vetores_para();
				setState(135);
				match(T__21);
				setState(136);
				codigo();
				setState(137);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				match(T__23);
				setState(140);
				expressao();
				setState(141);
				match(T__21);
				setState(142);
				codigo();
				setState(143);
				match(T__24);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				((InstrucoesContext)_localctx).atribuicao = match(IDENT);
				setState(146);
				match(T__25);
				setState(147);
				expressao();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				match(T__26);
				setState(149);
				match(T__9);
				setState(150);
				((InstrucoesContext)_localctx).pd_grafo = match(IDENT);
				setState(151);
				match(T__3);
				setState(152);
				((InstrucoesContext)_localctx).pd_vertice = match(IDENT);
				setState(153);
				match(T__10);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(T__27);
				setState(155);
				match(T__9);
				setState(156);
				((InstrucoesContext)_localctx).pp_grafo = match(IDENT);
				setState(157);
				match(T__3);
				setState(158);
				((InstrucoesContext)_localctx).pp_vertice = match(IDENT);
				setState(159);
				match(T__10);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				match(T__28);
				setState(161);
				match(T__9);
				setState(162);
				((InstrucoesContext)_localctx).pdfs_grafo = match(IDENT);
				setState(163);
				match(T__3);
				setState(164);
				((InstrucoesContext)_localctx).pdfs_vertice = match(IDENT);
				setState(165);
				match(T__10);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				match(T__29);
				setState(167);
				match(T__9);
				setState(168);
				((InstrucoesContext)_localctx).pbfs_grafo = match(IDENT);
				setState(169);
				match(T__3);
				setState(170);
				((InstrucoesContext)_localctx).pbfs_vertice = match(IDENT);
				setState(171);
				match(T__10);
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 15);
				{
				setState(172);
				instrucoes_com_retorno();
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 16);
				{
				setState(173);
				instrucoes_de_vetores();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_ou_identContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(GrafosParser.INTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public Int_ou_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_ou_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterInt_ou_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitInt_ou_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitInt_ou_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_ou_identContext int_ou_ident() throws RecognitionException {
		Int_ou_identContext _localctx = new Int_ou_identContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_int_ou_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==INTEIRO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucoes_com_retornoContext extends ParserRuleContext {
		public Token pgp_grafo;
		public Token pgp_vertice1;
		public Token pgp_vertice2;
		public Token pgc_grafo;
		public Token pgc_vertice;
		public Token pqv_grafo;
		public Token pdem_vetor;
		public Token pden_vetor;
		public Token ptam_vetor;
		public List<TerminalNode> IDENT() { return getTokens(GrafosParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrafosParser.IDENT, i);
		}
		public Instrucoes_com_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_com_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterInstrucoes_com_retorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitInstrucoes_com_retorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitInstrucoes_com_retorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucoes_com_retornoContext instrucoes_com_retorno() throws RecognitionException {
		Instrucoes_com_retornoContext _localctx = new Instrucoes_com_retornoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucoes_com_retorno);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__30);
				setState(179);
				match(T__9);
				setState(180);
				((Instrucoes_com_retornoContext)_localctx).pgp_grafo = match(IDENT);
				setState(181);
				match(T__3);
				setState(182);
				((Instrucoes_com_retornoContext)_localctx).pgp_vertice1 = match(IDENT);
				setState(183);
				match(T__3);
				setState(184);
				((Instrucoes_com_retornoContext)_localctx).pgp_vertice2 = match(IDENT);
				setState(185);
				match(T__10);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__31);
				setState(187);
				match(T__9);
				setState(188);
				((Instrucoes_com_retornoContext)_localctx).pgc_grafo = match(IDENT);
				setState(189);
				match(T__3);
				setState(190);
				((Instrucoes_com_retornoContext)_localctx).pgc_vertice = match(IDENT);
				setState(191);
				match(T__10);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__32);
				setState(193);
				match(T__9);
				setState(194);
				((Instrucoes_com_retornoContext)_localctx).pqv_grafo = match(IDENT);
				setState(195);
				match(T__10);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(T__33);
				setState(197);
				match(T__9);
				setState(198);
				((Instrucoes_com_retornoContext)_localctx).pdem_vetor = match(IDENT);
				setState(199);
				match(T__10);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(T__34);
				setState(201);
				match(T__9);
				setState(202);
				((Instrucoes_com_retornoContext)_localctx).pden_vetor = match(IDENT);
				setState(203);
				match(T__10);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(T__35);
				setState(205);
				match(T__9);
				setState(206);
				((Instrucoes_com_retornoContext)_localctx).ptam_vetor = match(IDENT);
				setState(207);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instrucoes_de_vetoresContext extends ParserRuleContext {
		public Token pv_grafo;
		public Token pv_vertice;
		public Token pver_grafo;
		public List<TerminalNode> IDENT() { return getTokens(GrafosParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrafosParser.IDENT, i);
		}
		public Instrucoes_de_vetoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_de_vetores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterInstrucoes_de_vetores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitInstrucoes_de_vetores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitInstrucoes_de_vetores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucoes_de_vetoresContext instrucoes_de_vetores() throws RecognitionException {
		Instrucoes_de_vetoresContext _localctx = new Instrucoes_de_vetoresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucoes_de_vetores);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__36);
				setState(211);
				match(T__9);
				setState(212);
				((Instrucoes_de_vetoresContext)_localctx).pv_grafo = match(IDENT);
				setState(213);
				match(T__3);
				setState(214);
				((Instrucoes_de_vetoresContext)_localctx).pv_vertice = match(IDENT);
				setState(215);
				match(T__10);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__37);
				setState(217);
				match(T__9);
				setState(218);
				((Instrucoes_de_vetoresContext)_localctx).pver_grafo = match(IDENT);
				setState(219);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vetores_paraContext extends ParserRuleContext {
		public Instrucoes_de_vetoresContext instrucoes_de_vetores() {
			return getRuleContext(Instrucoes_de_vetoresContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public Vetores_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vetores_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterVetores_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitVetores_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitVetores_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vetores_paraContext vetores_para() throws RecognitionException {
		Vetores_paraContext _localctx = new Vetores_paraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vetores_para);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				instrucoes_de_vetores();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_ou_cadeiaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(GrafosParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public Var_ou_cadeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_ou_cadeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterVar_ou_cadeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitVar_ou_cadeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitVar_ou_cadeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_ou_cadeiaContext var_ou_cadeia() throws RecognitionException {
		Var_ou_cadeiaContext _localctx = new Var_ou_cadeiaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_ou_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==CADEIA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Senao_opcionalContext extends ParserRuleContext {
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitSenao_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitSenao_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_senao_opcional);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__38);
				setState(229);
				codigo();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			exp_aritmetica();
			setState(234);
			op_opcional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			termo();
			setState(237);
			outros_termos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_termosContext extends ParserRuleContext {
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOutros_termos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOutros_termos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_outros_termos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__49) {
				{
				{
				setState(239);
				op_adicao();
				setState(240);
				termo();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			fator();
			setState(248);
			outros_fatores();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_fatoresContext extends ParserRuleContext {
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOutros_fatores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOutros_fatores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46 || _la==T__47) {
				{
				{
				setState(250);
				op_multiplicacao();
				setState(251);
				fator();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			parcela();
			setState(259);
			outras_parcelas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outras_parcelasContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOutras_parcelas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOutras_parcelas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(261);
				match(T__39);
				setState(262);
				parcela();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public TerminalNode INTEIRO() { return getToken(GrafosParser.INTEIRO, 0); }
		public Instrucoes_com_retornoContext instrucoes_com_retorno() {
			return getRuleContext(Instrucoes_com_retornoContext.class,0);
		}
		public Instrucoes_de_vetoresContext instrucoes_de_vetores() {
			return getRuleContext(Instrucoes_de_vetoresContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parcela);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(IDENT);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(INTEIRO);
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				instrucoes_com_retorno();
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				instrucoes_de_vetores();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(T__9);
				setState(273);
				expressao();
				setState(274);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_opcionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOp_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOp_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_opcional);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				op_relacional();
				setState(279);
				exp_aritmetica();
				}
				break;
			case T__2:
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOp_multiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOp_multiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_adicaoContext extends ParserRuleContext {
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrafosListener ) ((GrafosListener)listener).exitOp_adicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrafosVisitor ) return ((GrafosVisitor<? extends T>)visitor).visitOp_adicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\7\7\7N\n\7\f\7\16\7Q\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d3\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3\f\3\f\5\f\u00e3\n\f\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u0100\n\23\f\23\16\23\u0103\13\23\3\24\3\24\3\24\3\25\3\25\7\25"+
		"\u010a\n\25\f\25\16\25\u010d\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0117\n\26\3\27\3\27\3\27\3\27\5\27\u011d\n\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\b\3\2\7\n\3\2\65\66\4\2\65\65\67\67\3\2+\60\3\2\61\62"+
		"\3\2\63\64\2\u012d\2\64\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bH\3\2\2\2\nJ\3"+
		"\2\2\2\fO\3\2\2\2\16\u00b0\3\2\2\2\20\u00b2\3\2\2\2\22\u00d2\3\2\2\2\24"+
		"\u00de\3\2\2\2\26\u00e2\3\2\2\2\30\u00e4\3\2\2\2\32\u00e9\3\2\2\2\34\u00eb"+
		"\3\2\2\2\36\u00ee\3\2\2\2 \u00f6\3\2\2\2\"\u00f9\3\2\2\2$\u0101\3\2\2"+
		"\2&\u0104\3\2\2\2(\u010b\3\2\2\2*\u0116\3\2\2\2,\u011c\3\2\2\2.\u011e"+
		"\3\2\2\2\60\u0120\3\2\2\2\62\u0122\3\2\2\2\64\65\7\3\2\2\65\66\5\4\3\2"+
		"\66\67\7\4\2\2\678\5\f\7\289\7\5\2\29\3\3\2\2\2:;\5\6\4\2;<\5\4\3\2<?"+
		"\3\2\2\2=?\3\2\2\2>:\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\5\n\6\2AB\7\65\2\2"+
		"BC\5\b\5\2C\7\3\2\2\2DE\7\6\2\2EF\7\65\2\2FI\5\b\5\2GI\3\2\2\2HD\3\2\2"+
		"\2HG\3\2\2\2I\t\3\2\2\2JK\t\2\2\2K\13\3\2\2\2LN\5\16\b\2ML\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QO\3\2\2\2RS\7\13\2\2ST\7\f\2\2T"+
		"U\7\65\2\2UV\7\6\2\2VW\7\65\2\2WX\7\6\2\2XY\7\65\2\2YZ\7\6\2\2Z[\7\66"+
		"\2\2[\u00b1\7\r\2\2\\]\7\16\2\2]^\7\f\2\2^_\7\65\2\2_`\7\6\2\2`a\7\65"+
		"\2\2a\u00b1\7\r\2\2bc\7\17\2\2cd\7\f\2\2de\7\65\2\2ef\7\6\2\2fg\7\65\2"+
		"\2gh\7\6\2\2hi\5\20\t\2ij\7\r\2\2j\u00b1\3\2\2\2kl\7\20\2\2lm\7\f\2\2"+
		"mn\5\30\r\2no\7\r\2\2o\u00b1\3\2\2\2pq\7\21\2\2qr\7\f\2\2rs\7\65\2\2s"+
		"t\7\6\2\2tu\5\20\t\2uv\7\r\2\2v\u00b1\3\2\2\2wx\7\22\2\2xy\7\f\2\2yz\7"+
		"\65\2\2z{\7\6\2\2{|\5\20\t\2|}\7\r\2\2}\u00b1\3\2\2\2~\177\7\23\2\2\177"+
		"\u0080\5\34\17\2\u0080\u0081\7\24\2\2\u0081\u0082\5\f\7\2\u0082\u0083"+
		"\5\32\16\2\u0083\u0084\7\25\2\2\u0084\u00b1\3\2\2\2\u0085\u0086\7\26\2"+
		"\2\u0086\u0087\7\65\2\2\u0087\u0088\7\27\2\2\u0088\u0089\5\26\f\2\u0089"+
		"\u008a\7\30\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\31\2\2\u008c\u00b1\3"+
		"\2\2\2\u008d\u008e\7\32\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\30\2\2"+
		"\u0090\u0091\5\f\7\2\u0091\u0092\7\33\2\2\u0092\u00b1\3\2\2\2\u0093\u0094"+
		"\7\65\2\2\u0094\u0095\7\34\2\2\u0095\u00b1\5\34\17\2\u0096\u0097\7\35"+
		"\2\2\u0097\u0098\7\f\2\2\u0098\u0099\7\65\2\2\u0099\u009a\7\6\2\2\u009a"+
		"\u009b\7\65\2\2\u009b\u00b1\7\r\2\2\u009c\u009d\7\36\2\2\u009d\u009e\7"+
		"\f\2\2\u009e\u009f\7\65\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\7\65\2\2\u00a1"+
		"\u00b1\7\r\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7"+
		"\65\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\65\2\2\u00a7\u00b1\7\r\2\2\u00a8"+
		"\u00a9\7 \2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\7\6"+
		"\2\2\u00ac\u00ad\7\65\2\2\u00ad\u00b1\7\r\2\2\u00ae\u00b1\5\22\n\2\u00af"+
		"\u00b1\5\24\13\2\u00b0R\3\2\2\2\u00b0\\\3\2\2\2\u00b0b\3\2\2\2\u00b0k"+
		"\3\2\2\2\u00b0p\3\2\2\2\u00b0w\3\2\2\2\u00b0~\3\2\2\2\u00b0\u0085\3\2"+
		"\2\2\u00b0\u008d\3\2\2\2\u00b0\u0093\3\2\2\2\u00b0\u0096\3\2\2\2\u00b0"+
		"\u009c\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\21"+
		"\3\2\2\2\u00b4\u00b5\7!\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7\65\2\2\u00b7"+
		"\u00b8\7\6\2\2\u00b8\u00b9\7\65\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\7"+
		"\65\2\2\u00bb\u00d3\7\r\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\u00bf\7\65\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00d3\7"+
		"\r\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\7\65\2\2\u00c5"+
		"\u00d3\7\r\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7\65"+
		"\2\2\u00c9\u00d3\7\r\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\7\f\2\2\u00cc"+
		"\u00cd\7\65\2\2\u00cd\u00d3\7\r\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d0\7\f"+
		"\2\2\u00d0\u00d1\7\65\2\2\u00d1\u00d3\7\r\2\2\u00d2\u00b4\3\2\2\2\u00d2"+
		"\u00bc\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00ca\3\2"+
		"\2\2\u00d2\u00ce\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5\u00d6"+
		"\7\f\2\2\u00d6\u00d7\7\65\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\7\65\2\2"+
		"\u00d9\u00df\7\r\2\2\u00da\u00db\7(\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd"+
		"\7\65\2\2\u00dd\u00df\7\r\2\2\u00de\u00d4\3\2\2\2\u00de\u00da\3\2\2\2"+
		"\u00df\25\3\2\2\2\u00e0\u00e3\5\24\13\2\u00e1\u00e3\7\65\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\27\3\2\2\2\u00e4\u00e5\t\4\2\2\u00e5"+
		"\31\3\2\2\2\u00e6\u00e7\7)\2\2\u00e7\u00ea\5\f\7\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ec"+
		"\5\36\20\2\u00ec\u00ed\5,\27\2\u00ed\35\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef"+
		"\u00f0\5 \21\2\u00f0\37\3\2\2\2\u00f1\u00f2\5\62\32\2\u00f2\u00f3\5\""+
		"\22\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7!\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fa\5&\24\2\u00fa\u00fb\5$\23\2\u00fb#\3\2\2\2\u00fc\u00fd\5"+
		"\60\31\2\u00fd\u00fe\5&\24\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102%\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0105\5*\26\2\u0105\u0106\5(\25\2\u0106\'\3"+
		"\2\2\2\u0107\u0108\7*\2\2\u0108\u010a\5*\26\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c)\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010e\u0117\7\65\2\2\u010f\u0117\7\66\2\2\u0110\u0117"+
		"\5\22\n\2\u0111\u0117\5\24\13\2\u0112\u0113\7\f\2\2\u0113\u0114\5\34\17"+
		"\2\u0114\u0115\7\r\2\2\u0115\u0117\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f"+
		"\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0117"+
		"+\3\2\2\2\u0118\u0119\5.\30\2\u0119\u011a\5\36\20\2\u011a\u011d\3\2\2"+
		"\2\u011b\u011d\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011b\3\2\2\2\u011d-"+
		"\3\2\2\2\u011e\u011f\t\5\2\2\u011f/\3\2\2\2\u0120\u0121\t\6\2\2\u0121"+
		"\61\3\2\2\2\u0122\u0123\t\7\2\2\u0123\63\3\2\2\2\17>HO\u00b0\u00d2\u00de"+
		"\u00e2\u00e9\u00f6\u0101\u010b\u0116\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}