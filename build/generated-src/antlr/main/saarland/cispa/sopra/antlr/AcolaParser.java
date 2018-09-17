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
		TARGET=25, DIRECTION=26, REGISTER=27, MARKER=28, NUMBER=29, KEYWORD=30, 
		IDENTIFIER=31, SPACE=32, NEWLINE=33, COMMENTS=34;
	public static final int
		RULE_brain = 0, RULE_instruction = 1, RULE_turn = 2, RULE_mark = 3, RULE_unmark = 4, 
		RULE_set = 5, RULE_unset = 6, RULE_jump = 7, RULE_sensemarker = 8, RULE_sense = 9, 
		RULE_flip = 10, RULE_test = 11, RULE_direction = 12, RULE_pickup = 13, 
		RULE_drop = 14, RULE_move = 15, RULE_breed = 16;
	public static final String[] ruleNames = {
		"brain", "instruction", "turn", "mark", "unmark", "set", "unset", "jump", 
		"sensemarker", "sense", "flip", "test", "direction", "pickup", "drop", 
		"move", "breed"
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
		"IDENTIFIER", "SPACE", "NEWLINE", "COMMENTS"
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
	    throw new IllegalArgumentException(msg);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AcolaParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AcolaParser.SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AcolaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AcolaParser.NEWLINE, i);
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
			setState(34);
			match(T__0);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0) );
			setState(40);
			match(T__1);
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) {
				{
				{
				setState(43);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__2);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) {
					{
					{
					setState(50);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				instruction();
				setState(74); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SPACE || _la==COMMENTS) {
							{
							{
							setState(57);
							_la = _input.LA(1);
							if ( !(_la==SPACE || _la==COMMENTS) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(62);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(64); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(63);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(66); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(71);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(68);
								_la = _input.LA(1);
								if ( !(_la==SPACE || _la==COMMENTS) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								} 
							}
							setState(73);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0) );
			setState(82);
			match(T__3);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) {
				{
				{
				setState(83);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << NEWLINE) | (1L << COMMENTS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				mark();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				unmark();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				turn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				move();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				sense();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				unset();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				pickup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				drop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				flip();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(102);
				sensemarker();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				direction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				test();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(105);
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

	public static class TurnContext extends ParserRuleContext {
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 4, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class MarkContext extends ParserRuleContext {
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 6, RULE_mark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__7);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(122);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 8, RULE_unmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(130);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 10, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__9);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(138);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 12, RULE_unset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__10);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(146);
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

	public static class JumpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 14, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__11);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(154);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 16, RULE_sensemarker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__12);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(168);
			match(T__15);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
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
			do {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(180);
			match(T__16);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(186);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 18, RULE_sense);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__12);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(200);
			match(TARGET);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(206);
			match(T__16);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(212);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 20, RULE_flip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__17);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(226);
			match(T__16);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(232);
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
		public List<TerminalNode> REGISTER() { return getTokens(AcolaParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(AcolaParser.REGISTER, i);
		}
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 22, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__18);
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(240);
			match(REGISTER);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(246);
			match(T__16);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(252);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 24, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__19);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(260);
			match(DIRECTION);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(266);
			match(T__16);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(272);
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

	public static class PickupContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 26, RULE_pickup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__20);
			setState(276); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(280);
			match(T__16);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(286);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 28, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__21);
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(294);
			match(T__16);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(300);
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 30, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__22);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(308);
			match(T__16);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(314);
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
		public List<TerminalNode> COMMENTS() { return getTokens(AcolaParser.COMMENTS); }
		public TerminalNode COMMENTS(int i) {
			return getToken(AcolaParser.COMMENTS, i);
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
		enterRule(_localctx, 32, RULE_breed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__23);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(322);
			match(T__16);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==COMMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==COMMENTS );
			setState(328);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2\3\2"+
		"\6\2C\n\2\r\2\16\2D\3\2\7\2H\n\2\f\2\16\2K\13\2\6\2M\n\2\r\2\16\2N\6\2"+
		"Q\n\2\r\2\16\2R\3\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\6\4q\n"+
		"\4\r\4\16\4r\3\4\3\4\3\5\3\5\6\5y\n\5\r\5\16\5z\3\5\3\5\3\6\3\6\6\6\u0081"+
		"\n\6\r\6\16\6\u0082\3\6\3\6\3\7\3\7\6\7\u0089\n\7\r\7\16\7\u008a\3\7\3"+
		"\7\3\b\3\b\6\b\u0091\n\b\r\b\16\b\u0092\3\b\3\b\3\t\3\t\6\t\u0099\n\t"+
		"\r\t\16\t\u009a\3\t\3\t\3\n\3\n\6\n\u00a1\n\n\r\n\16\n\u00a2\3\n\3\n\6"+
		"\n\u00a7\n\n\r\n\16\n\u00a8\3\n\3\n\6\n\u00ad\n\n\r\n\16\n\u00ae\3\n\3"+
		"\n\6\n\u00b3\n\n\r\n\16\n\u00b4\3\n\3\n\6\n\u00b9\n\n\r\n\16\n\u00ba\3"+
		"\n\3\n\3\13\3\13\6\13\u00c1\n\13\r\13\16\13\u00c2\3\13\3\13\6\13\u00c7"+
		"\n\13\r\13\16\13\u00c8\3\13\3\13\6\13\u00cd\n\13\r\13\16\13\u00ce\3\13"+
		"\3\13\6\13\u00d3\n\13\r\13\16\13\u00d4\3\13\3\13\3\f\3\f\6\f\u00db\n\f"+
		"\r\f\16\f\u00dc\3\f\3\f\6\f\u00e1\n\f\r\f\16\f\u00e2\3\f\3\f\6\f\u00e7"+
		"\n\f\r\f\16\f\u00e8\3\f\3\f\3\r\3\r\6\r\u00ef\n\r\r\r\16\r\u00f0\3\r\3"+
		"\r\6\r\u00f5\n\r\r\r\16\r\u00f6\3\r\3\r\6\r\u00fb\n\r\r\r\16\r\u00fc\3"+
		"\r\3\r\3\16\3\16\6\16\u0103\n\16\r\16\16\16\u0104\3\16\3\16\6\16\u0109"+
		"\n\16\r\16\16\16\u010a\3\16\3\16\6\16\u010f\n\16\r\16\16\16\u0110\3\16"+
		"\3\16\3\17\3\17\6\17\u0117\n\17\r\17\16\17\u0118\3\17\3\17\6\17\u011d"+
		"\n\17\r\17\16\17\u011e\3\17\3\17\3\20\3\20\6\20\u0125\n\20\r\20\16\20"+
		"\u0126\3\20\3\20\6\20\u012b\n\20\r\20\16\20\u012c\3\20\3\20\3\21\3\21"+
		"\6\21\u0133\n\21\r\21\16\21\u0134\3\21\3\21\6\21\u0139\n\21\r\21\16\21"+
		"\u013a\3\21\3\21\3\22\3\22\6\22\u0141\n\22\r\22\16\22\u0142\3\22\3\22"+
		"\6\22\u0147\n\22\r\22\16\22\u0148\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\b\3\2\"$\4\2\"\"$$\3\2\b\t\3\2\35\36\3\2"+
		"\35\37\4\2\b\t\20\21\2\u0172\2$\3\2\2\2\4l\3\2\2\2\6n\3\2\2\2\bv\3\2\2"+
		"\2\n~\3\2\2\2\f\u0086\3\2\2\2\16\u008e\3\2\2\2\20\u0096\3\2\2\2\22\u009e"+
		"\3\2\2\2\24\u00be\3\2\2\2\26\u00d8\3\2\2\2\30\u00ec\3\2\2\2\32\u0100\3"+
		"\2\2\2\34\u0114\3\2\2\2\36\u0122\3\2\2\2 \u0130\3\2\2\2\"\u013e\3\2\2"+
		"\2$&\7\3\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2"+
		"\2\2*+\7\4\2\2+,\7!\2\2,\60\7\4\2\2-/\t\2\2\2.-\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63P\7\5\2\2\64\66"+
		"\t\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\2"+
		"9\67\3\2\2\2:L\5\4\3\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2AC\7#\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2EI\3\2\2\2FH\t\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2L>\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2P\67\3\2"+
		"\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TX\7\6\2\2UW\t\2\2\2VU\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\2\2\3\\\3"+
		"\3\2\2\2]m\5\b\5\2^m\5\n\6\2_m\5\6\4\2`m\5 \21\2am\5\24\13\2bm\5\f\7\2"+
		"cm\5\16\b\2dm\5\34\17\2em\5\36\20\2fm\5\20\t\2gm\5\26\f\2hm\5\22\n\2i"+
		"m\5\32\16\2jm\5\30\r\2km\5\"\22\2l]\3\2\2\2l^\3\2\2\2l_\3\2\2\2l`\3\2"+
		"\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg\3\2"+
		"\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\5\3\2\2\2np\7\7\2\2oq\t"+
		"\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\t\4\2\2u\7"+
		"\3\2\2\2vx\7\n\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"|\3\2\2\2|}\t\5\2\2}\t\3\2\2\2~\u0080\7\13\2\2\177\u0081\t\3\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\t\5\2\2\u0085\13\3\2\2\2\u0086\u0088"+
		"\7\f\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\35"+
		"\2\2\u008d\r\3\2\2\2\u008e\u0090\7\r\2\2\u008f\u0091\t\3\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\35\2\2\u0095\17\3\2\2\2\u0096\u0098\7\16"+
		"\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\t\6"+
		"\2\2\u009d\21\3\2\2\2\u009e\u00a0\7\17\2\2\u009f\u00a1\t\3\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\t\7\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\7\22\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\t\5\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\7\23\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\23\3\2\2\2\u00be\u00c0\7\17\2"+
		"\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\t\7\2\2\u00c5"+
		"\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\33\2\2\u00cb"+
		"\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\23\2\2\u00d1"+
		"\u00d3\t\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7"+
		"\25\3\2\2\2\u00d8\u00da\7\24\2\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2"+
		"\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\t\6\2\2\u00df\u00e1\t\3\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\7\23\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\t\6\2\2\u00eb\27\3\2\2\2\u00ec\u00ee\7\25\2\2\u00ed\u00ef"+
		"\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\35\2\2\u00f3\u00f5\t"+
		"\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7\23\2\2\u00f9\u00fb\t"+
		"\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\t\6\2\2\u00ff\31\3\2\2"+
		"\2\u0100\u0102\7\26\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\7\34\2\2\u0107\u0109\t\3\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\7\23\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\t\6\2\2\u0113\33\3\2\2\2\u0114\u0116\7\27\2\2\u0115\u0117"+
		"\t\3\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\7\23\2\2\u011b\u011d\t"+
		"\3\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\t\6\2\2\u0121\35\3\2\2"+
		"\2\u0122\u0124\7\30\2\2\u0123\u0125\t\3\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\7\23\2\2\u0129\u012b\t\3\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\t\6\2\2\u012f\37\3\2\2\2\u0130\u0132\7\31\2\2\u0131\u0133"+
		"\t\3\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\7\23\2\2\u0137\u0139\t"+
		"\3\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\t\6\2\2\u013d!\3\2\2\2"+
		"\u013e\u0140\7\32\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\7\23\2\2\u0145\u0147\t\3\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\t\6\2\2\u014b#\3\2\2\2,(\60\67>DINRXlrz\u0082\u008a\u0092\u009a"+
		"\u00a2\u00a8\u00ae\u00b4\u00ba\u00c2\u00c8\u00ce\u00d4\u00dc\u00e2\u00e8"+
		"\u00f0\u00f6\u00fc\u0104\u010a\u0110\u0118\u011e\u0126\u012c\u0134\u013a"+
		"\u0142\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}