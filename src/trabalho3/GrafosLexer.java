// Generated from Grafos.g4 by ANTLR 4.7
package trabalho3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrafosLexer extends Lexer {
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
		T__45=46, T__46=47, T__47=48, T__48=49, IDENT=50, INTEIRO=51, CADEIA=52, 
		COMENTARIO=53, WS=54, NAO_DECL=55, COMENTARIO_INCOMPLETO=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"IDENT", "INTEIRO", "CADEIA", "COMENTARIO", "WS", "NAO_DECL", "COMENTARIO_INCOMPLETO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declaracoes'", "'inicio'", "'fim'", "','", "'grafo'", "'vertice'", 
		"'int'", "'vetor'", "'aresta'", "'('", "')'", "'remove_vert'", "'set_custo_para_vertice'", 
		"'imprime'", "'empilha'", "'enfileira'", "'se'", "'entao'", "'fim_se'", 
		"'para'", "'em'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
		"'<-'", "'dijkstra'", "'prim'", "'dfs'", "'bfs'", "'get_peso'", "'get_custo_para_vertice'", 
		"'qtde_vert'", "'desempilha'", "'desenfila'", "'vizinhos'", "'vertices'", 
		"'senao'", "'%'", "'='", "'<>'", "'>='", "'<='", "'>'", "'<'", "'*'", 
		"'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "IDENT", "INTEIRO", "CADEIA", "COMENTARIO", "WS", "NAO_DECL", 
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


	    String grupo = "<619922_619795_619841_552437>";
	    private final int ERRO_COMENT = 11;
	    private final int ERRO_TOKEN = 10;


	public GrafosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grafos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 52:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			NAO_DECL_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			COMENTARIO_INCOMPLETO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void NAO_DECL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setType(ERRO_TOKEN);
			break;
		}
	}
	private void COMENTARIO_INCOMPLETO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setType(ERRO_COMENT);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0200\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u01b4\n\63"+
		"\f\63\16\63\u01b7\13\63\3\64\5\64\u01ba\n\64\3\64\3\64\7\64\u01be\n\64"+
		"\f\64\16\64\u01c1\13\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01d3\n\64\3\65\3\65\7\65\u01d7"+
		"\n\65\f\65\16\65\u01da\13\65\3\65\3\65\3\65\7\65\u01df\n\65\f\65\16\65"+
		"\u01e2\13\65\3\65\5\65\u01e5\n\65\3\66\3\66\7\66\u01e9\n\66\f\66\16\66"+
		"\u01ec\13\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\79\u01f9\n9"+
		"\f9\169\u01fc\139\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"--//\5\2\13\f\17\17))\5\2\13\f\17\17$$\4\2\f\f\177\177\5\2\13\f\17\17"+
		"\"\"\5\2#$BB~~\2\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5\177\3\2\2"+
		"\2\7\u0086\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u0092\3\2\2\2\17"+
		"\u009a\3\2\2\2\21\u009e\3\2\2\2\23\u00a4\3\2\2\2\25\u00ab\3\2\2\2\27\u00ad"+
		"\3\2\2\2\31\u00af\3\2\2\2\33\u00bb\3\2\2\2\35\u00d2\3\2\2\2\37\u00da\3"+
		"\2\2\2!\u00e2\3\2\2\2#\u00ec\3\2\2\2%\u00ef\3\2\2\2\'\u00f5\3\2\2\2)\u00fc"+
		"\3\2\2\2+\u0101\3\2\2\2-\u0104\3\2\2\2/\u0109\3\2\2\2\61\u0112\3\2\2\2"+
		"\63\u011b\3\2\2\2\65\u0128\3\2\2\2\67\u012b\3\2\2\29\u0134\3\2\2\2;\u0139"+
		"\3\2\2\2=\u013d\3\2\2\2?\u0141\3\2\2\2A\u014a\3\2\2\2C\u0161\3\2\2\2E"+
		"\u016b\3\2\2\2G\u0176\3\2\2\2I\u0180\3\2\2\2K\u0189\3\2\2\2M\u0192\3\2"+
		"\2\2O\u0198\3\2\2\2Q\u019a\3\2\2\2S\u019c\3\2\2\2U\u019f\3\2\2\2W\u01a2"+
		"\3\2\2\2Y\u01a5\3\2\2\2[\u01a7\3\2\2\2]\u01a9\3\2\2\2_\u01ab\3\2\2\2a"+
		"\u01ad\3\2\2\2c\u01af\3\2\2\2e\u01b1\3\2\2\2g\u01d2\3\2\2\2i\u01e4\3\2"+
		"\2\2k\u01e6\3\2\2\2m\u01f0\3\2\2\2o\u01f3\3\2\2\2q\u01f6\3\2\2\2st\7f"+
		"\2\2tu\7g\2\2uv\7e\2\2vw\7n\2\2wx\7c\2\2xy\7t\2\2yz\7c\2\2z{\7e\2\2{|"+
		"\7q\2\2|}\7g\2\2}~\7u\2\2~\4\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2"+
		"\2\u0081\u0082\7k\2\2\u0082\u0083\7e\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7q\2\2\u0085\6\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7o\2\2\u0089\b\3\2\2\2\u008a\u008b\7.\2\2\u008b\n\3\2\2\2\u008c\u008d"+
		"\7i\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7q\2\2\u0091\f\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097\u0098\7e\2\2"+
		"\u0098\u0099\7g\2\2\u0099\16\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7"+
		"p\2\2\u009c\u009d\7v\2\2\u009d\20\3\2\2\2\u009e\u009f\7x\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa\24\3\2\2\2\u00ab"+
		"\u00ac\7*\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7q\2\2"+
		"\u00b3\u00b4\7x\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7"+
		"\7x\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\32\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7a\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7u\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9"+
		"\u00ca\7a\2\2\u00ca\u00cb\7x\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2"+
		"\u00cd\u00ce\7v\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5"+
		"\7r\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7o\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\36\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7o\2\2\u00dc"+
		"\u00dd\7r\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7j\2\2"+
		"\u00e0\u00e1\7c\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2"+
		"\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\"\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee$\3\2\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7c\2\2"+
		"\u00f3\u00f4\7q\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7k\2"+
		"\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7a\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7c\2\2\u0100*\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103"+
		"\7o\2\2\u0103,\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106\7c\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7c\2\2\u0108.\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b"+
		"\7k\2\2\u010b\u010c\7o\2\2\u010c\u010d\7a\2\2\u010d\u010e\7r\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7t\2\2\u0110\u0111\7c\2\2\u0111\60\3\2\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7p\2\2\u0114\u0115\7s\2\2\u0115\u0116\7w\2\2"+
		"\u0116\u0117\7c\2\2\u0117\u0118\7p\2\2\u0118\u0119\7v\2\2\u0119\u011a"+
		"\7q\2\2\u011a\62\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d\7k\2\2\u011d\u011e"+
		"\7o\2\2\u011e\u011f\7a\2\2\u011f\u0120\7g\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7s\2\2\u0122\u0123\7w\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2"+
		"\u0125\u0126\7v\2\2\u0126\u0127\7q\2\2\u0127\64\3\2\2\2\u0128\u0129\7"+
		">\2\2\u0129\u012a\7/\2\2\u012a\66\3\2\2\2\u012b\u012c\7f\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7l\2\2\u012e\u012f\7m\2\2\u012f\u0130\7u\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7t\2\2\u0132\u0133\7c\2\2\u01338\3\2\2\2\u0134"+
		"\u0135\7r\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2\u0137\u0138\7o\2\2"+
		"\u0138:\3\2\2\2\u0139\u013a\7f\2\2\u013a\u013b\7h\2\2\u013b\u013c\7u\2"+
		"\2\u013c<\3\2\2\2\u013d\u013e\7d\2\2\u013e\u013f\7h\2\2\u013f\u0140\7"+
		"u\2\2\u0140>\3\2\2\2\u0141\u0142\7i\2\2\u0142\u0143\7g\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7a\2\2\u0145\u0146\7r\2\2\u0146\u0147\7g\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u0149\7q\2\2\u0149@\3\2\2\2\u014a\u014b\7i\2\2\u014b"+
		"\u014c\7g\2\2\u014c\u014d\7v\2\2\u014d\u014e\7a\2\2\u014e\u014f\7e\2\2"+
		"\u014f\u0150\7w\2\2\u0150\u0151\7u\2\2\u0151\u0152\7v\2\2\u0152\u0153"+
		"\7q\2\2\u0153\u0154\7a\2\2\u0154\u0155\7r\2\2\u0155\u0156\7c\2\2\u0156"+
		"\u0157\7t\2\2\u0157\u0158\7c\2\2\u0158\u0159\7a\2\2\u0159\u015a\7x\2\2"+
		"\u015a\u015b\7g\2\2\u015b\u015c\7t\2\2\u015c\u015d\7v\2\2\u015d\u015e"+
		"\7k\2\2\u015e\u015f\7e\2\2\u015f\u0160\7g\2\2\u0160B\3\2\2\2\u0161\u0162"+
		"\7s\2\2\u0162\u0163\7v\2\2\u0163\u0164\7f\2\2\u0164\u0165\7g\2\2\u0165"+
		"\u0166\7a\2\2\u0166\u0167\7x\2\2\u0167\u0168\7g\2\2\u0168\u0169\7t\2\2"+
		"\u0169\u016a\7v\2\2\u016aD\3\2\2\2\u016b\u016c\7f\2\2\u016c\u016d\7g\2"+
		"\2\u016d\u016e\7u\2\2\u016e\u016f\7g\2\2\u016f\u0170\7o\2\2\u0170\u0171"+
		"\7r\2\2\u0171\u0172\7k\2\2\u0172\u0173\7n\2\2\u0173\u0174\7j\2\2\u0174"+
		"\u0175\7c\2\2\u0175F\3\2\2\2\u0176\u0177\7f\2\2\u0177\u0178\7g\2\2\u0178"+
		"\u0179\7u\2\2\u0179\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b\u017c\7h\2\2"+
		"\u017c\u017d\7k\2\2\u017d\u017e\7n\2\2\u017e\u017f\7c\2\2\u017fH\3\2\2"+
		"\2\u0180\u0181\7x\2\2\u0181\u0182\7k\2\2\u0182\u0183\7|\2\2\u0183\u0184"+
		"\7k\2\2\u0184\u0185\7p\2\2\u0185\u0186\7j\2\2\u0186\u0187\7q\2\2\u0187"+
		"\u0188\7u\2\2\u0188J\3\2\2\2\u0189\u018a\7x\2\2\u018a\u018b\7g\2\2\u018b"+
		"\u018c\7t\2\2\u018c\u018d\7v\2\2\u018d\u018e\7k\2\2\u018e\u018f\7e\2\2"+
		"\u018f\u0190\7g\2\2\u0190\u0191\7u\2\2\u0191L\3\2\2\2\u0192\u0193\7u\2"+
		"\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7c\2\2\u0196\u0197"+
		"\7q\2\2\u0197N\3\2\2\2\u0198\u0199\7\'\2\2\u0199P\3\2\2\2\u019a\u019b"+
		"\7?\2\2\u019bR\3\2\2\2\u019c\u019d\7>\2\2\u019d\u019e\7@\2\2\u019eT\3"+
		"\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1\7?\2\2\u01a1V\3\2\2\2\u01a2\u01a3"+
		"\7>\2\2\u01a3\u01a4\7?\2\2\u01a4X\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6Z\3"+
		"\2\2\2\u01a7\u01a8\7>\2\2\u01a8\\\3\2\2\2\u01a9\u01aa\7,\2\2\u01aa^\3"+
		"\2\2\2\u01ab\u01ac\7\61\2\2\u01ac`\3\2\2\2\u01ad\u01ae\7-\2\2\u01aeb\3"+
		"\2\2\2\u01af\u01b0\7/\2\2\u01b0d\3\2\2\2\u01b1\u01b5\t\2\2\2\u01b2\u01b4"+
		"\t\3\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6f\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\t\4\2\2"+
		"\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf"+
		"\4\62;\2\u01bc\u01be\4\62;\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01d3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\7K\2\2\u01c3\u01c4\7P\2\2\u01c4\u01c5\7H\2\2\u01c5\u01c6"+
		"\7K\2\2\u01c6\u01c7\7P\2\2\u01c7\u01c8\7K\2\2\u01c8\u01c9\7V\2\2\u01c9"+
		"\u01d3\7Q\2\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7p\2\2\u01cc\u01cd\7h\2\2"+
		"\u01cd\u01ce\7k\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1"+
		"\7v\2\2\u01d1\u01d3\7q\2\2\u01d2\u01b9\3\2\2\2\u01d2\u01c2\3\2\2\2\u01d2"+
		"\u01ca\3\2\2\2\u01d3h\3\2\2\2\u01d4\u01d8\7$\2\2\u01d5\u01d7\n\5\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01e5\7)\2\2\u01dc"+
		"\u01e0\7$\2\2\u01dd\u01df\n\6\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e5\7$\2\2\u01e4\u01d4\3\2\2\2\u01e4\u01dc\3\2"+
		"\2\2\u01e5j\3\2\2\2\u01e6\u01ea\7}\2\2\u01e7\u01e9\n\7\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\177\2\2\u01ee\u01ef\b"+
		"\66\2\2\u01efl\3\2\2\2\u01f0\u01f1\t\b\2\2\u01f1\u01f2\b\67\3\2\u01f2"+
		"n\3\2\2\2\u01f3\u01f4\t\t\2\2\u01f4\u01f5\b8\4\2\u01f5p\3\2\2\2\u01f6"+
		"\u01fa\7}\2\2\u01f7\u01f9\n\7\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\7\f\2\2\u01fe\u01ff\b9\5\2\u01ffr\3\2\2\2\f"+
		"\2\u01b5\u01b9\u01bf\u01d2\u01d8\u01e0\u01e4\u01ea\u01fa\6\3\66\2\3\67"+
		"\3\38\4\39\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}