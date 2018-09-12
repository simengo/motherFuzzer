// Generated from Acola.g4 by ANTLR 4.7.1
package saarland.cispa.sopra.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcolaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		TARGET=25, DIRECTION=26, REGISTER=27, MARKER=28, NUMBER=29, IDENTIFIER=30, 
		COMMENT=31, SPACE=32, NEWLINE=33, ALLNUMS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "TARGET", 
		"DIRECTION", "REGISTER", "MARKER", "NUMBER", "IDENTIFIER", "COMMENT", 
		"SPACE", "NEWLINE", "ALLNUMS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"'", "'{'", "'}'", "'sense'", "'here'", "'ahead'", 
		"'left'", "'right'", "'marker'", "'else'", "'flip'", "'test'", "'direction'", 
		"'pickup'", "'drop'", "'move'", "'breed'", "'turn'", "'mark'", "'unmark'", 
		"'set'", "'unset'", "'jump'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "TARGET", "DIRECTION", "REGISTER", "MARKER", "NUMBER", "IDENTIFIER", 
		"COMMENT", "SPACE", "NEWLINE", "ALLNUMS"
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
	  public void recover(RecognitionException ex)
	  {
	    throw new RuntimeException(ex.getMessage());
	  }


	public AcolaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Acola.g4"; }

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
		case 30:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(" ");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0104\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0132\n\33\3\34\3\34\3\35\3\35\3\36\6\36"+
		"\u0139\n\36\r\36\16\36\u013a\3\37\3\37\6\37\u013f\n\37\r\37\16\37\u0140"+
		"\3 \3 \3 \3 \7 \u0147\n \f \16 \u014a\13 \3 \3 \3 \3 \3 \3 \7 \u0152\n"+
		" \f \16 \u0155\13 \3 \3 \3 \3 \3 \5 \u015c\n \5 \u015e\n \3 \3 \3!\5!"+
		"\u0163\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0171\n"+
		"\"\3#\3#\3#\5#\u0176\n#\4\u0148\u0153\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\t\3\2\62\67\3"+
		"\2\628\3\2\62;\6\2/\60C\\aac|\7\2/\60\62;C\\aac|\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\2\u0190\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\3G\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rY\3\2"+
		"\2\2\17^\3\2\2\2\21d\3\2\2\2\23i\3\2\2\2\25o\3\2\2\2\27v\3\2\2\2\31{\3"+
		"\2\2\2\33\u0080\3\2\2\2\35\u0085\3\2\2\2\37\u008f\3\2\2\2!\u0096\3\2\2"+
		"\2#\u009b\3\2\2\2%\u00a0\3\2\2\2\'\u00a6\3\2\2\2)\u00ab\3\2\2\2+\u00b0"+
		"\3\2\2\2-\u00b7\3\2\2\2/\u00bb\3\2\2\2\61\u00c1\3\2\2\2\63\u0103\3\2\2"+
		"\2\65\u0131\3\2\2\2\67\u0133\3\2\2\29\u0135\3\2\2\2;\u0138\3\2\2\2=\u013c"+
		"\3\2\2\2?\u015d\3\2\2\2A\u0162\3\2\2\2C\u0170\3\2\2\2E\u0175\3\2\2\2G"+
		"H\7d\2\2HI\7t\2\2IJ\7c\2\2JK\7k\2\2KL\7p\2\2L\4\3\2\2\2MN\7$\2\2N\6\3"+
		"\2\2\2OP\7}\2\2P\b\3\2\2\2QR\7\177\2\2R\n\3\2\2\2ST\7u\2\2TU\7g\2\2UV"+
		"\7p\2\2VW\7u\2\2WX\7g\2\2X\f\3\2\2\2YZ\7j\2\2Z[\7g\2\2[\\\7t\2\2\\]\7"+
		"g\2\2]\16\3\2\2\2^_\7c\2\2_`\7j\2\2`a\7g\2\2ab\7c\2\2bc\7f\2\2c\20\3\2"+
		"\2\2de\7n\2\2ef\7g\2\2fg\7h\2\2gh\7v\2\2h\22\3\2\2\2ij\7t\2\2jk\7k\2\2"+
		"kl\7i\2\2lm\7j\2\2mn\7v\2\2n\24\3\2\2\2op\7o\2\2pq\7c\2\2qr\7t\2\2rs\7"+
		"m\2\2st\7g\2\2tu\7t\2\2u\26\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2"+
		"\2z\30\3\2\2\2{|\7h\2\2|}\7n\2\2}~\7k\2\2~\177\7r\2\2\177\32\3\2\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083\u0084\7v\2\2"+
		"\u0084\34\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7k\2\2\u0087\u0088\7"+
		"t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e\36\3\2\2\2\u008f\u0090"+
		"\7r\2\2\u0090\u0091\7k\2\2\u0091\u0092\7e\2\2\u0092\u0093\7m\2\2\u0093"+
		"\u0094\7w\2\2\u0094\u0095\7r\2\2\u0095 \3\2\2\2\u0096\u0097\7f\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7q\2\2\u0099\u009a\7r\2\2\u009a\"\3\2\2\2\u009b"+
		"\u009c\7o\2\2\u009c\u009d\7q\2\2\u009d\u009e\7x\2\2\u009e\u009f\7g\2\2"+
		"\u009f$\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2"+
		"\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7f\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7"+
		"v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa("+
		"\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7m\2\2\u00af*\3\2\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7m\2\2"+
		"\u00b6,\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2"+
		"\2\u00ba.\3\2\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7"+
		"u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7l\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7r\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8\u0104\7g\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7j\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce\u00cf\7o\2\2\u00cf\u0104\7g\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u0104\7f\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7q\2\2"+
		"\u00d8\u00d9\7q\2\2\u00d9\u0104\7f\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u0104\7p\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2"+
		"\u00e3\u00e4\7e\2\2\u00e4\u0104\7m\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7"+
		"\7q\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u0104\7f\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7q\2\2"+
		"\u00ee\u00ef\7g\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7m\2\2\u00f3\u00f4\7g\2\2\u00f4\u0104\7t\2\2\u00f5"+
		"\u00f6\7j\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7o\2\2\u00f8\u0104\7g\2\2"+
		"\u00f9\u00fa\7h\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7h\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7q\2\2\u0102\u0104\7f\2\2\u0103\u00c6\3\2\2"+
		"\2\u0103\u00c9\3\2\2\2\u0103\u00d0\3\2\2\2\u0103\u00d6\3\2\2\2\u0103\u00da"+
		"\3\2\2\2\u0103\u00e1\3\2\2\2\u0103\u00e5\3\2\2\2\u0103\u00ec\3\2\2\2\u0103"+
		"\u00f5\3\2\2\2\u0103\u00f9\3\2\2\2\u0104\64\3\2\2\2\u0105\u0106\7p\2\2"+
		"\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108\u0109\7v\2\2\u0109\u010a"+
		"\7j\2\2\u010a\u010b\7y\2\2\u010b\u010c\7g\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u0132\7v\2\2\u010e\u010f\7y\2\2\u010f\u0110\7g\2\2\u0110\u0111\7u\2\2"+
		"\u0111\u0132\7v\2\2\u0112\u0113\7u\2\2\u0113\u0114\7q\2\2\u0114\u0115"+
		"\7w\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117\u0118\7y\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7u\2\2\u011a\u0132\7v\2\2\u011b\u011c\7u\2\2"+
		"\u011c\u011d\7q\2\2\u011d\u011e\7w\2\2\u011e\u011f\7v\2\2\u011f\u0120"+
		"\7j\2\2\u0120\u0121\7g\2\2\u0121\u0122\7c\2\2\u0122\u0123\7u\2\2\u0123"+
		"\u0132\7v\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0127\7u\2\2"+
		"\u0127\u0132\7v\2\2\u0128\u0129\7p\2\2\u0129\u012a\7q\2\2\u012a\u012b"+
		"\7t\2\2\u012b\u012c\7v\2\2\u012c\u012d\7j\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u012f\7c\2\2\u012f\u0130\7u\2\2\u0130\u0132\7v\2\2\u0131\u0105\3\2\2"+
		"\2\u0131\u010e\3\2\2\2\u0131\u0112\3\2\2\2\u0131\u011b\3\2\2\2\u0131\u0124"+
		"\3\2\2\2\u0131\u0128\3\2\2\2\u0132\66\3\2\2\2\u0133\u0134\t\2\2\2\u0134"+
		"8\3\2\2\2\u0135\u0136\t\3\2\2\u0136:\3\2\2\2\u0137\u0139\t\4\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b<\3\2\2\2\u013c\u013e\t\5\2\2\u013d\u013f\t\6\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		">\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7,\2\2\u0144\u0148\3\2\2\2"+
		"\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7,\2\2\u014c\u015e\7\61\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7"+
		"\61\2\2\u014f\u0153\3\2\2\2\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u015b\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u015c\t\7\2\2\u0157\u0158\7^\2\2\u0158"+
		"\u015c\7p\2\2\u0159\u015a\7^\2\2\u015a\u015c\7t\2\2\u015b\u0156\3\2\2"+
		"\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u0142"+
		"\3\2\2\2\u015d\u014d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b \2\2\u0160"+
		"@\3\2\2\2\u0161\u0163\t\b\2\2\u0162\u0161\3\2\2\2\u0163B\3\2\2\2\u0164"+
		"\u0171\t\7\2\2\u0165\u0166\7^\2\2\u0166\u0171\7p\2\2\u0167\u0168\7^\2"+
		"\2\u0168\u0171\7t\2\2\u0169\u016a\7^\2\2\u016a\u016b\7w\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\t\4\2\2\u016d\u016e\t\4\2\2\u016e\u016f\t\4\2\2\u016f"+
		"\u0171\t\4\2\2\u0170\u0164\3\2\2\2\u0170\u0165\3\2\2\2\u0170\u0167\3\2"+
		"\2\2\u0170\u0169\3\2\2\2\u0171D\3\2\2\2\u0172\u0176\5;\36\2\u0173\u0176"+
		"\59\35\2\u0174\u0176\5\67\34\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0175\u0174\3\2\2\2\u0176F\3\2\2\2\16\2\u0103\u0131\u013a\u0140\u0148"+
		"\u0153\u015b\u015d\u0162\u0170\u0175\3\3 \2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}