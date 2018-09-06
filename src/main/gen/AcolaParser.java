// Generated from /home/wep/IdeaProjects/group22/src/main/ressources/Acola.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		TURNDIRECTION=25, IDENTIFIER=26, NUMBER=27, FIELD=28, TARGET=29, COMMENT=30;
	public static final int
		RULE_brain = 0, RULE_instruction = 1, RULE_mark = 2, RULE_unmark = 3, 
		RULE_turn = 4, RULE_move = 5, RULE_sense = 6, RULE_set = 7, RULE_unset = 8, 
		RULE_pickup = 9, RULE_drop = 10, RULE_jump = 11, RULE_flip = 12, RULE_test = 13, 
		RULE_directions = 14, RULE_direction = 15;
	public static final String[] ruleNames = {
		"brain", "instruction", "mark", "unmark", "turn", "move", "sense", "set", 
		"unset", "pickup", "drop", "jump", "flip", "test", "directions", "direction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"\"'", "'{'", "'}'", "'mark'", "'unmark'", "'turn'", 
		"'move'", "'else'", "'sense'", "'set'", "'unset'", "'pickup'", "'drop'", 
		"'jump'", "'flip'", "'test'", "'directions'", "'northwest'", "'west'", 
		"'southwest'", "'southeast'", "'east'", "'northeast'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "TURNDIRECTION", "IDENTIFIER", "NUMBER", "FIELD", "TARGET", "COMMENT"
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AcolaParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(34);
			match(IDENTIFIER);
			setState(35);
			match(T__1);
			setState(36);
			match(T__2);
			setState(37);
			instruction();
			setState(38);
			match(T__3);
			setState(39);
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
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			mark();
			setState(42);
			unmark();
			setState(43);
			turn();
			setState(44);
			move();
			setState(45);
			sense();
			setState(46);
			set();
			setState(47);
			unset();
			setState(48);
			pickup();
			setState(49);
			drop();
			setState(50);
			jump();
			setState(51);
			flip();
			setState(52);
			test();
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
			setState(54);
			match(T__4);
			setState(55);
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
			setState(57);
			match(T__5);
			setState(58);
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
		public TerminalNode TURNDIRECTION() { return getToken(AcolaParser.TURNDIRECTION, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(61);
			match(TURNDIRECTION);
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
			setState(63);
			match(T__7);
			setState(64);
			match(T__8);
			setState(65);
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
			setState(67);
			match(T__9);
			setState(68);
			match(FIELD);
			setState(69);
			match(TARGET);
			setState(70);
			match(T__8);
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
		enterRule(_localctx, 14, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__10);
			setState(74);
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
		enterRule(_localctx, 16, RULE_unset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__11);
			setState(77);
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
		enterRule(_localctx, 18, RULE_pickup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__12);
			setState(80);
			match(T__8);
			setState(81);
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
		enterRule(_localctx, 20, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__13);
			setState(84);
			match(T__8);
			setState(85);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 22, RULE_jump);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__14);
			setState(88);
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
		enterRule(_localctx, 24, RULE_flip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__15);
			setState(91);
			match(T__8);
			setState(92);
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
		enterRule(_localctx, 26, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__16);
			setState(95);
			match(T__8);
			setState(96);
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
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_directions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__17);
			setState(99);
			direction();
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
		enterRule(_localctx, 30, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__18);
			setState(102);
			match(T__19);
			setState(103);
			match(T__20);
			setState(104);
			match(T__21);
			setState(105);
			match(T__22);
			setState(106);
			match(T__23);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 o\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\2\2^\2\"\3\2\2\2\4+\3\2\2\2\68\3\2\2\2\b;\3\2\2\2\n>\3\2"+
		"\2\2\fA\3\2\2\2\16E\3\2\2\2\20K\3\2\2\2\22N\3\2\2\2\24Q\3\2\2\2\26U\3"+
		"\2\2\2\30Y\3\2\2\2\32\\\3\2\2\2\34`\3\2\2\2\36d\3\2\2\2 g\3\2\2\2\"#\7"+
		"\3\2\2#$\7\4\2\2$%\7\34\2\2%&\7\4\2\2&\'\7\5\2\2\'(\5\4\3\2()\7\6\2\2"+
		")*\7\2\2\3*\3\3\2\2\2+,\5\6\4\2,-\5\b\5\2-.\5\n\6\2./\5\f\7\2/\60\5\16"+
		"\b\2\60\61\5\20\t\2\61\62\5\22\n\2\62\63\5\24\13\2\63\64\5\26\f\2\64\65"+
		"\5\30\r\2\65\66\5\32\16\2\66\67\5\34\17\2\67\5\3\2\2\289\7\7\2\29:\7\35"+
		"\2\2:\7\3\2\2\2;<\7\b\2\2<=\7\35\2\2=\t\3\2\2\2>?\7\t\2\2?@\7\33\2\2@"+
		"\13\3\2\2\2AB\7\n\2\2BC\7\13\2\2CD\7\35\2\2D\r\3\2\2\2EF\7\f\2\2FG\7\36"+
		"\2\2GH\7\37\2\2HI\7\13\2\2IJ\7\35\2\2J\17\3\2\2\2KL\7\r\2\2LM\7\35\2\2"+
		"M\21\3\2\2\2NO\7\16\2\2OP\7\35\2\2P\23\3\2\2\2QR\7\17\2\2RS\7\13\2\2S"+
		"T\7\35\2\2T\25\3\2\2\2UV\7\20\2\2VW\7\13\2\2WX\7\35\2\2X\27\3\2\2\2YZ"+
		"\7\21\2\2Z[\7\35\2\2[\31\3\2\2\2\\]\7\22\2\2]^\7\13\2\2^_\7\35\2\2_\33"+
		"\3\2\2\2`a\7\23\2\2ab\7\13\2\2bc\7\35\2\2c\35\3\2\2\2de\7\24\2\2ef\5 "+
		"\21\2f\37\3\2\2\2gh\7\25\2\2hi\7\26\2\2ij\7\27\2\2jk\7\30\2\2kl\7\31\2"+
		"\2lm\7\32\2\2m!\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}