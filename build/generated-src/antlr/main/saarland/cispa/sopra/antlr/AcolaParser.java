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
		IDENTIFIER=31, COMMENTWITHNEWLINE=32, COMMENTS=33, SPACE=34, NEWLINE=35;
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
		"IDENTIFIER", "COMMENTWITHNEWLINE", "COMMENTS", "SPACE", "NEWLINE"
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
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
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(51);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0)) ) {
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
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENTS || _la==SPACE) {
							{
							{
							setState(58);
							_la = _input.LA(1);
							if ( !(_la==COMMENTS || _la==SPACE) ) {
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
						setState(65); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(64);
								_la = _input.LA(1);
								if ( !(_la==COMMENTWITHNEWLINE || _la==NEWLINE) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(67); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						} 
					}
					setState(73);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << SPACE) | (1L << NEWLINE))) != 0) );
			setState(78);
			match(T__3);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTWITHNEWLINE) | (1L << COMMENTS) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				mark();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				unmark();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				turn();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				move();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				sense();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				unset();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				pickup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				drop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				jump();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				flip();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(98);
				sensemarker();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99);
				direction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(100);
				test();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__4);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(105);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(111);
					match(COMMENTS);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(117);
					match(SPACE);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(COMMENTS);
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						match(SPACE);
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__7);
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(147);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(153);
					match(COMMENTS);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(159);
					match(SPACE);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174);
						match(COMMENTS);
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(180);
						match(SPACE);
						}
						} 
					}
					setState(185);
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

	public static class UnmarkContext extends ParserRuleContext {
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__8);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(189);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(195);
					match(COMMENTS);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(201);
					match(SPACE);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						match(COMMENTS);
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(SPACE);
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__9);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(231);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(237);
					match(COMMENTS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(243);
					match(SPACE);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(251);
			match(REGISTER);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						match(COMMENTS);
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						match(SPACE);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__10);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(273);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(279);
					match(COMMENTS);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(285);
					match(SPACE);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(293);
			match(REGISTER);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(294);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(COMMENTS);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(SPACE);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__11);
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(315);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(321);
					match(COMMENTS);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(327);
					match(SPACE);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
						match(COMMENTS);
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(SPACE);
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__12);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(357);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(363);
					match(COMMENTS);
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(369);
					match(SPACE);
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(378);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(384);
					match(COMMENTS);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(390);
					match(SPACE);
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(398);
			match(T__15);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(399);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(405);
					match(COMMENTS);
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(411);
					match(SPACE);
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==MARKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(420);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(426);
					match(COMMENTS);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(432);
					match(SPACE);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(440);
			match(T__16);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(441);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(447);
					match(COMMENTS);
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(453);
					match(SPACE);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(462);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(468);
						match(COMMENTS);
						}
						} 
					}
					setState(473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474);
						match(SPACE);
						}
						} 
					}
					setState(479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__12);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(483);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(489);
					match(COMMENTS);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
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
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(504);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(510);
					match(COMMENTS);
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(516);
					match(SPACE);
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(524);
			match(TARGET);
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(525);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(531);
					match(COMMENTS);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(537);
					match(SPACE);
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(545);
			match(T__16);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(546);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(552);
					match(COMMENTS);
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(558);
					match(SPACE);
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(566);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(573);
						match(COMMENTS);
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(579);
						match(SPACE);
						}
						} 
					}
					setState(584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__17);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(588);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(594);
					match(COMMENTS);
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(600);
					match(SPACE);
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(608);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(609);
					match(COMMENTWITHNEWLINE);
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
				while (_la==COMMENTS) {
					{
					{
					setState(615);
					match(COMMENTS);
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(621);
					match(SPACE);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(629);
			match(T__16);
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(630);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(636);
					match(COMMENTS);
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(642);
					match(SPACE);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(650);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(651);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(657);
						match(COMMENTS);
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(663);
						match(SPACE);
						}
						} 
					}
					setState(668);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		public List<TerminalNode> REGISTER() { return getTokens(AcolaParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(AcolaParser.REGISTER, i);
		}
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__18);
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(672);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(678);
					match(COMMENTS);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(684);
					match(SPACE);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(692);
			match(REGISTER);
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(693);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(699);
					match(COMMENTS);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
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
			match(T__16);
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(714);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(720);
					match(COMMENTS);
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(726);
					match(SPACE);
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(734);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(735);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(740);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(741);
						match(COMMENTS);
						}
						} 
					}
					setState(746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(747);
						match(SPACE);
						}
						} 
					}
					setState(752);
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode DIRECTION() { return getToken(AcolaParser.DIRECTION, 0); }
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			setState(755);
			match(T__19);
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(756);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(762);
					match(COMMENTS);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(768);
					match(SPACE);
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(776);
			match(DIRECTION);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(777);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(783);
					match(COMMENTS);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(789);
					match(SPACE);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(797);
			match(T__16);
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(798);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(804);
					match(COMMENTS);
					}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(810);
					match(SPACE);
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(818);
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
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T__20);
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(821);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(827);
					match(COMMENTS);
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(833);
					match(SPACE);
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(841);
			match(T__16);
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(842);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(848);
					match(COMMENTS);
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(854);
					match(SPACE);
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(862);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(863);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(869);
						match(COMMENTS);
						}
						} 
					}
					setState(874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(875);
						match(SPACE);
						}
						} 
					}
					setState(880);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(T__21);
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(884);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(890);
					match(COMMENTS);
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(896);
					match(SPACE);
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(904);
			match(T__16);
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(905);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(911);
					match(COMMENTS);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(917);
					match(SPACE);
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(925);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(926);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(931);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(932);
						match(COMMENTS);
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(938);
						match(SPACE);
						}
						} 
					}
					setState(943);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(T__22);
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(947);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(953);
					match(COMMENTS);
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(959);
					match(SPACE);
					}
					}
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(967);
			match(T__16);
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(968);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(974);
					match(COMMENTS);
					}
					}
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(980);
					match(SPACE);
					}
					}
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(988);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(989);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(994);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(995);
						match(COMMENTS);
						}
						} 
					}
					setState(1000);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1001);
						match(SPACE);
						}
						} 
					}
					setState(1006);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AcolaParser.NUMBER, 0); }
		public TerminalNode MARKER() { return getToken(AcolaParser.MARKER, 0); }
		public TerminalNode REGISTER() { return getToken(AcolaParser.REGISTER, 0); }
		public List<TerminalNode> COMMENTWITHNEWLINE() { return getTokens(AcolaParser.COMMENTWITHNEWLINE); }
		public TerminalNode COMMENTWITHNEWLINE(int i) {
			return getToken(AcolaParser.COMMENTWITHNEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(T__23);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(1010);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(1016);
					match(COMMENTS);
					}
					}
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(1022);
					match(SPACE);
					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1030);
			match(T__16);
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTWITHNEWLINE) {
					{
					{
					setState(1031);
					match(COMMENTWITHNEWLINE);
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENTS) {
					{
					{
					setState(1037);
					match(COMMENTS);
					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(1043);
					match(SPACE);
					}
					}
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1051);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << MARKER) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1052);
						match(COMMENTWITHNEWLINE);
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1058);
						match(COMMENTS);
						}
						} 
					}
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(1067);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1064);
						match(SPACE);
						}
						} 
					}
					setState(1069);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0433\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\2\6\2D\n\2\r\2\16\2E\7\2H\n\2\f\2\16\2K\13\2\6\2M\n\2\r\2\16\2"+
		"N\3\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\4\3\4\7\4m\n\4\f\4\16\4p\13"+
		"\4\3\4\7\4s\n\4\f\4\16\4v\13\4\3\4\7\4y\n\4\f\4\16\4|\13\4\5\4~\n\4\3"+
		"\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13\4\3\4\7\4\u0088\n\4\f\4\16\4\u008b"+
		"\13\4\3\4\7\4\u008e\n\4\f\4\16\4\u0091\13\4\5\4\u0093\n\4\3\5\3\5\7\5"+
		"\u0097\n\5\f\5\16\5\u009a\13\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3"+
		"\5\7\5\u00a3\n\5\f\5\16\5\u00a6\13\5\5\5\u00a8\n\5\3\5\3\5\7\5\u00ac\n"+
		"\5\f\5\16\5\u00af\13\5\3\5\7\5\u00b2\n\5\f\5\16\5\u00b5\13\5\3\5\7\5\u00b8"+
		"\n\5\f\5\16\5\u00bb\13\5\5\5\u00bd\n\5\3\6\3\6\7\6\u00c1\n\6\f\6\16\6"+
		"\u00c4\13\6\3\6\7\6\u00c7\n\6\f\6\16\6\u00ca\13\6\3\6\7\6\u00cd\n\6\f"+
		"\6\16\6\u00d0\13\6\5\6\u00d2\n\6\3\6\3\6\7\6\u00d6\n\6\f\6\16\6\u00d9"+
		"\13\6\3\6\7\6\u00dc\n\6\f\6\16\6\u00df\13\6\3\6\7\6\u00e2\n\6\f\6\16\6"+
		"\u00e5\13\6\5\6\u00e7\n\6\3\7\3\7\7\7\u00eb\n\7\f\7\16\7\u00ee\13\7\3"+
		"\7\7\7\u00f1\n\7\f\7\16\7\u00f4\13\7\3\7\7\7\u00f7\n\7\f\7\16\7\u00fa"+
		"\13\7\5\7\u00fc\n\7\3\7\3\7\7\7\u0100\n\7\f\7\16\7\u0103\13\7\3\7\7\7"+
		"\u0106\n\7\f\7\16\7\u0109\13\7\3\7\7\7\u010c\n\7\f\7\16\7\u010f\13\7\5"+
		"\7\u0111\n\7\3\b\3\b\7\b\u0115\n\b\f\b\16\b\u0118\13\b\3\b\7\b\u011b\n"+
		"\b\f\b\16\b\u011e\13\b\3\b\7\b\u0121\n\b\f\b\16\b\u0124\13\b\5\b\u0126"+
		"\n\b\3\b\3\b\7\b\u012a\n\b\f\b\16\b\u012d\13\b\3\b\7\b\u0130\n\b\f\b\16"+
		"\b\u0133\13\b\3\b\7\b\u0136\n\b\f\b\16\b\u0139\13\b\5\b\u013b\n\b\3\t"+
		"\3\t\7\t\u013f\n\t\f\t\16\t\u0142\13\t\3\t\7\t\u0145\n\t\f\t\16\t\u0148"+
		"\13\t\3\t\7\t\u014b\n\t\f\t\16\t\u014e\13\t\5\t\u0150\n\t\3\t\3\t\7\t"+
		"\u0154\n\t\f\t\16\t\u0157\13\t\3\t\7\t\u015a\n\t\f\t\16\t\u015d\13\t\3"+
		"\t\7\t\u0160\n\t\f\t\16\t\u0163\13\t\5\t\u0165\n\t\3\n\3\n\7\n\u0169\n"+
		"\n\f\n\16\n\u016c\13\n\3\n\7\n\u016f\n\n\f\n\16\n\u0172\13\n\3\n\7\n\u0175"+
		"\n\n\f\n\16\n\u0178\13\n\5\n\u017a\n\n\3\n\3\n\7\n\u017e\n\n\f\n\16\n"+
		"\u0181\13\n\3\n\7\n\u0184\n\n\f\n\16\n\u0187\13\n\3\n\7\n\u018a\n\n\f"+
		"\n\16\n\u018d\13\n\5\n\u018f\n\n\3\n\3\n\7\n\u0193\n\n\f\n\16\n\u0196"+
		"\13\n\3\n\7\n\u0199\n\n\f\n\16\n\u019c\13\n\3\n\7\n\u019f\n\n\f\n\16\n"+
		"\u01a2\13\n\5\n\u01a4\n\n\3\n\3\n\7\n\u01a8\n\n\f\n\16\n\u01ab\13\n\3"+
		"\n\7\n\u01ae\n\n\f\n\16\n\u01b1\13\n\3\n\7\n\u01b4\n\n\f\n\16\n\u01b7"+
		"\13\n\5\n\u01b9\n\n\3\n\3\n\7\n\u01bd\n\n\f\n\16\n\u01c0\13\n\3\n\7\n"+
		"\u01c3\n\n\f\n\16\n\u01c6\13\n\3\n\7\n\u01c9\n\n\f\n\16\n\u01cc\13\n\5"+
		"\n\u01ce\n\n\3\n\3\n\7\n\u01d2\n\n\f\n\16\n\u01d5\13\n\3\n\7\n\u01d8\n"+
		"\n\f\n\16\n\u01db\13\n\3\n\7\n\u01de\n\n\f\n\16\n\u01e1\13\n\5\n\u01e3"+
		"\n\n\3\13\3\13\7\13\u01e7\n\13\f\13\16\13\u01ea\13\13\3\13\7\13\u01ed"+
		"\n\13\f\13\16\13\u01f0\13\13\3\13\7\13\u01f3\n\13\f\13\16\13\u01f6\13"+
		"\13\5\13\u01f8\n\13\3\13\3\13\7\13\u01fc\n\13\f\13\16\13\u01ff\13\13\3"+
		"\13\7\13\u0202\n\13\f\13\16\13\u0205\13\13\3\13\7\13\u0208\n\13\f\13\16"+
		"\13\u020b\13\13\5\13\u020d\n\13\3\13\3\13\7\13\u0211\n\13\f\13\16\13\u0214"+
		"\13\13\3\13\7\13\u0217\n\13\f\13\16\13\u021a\13\13\3\13\7\13\u021d\n\13"+
		"\f\13\16\13\u0220\13\13\5\13\u0222\n\13\3\13\3\13\7\13\u0226\n\13\f\13"+
		"\16\13\u0229\13\13\3\13\7\13\u022c\n\13\f\13\16\13\u022f\13\13\3\13\7"+
		"\13\u0232\n\13\f\13\16\13\u0235\13\13\5\13\u0237\n\13\3\13\3\13\7\13\u023b"+
		"\n\13\f\13\16\13\u023e\13\13\3\13\7\13\u0241\n\13\f\13\16\13\u0244\13"+
		"\13\3\13\7\13\u0247\n\13\f\13\16\13\u024a\13\13\5\13\u024c\n\13\3\f\3"+
		"\f\7\f\u0250\n\f\f\f\16\f\u0253\13\f\3\f\7\f\u0256\n\f\f\f\16\f\u0259"+
		"\13\f\3\f\7\f\u025c\n\f\f\f\16\f\u025f\13\f\5\f\u0261\n\f\3\f\3\f\7\f"+
		"\u0265\n\f\f\f\16\f\u0268\13\f\3\f\7\f\u026b\n\f\f\f\16\f\u026e\13\f\3"+
		"\f\7\f\u0271\n\f\f\f\16\f\u0274\13\f\5\f\u0276\n\f\3\f\3\f\7\f\u027a\n"+
		"\f\f\f\16\f\u027d\13\f\3\f\7\f\u0280\n\f\f\f\16\f\u0283\13\f\3\f\7\f\u0286"+
		"\n\f\f\f\16\f\u0289\13\f\5\f\u028b\n\f\3\f\3\f\7\f\u028f\n\f\f\f\16\f"+
		"\u0292\13\f\3\f\7\f\u0295\n\f\f\f\16\f\u0298\13\f\3\f\7\f\u029b\n\f\f"+
		"\f\16\f\u029e\13\f\5\f\u02a0\n\f\3\r\3\r\7\r\u02a4\n\r\f\r\16\r\u02a7"+
		"\13\r\3\r\7\r\u02aa\n\r\f\r\16\r\u02ad\13\r\3\r\7\r\u02b0\n\r\f\r\16\r"+
		"\u02b3\13\r\5\r\u02b5\n\r\3\r\3\r\7\r\u02b9\n\r\f\r\16\r\u02bc\13\r\3"+
		"\r\7\r\u02bf\n\r\f\r\16\r\u02c2\13\r\3\r\7\r\u02c5\n\r\f\r\16\r\u02c8"+
		"\13\r\5\r\u02ca\n\r\3\r\3\r\7\r\u02ce\n\r\f\r\16\r\u02d1\13\r\3\r\7\r"+
		"\u02d4\n\r\f\r\16\r\u02d7\13\r\3\r\7\r\u02da\n\r\f\r\16\r\u02dd\13\r\5"+
		"\r\u02df\n\r\3\r\3\r\7\r\u02e3\n\r\f\r\16\r\u02e6\13\r\3\r\7\r\u02e9\n"+
		"\r\f\r\16\r\u02ec\13\r\3\r\7\r\u02ef\n\r\f\r\16\r\u02f2\13\r\5\r\u02f4"+
		"\n\r\3\16\3\16\7\16\u02f8\n\16\f\16\16\16\u02fb\13\16\3\16\7\16\u02fe"+
		"\n\16\f\16\16\16\u0301\13\16\3\16\7\16\u0304\n\16\f\16\16\16\u0307\13"+
		"\16\5\16\u0309\n\16\3\16\3\16\7\16\u030d\n\16\f\16\16\16\u0310\13\16\3"+
		"\16\7\16\u0313\n\16\f\16\16\16\u0316\13\16\3\16\7\16\u0319\n\16\f\16\16"+
		"\16\u031c\13\16\5\16\u031e\n\16\3\16\3\16\7\16\u0322\n\16\f\16\16\16\u0325"+
		"\13\16\3\16\7\16\u0328\n\16\f\16\16\16\u032b\13\16\3\16\7\16\u032e\n\16"+
		"\f\16\16\16\u0331\13\16\5\16\u0333\n\16\3\16\3\16\3\17\3\17\7\17\u0339"+
		"\n\17\f\17\16\17\u033c\13\17\3\17\7\17\u033f\n\17\f\17\16\17\u0342\13"+
		"\17\3\17\7\17\u0345\n\17\f\17\16\17\u0348\13\17\5\17\u034a\n\17\3\17\3"+
		"\17\7\17\u034e\n\17\f\17\16\17\u0351\13\17\3\17\7\17\u0354\n\17\f\17\16"+
		"\17\u0357\13\17\3\17\7\17\u035a\n\17\f\17\16\17\u035d\13\17\5\17\u035f"+
		"\n\17\3\17\3\17\7\17\u0363\n\17\f\17\16\17\u0366\13\17\3\17\7\17\u0369"+
		"\n\17\f\17\16\17\u036c\13\17\3\17\7\17\u036f\n\17\f\17\16\17\u0372\13"+
		"\17\5\17\u0374\n\17\3\20\3\20\7\20\u0378\n\20\f\20\16\20\u037b\13\20\3"+
		"\20\7\20\u037e\n\20\f\20\16\20\u0381\13\20\3\20\7\20\u0384\n\20\f\20\16"+
		"\20\u0387\13\20\5\20\u0389\n\20\3\20\3\20\7\20\u038d\n\20\f\20\16\20\u0390"+
		"\13\20\3\20\7\20\u0393\n\20\f\20\16\20\u0396\13\20\3\20\7\20\u0399\n\20"+
		"\f\20\16\20\u039c\13\20\5\20\u039e\n\20\3\20\3\20\7\20\u03a2\n\20\f\20"+
		"\16\20\u03a5\13\20\3\20\7\20\u03a8\n\20\f\20\16\20\u03ab\13\20\3\20\7"+
		"\20\u03ae\n\20\f\20\16\20\u03b1\13\20\5\20\u03b3\n\20\3\21\3\21\7\21\u03b7"+
		"\n\21\f\21\16\21\u03ba\13\21\3\21\7\21\u03bd\n\21\f\21\16\21\u03c0\13"+
		"\21\3\21\7\21\u03c3\n\21\f\21\16\21\u03c6\13\21\5\21\u03c8\n\21\3\21\3"+
		"\21\7\21\u03cc\n\21\f\21\16\21\u03cf\13\21\3\21\7\21\u03d2\n\21\f\21\16"+
		"\21\u03d5\13\21\3\21\7\21\u03d8\n\21\f\21\16\21\u03db\13\21\5\21\u03dd"+
		"\n\21\3\21\3\21\7\21\u03e1\n\21\f\21\16\21\u03e4\13\21\3\21\7\21\u03e7"+
		"\n\21\f\21\16\21\u03ea\13\21\3\21\7\21\u03ed\n\21\f\21\16\21\u03f0\13"+
		"\21\5\21\u03f2\n\21\3\22\3\22\7\22\u03f6\n\22\f\22\16\22\u03f9\13\22\3"+
		"\22\7\22\u03fc\n\22\f\22\16\22\u03ff\13\22\3\22\7\22\u0402\n\22\f\22\16"+
		"\22\u0405\13\22\5\22\u0407\n\22\3\22\3\22\7\22\u040b\n\22\f\22\16\22\u040e"+
		"\13\22\3\22\7\22\u0411\n\22\f\22\16\22\u0414\13\22\3\22\7\22\u0417\n\22"+
		"\f\22\16\22\u041a\13\22\5\22\u041c\n\22\3\22\3\22\7\22\u0420\n\22\f\22"+
		"\16\22\u0423\13\22\3\22\7\22\u0426\n\22\f\22\16\22\u0429\13\22\3\22\7"+
		"\22\u042c\n\22\f\22\16\22\u042f\13\22\5\22\u0431\n\22\3\22\2\2\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\n\3\2\"%\3\2#$\4\2\"\"%%\4\2"+
		"\"#%%\3\2\b\t\3\2\35\36\3\2\35\37\4\2\b\t\20\21\2\u051d\2$\3\2\2\2\4h"+
		"\3\2\2\2\6j\3\2\2\2\b\u0094\3\2\2\2\n\u00be\3\2\2\2\f\u00e8\3\2\2\2\16"+
		"\u0112\3\2\2\2\20\u013c\3\2\2\2\22\u0166\3\2\2\2\24\u01e4\3\2\2\2\26\u024d"+
		"\3\2\2\2\30\u02a1\3\2\2\2\32\u02f5\3\2\2\2\34\u0336\3\2\2\2\36\u0375\3"+
		"\2\2\2 \u03b4\3\2\2\2\"\u03f3\3\2\2\2$(\7\3\2\2%\'\t\2\2\2&%\3\2\2\2\'"+
		"*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\4\2\2,-\7!\2\2-"+
		"\61\7\4\2\2.\60\t\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64L\7\5\2\2\65\67\t\2\2\2\66\65\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;I\5\4\3\2<>\t"+
		"\3\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\t"+
		"\4\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G?\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2L8\3\2\2\2MN\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7\6\2\2QS\t\5\2\2RQ\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\2\2\3X\3\3\2\2\2Yi\5\b\5\2Zi"+
		"\5\n\6\2[i\5\6\4\2\\i\5 \21\2]i\5\24\13\2^i\5\f\7\2_i\5\16\b\2`i\5\34"+
		"\17\2ai\5\36\20\2bi\5\20\t\2ci\5\26\f\2di\5\22\n\2ei\5\32\16\2fi\5\30"+
		"\r\2gi\5\"\22\2hY\3\2\2\2hZ\3\2\2\2h[\3\2\2\2h\\\3\2\2\2h]\3\2\2\2h^\3"+
		"\2\2\2h_\3\2\2\2h`\3\2\2\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3"+
		"\2\2\2hf\3\2\2\2hg\3\2\2\2i\5\3\2\2\2j}\7\7\2\2km\7\"\2\2lk\3\2\2\2mp"+
		"\3\2\2\2nl\3\2\2\2no\3\2\2\2o~\3\2\2\2pn\3\2\2\2qs\7#\2\2rq\3\2\2\2sv"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2u~\3\2\2\2vt\3\2\2\2wy\7$\2\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}n\3\2\2\2}t\3\2\2\2}"+
		"z\3\2\2\2~\177\3\2\2\2\177\u0092\t\6\2\2\u0080\u0082\7\"\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0093\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7#\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0093\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\7$\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0089\3\2"+
		"\2\2\u0092\u008f\3\2\2\2\u0093\7\3\2\2\2\u0094\u00a7\7\n\2\2\u0095\u0097"+
		"\7\"\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a8\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7#"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a8\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7$"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u0098\3\2"+
		"\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00bc\t\7\2\2\u00aa\u00ac\7\"\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00bd\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b2\7#\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bd\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b8\7$\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bd\t\3\2\2\2\u00be\u00d1\7\13\2\2\u00bf\u00c1\7\"\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00d2\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7#\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00d2\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7$\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1\u00c8\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e6\t\7\2\2\u00d4"+
		"\u00d6\7\"\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e7\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\7#\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e7\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e2\7$\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00d7\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\13\3\2\2"+
		"\2\u00e8\u00fb\7\f\2\2\u00e9\u00eb\7\"\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00fc\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f1\7#\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fc\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f7\7$\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00ec\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0110\7\35\2\2\u00fe\u0100\7\"\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0111\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\7#\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0111\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7$\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0101\3\2\2\2\u0110"+
		"\u0107\3\2\2\2\u0110\u010d\3\2\2\2\u0111\r\3\2\2\2\u0112\u0125\7\r\2\2"+
		"\u0113\u0115\7\"\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0126\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\7#\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0121\7$\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0116\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0122\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u013a\7\35\2\2\u0128\u012a\7\"\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u013b\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u0130\7#\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013b\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7$\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u012b\3\2\2\2\u013a\u0131\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013b\17\3\2\2\2\u013c\u014f\7\16\2\2\u013d\u013f\7\"\2"+
		"\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0150\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\7#\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0150\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7$\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0140\3\2\2\2\u014f"+
		"\u0146\3\2\2\2\u014f\u014c\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0164\t\b"+
		"\2\2\u0152\u0154\7\"\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0165\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u015a\7#\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0165\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u0160\7$\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0155\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u0161\3\2\2\2\u0165"+
		"\21\3\2\2\2\u0166\u0179\7\17\2\2\u0167\u0169\7\"\2\2\u0168\u0167\3\2\2"+
		"\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u017a"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\7#\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u017a\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0175\7$\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u0170\3\2\2\2\u0179"+
		"\u0176\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u018e\t\t\2\2\u017c\u017e\7\""+
		"\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u018f\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\7#"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u018f\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\7$"+
		"\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u017f\3\2"+
		"\2\2\u018e\u0185\3\2\2\2\u018e\u018b\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u01a3\7\22\2\2\u0191\u0193\7\"\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3"+
		"\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a4\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0199\7#\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a4\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019f\7$\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u0194\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3\u01a0\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b8\t\7\2\2\u01a6\u01a8\7\"\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01b9\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\7#\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b9\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\7$\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01a9\3\2\2\2\u01b8"+
		"\u01af\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01cd\7\23"+
		"\2\2\u01bb\u01bd\7\"\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01ce\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c1\u01c3\7#\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01ce\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c9\7$\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01be\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01e2\t\b\2\2\u01d0\u01d2\7\"\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01e3\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\7#\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01e3\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\7$\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01d3\3\2\2\2\u01e2\u01d9\3\2"+
		"\2\2\u01e2\u01df\3\2\2\2\u01e3\23\3\2\2\2\u01e4\u01f7\7\17\2\2\u01e5\u01e7"+
		"\7\"\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01f8\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\7#"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f8\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\7$"+
		"\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01e8\3\2"+
		"\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u020c\t\t\2\2\u01fa\u01fc\7\"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u020d\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0202\7#\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u020d\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u0208\7$\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020c\u01fd\3\2\2\2\u020c\u0203\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0221\7\33\2\2\u020f\u0211\7\"\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0222\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7#\2\2\u0216"+
		"\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u0222\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\7$\2\2\u021c"+
		"\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0212\3\2\2\2\u0221"+
		"\u0218\3\2\2\2\u0221\u021e\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0236\7\23"+
		"\2\2\u0224\u0226\7\"\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0237\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022c\7#\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0237\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u0230\u0232\7$\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236\u0227\3\2\2\2\u0236\u022d\3\2\2\2\u0236\u0233\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u024b\t\b\2\2\u0239\u023b\7\"\2\2\u023a\u0239\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u024c\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0241\7#\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u024c\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\7$\2\2\u0246\u0245\3\2"+
		"\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u023c\3\2\2\2\u024b\u0242\3\2"+
		"\2\2\u024b\u0248\3\2\2\2\u024c\25\3\2\2\2\u024d\u0260\7\24\2\2\u024e\u0250"+
		"\7\"\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0261\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7#"+
		"\2\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0261\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025c\7$"+
		"\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0251\3\2"+
		"\2\2\u0260\u0257\3\2\2\2\u0260\u025d\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0275\t\b\2\2\u0263\u0265\7\"\2\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0276\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026b\7#\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0276\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0271\7$\2\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0275\u0266\3\2\2\2\u0275\u026c\3\2\2\2\u0275\u0272\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277\u028a\7\23\2\2\u0278\u027a\7\"\2\2\u0279"+
		"\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u028b\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0280\7#\2\2\u027f"+
		"\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u028b\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\7$\2\2\u0285"+
		"\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u027b\3\2\2\2\u028a"+
		"\u0281\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u029f\t\b"+
		"\2\2\u028d\u028f\7\"\2\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u02a0\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0295\7#\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u02a0\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029b\7$\2\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029f\u0290\3\2\2\2\u029f\u0296\3\2\2\2\u029f\u029c\3\2\2\2\u02a0"+
		"\27\3\2\2\2\u02a1\u02b4\7\25\2\2\u02a2\u02a4\7\"\2\2\u02a3\u02a2\3\2\2"+
		"\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02b5"+
		"\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\7#\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b5\3\2"+
		"\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\7$\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b5\3\2"+
		"\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02a5\3\2\2\2\u02b4\u02ab\3\2\2\2\u02b4"+
		"\u02b1\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02c9\7\35\2\2\u02b7\u02b9\7"+
		"\"\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02ca\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02bf\7#"+
		"\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02ca\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7$"+
		"\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ba\3\2"+
		"\2\2\u02c9\u02c0\3\2\2\2\u02c9\u02c6\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02de\7\23\2\2\u02cc\u02ce\7\"\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3"+
		"\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02df\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d4\7#\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3\2"+
		"\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02df\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02da\7$\2\2\u02d9\u02d8\3\2\2\2\u02da\u02dd\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02de\u02cf\3\2\2\2\u02de\u02d5\3\2\2\2\u02de\u02db\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02f3\t\b\2\2\u02e1\u02e3\7\"\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2"+
		"\2\2\u02e5\u02f4\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e9\7#\2\2\u02e8"+
		"\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02f4\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ef\7$\2\2\u02ee"+
		"\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02e4\3\2\2\2\u02f3"+
		"\u02ea\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f4\31\3\2\2\2\u02f5\u0308\7\26\2"+
		"\2\u02f6\u02f8\7\"\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u0309\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc"+
		"\u02fe\7#\2\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u0309\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u0304\7$\2\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u02f9\3\2\2\2\u0308\u02ff\3\2\2\2\u0308\u0305\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u031d\7\34\2\2\u030b\u030d\7\"\2\2\u030c\u030b\3\2\2\2\u030d"+
		"\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u031e\3\2"+
		"\2\2\u0310\u030e\3\2\2\2\u0311\u0313\7#\2\2\u0312\u0311\3\2\2\2\u0313"+
		"\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031e\3\2"+
		"\2\2\u0316\u0314\3\2\2\2\u0317\u0319\7$\2\2\u0318\u0317\3\2\2\2\u0319"+
		"\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031e\3\2"+
		"\2\2\u031c\u031a\3\2\2\2\u031d\u030e\3\2\2\2\u031d\u0314\3\2\2\2\u031d"+
		"\u031a\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0332\7\23\2\2\u0320\u0322\7"+
		"\"\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0333\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0328\7#"+
		"\2\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u0333\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\7$"+
		"\2\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0323\3\2"+
		"\2\2\u0332\u0329\3\2\2\2\u0332\u032f\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0335\t\b\2\2\u0335\33\3\2\2\2\u0336\u0349\7\27\2\2\u0337\u0339\7\"\2"+
		"\2\u0338\u0337\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u034a\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033f\7#\2\2\u033e"+
		"\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u034a\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0345\7$\2\2\u0344"+
		"\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u033a\3\2\2\2\u0349"+
		"\u0340\3\2\2\2\u0349\u0346\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u035e\7\23"+
		"\2\2\u034c\u034e\7\"\2\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u035f\3\2\2\2\u0351\u034f\3\2"+
		"\2\2\u0352\u0354\7#\2\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035f\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358\u035a\7$\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035e\u034f\3\2\2\2\u035e\u0355\3\2\2\2\u035e\u035b\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0373\t\b\2\2\u0361\u0363\7\"\2\2\u0362\u0361\3\2"+
		"\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0374\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0369\7#\2\2\u0368\u0367\3\2"+
		"\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u0374\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036f\7$\2\2\u036e\u036d\3\2"+
		"\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0364\3\2\2\2\u0373\u036a\3\2"+
		"\2\2\u0373\u0370\3\2\2\2\u0374\35\3\2\2\2\u0375\u0388\7\30\2\2\u0376\u0378"+
		"\7\"\2\2\u0377\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u0389\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037e\7#"+
		"\2\2\u037d\u037c\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0389\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0384\7$"+
		"\2\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0379\3\2"+
		"\2\2\u0388\u037f\3\2\2\2\u0388\u0385\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u039d\7\23\2\2\u038b\u038d\7\"\2\2\u038c\u038b\3\2\2\2\u038d\u0390\3"+
		"\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u039e\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0393\7#\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u039e\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0399\7$\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2"+
		"\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039d\u038e\3\2\2\2\u039d\u0394\3\2\2\2\u039d\u039a\3\2"+
		"\2\2\u039e\u039f\3\2\2\2\u039f\u03b2\t\b\2\2\u03a0\u03a2\7\"\2\2\u03a1"+
		"\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03b3\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a8\7#\2\2\u03a7"+
		"\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03b3\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\7$\2\2\u03ad"+
		"\u03ac\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2"+
		"\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03a3\3\2\2\2\u03b2"+
		"\u03a9\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3\37\3\2\2\2\u03b4\u03c7\7\31\2"+
		"\2\u03b5\u03b7\7\"\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6"+
		"\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03c8\3\2\2\2\u03ba\u03b8\3\2\2\2\u03bb"+
		"\u03bd\7#\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c8\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"+
		"\u03c3\7$\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7"+
		"\u03b8\3\2\2\2\u03c7\u03be\3\2\2\2\u03c7\u03c4\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u03dc\7\23\2\2\u03ca\u03cc\7\"\2\2\u03cb\u03ca\3\2\2\2\u03cc"+
		"\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03dd\3\2"+
		"\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d2\7#\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03dd\3\2"+
		"\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d8\7$\2\2\u03d7\u03d6\3\2\2\2\u03d8"+
		"\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dd\3\2"+
		"\2\2\u03db\u03d9\3\2\2\2\u03dc\u03cd\3\2\2\2\u03dc\u03d3\3\2\2\2\u03dc"+
		"\u03d9\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03f1\t\b\2\2\u03df\u03e1\7\""+
		"\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03f2\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e7\7#"+
		"\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03f2\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ed\7$"+
		"\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03e2\3\2"+
		"\2\2\u03f1\u03e8\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f2!\3\2\2\2\u03f3\u0406"+
		"\7\32\2\2\u03f4\u03f6\7\"\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2"+
		"\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u0407\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03fa\u03fc\7#\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd"+
		"\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0407\3\2\2\2\u03ff\u03fd\3\2"+
		"\2\2\u0400\u0402\7$\2\2\u0401\u0400\3\2\2\2\u0402\u0405\3\2\2\2\u0403"+
		"\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2"+
		"\2\2\u0406\u03f7\3\2\2\2\u0406\u03fd\3\2\2\2\u0406\u0403\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408\u041b\7\23\2\2\u0409\u040b\7\"\2\2\u040a\u0409\3"+
		"\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u041c\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\7#\2\2\u0410\u040f\3\2"+
		"\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u041c\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0417\7$\2\2\u0416\u0415\3\2"+
		"\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u040c\3\2\2\2\u041b\u0412\3\2"+
		"\2\2\u041b\u0418\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u0430\t\b\2\2\u041e"+
		"\u0420\7\"\2\2\u041f\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2"+
		"\2\2\u0421\u0422\3\2\2\2\u0422\u0431\3\2\2\2\u0423\u0421\3\2\2\2\u0424"+
		"\u0426\7#\2\2\u0425\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2"+
		"\2\2\u0427\u0428\3\2\2\2\u0428\u0431\3\2\2\2\u0429\u0427\3\2\2\2\u042a"+
		"\u042c\7$\2\2\u042b\u042a\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2"+
		"\2\2\u042d\u042e\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u0430"+
		"\u0421\3\2\2\2\u0430\u0427\3\2\2\2\u0430\u042d\3\2\2\2\u0431#\3\2\2\2"+
		"\u00c3(\618?EINThntz}\u0083\u0089\u008f\u0092\u0098\u009e\u00a4\u00a7"+
		"\u00ad\u00b3\u00b9\u00bc\u00c2\u00c8\u00ce\u00d1\u00d7\u00dd\u00e3\u00e6"+
		"\u00ec\u00f2\u00f8\u00fb\u0101\u0107\u010d\u0110\u0116\u011c\u0122\u0125"+
		"\u012b\u0131\u0137\u013a\u0140\u0146\u014c\u014f\u0155\u015b\u0161\u0164"+
		"\u016a\u0170\u0176\u0179\u017f\u0185\u018b\u018e\u0194\u019a\u01a0\u01a3"+
		"\u01a9\u01af\u01b5\u01b8\u01be\u01c4\u01ca\u01cd\u01d3\u01d9\u01df\u01e2"+
		"\u01e8\u01ee\u01f4\u01f7\u01fd\u0203\u0209\u020c\u0212\u0218\u021e\u0221"+
		"\u0227\u022d\u0233\u0236\u023c\u0242\u0248\u024b\u0251\u0257\u025d\u0260"+
		"\u0266\u026c\u0272\u0275\u027b\u0281\u0287\u028a\u0290\u0296\u029c\u029f"+
		"\u02a5\u02ab\u02b1\u02b4\u02ba\u02c0\u02c6\u02c9\u02cf\u02d5\u02db\u02de"+
		"\u02e4\u02ea\u02f0\u02f3\u02f9\u02ff\u0305\u0308\u030e\u0314\u031a\u031d"+
		"\u0323\u0329\u032f\u0332\u033a\u0340\u0346\u0349\u034f\u0355\u035b\u035e"+
		"\u0364\u036a\u0370\u0373\u0379\u037f\u0385\u0388\u038e\u0394\u039a\u039d"+
		"\u03a3\u03a9\u03af\u03b2\u03b8\u03be\u03c4\u03c7\u03cd\u03d3\u03d9\u03dc"+
		"\u03e2\u03e8\u03ee\u03f1\u03f7\u03fd\u0403\u0406\u040c\u0412\u0418\u041b"+
		"\u0421\u0427\u042d\u0430";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}