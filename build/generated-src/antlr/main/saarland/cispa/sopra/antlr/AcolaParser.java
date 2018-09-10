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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, FIELD=24, 
		TARGET=25, DIRECTION=26, MARKER=27, NUMBER=28, IDENTIFIER=29, COMMENT=30;
	public static final int
		RULE_brain = 0, RULE_instruction = 1, RULE_mark = 2, RULE_unmark = 3, 
		RULE_turn = 4, RULE_move = 5, RULE_sense = 6, RULE_sensemarker = 7, RULE_set = 8, 
		RULE_unset = 9, RULE_pickup = 10, RULE_drop = 11, RULE_jump = 12, RULE_flip = 13, 
		RULE_test = 14, RULE_directions = 15, RULE_breed = 16;
	public static final String[] ruleNames = {
		"brain", "instruction", "mark", "unmark", "turn", "move", "sense", "sensemarker", 
		"set", "unset", "pickup", "drop", "jump", "flip", "test", "directions", 
		"breed"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"'", "'{'", "'\\n'", "'}'", "'mark'", "'unmark'", 
		"'turn'", "'left'", "'right'", "'move'", "'else'", "'sense'", "'marker'", 
		"'set'", "'unset'", "'pickup'", "'drop'", "'jump'", "'flip'", "'test'", 
		"'directions'", "'breed'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"FIELD", "TARGET", "DIRECTION", "MARKER", "NUMBER", "IDENTIFIER", "COMMENT"
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
			setState(35);
			match(T__1);
			setState(36);
			match(IDENTIFIER);
			setState(37);
			match(T__1);
			setState(38);
			match(T__2);
			setState(39);
			match(T__3);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				instruction();
				setState(41);
				match(T__3);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << COMMENT))) != 0) );
			setState(47);
			match(T__4);
			setState(48);
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
		public DirectionsContext directions() {
			return getRuleContext(DirectionsContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(AcolaParser.COMMENT, 0); }
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				mark();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				unmark();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				turn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				move();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				sense();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				unset();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				pickup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				drop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
				flip();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				sensemarker();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62);
				directions();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(63);
				test();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(64);
				match(COMMENT);
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

	public static class MarkContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 4, RULE_mark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 6, RULE_unmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__6);
			setState(71);
			match(NUMBER);
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
		enterRule(_localctx, 8, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 10, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__10);
			setState(77);
			match(T__11);
			setState(78);
			match(NUMBER);
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
		public TerminalNode FIELD() { return getToken(AcolaParser.FIELD, 0); }
		public TerminalNode TARGET() { return getToken(AcolaParser.TARGET, 0); }
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 12, RULE_sense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__12);
			setState(81);
			match(FIELD);
			setState(82);
			match(TARGET);
			setState(83);
			match(T__11);
			setState(84);
			match(NUMBER);
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
		public TerminalNode FIELD() { return getToken(AcolaParser.FIELD, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 14, RULE_sensemarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__12);
			setState(87);
			match(FIELD);
			setState(88);
			match(T__13);
			setState(89);
			match(MARKER);
			setState(90);
			match(T__11);
			setState(91);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 16, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__14);
			setState(94);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 18, RULE_unset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__15);
			setState(97);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 20, RULE_pickup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__16);
			setState(100);
			match(T__11);
			setState(101);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 22, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__17);
			setState(104);
			match(T__11);
			setState(105);
			match(NUMBER);
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
		public List<TerminalNode> NUMBER() { return getTokens(AcolaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AcolaParser.NUMBER, i);
		}
		public List<TerminalNode> MARKER() { return getTokens(AcolaParser.MARKER); }
		public TerminalNode MARKER(int i) {
			return getToken(AcolaParser.MARKER, i);
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
		enterRule(_localctx, 24, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__18);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==MARKER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MARKER || _la==NUMBER );
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 26, RULE_flip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__19);
			setState(114);
			match(T__11);
			setState(115);
			match(NUMBER);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 28, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__20);
			setState(118);
			match(T__11);
			setState(119);
			match(NUMBER);
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

	public static class DirectionsContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AcolaParser.DIRECTION, 0); }
		public DirectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).enterDirections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcolaListener ) ((AcolaListener)listener).exitDirections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcolaVisitor ) return ((AcolaVisitor<? extends T>)visitor).visitDirections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionsContext directions() throws RecognitionException {
		DirectionsContext _localctx = new DirectionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_directions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__21);
			setState(122);
			match(DIRECTION);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 32, RULE_breed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__22);
			setState(125);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\6\16p\n\16\r\16\16\16q\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2\13\f\3\2\35\36\2\u0080"+
		"\2$\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bH\3\2\2\2\nK\3\2\2\2\fN\3\2\2\2\16"+
		"R\3\2\2\2\20X\3\2\2\2\22_\3\2\2\2\24b\3\2\2\2\26e\3\2\2\2\30i\3\2\2\2"+
		"\32m\3\2\2\2\34s\3\2\2\2\36w\3\2\2\2 {\3\2\2\2\"~\3\2\2\2$%\7\3\2\2%&"+
		"\7\4\2\2&\'\7\37\2\2\'(\7\4\2\2()\7\5\2\2)-\7\6\2\2*+\5\4\3\2+,\7\6\2"+
		"\2,.\3\2\2\2-*\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\7\7\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64D\5\6\4\2\65D\5\b\5\2\66D\5\n"+
		"\6\2\67D\5\f\7\28D\5\16\b\29D\5\22\n\2:D\5\24\13\2;D\5\26\f\2<D\5\30\r"+
		"\2=D\5\32\16\2>D\5\34\17\2?D\5\20\t\2@D\5 \21\2AD\5\36\20\2BD\7 \2\2C"+
		"\64\3\2\2\2C\65\3\2\2\2C\66\3\2\2\2C\67\3\2\2\2C8\3\2\2\2C9\3\2\2\2C:"+
		"\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2C"+
		"A\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\7\b\2\2FG\7\36\2\2G\7\3\2\2\2HI\7\t\2"+
		"\2IJ\7\36\2\2J\t\3\2\2\2KL\7\n\2\2LM\t\2\2\2M\13\3\2\2\2NO\7\r\2\2OP\7"+
		"\16\2\2PQ\7\36\2\2Q\r\3\2\2\2RS\7\17\2\2ST\7\32\2\2TU\7\33\2\2UV\7\16"+
		"\2\2VW\7\36\2\2W\17\3\2\2\2XY\7\17\2\2YZ\7\32\2\2Z[\7\20\2\2[\\\7\35\2"+
		"\2\\]\7\16\2\2]^\7\36\2\2^\21\3\2\2\2_`\7\21\2\2`a\7\36\2\2a\23\3\2\2"+
		"\2bc\7\22\2\2cd\7\36\2\2d\25\3\2\2\2ef\7\23\2\2fg\7\16\2\2gh\7\36\2\2"+
		"h\27\3\2\2\2ij\7\24\2\2jk\7\16\2\2kl\7\36\2\2l\31\3\2\2\2mo\7\25\2\2n"+
		"p\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\33\3\2\2\2st\7\26\2"+
		"\2tu\7\16\2\2uv\7\36\2\2v\35\3\2\2\2wx\7\27\2\2xy\7\16\2\2yz\7\36\2\2"+
		"z\37\3\2\2\2{|\7\30\2\2|}\7\34\2\2}!\3\2\2\2~\177\7\31\2\2\177\u0080\7"+
		"\36\2\2\u0080#\3\2\2\2\5/Cq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}