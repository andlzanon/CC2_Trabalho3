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
		T__45=46, IDENT=47, INTEIRO=48, CADEIA=49, COMENTARIO=50, WS=51, NAO_DECL=52, 
		COMENTARIO_INCOMPLETO=53;
	public static final int
		RULE_algoritmo = 0, RULE_declaracao = 1, RULE_variavel = 2, RULE_mais_variavel = 3, 
		RULE_tipo = 4, RULE_codigo = 5, RULE_instrucoes = 6, RULE_instrucoes_com_retorno = 7, 
		RULE_instrucoes_de_vetores = 8, RULE_vetores_para = 9, RULE_var_ou_cadeia = 10, 
		RULE_senao_opcional = 11, RULE_expressao = 12, RULE_exp_aritmetica = 13, 
		RULE_outros_termos = 14, RULE_termo = 15, RULE_outros_fatores = 16, RULE_fator = 17, 
		RULE_outras_parcelas = 18, RULE_parcela = 19, RULE_op_opcional = 20, RULE_op_relacional = 21, 
		RULE_op_multiplicacao = 22, RULE_op_adicao = 23;
	public static final String[] ruleNames = {
		"algoritmo", "declaracao", "variavel", "mais_variavel", "tipo", "codigo", 
		"instrucoes", "instrucoes_com_retorno", "instrucoes_de_vetores", "vetores_para", 
		"var_ou_cadeia", "senao_opcional", "expressao", "exp_aritmetica", "outros_termos", 
		"termo", "outros_fatores", "fator", "outras_parcelas", "parcela", "op_opcional", 
		"op_relacional", "op_multiplicacao", "op_adicao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declaracoes'", "'inicio'", "'fim'", "','", "'grafo'", "'vertice'", 
		"'int'", "'vetor'", "'aresta'", "'('", "')'", "'remove_vert'", "'set_peso'", 
		"'set_custo_para_vertice'", "'imprime'", "'se'", "'entao'", "'fim_se'", 
		"'para'", "'em'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
		"'<-'", "'dijkstra'", "'prim'", "'dfs'", "'bfs'", "'get_peso'", "'get_custo_para_vertice'", 
		"'qtde_vert'", "'vizinhos'", "'vertices'", "'senao'", "'%'", "'='", "'<>'", 
		"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "IDENT", 
		"INTEIRO", "CADEIA", "COMENTARIO", "WS", "NAO_DECL", "COMENTARIO_INCOMPLETO"
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
			setState(48);
			match(T__0);
			setState(49);
			declaracao();
			setState(50);
			match(T__1);
			setState(51);
			codigo();
			setState(52);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				variavel();
				setState(55);
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
			setState(60);
			tipo();
			setState(61);
			match(IDENT);
			setState(62);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__3);
				setState(65);
				match(IDENT);
				setState(66);
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
			setState(70);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << IDENT))) != 0)) {
				{
				{
				setState(72);
				instrucoes();
				}
				}
				setState(77);
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
		public List<TerminalNode> IDENT() { return getTokens(GrafosParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrafosParser.IDENT, i);
		}
		public TerminalNode INTEIRO() { return getToken(GrafosParser.INTEIRO, 0); }
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__8);
				setState(79);
				match(T__9);
				setState(80);
				match(IDENT);
				setState(81);
				match(T__3);
				setState(82);
				match(IDENT);
				setState(83);
				match(T__3);
				setState(84);
				match(IDENT);
				setState(85);
				match(T__3);
				setState(86);
				match(INTEIRO);
				setState(87);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__11);
				setState(89);
				match(T__9);
				setState(90);
				match(IDENT);
				setState(91);
				match(T__3);
				setState(92);
				match(IDENT);
				setState(93);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__12);
				setState(95);
				match(T__9);
				setState(96);
				match(IDENT);
				setState(97);
				match(T__3);
				setState(98);
				match(IDENT);
				setState(99);
				match(T__3);
				setState(100);
				match(IDENT);
				setState(101);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__13);
				setState(103);
				match(T__9);
				setState(104);
				match(IDENT);
				setState(105);
				match(T__3);
				setState(106);
				match(IDENT);
				setState(107);
				match(T__3);
				setState(108);
				match(INTEIRO);
				setState(109);
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
				var_ou_cadeia();
				setState(113);
				match(T__10);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__15);
				setState(116);
				expressao();
				setState(117);
				match(T__16);
				setState(118);
				codigo();
				setState(119);
				senao_opcional();
				setState(120);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(T__18);
				setState(123);
				match(IDENT);
				setState(124);
				match(T__19);
				setState(125);
				vetores_para();
				setState(126);
				match(T__20);
				setState(127);
				codigo();
				setState(128);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(T__22);
				setState(131);
				expressao();
				setState(132);
				match(T__20);
				setState(133);
				codigo();
				setState(134);
				match(T__23);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				match(IDENT);
				setState(137);
				match(T__24);
				setState(138);
				expressao();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				match(T__25);
				setState(140);
				match(T__9);
				setState(141);
				match(IDENT);
				setState(142);
				match(T__3);
				setState(143);
				match(IDENT);
				setState(144);
				match(T__10);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(T__26);
				setState(146);
				match(T__9);
				setState(147);
				match(IDENT);
				setState(148);
				match(T__3);
				setState(149);
				match(IDENT);
				setState(150);
				match(T__10);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 12);
				{
				setState(151);
				match(T__27);
				setState(152);
				match(T__9);
				setState(153);
				match(IDENT);
				setState(154);
				match(T__3);
				setState(155);
				match(IDENT);
				setState(156);
				match(T__10);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				match(T__28);
				setState(158);
				match(T__9);
				setState(159);
				match(IDENT);
				setState(160);
				match(T__3);
				setState(161);
				match(IDENT);
				setState(162);
				match(T__10);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 14);
				{
				setState(163);
				instrucoes_com_retorno();
				}
				break;
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 15);
				{
				setState(164);
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

	public static class Instrucoes_com_retornoContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_instrucoes_com_retorno);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__29);
				setState(168);
				match(T__9);
				setState(169);
				match(IDENT);
				setState(170);
				match(T__3);
				setState(171);
				match(IDENT);
				setState(172);
				match(T__3);
				setState(173);
				match(IDENT);
				setState(174);
				match(T__10);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__30);
				setState(176);
				match(T__9);
				setState(177);
				match(IDENT);
				setState(178);
				match(T__3);
				setState(179);
				match(IDENT);
				setState(180);
				match(T__10);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__31);
				setState(182);
				match(T__9);
				setState(183);
				match(IDENT);
				setState(184);
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
		enterRule(_localctx, 16, RULE_instrucoes_de_vetores);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__32);
				setState(188);
				match(T__9);
				setState(189);
				match(IDENT);
				setState(190);
				match(T__3);
				setState(191);
				match(IDENT);
				setState(192);
				match(T__10);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__33);
				setState(194);
				match(T__9);
				setState(195);
				match(IDENT);
				setState(196);
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
		enterRule(_localctx, 18, RULE_vetores_para);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				instrucoes_de_vetores();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
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
		enterRule(_localctx, 20, RULE_var_ou_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 22, RULE_senao_opcional);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__34);
				setState(206);
				codigo();
				}
				break;
			case T__17:
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
		enterRule(_localctx, 24, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			exp_aritmetica();
			setState(211);
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
		enterRule(_localctx, 26, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			termo();
			setState(214);
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
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
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
		enterRule(_localctx, 28, RULE_outros_termos);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				op_adicao();
				setState(217);
				termo();
				setState(218);
				outros_termos();
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
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
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
		enterRule(_localctx, 30, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			fator();
			setState(224);
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
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
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
		enterRule(_localctx, 32, RULE_outros_fatores);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				op_multiplicacao();
				setState(227);
				fator();
				setState(228);
				outros_fatores();
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
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
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
		enterRule(_localctx, 34, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			parcela();
			setState(234);
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
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
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
		enterRule(_localctx, 36, RULE_outras_parcelas);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__35);
				setState(237);
				parcela();
				setState(238);
				outras_parcelas();
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
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
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

	public static class ParcelaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrafosParser.IDENT, 0); }
		public TerminalNode INTEIRO() { return getToken(GrafosParser.INTEIRO, 0); }
		public Instrucoes_com_retornoContext instrucoes_com_retorno() {
			return getRuleContext(Instrucoes_com_retornoContext.class,0);
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
		enterRule(_localctx, 38, RULE_parcela);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(IDENT);
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(INTEIRO);
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				instrucoes_com_retorno();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(T__9);
				setState(247);
				expressao();
				setState(248);
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
		enterRule(_localctx, 40, RULE_op_opcional);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				op_relacional();
				setState(253);
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
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
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
		enterRule(_localctx, 42, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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
		enterRule(_localctx, 46, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00bc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c8\n\n"+
		"\3\13\3\13\5\13\u00cc\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00d3\n\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00f4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00fd\n\25\3\26\3\26\3\26\3\26\5\26\u0103\n\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\2\7\3\2\7\n\4\2\61\61\63\63\3\2\',\3\2-.\3\2/\60\2\u010f\2\62\3\2\2\2"+
		"\4<\3\2\2\2\6>\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16\u00a7\3\2\2"+
		"\2\20\u00bb\3\2\2\2\22\u00c7\3\2\2\2\24\u00cb\3\2\2\2\26\u00cd\3\2\2\2"+
		"\30\u00d2\3\2\2\2\32\u00d4\3\2\2\2\34\u00d7\3\2\2\2\36\u00df\3\2\2\2 "+
		"\u00e1\3\2\2\2\"\u00e9\3\2\2\2$\u00eb\3\2\2\2&\u00f3\3\2\2\2(\u00fc\3"+
		"\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0106\3\2\2\2\60\u0108\3\2\2\2\62"+
		"\63\7\3\2\2\63\64\5\4\3\2\64\65\7\4\2\2\65\66\5\f\7\2\66\67\7\5\2\2\67"+
		"\3\3\2\2\289\5\6\4\29:\5\4\3\2:=\3\2\2\2;=\3\2\2\2<8\3\2\2\2<;\3\2\2\2"+
		"=\5\3\2\2\2>?\5\n\6\2?@\7\61\2\2@A\5\b\5\2A\7\3\2\2\2BC\7\6\2\2CD\7\61"+
		"\2\2DG\5\b\5\2EG\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\t\2\2\2I\13"+
		"\3\2\2\2JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\r\3\2\2\2"+
		"OM\3\2\2\2PQ\7\13\2\2QR\7\f\2\2RS\7\61\2\2ST\7\6\2\2TU\7\61\2\2UV\7\6"+
		"\2\2VW\7\61\2\2WX\7\6\2\2XY\7\62\2\2Y\u00a8\7\r\2\2Z[\7\16\2\2[\\\7\f"+
		"\2\2\\]\7\61\2\2]^\7\6\2\2^_\7\61\2\2_\u00a8\7\r\2\2`a\7\17\2\2ab\7\f"+
		"\2\2bc\7\61\2\2cd\7\6\2\2de\7\61\2\2ef\7\6\2\2fg\7\61\2\2g\u00a8\7\r\2"+
		"\2hi\7\20\2\2ij\7\f\2\2jk\7\61\2\2kl\7\6\2\2lm\7\61\2\2mn\7\6\2\2no\7"+
		"\62\2\2o\u00a8\7\r\2\2pq\7\21\2\2qr\7\f\2\2rs\5\26\f\2st\7\r\2\2t\u00a8"+
		"\3\2\2\2uv\7\22\2\2vw\5\32\16\2wx\7\23\2\2xy\5\f\7\2yz\5\30\r\2z{\7\24"+
		"\2\2{\u00a8\3\2\2\2|}\7\25\2\2}~\7\61\2\2~\177\7\26\2\2\177\u0080\5\24"+
		"\13\2\u0080\u0081\7\27\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7\30\2\2\u0083"+
		"\u00a8\3\2\2\2\u0084\u0085\7\31\2\2\u0085\u0086\5\32\16\2\u0086\u0087"+
		"\7\27\2\2\u0087\u0088\5\f\7\2\u0088\u0089\7\32\2\2\u0089\u00a8\3\2\2\2"+
		"\u008a\u008b\7\61\2\2\u008b\u008c\7\33\2\2\u008c\u00a8\5\32\16\2\u008d"+
		"\u008e\7\34\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7"+
		"\6\2\2\u0091\u0092\7\61\2\2\u0092\u00a8\7\r\2\2\u0093\u0094\7\35\2\2\u0094"+
		"\u0095\7\f\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7\6\2\2\u0097\u0098\7"+
		"\61\2\2\u0098\u00a8\7\r\2\2\u0099\u009a\7\36\2\2\u009a\u009b\7\f\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\7\6\2\2\u009d\u009e\7\61\2\2\u009e\u00a8\7"+
		"\r\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a8\7\r\2\2\u00a5\u00a8\5"+
		"\20\t\2\u00a6\u00a8\5\22\n\2\u00a7P\3\2\2\2\u00a7Z\3\2\2\2\u00a7`\3\2"+
		"\2\2\u00a7h\3\2\2\2\u00a7p\3\2\2\2\u00a7u\3\2\2\2\u00a7|\3\2\2\2\u00a7"+
		"\u0084\3\2\2\2\u00a7\u008a\3\2\2\2\u00a7\u008d\3\2\2\2\u00a7\u0093\3\2"+
		"\2\2\u00a7\u0099\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ab\7\f\2\2"+
		"\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af"+
		"\7\6\2\2\u00af\u00b0\7\61\2\2\u00b0\u00bc\7\r\2\2\u00b1\u00b2\7!\2\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7"+
		"\61\2\2\u00b6\u00bc\7\r\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7\f\2\2\u00b9"+
		"\u00ba\7\61\2\2\u00ba\u00bc\7\r\2\2\u00bb\u00a9\3\2\2\2\u00bb\u00b1\3"+
		"\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf"+
		"\7\f\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\61\2\2"+
		"\u00c2\u00c8\7\r\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6"+
		"\7\61\2\2\u00c6\u00c8\7\r\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3\2\2\2"+
		"\u00c8\23\3\2\2\2\u00c9\u00cc\5\22\n\2\u00ca\u00cc\7\61\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\25\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce"+
		"\27\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0\u00d3\5\f\7\2\u00d1\u00d3\3\2\2\2"+
		"\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d5"+
		"\5\34\17\2\u00d5\u00d6\5*\26\2\u00d6\33\3\2\2\2\u00d7\u00d8\5 \21\2\u00d8"+
		"\u00d9\5\36\20\2\u00d9\35\3\2\2\2\u00da\u00db\5\60\31\2\u00db\u00dc\5"+
		" \21\2\u00dc\u00dd\5\36\20\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\5$\23"+
		"\2\u00e2\u00e3\5\"\22\2\u00e3!\3\2\2\2\u00e4\u00e5\5.\30\2\u00e5\u00e6"+
		"\5$\23\2\u00e6\u00e7\5\"\22\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00e4\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ec\5"+
		"(\25\2\u00ec\u00ed\5&\24\2\u00ed%\3\2\2\2\u00ee\u00ef\7&\2\2\u00ef\u00f0"+
		"\5(\25\2\u00f0\u00f1\5&\24\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00fd\7\61\2"+
		"\2\u00f6\u00fd\7\62\2\2\u00f7\u00fd\5\20\t\2\u00f8\u00f9\7\f\2\2\u00f9"+
		"\u00fa\5\32\16\2\u00fa\u00fb\7\r\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f5\3"+
		"\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd"+
		")\3\2\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100\5\34\17\2\u0100\u0103\3\2\2"+
		"\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0101\3\2\2\2\u0103+"+
		"\3\2\2\2\u0104\u0105\t\4\2\2\u0105-\3\2\2\2\u0106\u0107\t\5\2\2\u0107"+
		"/\3\2\2\2\u0108\u0109\t\6\2\2\u0109\61\3\2\2\2\17<FM\u00a7\u00bb\u00c7"+
		"\u00cb\u00d2\u00df\u00e9\u00f3\u00fc\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}