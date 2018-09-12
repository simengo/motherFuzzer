// Generated from Acola.g4 by ANTLR 4.7.1
package saarland.cispa.sopra.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcolaParser extends Parser {
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
	public static final int
		RULE_brain = 0, RULE_instruction = 1, RULE_sensemarker = 2, RULE_sense = 3, 
		RULE_flip = 4, RULE_test = 5, RULE_direction = 6, RULE_pickup = 7, RULE_drop = 8, 
		RULE_move = 9, RULE_breed = 10, RULE_turn = 11, RULE_mark = 12, RULE_unmark = 13, 
		RULE_set = 14, RULE_unset = 15, RULE_jump = 16;
	public static final String[] ruleNames = {
		"brain", "instruction", "sensemarker", "sense", "flip", "test", "direction", 
		"pickup", "drop", "move", "breed", "turn", "mark", "unmark", "set", "unset", 
		"jump"
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
	public String getGrammarFileName() { return "Acola.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  @Override
	  public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
	  {
	    throw new RuntimeException(msg);
	  }

	public AcolaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BrainContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AcolaParser.IDENTIFIER, 0); }
		public TerminalNode EOF() { return getToken(AcolaParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AcolaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AcolaParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public BrainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterBrain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitBrain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitBrain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrainContext brain() throws RecognitionException {
		BrainContext _localctx = new BrainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_brain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(T__1);
			setState(42);
			match(IDENTIFIER);
			setState(43);
			match(T__1);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__2);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(51);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				instruction();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==SPACE) {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==SPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(NEWLINE);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << COMMENT) | (1L << SPACE) | (1L << NEWLINE))) != 0) );
			setState(70);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(71);
				match(NEWLINE);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(EOF);
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

	public static class InstructionContext extends ParserRuleContext {
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public UnmarkContext unmark() {
			return getRuleContext(UnmarkContext.class,0);
		}
		public TurnContext turn() {
			return getRuleContext(TurnContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public SenseContext sense() {
			return getRuleContext(SenseContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public UnsetContext unset() {
			return getRuleContext(UnsetContext.class,0);
		}
		public PickupContext pickup() {
			return getRuleContext(PickupContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public FlipContext flip() {
			return getRuleContext(FlipContext.class,0);
		}
		public SensemarkerContext sensemarker() {
			return getRuleContext(SensemarkerContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public BreedContext breed() {
			return getRuleContext(BreedContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				mark();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				unmark();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				turn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				move();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				sense();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				unset();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				pickup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				drop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				flip();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				sensemarker();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(91);
				direction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(92);
				test();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(93);
				breed();
				}
				break;
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

	public static class SensemarkerContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public SensemarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensemarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterSensemarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitSensemarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitSensemarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensemarkerContext sensemarker() throws RecognitionException {
		SensemarkerContext _localctx = new SensemarkerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sensemarker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(97);
					match(COMMENT);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(103);
					match(SPACE);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(112);
					match(COMMENT);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(118);
					match(SPACE);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(126);
			match(T__9);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(127);
					match(COMMENT);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(133);
					match(SPACE);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(142);
					match(COMMENT);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(148);
					match(SPACE);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(156);
			match(T__10);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(157);
					match(COMMENT);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(163);
					match(SPACE);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(171);
			match(ALLNUMS);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172);
						match(COMMENT);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						match(SPACE);
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
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

	public static class SenseContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(AcolaParser.TARGET, 0); }
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public SenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterSense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitSense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitSense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenseContext sense() throws RecognitionException {
		SenseContext _localctx = new SenseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sense);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__4);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(187);
					match(COMMENT);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(193);
					match(SPACE);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(202);
					match(COMMENT);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(208);
					match(SPACE);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(216);
			match(TARGET);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(217);
					match(COMMENT);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(223);
					match(SPACE);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(231);
			match(T__10);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(232);
					match(COMMENT);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(238);
					match(SPACE);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(246);
			match(ALLNUMS);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						match(COMMENT);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						match(SPACE);
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
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

	public static class FlipContext extends ParserRuleContext {
		public List<TerminalNode> ALLNUMS() { return getTokens(AcolaParser.ALLNUMS); }
		public TerminalNode ALLNUMS(int i) {
			return getToken(AcolaParser.ALLNUMS, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public FlipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterFlip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitFlip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitFlip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlipContext flip() throws RecognitionException {
		FlipContext _localctx = new FlipContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flip);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__11);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(262);
					match(COMMENT);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(268);
					match(SPACE);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(276);
			match(ALLNUMS);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(277);
					match(COMMENT);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(283);
					match(SPACE);
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(291);
			match(T__10);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(292);
					match(COMMENT);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(298);
					match(SPACE);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(306);
			match(ALLNUMS);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(COMMENT);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						match(SPACE);
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				}
				break;
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

	public static class TestContext extends ParserRuleContext {
		public List<TerminalNode> ALLNUMS() { return getTokens(AcolaParser.ALLNUMS); }
		public TerminalNode ALLNUMS(int i) {
			return getToken(AcolaParser.ALLNUMS, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_test);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__12);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(322);
					match(COMMENT);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(328);
					match(SPACE);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(336);
			match(ALLNUMS);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(337);
					match(COMMENT);
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(343);
					match(SPACE);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(351);
			match(T__10);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(352);
					match(COMMENT);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(358);
					match(SPACE);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(366);
			match(ALLNUMS);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(COMMENT);
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(SPACE);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AcolaParser.DIRECTION, 0); }
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__13);
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(382);
					match(COMMENT);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(388);
					match(SPACE);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(396);
			match(DIRECTION);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(397);
					match(COMMENT);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(403);
					match(SPACE);
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(411);
			match(T__10);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(412);
					match(COMMENT);
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(418);
					match(SPACE);
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(426);
			match(ALLNUMS);
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

	public static class PickupContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public PickupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterPickup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitPickup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitPickup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupContext pickup() throws RecognitionException {
		PickupContext _localctx = new PickupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pickup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__14);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(429);
					match(COMMENT);
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(435);
					match(SPACE);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(443);
			match(T__10);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(444);
					match(COMMENT);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(450);
					match(SPACE);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(458);
			match(ALLNUMS);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(459);
						match(COMMENT);
						}
						} 
					}
					setState(464);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(465);
						match(SPACE);
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__15);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(474);
					match(COMMENT);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(480);
					match(SPACE);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(488);
			match(T__10);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(489);
					match(COMMENT);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(495);
					match(SPACE);
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(503);
			match(ALLNUMS);
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(504);
						match(COMMENT);
						}
						} 
					}
					setState(509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(510);
						match(SPACE);
						}
						} 
					}
					setState(515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_move);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__16);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(519);
					match(COMMENT);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(525);
					match(SPACE);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(533);
			match(T__10);
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(534);
					match(COMMENT);
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(540);
					match(SPACE);
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(548);
			match(ALLNUMS);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(549);
						match(COMMENT);
						}
						} 
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(SPACE);
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
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

	public static class BreedContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public BreedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterBreed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitBreed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitBreed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreedContext breed() throws RecognitionException {
		BreedContext _localctx = new BreedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breed);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__17);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(564);
					match(COMMENT);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(570);
					match(SPACE);
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(578);
			match(T__10);
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(579);
					match(COMMENT);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(585);
					match(SPACE);
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(593);
			match(ALLNUMS);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(594);
						match(COMMENT);
						}
						} 
					}
					setState(599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						match(SPACE);
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
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

	public static class TurnContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_turn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__18);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(609);
					match(COMMENT);
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(615);
					match(SPACE);
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(COMMENT);
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(630);
						match(SPACE);
						}
						} 
					}
					setState(635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
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

	public static class MarkContext extends ParserRuleContext {
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public MarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkContext mark() throws RecognitionException {
		MarkContext _localctx = new MarkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mark);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__19);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(639);
					match(COMMENT);
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(645);
					match(SPACE);
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(653);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(654);
						match(COMMENT);
						}
						} 
					}
					setState(659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(660);
						match(SPACE);
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
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

	public static class UnmarkContext extends ParserRuleContext {
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public UnmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterUnmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitUnmark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitUnmark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmarkContext unmark() throws RecognitionException {
		UnmarkContext _localctx = new UnmarkContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unmark);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__20);
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(669);
					match(COMMENT);
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(675);
					match(SPACE);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(683);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(COMMENT);
						}
						} 
					}
					setState(689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						match(SPACE);
						}
						} 
					}
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__21);
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(699);
					match(COMMENT);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(705);
					match(SPACE);
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(713);
			match(REGISTER);
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(714);
						match(COMMENT);
						}
						} 
					}
					setState(719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(720);
						match(SPACE);
						}
						} 
					}
					setState(725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
				break;
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

	public static class UnsetContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public UnsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterUnset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitUnset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitUnset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetContext unset() throws RecognitionException {
		UnsetContext _localctx = new UnsetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unset);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T__22);
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(729);
					match(COMMENT);
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(735);
					match(SPACE);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(743);
			match(REGISTER);
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(744);
						match(COMMENT);
						}
						} 
					}
					setState(749);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(750);
						match(SPACE);
						}
						} 
					}
					setState(755);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				}
				break;
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

	public static class JumpContext extends ParserRuleContext {
		public TerminalNode ALLNUMS() { return getToken(AcolaParser.ALLNUMS, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(AcolaParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AcolaParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jump);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__23);
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(759);
					match(COMMENT);
					}
					}
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(765);
					match(SPACE);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(773);
			match(ALLNUMS);
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(774);
						match(COMMENT);
						}
						} 
					}
					setState(779);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						match(SPACE);
						}
						} 
					}
					setState(785);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0317\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\2\3\2\6\2E\n\2\r\2\16\2F\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n"+
		"\3\3\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\7\4k\n\4\f\4\16\4n\13\4\5\4p\n"+
		"\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13\4\3\4\7\4z\n\4\f\4\16\4}\13\4\5\4\177"+
		"\n\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086\13\4\3\4\7\4\u0089\n\4\f\4\16"+
		"\4\u008c\13\4\5\4\u008e\n\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4"+
		"\3\4\7\4\u0098\n\4\f\4\16\4\u009b\13\4\5\4\u009d\n\4\3\4\3\4\7\4\u00a1"+
		"\n\4\f\4\16\4\u00a4\13\4\3\4\7\4\u00a7\n\4\f\4\16\4\u00aa\13\4\5\4\u00ac"+
		"\n\4\3\4\3\4\7\4\u00b0\n\4\f\4\16\4\u00b3\13\4\3\4\7\4\u00b6\n\4\f\4\16"+
		"\4\u00b9\13\4\5\4\u00bb\n\4\3\5\3\5\7\5\u00bf\n\5\f\5\16\5\u00c2\13\5"+
		"\3\5\7\5\u00c5\n\5\f\5\16\5\u00c8\13\5\5\5\u00ca\n\5\3\5\3\5\7\5\u00ce"+
		"\n\5\f\5\16\5\u00d1\13\5\3\5\7\5\u00d4\n\5\f\5\16\5\u00d7\13\5\5\5\u00d9"+
		"\n\5\3\5\3\5\7\5\u00dd\n\5\f\5\16\5\u00e0\13\5\3\5\7\5\u00e3\n\5\f\5\16"+
		"\5\u00e6\13\5\5\5\u00e8\n\5\3\5\3\5\7\5\u00ec\n\5\f\5\16\5\u00ef\13\5"+
		"\3\5\7\5\u00f2\n\5\f\5\16\5\u00f5\13\5\5\5\u00f7\n\5\3\5\3\5\7\5\u00fb"+
		"\n\5\f\5\16\5\u00fe\13\5\3\5\7\5\u0101\n\5\f\5\16\5\u0104\13\5\5\5\u0106"+
		"\n\5\3\6\3\6\7\6\u010a\n\6\f\6\16\6\u010d\13\6\3\6\7\6\u0110\n\6\f\6\16"+
		"\6\u0113\13\6\5\6\u0115\n\6\3\6\3\6\7\6\u0119\n\6\f\6\16\6\u011c\13\6"+
		"\3\6\7\6\u011f\n\6\f\6\16\6\u0122\13\6\5\6\u0124\n\6\3\6\3\6\7\6\u0128"+
		"\n\6\f\6\16\6\u012b\13\6\3\6\7\6\u012e\n\6\f\6\16\6\u0131\13\6\5\6\u0133"+
		"\n\6\3\6\3\6\7\6\u0137\n\6\f\6\16\6\u013a\13\6\3\6\7\6\u013d\n\6\f\6\16"+
		"\6\u0140\13\6\5\6\u0142\n\6\3\7\3\7\7\7\u0146\n\7\f\7\16\7\u0149\13\7"+
		"\3\7\7\7\u014c\n\7\f\7\16\7\u014f\13\7\5\7\u0151\n\7\3\7\3\7\7\7\u0155"+
		"\n\7\f\7\16\7\u0158\13\7\3\7\7\7\u015b\n\7\f\7\16\7\u015e\13\7\5\7\u0160"+
		"\n\7\3\7\3\7\7\7\u0164\n\7\f\7\16\7\u0167\13\7\3\7\7\7\u016a\n\7\f\7\16"+
		"\7\u016d\13\7\5\7\u016f\n\7\3\7\3\7\7\7\u0173\n\7\f\7\16\7\u0176\13\7"+
		"\3\7\7\7\u0179\n\7\f\7\16\7\u017c\13\7\5\7\u017e\n\7\3\b\3\b\7\b\u0182"+
		"\n\b\f\b\16\b\u0185\13\b\3\b\7\b\u0188\n\b\f\b\16\b\u018b\13\b\5\b\u018d"+
		"\n\b\3\b\3\b\7\b\u0191\n\b\f\b\16\b\u0194\13\b\3\b\7\b\u0197\n\b\f\b\16"+
		"\b\u019a\13\b\5\b\u019c\n\b\3\b\3\b\7\b\u01a0\n\b\f\b\16\b\u01a3\13\b"+
		"\3\b\7\b\u01a6\n\b\f\b\16\b\u01a9\13\b\5\b\u01ab\n\b\3\b\3\b\3\t\3\t\7"+
		"\t\u01b1\n\t\f\t\16\t\u01b4\13\t\3\t\7\t\u01b7\n\t\f\t\16\t\u01ba\13\t"+
		"\5\t\u01bc\n\t\3\t\3\t\7\t\u01c0\n\t\f\t\16\t\u01c3\13\t\3\t\7\t\u01c6"+
		"\n\t\f\t\16\t\u01c9\13\t\5\t\u01cb\n\t\3\t\3\t\7\t\u01cf\n\t\f\t\16\t"+
		"\u01d2\13\t\3\t\7\t\u01d5\n\t\f\t\16\t\u01d8\13\t\5\t\u01da\n\t\3\n\3"+
		"\n\7\n\u01de\n\n\f\n\16\n\u01e1\13\n\3\n\7\n\u01e4\n\n\f\n\16\n\u01e7"+
		"\13\n\5\n\u01e9\n\n\3\n\3\n\7\n\u01ed\n\n\f\n\16\n\u01f0\13\n\3\n\7\n"+
		"\u01f3\n\n\f\n\16\n\u01f6\13\n\5\n\u01f8\n\n\3\n\3\n\7\n\u01fc\n\n\f\n"+
		"\16\n\u01ff\13\n\3\n\7\n\u0202\n\n\f\n\16\n\u0205\13\n\5\n\u0207\n\n\3"+
		"\13\3\13\7\13\u020b\n\13\f\13\16\13\u020e\13\13\3\13\7\13\u0211\n\13\f"+
		"\13\16\13\u0214\13\13\5\13\u0216\n\13\3\13\3\13\7\13\u021a\n\13\f\13\16"+
		"\13\u021d\13\13\3\13\7\13\u0220\n\13\f\13\16\13\u0223\13\13\5\13\u0225"+
		"\n\13\3\13\3\13\7\13\u0229\n\13\f\13\16\13\u022c\13\13\3\13\7\13\u022f"+
		"\n\13\f\13\16\13\u0232\13\13\5\13\u0234\n\13\3\f\3\f\7\f\u0238\n\f\f\f"+
		"\16\f\u023b\13\f\3\f\7\f\u023e\n\f\f\f\16\f\u0241\13\f\5\f\u0243\n\f\3"+
		"\f\3\f\7\f\u0247\n\f\f\f\16\f\u024a\13\f\3\f\7\f\u024d\n\f\f\f\16\f\u0250"+
		"\13\f\5\f\u0252\n\f\3\f\3\f\7\f\u0256\n\f\f\f\16\f\u0259\13\f\3\f\7\f"+
		"\u025c\n\f\f\f\16\f\u025f\13\f\5\f\u0261\n\f\3\r\3\r\7\r\u0265\n\r\f\r"+
		"\16\r\u0268\13\r\3\r\7\r\u026b\n\r\f\r\16\r\u026e\13\r\5\r\u0270\n\r\3"+
		"\r\3\r\7\r\u0274\n\r\f\r\16\r\u0277\13\r\3\r\7\r\u027a\n\r\f\r\16\r\u027d"+
		"\13\r\5\r\u027f\n\r\3\16\3\16\7\16\u0283\n\16\f\16\16\16\u0286\13\16\3"+
		"\16\7\16\u0289\n\16\f\16\16\16\u028c\13\16\5\16\u028e\n\16\3\16\3\16\7"+
		"\16\u0292\n\16\f\16\16\16\u0295\13\16\3\16\7\16\u0298\n\16\f\16\16\16"+
		"\u029b\13\16\5\16\u029d\n\16\3\17\3\17\7\17\u02a1\n\17\f\17\16\17\u02a4"+
		"\13\17\3\17\7\17\u02a7\n\17\f\17\16\17\u02aa\13\17\5\17\u02ac\n\17\3\17"+
		"\3\17\7\17\u02b0\n\17\f\17\16\17\u02b3\13\17\3\17\7\17\u02b6\n\17\f\17"+
		"\16\17\u02b9\13\17\5\17\u02bb\n\17\3\20\3\20\7\20\u02bf\n\20\f\20\16\20"+
		"\u02c2\13\20\3\20\7\20\u02c5\n\20\f\20\16\20\u02c8\13\20\5\20\u02ca\n"+
		"\20\3\20\3\20\7\20\u02ce\n\20\f\20\16\20\u02d1\13\20\3\20\7\20\u02d4\n"+
		"\20\f\20\16\20\u02d7\13\20\5\20\u02d9\n\20\3\21\3\21\7\21\u02dd\n\21\f"+
		"\21\16\21\u02e0\13\21\3\21\7\21\u02e3\n\21\f\21\16\21\u02e6\13\21\5\21"+
		"\u02e8\n\21\3\21\3\21\7\21\u02ec\n\21\f\21\16\21\u02ef\13\21\3\21\7\21"+
		"\u02f2\n\21\f\21\16\21\u02f5\13\21\5\21\u02f7\n\21\3\22\3\22\7\22\u02fb"+
		"\n\22\f\22\16\22\u02fe\13\22\3\22\7\22\u0301\n\22\f\22\16\22\u0304\13"+
		"\22\5\22\u0306\n\22\3\22\3\22\7\22\u030a\n\22\f\22\16\22\u030d\13\22\3"+
		"\22\7\22\u0310\n\22\f\22\16\22\u0313\13\22\5\22\u0315\n\22\3\22\2\2\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2!#\3\2!\"\3\2\b\13\3"+
		"\2\35\36\3\2\n\13\2\u03a3\2$\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\b\u00bc\3\2"+
		"\2\2\n\u0107\3\2\2\2\f\u0143\3\2\2\2\16\u017f\3\2\2\2\20\u01ae\3\2\2\2"+
		"\22\u01db\3\2\2\2\24\u0208\3\2\2\2\26\u0235\3\2\2\2\30\u0262\3\2\2\2\32"+
		"\u0280\3\2\2\2\34\u029e\3\2\2\2\36\u02bc\3\2\2\2 \u02da\3\2\2\2\"\u02f8"+
		"\3\2\2\2$(\7\3\2\2%\'\t\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")+\3\2\2\2*(\3\2\2\2+,\7\4\2\2,-\7 \2\2-\61\7\4\2\2.\60\t\2\2\2/.\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2"+
		"\2\64D\7\5\2\2\65\67\t\2\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3"+
		"\2\2\29;\3\2\2\2:8\3\2\2\2;?\5\4\3\2<>\t\3\2\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7#\2\2CE\3\2\2\2D8\3\2\2\2EF\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HL\7\6\2\2IK\7#\2\2JI\3\2\2\2KN\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\2\2\3P\3\3\2\2\2Qa"+
		"\5\32\16\2Ra\5\34\17\2Sa\5\30\r\2Ta\5\24\13\2Ua\5\b\5\2Va\5\36\20\2Wa"+
		"\5 \21\2Xa\5\20\t\2Ya\5\22\n\2Za\5\"\22\2[a\5\n\6\2\\a\5\6\4\2]a\5\16"+
		"\b\2^a\5\f\7\2_a\5\26\f\2`Q\3\2\2\2`R\3\2\2\2`S\3\2\2\2`T\3\2\2\2`U\3"+
		"\2\2\2`V\3\2\2\2`W\3\2\2\2`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\"+
		"\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bo\7\7\2\2ce\7!\2\2d"+
		"c\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gp\3\2\2\2hf\3\2\2\2ik\7\"\2\2"+
		"ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2of\3\2\2\2"+
		"ol\3\2\2\2pq\3\2\2\2q~\t\4\2\2rt\7!\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v\177\3\2\2\2wu\3\2\2\2xz\7\"\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~u\3\2\2\2~{\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u008d\7\f\2\2\u0081\u0083\7!\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008e\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7\"\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u008a\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u009c\t\5\2\2\u0090\u0092\7!\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u009d\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\"\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00ab\7\r\2\2\u009f\u00a1\7!\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7\"\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ba\7$\2\2\u00ae\u00b0\7!\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00bb\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7\"\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00bb\7\3\2\2\2\u00bc\u00c9\7\7\2\2\u00bd\u00bf\7!\2\2"+
		"\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00ca\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\"\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d8\t\4\2\2\u00cc\u00ce\7!"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\""+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00cf\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e7\7\33\2\2\u00db"+
		"\u00dd\7!\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e3\7\"\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00de\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f6\7\r"+
		"\2\2\u00ea\u00ec\7!\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f2\7\"\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u0105\7$\2\2\u00f9\u00fb\7!\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0106\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0101\7\"\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u00fc\3\2\2\2\u0105\u0102\3\2\2\2\u0106\t\3\2\2\2\u0107\u0114"+
		"\7\16\2\2\u0108\u010a\7!\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0115\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\7\"\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u010b\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0123\7$\2\2\u0117\u0119\7!\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0124\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011f\7\"\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u011a\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0132\7\r\2\2\u0126\u0128\7!\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0133\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012e\7\"\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0141\7$\2\2\u0135\u0137\7!\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0142\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013d\7\"\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u013e\3\2\2\2\u0142\13\3\2\2"+
		"\2\u0143\u0150\7\17\2\2\u0144\u0146\7!\2\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0151\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014c\7\"\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014d\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u015f\7$\2\2\u0153\u0155\7!\2\2\u0154\u0153\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0160\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015b\7\"\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u016e\7\r\2\2\u0162\u0164\7!\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016f\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7\"\2\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u016b\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u017d\7$\2\2\u0171\u0173\7!\2\2\u0172\u0171\3\2\2"+
		"\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017e"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\7\"\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u0174\3\2\2\2\u017d\u017a\3\2\2\2\u017e"+
		"\r\3\2\2\2\u017f\u018c\7\20\2\2\u0180\u0182\7!\2\2\u0181\u0180\3\2\2\2"+
		"\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018d"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\7\"\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0189\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u019b\7\34\2\2\u018f\u0191\7!\2\2\u0190\u018f\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u019c\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\7\"\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0198\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u01aa\7\r\2\2\u019e\u01a0\7!\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01ab\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\7\"\2\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa"+
		"\u01a7\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7$\2\2\u01ad\17\3\2\2\2"+
		"\u01ae\u01bb\7\21\2\2\u01af\u01b1\7!\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bc\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b7\7\"\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01ca\7\r\2\2\u01be\u01c0\7!\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01cb\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\7\"\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c7\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01d9\7$\2\2\u01cd\u01cf\7!\2\2\u01ce\u01cd\3\2\2"+
		"\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01da"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\7\"\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01d0\3\2\2\2\u01d9\u01d6\3\2\2\2\u01da"+
		"\21\3\2\2\2\u01db\u01e8\7\22\2\2\u01dc\u01de\7!\2\2\u01dd\u01dc\3\2\2"+
		"\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e9"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\7\"\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01f7\7\r\2\2\u01eb\u01ed\7!\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f8\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\7\"\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01f4\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0206\7$\2\2\u01fa\u01fc\7!\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0207\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7\"\2\2\u0201\u0200\3\2"+
		"\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u01fd\3\2\2\2\u0206\u0203\3\2"+
		"\2\2\u0207\23\3\2\2\2\u0208\u0215\7\23\2\2\u0209\u020b\7!\2\2\u020a\u0209"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0216\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\7\"\2\2\u0210\u020f\3\2"+
		"\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u020c\3\2\2\2\u0215\u0212\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0224\7\r\2\2\u0218\u021a\7!\2\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u0225\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\7\"\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u021b\3\2\2\2\u0224"+
		"\u0221\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0233\7$\2\2\u0227\u0229\7!\2"+
		"\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u0234\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022f\7\"\2\2\u022e"+
		"\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u022a\3\2\2\2\u0233"+
		"\u0230\3\2\2\2\u0234\25\3\2\2\2\u0235\u0242\7\24\2\2\u0236\u0238\7!\2"+
		"\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u0243\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023e\7\"\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0239\3\2\2\2\u0242"+
		"\u023f\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0251\7\r\2\2\u0245\u0247\7!"+
		"\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u0252\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7\""+
		"\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0248\3\2"+
		"\2\2\u0251\u024e\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0260\7$\2\2\u0254"+
		"\u0256\7!\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u0261\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\u025c\7\"\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0257\3\2\2\2\u0260\u025d\3\2\2\2\u0261\27\3\2\2\2\u0262\u026f\7\25\2"+
		"\2\u0263\u0265\7!\2\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0270\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026b\7\"\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0266\3\2\2\2\u026f\u026c\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u027e\t\6"+
		"\2\2\u0272\u0274\7!\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u027f\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u027a\7\"\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u0275\3\2\2\2\u027e\u027b\3\2\2\2\u027f\31\3\2\2\2\u0280\u028d"+
		"\7\26\2\2\u0281\u0283\7!\2\2\u0282\u0281\3\2\2\2\u0283\u0286\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028e\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0287\u0289\7\"\2\2\u0288\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028d\u0284\3\2\2\2\u028d\u028a\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u029c\t\5\2\2\u0290\u0292\7!\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u029d\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u0298\7\"\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u0293\3\2\2\2\u029c\u0299\3\2\2\2\u029d\33\3\2\2"+
		"\2\u029e\u02ab\7\27\2\2\u029f\u02a1\7!\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a4"+
		"\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02ac\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a7\7\"\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02ab\u02a2\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02ba\t\5\2\2\u02ae\u02b0\7!\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02bb\3\2"+
		"\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b6\7\"\2\2\u02b5\u02b4\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02b1\3\2\2\2\u02ba\u02b7\3\2\2\2\u02bb"+
		"\35\3\2\2\2\u02bc\u02c9\7\30\2\2\u02bd\u02bf\7!\2\2\u02be\u02bd\3\2\2"+
		"\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02ca"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7\"\2\2\u02c4\u02c3\3\2\2\2\u02c5"+
		"\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ca\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02c0\3\2\2\2\u02c9\u02c6\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02d8\7\35\2\2\u02cc\u02ce\7!\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d9\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\7\"\2\2\u02d3\u02d2\3\2"+
		"\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02cf\3\2\2\2\u02d8\u02d5\3\2"+
		"\2\2\u02d9\37\3\2\2\2\u02da\u02e7\7\31\2\2\u02db\u02dd\7!\2\2\u02dc\u02db"+
		"\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e8\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\7\"\2\2\u02e2\u02e1\3\2"+
		"\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02de\3\2\2\2\u02e7\u02e4\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f6\7\35\2\2\u02ea\u02ec\7!\2\2\u02eb"+
		"\u02ea\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02f7\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f2\7\"\2\2\u02f1"+
		"\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02ed\3\2\2\2\u02f6"+
		"\u02f3\3\2\2\2\u02f7!\3\2\2\2\u02f8\u0305\7\32\2\2\u02f9\u02fb\7!\2\2"+
		"\u02fa\u02f9\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd"+
		"\3\2\2\2\u02fd\u0306\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\7\"\2\2\u0300"+
		"\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u02fc\3\2\2\2\u0305"+
		"\u0302\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0314\7$\2\2\u0308\u030a\7!\2"+
		"\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c"+
		"\3\2\2\2\u030c\u0315\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\7\"\2\2\u030f"+
		"\u030e\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u030b\3\2\2\2\u0314"+
		"\u0311\3\2\2\2\u0315#\3\2\2\2\u0093(\618?FL`flou{~\u0084\u008a\u008d\u0093"+
		"\u0099\u009c\u00a2\u00a8\u00ab\u00b1\u00b7\u00ba\u00c0\u00c6\u00c9\u00cf"+
		"\u00d5\u00d8\u00de\u00e4\u00e7\u00ed\u00f3\u00f6\u00fc\u0102\u0105\u010b"+
		"\u0111\u0114\u011a\u0120\u0123\u0129\u012f\u0132\u0138\u013e\u0141\u0147"+
		"\u014d\u0150\u0156\u015c\u015f\u0165\u016b\u016e\u0174\u017a\u017d\u0183"+
		"\u0189\u018c\u0192\u0198\u019b\u01a1\u01a7\u01aa\u01b2\u01b8\u01bb\u01c1"+
		"\u01c7\u01ca\u01d0\u01d6\u01d9\u01df\u01e5\u01e8\u01ee\u01f4\u01f7\u01fd"+
		"\u0203\u0206\u020c\u0212\u0215\u021b\u0221\u0224\u022a\u0230\u0233\u0239"+
		"\u023f\u0242\u0248\u024e\u0251\u0257\u025d\u0260\u0266\u026c\u026f\u0275"+
		"\u027b\u027e\u0284\u028a\u028d\u0293\u0299\u029c\u02a2\u02a8\u02ab\u02b1"+
		"\u02b7\u02ba\u02c0\u02c6\u02c9\u02cf\u02d5\u02d8\u02de\u02e4\u02e7\u02ed"+
		"\u02f3\u02f6\u02fc\u0302\u0305\u030b\u0311\u0314";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}