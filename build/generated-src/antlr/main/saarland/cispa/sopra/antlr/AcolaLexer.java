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
		TARGET=25, DIRECTION=26, REGISTER=27, MARKER=28, NUMBER=29, KEYWORD=30, 
		IDENTIFIER=31, SPACE=32, COMMENTWITHNEWLINE=33, COMMENTS=34, NEWLINE=35;
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
		"DIRECTION", "REGISTER", "MARKER", "NUMBER", "KEYWORD", "IDENTIFIER", 
		"SPACE", "COMMENTWITHNEWLINE", "COMMENTS", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"'", "'{'", "'}'", "'turn'", "'left'", "'right'", 
		"'mark'", "'unmark'", "'set'", "'unset'", "'jump'", "'sense'", "'here'", 
		"'ahead'", "'marker'", "'else'", "'flip'", "'test'", "'direction'", "'pickup'", 
		"'drop'", "'move'", "'breed'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "TARGET", "DIRECTION", "REGISTER", "MARKER", "NUMBER", "KEYWORD", 
		"IDENTIFIER", "SPACE", "COMMENTWITHNEWLINE", "COMMENTS", "NEWLINE"
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
	    throw new IllegalArgumentException(ex.getMessage());
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
		case 31:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			COMMENTWITHNEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			COMMENTS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(" ");
			break;
		}
	}
	private void COMMENTWITHNEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(" \n");
			break;
		}
	}
	private void COMMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setText(" ");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u01dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u0106\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0134\n\33\3\34\3\34\3\35\3\35\3\36"+
		"\6\36\u013b\n\36\r\36\16\36\u013c\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u0192\n\37\3 \3 \6 \u0196\n \r \16 "+
		"\u0197\3!\6!\u019b\n!\r!\16!\u019c\3!\3!\3\"\3\"\3\"\3\"\7\"\u01a5\n\""+
		"\f\"\16\"\u01a8\13\"\3\"\6\"\u01ab\n\"\r\"\16\"\u01ac\6\"\u01af\n\"\r"+
		"\"\16\"\u01b0\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01b9\n\"\f\"\16\"\u01bc\13"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c3\n\"\5\"\u01c5\n\"\3\"\3\"\3#\3#\3#\3"+
		"#\7#\u01cd\n#\f#\16#\u01d0\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u01dc"+
		"\n$\4\u01ba\u01ce\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\13\3\2\62\67\3\2\628\3\2\62;\6\2"+
		"/\60C\\aac|\7\2/\60\62;C\\aac|\4\2\13\13\"\"\3\2\60\60\3\2\f\f\4\2\f\f"+
		"\17\17\2\u0206\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2"+
		"\2\2\rZ\3\2\2\2\17_\3\2\2\2\21e\3\2\2\2\23j\3\2\2\2\25q\3\2\2\2\27u\3"+
		"\2\2\2\31{\3\2\2\2\33\u0080\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2"+
		"!\u0091\3\2\2\2#\u0098\3\2\2\2%\u009d\3\2\2\2\'\u00a2\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00b1\3\2\2\2-\u00b8\3\2\2\2/\u00bd\3\2\2\2\61\u00c2\3\2\2\2\63"+
		"\u0105\3\2\2\2\65\u0133\3\2\2\2\67\u0135\3\2\2\29\u0137\3\2\2\2;\u013a"+
		"\3\2\2\2=\u0191\3\2\2\2?\u0193\3\2\2\2A\u019a\3\2\2\2C\u01c4\3\2\2\2E"+
		"\u01c8\3\2\2\2G\u01db\3\2\2\2IJ\7d\2\2JK\7t\2\2KL\7c\2\2LM\7k\2\2MN\7"+
		"p\2\2N\4\3\2\2\2OP\7$\2\2P\6\3\2\2\2QR\7}\2\2R\b\3\2\2\2ST\7\177\2\2T"+
		"\n\3\2\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XY\7p\2\2Y\f\3\2\2\2Z[\7n\2\2[\\"+
		"\7g\2\2\\]\7h\2\2]^\7v\2\2^\16\3\2\2\2_`\7t\2\2`a\7k\2\2ab\7i\2\2bc\7"+
		"j\2\2cd\7v\2\2d\20\3\2\2\2ef\7o\2\2fg\7c\2\2gh\7t\2\2hi\7m\2\2i\22\3\2"+
		"\2\2jk\7w\2\2kl\7p\2\2lm\7o\2\2mn\7c\2\2no\7t\2\2op\7m\2\2p\24\3\2\2\2"+
		"qr\7u\2\2rs\7g\2\2st\7v\2\2t\26\3\2\2\2uv\7w\2\2vw\7p\2\2wx\7u\2\2xy\7"+
		"g\2\2yz\7v\2\2z\30\3\2\2\2{|\7l\2\2|}\7w\2\2}~\7o\2\2~\177\7r\2\2\177"+
		"\32\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\34\3\2\2\2\u0086\u0087\7j\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\36\3\2\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7j\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7f\2\2\u0090 \3\2\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2"+
		"\2\u0093\u0094\7t\2\2\u0094\u0095\7m\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7t\2\2\u0097\"\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u009c\7g\2\2\u009c$\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f"+
		"\7n\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7r\2\2\u00a1&\3\2\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"(\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7k\2\2"+
		"\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7r\2"+
		"\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7m\2\2\u00b5\u00b6"+
		"\7w\2\2\u00b6\u00b7\7r\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7r\2\2\u00bc.\3\2\2\2\u00bd\u00be"+
		"\7o\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\60\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7f\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u0106\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7o\2\2\u00d1\u0106\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u0106\7f\2\2"+
		"\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7q\2\2\u00db\u0106"+
		"\7f\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7q\2\2\u00e2\u0106\7p\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7e\2\2\u00e6\u0106"+
		"\7m\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7h\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7q\2\2\u00ed\u0106\7f\2\2"+
		"\u00ee\u00ef\7h\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2"+
		"\7o\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7m\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u0106\7t\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7q\2\2"+
		"\u00f9\u00fa\7o\2\2\u00fa\u0106\7g\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd"+
		"\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7f\2\2\u0101\u0102\7h\2\2\u0102\u0103\7q\2\2\u0103\u0104\7q\2\2"+
		"\u0104\u0106\7f\2\2\u0105\u00c8\3\2\2\2\u0105\u00cb\3\2\2\2\u0105\u00d2"+
		"\3\2\2\2\u0105\u00d8\3\2\2\2\u0105\u00dc\3\2\2\2\u0105\u00e3\3\2\2\2\u0105"+
		"\u00e7\3\2\2\2\u0105\u00ee\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00fb\3\2"+
		"\2\2\u0106\64\3\2\2\2\u0107\u0108\7p\2\2\u0108\u0109\7q\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7y\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7u\2\2\u010f\u0134\7v\2\2\u0110\u0111\7y\2\2"+
		"\u0111\u0112\7g\2\2\u0112\u0113\7u\2\2\u0113\u0134\7v\2\2\u0114\u0115"+
		"\7u\2\2\u0115\u0116\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7v\2\2\u0118"+
		"\u0119\7j\2\2\u0119\u011a\7y\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2"+
		"\u011c\u0134\7v\2\2\u011d\u011e\7u\2\2\u011e\u011f\7q\2\2\u011f\u0120"+
		"\7w\2\2\u0120\u0121\7v\2\2\u0121\u0122\7j\2\2\u0122\u0123\7g\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7u\2\2\u0125\u0134\7v\2\2\u0126\u0127\7g\2\2"+
		"\u0127\u0128\7c\2\2\u0128\u0129\7u\2\2\u0129\u0134\7v\2\2\u012a\u012b"+
		"\7p\2\2\u012b\u012c\7q\2\2\u012c\u012d\7t\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u012f\7j\2\2\u012f\u0130\7g\2\2\u0130\u0131\7c\2\2\u0131\u0132\7u\2\2"+
		"\u0132\u0134\7v\2\2\u0133\u0107\3\2\2\2\u0133\u0110\3\2\2\2\u0133\u0114"+
		"\3\2\2\2\u0133\u011d\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u012a\3\2\2\2\u0134"+
		"\66\3\2\2\2\u0135\u0136\t\2\2\2\u01368\3\2\2\2\u0137\u0138\t\3\2\2\u0138"+
		":\3\2\2\2\u0139\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d<\3\2\2\2\u013e\u013f\7"+
		"d\2\2\u013f\u0140\7t\2\2\u0140\u0141\7c\2\2\u0141\u0142\7k\2\2\u0142\u0192"+
		"\7p\2\2\u0143\u0144\7o\2\2\u0144\u0145\7c\2\2\u0145\u0146\7t\2\2\u0146"+
		"\u0192\7m\2\2\u0147\u0148\7w\2\2\u0148\u0149\7p\2\2\u0149\u014a\7o\2\2"+
		"\u014a\u014b\7c\2\2\u014b\u014c\7t\2\2\u014c\u0192\7m\2\2\u014d\u014e"+
		"\7v\2\2\u014e\u014f\7w\2\2\u014f\u0150\7t\2\2\u0150\u0192\7p\2\2\u0151"+
		"\u0152\7o\2\2\u0152\u0153\7q\2\2\u0153\u0154\7x\2\2\u0154\u0192\7g\2\2"+
		"\u0155\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157\u0158\7p\2\2\u0158\u0159"+
		"\7u\2\2\u0159\u0192\7g\2\2\u015a\u015b\7u\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u0192\7v\2\2\u015d\u015e\7w\2\2\u015e\u015f\7p\2\2\u015f\u0160\7u\2\2"+
		"\u0160\u0161\7g\2\2\u0161\u0192\7v\2\2\u0162\u0163\7r\2\2\u0163\u0164"+
		"\7k\2\2\u0164\u0165\7e\2\2\u0165\u0166\7m\2\2\u0166\u0167\7w\2\2\u0167"+
		"\u0192\7r\2\2\u0168\u0169\7f\2\2\u0169\u016a\7t\2\2\u016a\u016b\7q\2\2"+
		"\u016b\u0192\7r\2\2\u016c\u016d\7l\2\2\u016d\u016e\7w\2\2\u016e\u016f"+
		"\7o\2\2\u016f\u0192\7r\2\2\u0170\u0171\7h\2\2\u0171\u0172\7n\2\2\u0172"+
		"\u0173\7k\2\2\u0173\u0192\7r\2\2\u0174\u0175\7u\2\2\u0175\u0176\7g\2\2"+
		"\u0176\u0177\7p\2\2\u0177\u0178\7u\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7o\2\2\u017a\u017b\7c\2\2\u017b\u017c\7t\2\2\u017c\u017d\7m\2\2\u017d"+
		"\u017e\7g\2\2\u017e\u0192\7t\2\2\u017f\u0180\7f\2\2\u0180\u0181\7k\2\2"+
		"\u0181\u0182\7t\2\2\u0182\u0183\7g\2\2\u0183\u0184\7e\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7k\2\2\u0186\u0187\7q\2\2\u0187\u0192\7p\2\2\u0188"+
		"\u0189\7v\2\2\u0189\u018a\7g\2\2\u018a\u018b\7u\2\2\u018b\u0192\7v\2\2"+
		"\u018c\u018d\7d\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190"+
		"\7g\2\2\u0190\u0192\7f\2\2\u0191\u013e\3\2\2\2\u0191\u0143\3\2\2\2\u0191"+
		"\u0147\3\2\2\2\u0191\u014d\3\2\2\2\u0191\u0151\3\2\2\2\u0191\u0155\3\2"+
		"\2\2\u0191\u015a\3\2\2\2\u0191\u015d\3\2\2\2\u0191\u0162\3\2\2\2\u0191"+
		"\u0168\3\2\2\2\u0191\u016c\3\2\2\2\u0191\u0170\3\2\2\2\u0191\u0174\3\2"+
		"\2\2\u0191\u017f\3\2\2\2\u0191\u0188\3\2\2\2\u0191\u018c\3\2\2\2\u0192"+
		">\3\2\2\2\u0193\u0195\t\5\2\2\u0194\u0196\t\6\2\2\u0195\u0194\3\2\2\2"+
		"\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198@\3"+
		"\2\2\2\u0199\u019b\t\7\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b!"+
		"\2\2\u019fB\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2\7,\2\2\u01a2\u01ae"+
		"\3\2\2\2\u01a3\u01a5\t\b\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a9\u01ab\t\t\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a6\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3\u01c5\7\61\2\2\u01b4\u01b5\7\61"+
		"\2\2\u01b5\u01b6\7\61\2\2\u01b6\u01ba\3\2\2\2\u01b7\u01b9\13\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\u01c2\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c3\t\n\2\2\u01be"+
		"\u01bf\7^\2\2\u01bf\u01c3\7p\2\2\u01c0\u01c1\7^\2\2\u01c1\u01c3\7t\2\2"+
		"\u01c2\u01bd\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01a0\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\b\"\3\2\u01c7D\3\2\2\2\u01c8\u01c9\7\61\2\2\u01c9\u01ca\7,\2\2"+
		"\u01ca\u01ce\3\2\2\2\u01cb\u01cd\13\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d2\7,\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d5\b#\4\2\u01d5F\3\2\2\2\u01d6\u01dc\t\n\2\2\u01d7\u01d8"+
		"\7^\2\2\u01d8\u01dc\7p\2\2\u01d9\u01da\7^\2\2\u01da\u01dc\7t\2\2\u01db"+
		"\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01db\u01d9\3\2\2\2\u01dcH\3\2\2\2"+
		"\21\2\u0105\u0133\u013c\u0191\u0197\u019c\u01a6\u01ac\u01b0\u01ba\u01c2"+
		"\u01c4\u01ce\u01db\5\3!\2\3\"\3\3#\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}