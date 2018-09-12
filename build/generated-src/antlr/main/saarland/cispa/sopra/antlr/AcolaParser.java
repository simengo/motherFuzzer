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
		T__24=25, T__25=26, TARGET=27, DIRECTION=28, REGISTER=29, MARKER=30, NUMBER=31, 
		IDENTIFIER=32, COMMENT=33, SPACE=34;
	public static final int
		RULE_brain = 0, RULE_instruction = 1, RULE_mark = 2, RULE_unmark = 3, 
		RULE_turn = 4, RULE_move = 5, RULE_sense = 6, RULE_sensemarker = 7, RULE_set = 8, 
		RULE_unset = 9, RULE_pickup = 10, RULE_drop = 11, RULE_jump = 12, RULE_flip = 13, 
		RULE_test = 14, RULE_direction = 15, RULE_breed = 16;
	public static final String[] ruleNames = {
		"brain", "instruction", "mark", "unmark", "turn", "move", "sense", "sensemarker", 
		"set", "unset", "pickup", "drop", "jump", "flip", "test", "direction", 
		"breed"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brain'", "'\"'", "'{'", "'\n'", "'\r'", "'}'", "'mark'", "'unmark'", 
		"'turn'", "'left'", "'right'", "'move'", "'else'", "'sense'", "'here'", 
		"'ahead'", "'marker'", "'set'", "'unset'", "'pickup'", "'drop'", "'jump'", 
		"'flip'", "'test'", "'direction'", "'breed'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TARGET", "DIRECTION", "REGISTER", "MARKER", "NUMBER", 
		"IDENTIFIER", "COMMENT", "SPACE"
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
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(34);
				match(SPACE);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(T__0);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(41);
				match(SPACE);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__1);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(48);
				match(SPACE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(IDENTIFIER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(55);
				match(SPACE);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(62);
				match(SPACE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(69);
				match(SPACE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(SPACE);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(82);
					match(SPACE);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				instruction();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(89);
					match(SPACE);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << COMMENT) | (1L << SPACE))) != 0) );
			setState(101);
			match(T__5);
			setState(102);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				mark();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				unmark();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				turn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				move();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				sense();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				unset();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				pickup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				drop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(114);
				flip();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(115);
				sensemarker();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(116);
				direction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(117);
				test();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(118);
				breed();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(119);
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
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 4, RULE_mark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(123);
				match(SPACE);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
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

	public static class UnmarkContext extends ParserRuleContext {
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 6, RULE_unmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__7);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(132);
				match(SPACE);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
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

	public static class TurnContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__8);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(141);
				match(SPACE);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 10, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__11);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(150);
				match(SPACE);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__12);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(157);
				match(SPACE);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class SenseContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(AcolaParser.TARGET, 0); }
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 12, RULE_sense);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__13);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(166);
				match(SPACE);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(173);
				match(SPACE);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(TARGET);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(180);
				match(SPACE);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(T__12);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(187);
				match(SPACE);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class SensemarkerContext extends ParserRuleContext {
		public List<TerminalNode> MARKER() { return getTokens(AcolaParser.MARKER); }
		public TerminalNode MARKER(int i) {
			return getToken(AcolaParser.MARKER, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(AcolaParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(AcolaParser.REGISTER, i);
		}
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
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
		enterRule(_localctx, 14, RULE_sensemarker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__13);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(196);
				match(SPACE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(203);
				match(SPACE);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__16);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(210);
				match(SPACE);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(217);
				match(SPACE);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__12);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(224);
				match(SPACE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 16, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__17);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(233);
				match(SPACE);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(REGISTER);
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
		enterRule(_localctx, 18, RULE_unset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__18);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(242);
				match(SPACE);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(REGISTER);
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
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 20, RULE_pickup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__19);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(251);
				match(SPACE);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(T__12);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(258);
				match(SPACE);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 22, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__20);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(267);
				match(SPACE);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__12);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(274);
				match(SPACE);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class JumpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 24, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__21);
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
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class FlipContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(AcolaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AcolaParser.NUMBER, i);
		}
		public List<TerminalNode> MARKER() { return getTokens(AcolaParser.MARKER); }
		public TerminalNode MARKER(int i) {
			return getToken(AcolaParser.MARKER, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(AcolaParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(AcolaParser.REGISTER, i);
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
		enterRule(_localctx, 26, RULE_flip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__22);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(292);
				match(SPACE);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(299);
				match(SPACE);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__12);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(306);
				match(SPACE);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class TestContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(AcolaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AcolaParser.NUMBER, i);
		}
		public List<TerminalNode> MARKER() { return getTokens(AcolaParser.MARKER); }
		public TerminalNode MARKER(int i) {
			return getToken(AcolaParser.MARKER, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(AcolaParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(AcolaParser.REGISTER, i);
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
		enterRule(_localctx, 28, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__23);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(315);
				match(SPACE);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(322);
				match(SPACE);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(T__12);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(329);
				match(SPACE);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AcolaParser.DIRECTION, 0); }
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 30, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__24);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(338);
				match(SPACE);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(DIRECTION);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(345);
				match(SPACE);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(T__12);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(352);
				match(SPACE);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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

	public static class BreedContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
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
		enterRule(_localctx, 32, RULE_breed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__25);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(361);
				match(SPACE);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(T__12);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(368);
				match(SPACE);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\7\2P\n"+
		"\2\f\2\16\2S\13\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2\16"+
		"\2`\13\2\3\2\3\2\6\2d\n\2\r\2\16\2e\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3{\n\3\3\4\3\4\7\4\177\n"+
		"\4\f\4\16\4\u0082\13\4\3\4\3\4\3\5\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13"+
		"\5\3\5\3\5\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6\3\7\3\7\7"+
		"\7\u009a\n\7\f\7\16\7\u009d\13\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4"+
		"\13\7\3\7\3\7\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\3\b\7\b\u00b1"+
		"\n\b\f\b\16\b\u00b4\13\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\b"+
		"\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\3\t\3\t\7\t\u00c8\n\t\f"+
		"\t\16\t\u00cb\13\t\3\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\3\t\3\t\7"+
		"\t\u00d6\n\t\f\t\16\t\u00d9\13\t\3\t\3\t\7\t\u00dd\n\t\f\t\16\t\u00e0"+
		"\13\t\3\t\3\t\7\t\u00e4\n\t\f\t\16\t\u00e7\13\t\3\t\3\t\3\n\3\n\7\n\u00ed"+
		"\n\n\f\n\16\n\u00f0\13\n\3\n\3\n\3\13\3\13\7\13\u00f6\n\13\f\13\16\13"+
		"\u00f9\13\13\3\13\3\13\3\f\3\f\7\f\u00ff\n\f\f\f\16\f\u0102\13\f\3\f\3"+
		"\f\7\f\u0106\n\f\f\f\16\f\u0109\13\f\3\f\3\f\3\r\3\r\7\r\u010f\n\r\f\r"+
		"\16\r\u0112\13\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\r\3\r\3\16"+
		"\3\16\7\16\u011f\n\16\f\16\16\16\u0122\13\16\3\16\3\16\3\17\3\17\7\17"+
		"\u0128\n\17\f\17\16\17\u012b\13\17\3\17\3\17\7\17\u012f\n\17\f\17\16\17"+
		"\u0132\13\17\3\17\3\17\7\17\u0136\n\17\f\17\16\17\u0139\13\17\3\17\3\17"+
		"\3\20\3\20\7\20\u013f\n\20\f\20\16\20\u0142\13\20\3\20\3\20\7\20\u0146"+
		"\n\20\f\20\16\20\u0149\13\20\3\20\3\20\7\20\u014d\n\20\f\20\16\20\u0150"+
		"\13\20\3\20\3\20\3\21\3\21\7\21\u0156\n\21\f\21\16\21\u0159\13\21\3\21"+
		"\3\21\7\21\u015d\n\21\f\21\16\21\u0160\13\21\3\21\3\21\7\21\u0164\n\21"+
		"\f\21\16\21\u0167\13\21\3\21\3\21\3\22\3\22\7\22\u016d\n\22\f\22\16\22"+
		"\u0170\13\22\3\22\3\22\7\22\u0174\n\22\f\22\16\22\u0177\13\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\6\7\3\2"+
		"\37 \3\2\f\r\3\2\37!\4\2\f\r\21\22\2\u01a2\2\'\3\2\2\2\4z\3\2\2\2\6|\3"+
		"\2\2\2\b\u0085\3\2\2\2\n\u008e\3\2\2\2\f\u0097\3\2\2\2\16\u00a7\3\2\2"+
		"\2\20\u00c5\3\2\2\2\22\u00ea\3\2\2\2\24\u00f3\3\2\2\2\26\u00fc\3\2\2\2"+
		"\30\u010c\3\2\2\2\32\u011c\3\2\2\2\34\u0125\3\2\2\2\36\u013c\3\2\2\2 "+
		"\u0153\3\2\2\2\"\u016a\3\2\2\2$&\7$\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\7\3\2\2+-\7$\2\2,+\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\7\4\2\2\62\64\7"+
		"$\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\65\3\2\2\28<\7\"\2\29;\7$\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\7\4\2\2@B\7$\2\2A@\3\2\2\2BE\3\2\2\2CA"+
		"\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\7\5\2\2GI\7$\2\2HG\3\2\2\2IL"+
		"\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MQ\t\2\2\2NP\7$\2\2ON"+
		"\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2Rc\3\2\2\2SQ\3\2\2\2TV\7$\2\2UT"+
		"\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z^\5\4\3\2["+
		"]\7$\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2"+
		"ab\t\2\2\2bd\3\2\2\2cW\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\7\b\2\2hi\7\2\2\3i\3\3\2\2\2j{\5\6\4\2k{\5\b\5\2l{\5\n\6\2m{\5\f\7"+
		"\2n{\5\16\b\2o{\5\22\n\2p{\5\24\13\2q{\5\26\f\2r{\5\30\r\2s{\5\32\16\2"+
		"t{\5\34\17\2u{\5\20\t\2v{\5 \21\2w{\5\36\20\2x{\5\"\22\2y{\7#\2\2zj\3"+
		"\2\2\2zk\3\2\2\2zl\3\2\2\2zm\3\2\2\2zn\3\2\2\2zo\3\2\2\2zp\3\2\2\2zq\3"+
		"\2\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3"+
		"\2\2\2zy\3\2\2\2{\5\3\2\2\2|\u0080\7\t\2\2}\177\7$\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\t\3\2\2\u0084\7\3\2\2\2\u0085\u0089\7\n\2\2"+
		"\u0086\u0088\7$\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\t\3\2\2\u008d\t\3\2\2\2\u008e\u0092\7\13\2\2\u008f\u0091\7$\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\t\4\2\2\u0096"+
		"\13\3\2\2\2\u0097\u009b\7\16\2\2\u0098\u009a\7$\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a2\7\17\2\2\u009f\u00a1\7$\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6"+
		"\r\3\2\2\2\u00a7\u00ab\7\20\2\2\u00a8\u00aa\7$\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\t\6\2\2\u00af\u00b1\7$\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b9\7\35\2\2\u00b6"+
		"\u00b8\7$\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00c0\7\17\2\2\u00bd\u00bf\7$\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4\17\3\2\2\2\u00c5\u00c9\7\20\2"+
		"\2\u00c6\u00c8\7$\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d0\t\6\2\2\u00cd\u00cf\7$\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d7\7\23\2\2\u00d4\u00d6\7$\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\t\3\2\2\u00db\u00dd\7$"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\7\17"+
		"\2\2\u00e2\u00e4\7$\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\t\5\2\2\u00e9\21\3\2\2\2\u00ea\u00ee\7\24\2\2\u00eb\u00ed"+
		"\7$\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\37"+
		"\2\2\u00f2\23\3\2\2\2\u00f3\u00f7\7\25\2\2\u00f4\u00f6\7$\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\37\2\2\u00fb\25\3\2\2"+
		"\2\u00fc\u0100\7\26\2\2\u00fd\u00ff\7$\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0107\7\17\2\2\u0104\u0106\7$\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\t\5\2\2\u010b\27\3\2\2"+
		"\2\u010c\u0110\7\27\2\2\u010d\u010f\7$\2\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0117\7\17\2\2\u0114\u0116\7$\2\2\u0115\u0114\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\t\5\2\2\u011b\31\3\2\2"+
		"\2\u011c\u0120\7\30\2\2\u011d\u011f\7$\2\2\u011e\u011d\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\t\5\2\2\u0124\33\3\2\2\2\u0125\u0129\7\31\2"+
		"\2\u0126\u0128\7$\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u0130\t\5\2\2\u012d\u012f\7$\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0137\7\17\2\2\u0134\u0136\7$\2\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\t\5\2\2\u013b\35\3\2\2"+
		"\2\u013c\u0140\7\32\2\2\u013d\u013f\7$\2\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0147\t\5\2\2\u0144\u0146\7$\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e\7\17\2\2\u014b\u014d\7"+
		"$\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\t\5"+
		"\2\2\u0152\37\3\2\2\2\u0153\u0157\7\33\2\2\u0154\u0156\7$\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015e\7\36\2\2\u015b\u015d\7"+
		"$\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0165\7\17"+
		"\2\2\u0162\u0164\7$\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0169\t\5\2\2\u0169!\3\2\2\2\u016a\u016e\7\34\2\2\u016b\u016d"+
		"\7$\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0175\7\17"+
		"\2\2\u0172\u0174\7$\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\t\5\2\2\u0179#\3\2\2\2-\'.\65<CJQW^ez\u0080\u0089\u0092"+
		"\u009b\u00a2\u00ab\u00b2\u00b9\u00c0\u00c9\u00d0\u00d7\u00de\u00e5\u00ee"+
		"\u00f7\u0100\u0107\u0110\u0117\u0120\u0129\u0130\u0137\u0140\u0147\u014e"+
		"\u0157\u015e\u0165\u016e\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}