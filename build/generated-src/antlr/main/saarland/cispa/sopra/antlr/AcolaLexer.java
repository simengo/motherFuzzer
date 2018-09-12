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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, FIELD=23, TARGET=24, 
		DIRECTION=25, REGISTER=26, MARKER=27, NUMBER=28, IDENTIFIER=29, COMMENT=30, 
		SPACE=31, NEWLINE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "FIELD", "TARGET", "DIRECTION", 
		"REGISTER", "MARKER", "NUMBER", "IDENTIFIER", "COMMENT", "SPACE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"'", "'{'", "'}'", "'mark'", "'unmark'", "'turn'", 
		"'left'", "'right'", "'move'", "'else'", "'sense'", "'marker'", "'set'", 
		"'unset'", "'pickup'", "'drop'", "'jump'", "'flip'", "'test'", "'direction'", 
		"'breed'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "FIELD", 
		"TARGET", "DIRECTION", "REGISTER", "MARKER", "NUMBER", "IDENTIFIER", "COMMENT", 
		"SPACE", "NEWLINE"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0168\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00ca\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0109\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0137"+
		"\n\32\3\33\3\33\3\34\3\34\3\35\6\35\u013e\n\35\r\35\16\35\u013f\3\36\3"+
		"\36\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\37\3\37\3\37\3\37\7\37\u014d"+
		"\n\37\f\37\16\37\u0150\13\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0158"+
		"\n\37\f\37\16\37\u015b\13\37\3\37\5\37\u015e\n\37\3\37\3\37\3 \6 \u0163"+
		"\n \r \16 \u0164\3!\3!\4\u014e\u0159\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\t\3\2\62\67\3\2\62"+
		"8\3\2\62;\6\2/\60C\\aac|\7\2/\60\62;C\\aac|\3\2\"\"\4\2\f\f\17\17\2\u017e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5I\3\2\2\2\7K\3\2\2"+
		"\2\tM\3\2\2\2\13O\3\2\2\2\rT\3\2\2\2\17[\3\2\2\2\21`\3\2\2\2\23e\3\2\2"+
		"\2\25k\3\2\2\2\27p\3\2\2\2\31u\3\2\2\2\33{\3\2\2\2\35\u0082\3\2\2\2\37"+
		"\u0086\3\2\2\2!\u008c\3\2\2\2#\u0093\3\2\2\2%\u0098\3\2\2\2\'\u009d\3"+
		"\2\2\2)\u00a2\3\2\2\2+\u00a7\3\2\2\2-\u00b1\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u0108\3\2\2\2\63\u0136\3\2\2\2\65\u0138\3\2\2\2\67\u013a\3\2\2\29\u013d"+
		"\3\2\2\2;\u0141\3\2\2\2=\u015d\3\2\2\2?\u0162\3\2\2\2A\u0166\3\2\2\2C"+
		"D\7d\2\2DE\7t\2\2EF\7c\2\2FG\7k\2\2GH\7p\2\2H\4\3\2\2\2IJ\7$\2\2J\6\3"+
		"\2\2\2KL\7}\2\2L\b\3\2\2\2MN\7\177\2\2N\n\3\2\2\2OP\7o\2\2PQ\7c\2\2QR"+
		"\7t\2\2RS\7m\2\2S\f\3\2\2\2TU\7w\2\2UV\7p\2\2VW\7o\2\2WX\7c\2\2XY\7t\2"+
		"\2YZ\7m\2\2Z\16\3\2\2\2[\\\7v\2\2\\]\7w\2\2]^\7t\2\2^_\7p\2\2_\20\3\2"+
		"\2\2`a\7n\2\2ab\7g\2\2bc\7h\2\2cd\7v\2\2d\22\3\2\2\2ef\7t\2\2fg\7k\2\2"+
		"gh\7i\2\2hi\7j\2\2ij\7v\2\2j\24\3\2\2\2kl\7o\2\2lm\7q\2\2mn\7x\2\2no\7"+
		"g\2\2o\26\3\2\2\2pq\7g\2\2qr\7n\2\2rs\7u\2\2st\7g\2\2t\30\3\2\2\2uv\7"+
		"u\2\2vw\7g\2\2wx\7p\2\2xy\7u\2\2yz\7g\2\2z\32\3\2\2\2{|\7o\2\2|}\7c\2"+
		"\2}~\7t\2\2~\177\7m\2\2\177\u0080\7g\2\2\u0080\u0081\7t\2\2\u0081\34\3"+
		"\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b \3\2\2\2\u008c\u008d\7r\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7e\2\2\u008f\u0090\7m\2\2\u0090\u0091\7w\2\2"+
		"\u0091\u0092\7r\2\2\u0092\"\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095\7t"+
		"\2\2\u0095\u0096\7q\2\2\u0096\u0097\7r\2\2\u0097$\3\2\2\2\u0098\u0099"+
		"\7l\2\2\u0099\u009a\7w\2\2\u009a\u009b\7o\2\2\u009b\u009c\7r\2\2\u009c"+
		"&\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7e\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7f\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7t\2\2\u00ba\u00ca\7g\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7c\2\2"+
		"\u00bf\u00ca\7f\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00ca\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7i\2\2\u00c7\u00c8\7j\2\2\u00c8\u00ca\7v\2\2\u00c9\u00b7\3\2\2"+
		"\2\u00c9\u00bb\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\60"+
		"\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7q\2\2\u00cd\u0109\7g\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7j\2\2"+
		"\u00d2\u00d3\7q\2\2\u00d3\u00d4\7o\2\2\u00d4\u0109\7g\2\2\u00d5\u00d6"+
		"\7h\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u0109\7f\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7q\2\2"+
		"\u00dd\u00de\7q\2\2\u00de\u0109\7f\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u0109\7p\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7q\2\2"+
		"\u00e8\u00e9\7e\2\2\u00e9\u0109\7m\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u0109\7f\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7q\2\2"+
		"\u00f3\u00f4\7g\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7t\2\2\u00f7\u00f8\7m\2\2\u00f8\u00f9\7g\2\2\u00f9\u0109\7t\2\2\u00fa"+
		"\u00fb\7j\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7o\2\2\u00fd\u0109\7g\2\2"+
		"\u00fe\u00ff\7h\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7f\2\2\u0104\u0105\7h\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7q\2\2\u0107\u0109\7f\2\2\u0108\u00cb\3\2\2"+
		"\2\u0108\u00ce\3\2\2\2\u0108\u00d5\3\2\2\2\u0108\u00db\3\2\2\2\u0108\u00df"+
		"\3\2\2\2\u0108\u00e6\3\2\2\2\u0108\u00ea\3\2\2\2\u0108\u00f1\3\2\2\2\u0108"+
		"\u00fa\3\2\2\2\u0108\u00fe\3\2\2\2\u0109\62\3\2\2\2\u010a\u010b\7p\2\2"+
		"\u010b\u010c\7q\2\2\u010c\u010d\7t\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7j\2\2\u010f\u0110\7y\2\2\u0110\u0111\7g\2\2\u0111\u0112\7u\2\2\u0112"+
		"\u0137\7v\2\2\u0113\u0114\7y\2\2\u0114\u0115\7g\2\2\u0115\u0116\7u\2\2"+
		"\u0116\u0137\7v\2\2\u0117\u0118\7u\2\2\u0118\u0119\7q\2\2\u0119\u011a"+
		"\7w\2\2\u011a\u011b\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7y\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u011f\7u\2\2\u011f\u0137\7v\2\2\u0120\u0121\7u\2\2"+
		"\u0121\u0122\7q\2\2\u0122\u0123\7w\2\2\u0123\u0124\7v\2\2\u0124\u0125"+
		"\7j\2\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2\2\u0127\u0128\7u\2\2\u0128"+
		"\u0137\7v\2\2\u0129\u012a\7g\2\2\u012a\u012b\7c\2\2\u012b\u012c\7u\2\2"+
		"\u012c\u0137\7v\2\2\u012d\u012e\7p\2\2\u012e\u012f\7q\2\2\u012f\u0130"+
		"\7t\2\2\u0130\u0131\7v\2\2\u0131\u0132\7j\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7c\2\2\u0134\u0135\7u\2\2\u0135\u0137\7v\2\2\u0136\u010a\3\2\2"+
		"\2\u0136\u0113\3\2\2\2\u0136\u0117\3\2\2\2\u0136\u0120\3\2\2\2\u0136\u0129"+
		"\3\2\2\2\u0136\u012d\3\2\2\2\u0137\64\3\2\2\2\u0138\u0139\t\2\2\2\u0139"+
		"\66\3\2\2\2\u013a\u013b\t\3\2\2\u013b8\3\2\2\2\u013c\u013e\t\4\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140:\3\2\2\2\u0141\u0145\t\5\2\2\u0142\u0144\t\6\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"<\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7,\2\2"+
		"\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\7,\2\2\u0152\u015e\7\61\2\2\u0153\u0154\7\61"+
		"\2\2\u0154\u0155\7\61\2\2\u0155\u0159\3\2\2\2\u0156\u0158\13\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\5A!\2\u015d\u0148"+
		"\3\2\2\2\u015d\u0153\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\37\2\2"+
		"\u0160>\3\2\2\2\u0161\u0163\t\7\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165@\3\2\2\2\u0166\u0167"+
		"\t\b\2\2\u0167B\3\2\2\2\f\2\u00c9\u0108\u0136\u013f\u0145\u014e\u0159"+
		"\u015d\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}