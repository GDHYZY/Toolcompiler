// Generated from Interpreter.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Whitespace=19, Newline=20, ID=21, NUM=22, Eq=23, Assign=24, 
		Mul=25, Div=26, Add=27, Sub=28, Inc=29, Dec=30, Ne=31, Le=32, Shl=33, 
		Lt=34, Ge=35, Shr=36, Gt=37, Lor=38, Or=39, Lan=40, And=41, Xor=42, Mod=43, 
		Brak=44, Cond=45, Til=46, Not=47, BCMT=48, LCMT=49, CODING=50;
	public static final int
		RULE_expr = 0, RULE_apos = 1, RULE_dquo = 2, RULE_comment = 3, RULE_type = 4, 
		RULE_program = 5, RULE_global_declaration = 6, RULE_id = 7, RULE_enum_decl = 8, 
		RULE_variable_decl = 9, RULE_function_decl = 10, RULE_parameter_decl = 11, 
		RULE_body_decl = 12, RULE_statement = 13, RULE_if_statement = 14, RULE_while_statement = 15;
	public static final String[] ruleNames = {
		"expr", "apos", "dquo", "comment", "type", "program", "global_declaration", 
		"id", "enum_decl", "variable_decl", "function_decl", "parameter_decl", 
		"body_decl", "statement", "if_statement", "while_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "']'", "'('", "','", "')'", "'.'", "'->'", "'''", "'\"'", "'int'", 
		"'char'", "'enum'", "'{'", "'}'", "';'", "'return'", "'if'", "'else'", 
		"'while'", null, null, null, null, "'=='", "'='", "'*'", "'/'", "'+'", 
		"'-'", "'++'", "'--'", "'!='", "'<='", "'<<'", "'<'", "'>='", "'>>'", 
		"'>'", "'||'", "'|'", "'&&'", "'&'", "'^'", "'%'", "'['", "'?'", "'~'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Whitespace", "Newline", "ID", 
		"NUM", "Eq", "Assign", "Mul", "Div", "Add", "Sub", "Inc", "Dec", "Ne", 
		"Le", "Shl", "Lt", "Ge", "Shr", "Gt", "Lor", "Or", "Lan", "And", "Xor", 
		"Mod", "Brak", "Cond", "Til", "Not", "BCMT", "LCMT", "CODING"
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
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(InterpreterParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public MemberAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUM() { return getToken(InterpreterParser.NUM, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubscriptContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public List<AposContext> apos() {
			return getRuleContexts(AposContext.class);
		}
		public AposContext apos(int i) {
			return getRuleContext(AposContext.class,i);
		}
		public TerminalNode CODING() { return getToken(InterpreterParser.CODING, 0); }
		public List<DquoContext> dquo() {
			return getRuleContexts(DquoContext.class);
		}
		public DquoContext dquo(int i) {
			return getRuleContext(DquoContext.class,i);
		}
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixIncDecContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostfixIncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitPostfixIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(InterpreterParser.NUM, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifyContext extends ExprContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdentifyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIdentify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(35);
				expr(18);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Add) | (1L << Sub) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(37);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(38);
					expr(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new IdentifyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				id();
				}
				break;
			case 5:
				{
				_localctx = new SubExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__1);
				setState(43);
				expr(0);
				setState(44);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				apos();
				setState(47);
				match(CODING);
				setState(48);
				apos();
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				dquo();
				setState(51);
				match(CODING);
				setState(52);
				dquo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(57);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(58);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(60);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Shl || _la==Shr) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(61);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(63);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Lt || _la==Gt) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(64);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(66);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Le || _la==Ge) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(67);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(69);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Eq || _la==Ne) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(70);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(72);
						((BinaryExprContext)_localctx).op = match(And);
						setState(73);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(75);
						((BinaryExprContext)_localctx).op = match(Xor);
						setState(76);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(78);
						((BinaryExprContext)_localctx).op = match(Or);
						setState(79);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(81);
						((BinaryExprContext)_localctx).op = match(Lan);
						setState(82);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
						((BinaryExprContext)_localctx).op = match(Lor);
						setState(85);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(87);
						((BinaryExprContext)_localctx).op = match(Assign);
						setState(88);
						expr(6);
						}
						break;
					case 12:
						{
						_localctx = new SubscriptContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(90);
						match(Brak);
						setState(91);
						expr(0);
						setState(92);
						match(T__0);
						}
						break;
					case 13:
						{
						_localctx = new FunctionCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(95);
						match(T__1);
						setState(97);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) {
							{
							setState(96);
							expr(0);
							}
						}

						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(99);
							match(T__2);
							setState(100);
							expr(0);
							}
							}
							setState(105);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(106);
						match(T__3);
						}
						break;
					case 14:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(108);
						match(T__4);
						setState(109);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(111);
						match(T__5);
						setState(112);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(114);
						((PostfixIncDecContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Inc || _la==Dec) ) {
							((PostfixIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(116);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(117);
							match(NUM);
							}
							break;
						case 2:
							{
							setState(118);
							expr(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AposContext extends ParserRuleContext {
		public AposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitApos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AposContext apos() throws RecognitionException {
		AposContext _localctx = new AposContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_apos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__6);
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

	public static class DquoContext extends ParserRuleContext {
		public DquoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dquo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitDquo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DquoContext dquo() throws RecognitionException {
		DquoContext _localctx = new DquoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dquo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__7);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode BCMT() { return getToken(InterpreterParser.BCMT, 0); }
		public TerminalNode LCMT() { return getToken(InterpreterParser.LCMT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==BCMT || _la==LCMT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharContext extends TypeContext {
		public CharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntptrContext extends TypeContext {
		public IntptrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIntptr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharptrContext extends TypeContext {
		public CharptrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitCharptr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeContext {
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			int _alt;
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new IntptrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__8);
				setState(136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(135);
						match(Mul);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new CharptrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__9);
				setState(142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(141);
						match(Mul);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ProgramContext extends ParserRuleContext {
		public List<Global_declarationContext> global_declaration() {
			return getRuleContexts(Global_declarationContext.class);
		}
		public Global_declarationContext global_declaration(int i) {
			return getRuleContext(Global_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				global_declaration();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << BCMT) | (1L << LCMT))) != 0) );
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

	public static class Global_declarationContext extends ParserRuleContext {
		public Enum_declContext enum_decl() {
			return getRuleContext(Enum_declContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Global_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitGlobal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declarationContext global_declaration() throws RecognitionException {
		Global_declarationContext _localctx = new Global_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_global_declaration);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				enum_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				variable_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				function_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				comment();
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

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	 
		public IdContext() { }
		public void copyFrom(IdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PtrIdentifyContext extends IdContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public List<TerminalNode> Mul() { return getTokens(InterpreterParser.Mul); }
		public TerminalNode Mul(int i) {
			return getToken(InterpreterParser.Mul, i);
		}
		public PtrIdentifyContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitPtrIdentify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleIdentifyContext extends IdContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public SingleIdentifyContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSingleIdentify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new SingleIdentifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(ID);
				}
				break;
			case 2:
				_localctx = new PtrIdentifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul) {
					{
					{
					setState(160);
					match(Mul);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(ID);
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

	public static class Enum_declContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> NUM() { return getTokens(InterpreterParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(InterpreterParser.NUM, i);
		}
		public Enum_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitEnum_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declContext enum_decl() throws RecognitionException {
		Enum_declContext _localctx = new Enum_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enum_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__10);
			setState(171);
			_la = _input.LA(1);
			if (_la==ID || _la==Mul) {
				{
				setState(170);
				id();
				}
			}

			setState(173);
			match(T__11);
			setState(174);
			id();
			setState(177);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(175);
				match(Assign);
				setState(176);
				match(NUM);
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(179);
				match(T__2);
				setState(180);
				id();
				setState(183);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(181);
					match(Assign);
					setState(182);
					match(NUM);
					}
				}

				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__12);
			setState(191);
			match(T__13);
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

	public static class Variable_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVariable_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			type();
			setState(194);
			id();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(195);
				match(T__2);
				setState(196);
				id();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__13);
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

	public static class Function_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Parameter_declContext parameter_decl() {
			return getRuleContext(Parameter_declContext.class,0);
		}
		public Body_declContext body_decl() {
			return getRuleContext(Body_declContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			type();
			setState(205);
			id();
			setState(206);
			match(T__1);
			setState(207);
			parameter_decl();
			setState(208);
			match(T__3);
			setState(209);
			match(T__11);
			setState(210);
			body_decl();
			setState(211);
			match(T__12);
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

	public static class Parameter_declContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameter_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_decl);
		int _la;
		try {
			setState(230);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				type();
				setState(214);
				id();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(215);
					match(T__2);
					setState(216);
					type();
					setState(217);
					id();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
			case BCMT:
			case LCMT:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BCMT || _la==LCMT) {
					{
					{
					setState(224);
					comment();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Body_declContext extends ParserRuleContext {
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Body_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBody_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_declContext body_decl() throws RecognitionException {
		Body_declContext _localctx = new Body_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body_decl);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8 || _la==T__9) {
					{
					{
					setState(232);
					variable_decl();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) {
					{
					{
					setState(238);
					statement();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BCMT || _la==LCMT) {
					{
					{
					setState(244);
					comment();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(275);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				if_statement();
				}
				break;
			case T__17:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				while_statement();
				}
				break;
			case T__11:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(T__11);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) {
					{
					{
					setState(255);
					statement();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__12);
				}
				break;
			case T__14:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(T__14);
				setState(264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) {
					{
					setState(263);
					expr(0);
					}
				}

				setState(266);
				match(T__13);
				}
				break;
			case T__1:
			case T__6:
			case T__7:
			case ID:
			case NUM:
			case Mul:
			case Add:
			case Sub:
			case Inc:
			case Dec:
			case And:
			case Til:
			case Not:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				expr(0);
				setState(268);
				match(T__13);
				}
				break;
			case T__13:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__15);
			setState(278);
			match(T__1);
			setState(279);
			expr(0);
			setState(280);
			match(T__3);
			setState(281);
			statement();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(T__16);
					setState(283);
					statement();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__17);
			setState(290);
			match(T__1);
			setState(291);
			expr(0);
			setState(292);
			match(T__3);
			setState(293);
			statement();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 22);
		case 13:
			return precpred(_ctx, 21);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 19);
		case 16:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\29\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d\n\2\3\2\3\2\7\2h\n"+
		"\2\f\2\16\2k\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2z\n\2\7\2|\n\2\f\2\16\2\177\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\6\6\u008b\n\6\r\6\16\6\u008c\3\6\3\6\6\6\u0091\n\6\r\6\16\6\u0092"+
		"\5\6\u0095\n\6\3\7\6\7\u0098\n\7\r\7\16\7\u0099\3\b\3\b\3\b\3\b\5\b\u00a0"+
		"\n\b\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\5\t\u00aa\n\t\3\n\3"+
		"\n\5\n\u00ae\n\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n\5\n\u00ba"+
		"\n\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1"+
		"\13\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\5\r\u00e9\n\r\3\16\7\16\u00ec"+
		"\n\16\f\16\16\16\u00ef\13\16\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5\13"+
		"\16\3\16\7\16\u00f8\n\16\f\16\16\16\u00fb\13\16\5\16\u00fd\n\16\3\17\3"+
		"\17\3\17\3\17\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\17\3\17\3\17\5"+
		"\17\u010b\n\17\3\17\3\17\3\17\3\17\3\17\6\17\u0112\n\17\r\17\16\17\u0113"+
		"\5\17\u0116\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011f\n\20\f"+
		"\20\16\20\u0122\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\3\2\22\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\13\3\2\37 \6\2\33\33\35\36++\60"+
		"\61\4\2\33\34--\4\2##&&\4\2$$\'\'\4\2\"\"%%\4\2\31\31!!\3\2\35\36\3\2"+
		"\62\63\u0154\28\3\2\2\2\4\u0080\3\2\2\2\6\u0082\3\2\2\2\b\u0084\3\2\2"+
		"\2\n\u0094\3\2\2\2\f\u0097\3\2\2\2\16\u009f\3\2\2\2\20\u00a9\3\2\2\2\22"+
		"\u00ab\3\2\2\2\24\u00c3\3\2\2\2\26\u00ce\3\2\2\2\30\u00e8\3\2\2\2\32\u00fc"+
		"\3\2\2\2\34\u0115\3\2\2\2\36\u0117\3\2\2\2 \u0123\3\2\2\2\"#\b\2\1\2#"+
		"9\7\30\2\2$%\t\2\2\2%9\5\2\2\24&)\t\3\2\2\'*\7\30\2\2(*\5\2\2\2)\'\3\2"+
		"\2\2)(\3\2\2\2*9\3\2\2\2+9\5\20\t\2,-\7\4\2\2-.\5\2\2\2./\7\6\2\2/9\3"+
		"\2\2\2\60\61\5\4\3\2\61\62\7\64\2\2\62\63\5\4\3\2\639\3\2\2\2\64\65\5"+
		"\6\4\2\65\66\7\64\2\2\66\67\5\6\4\2\679\3\2\2\28\"\3\2\2\28$\3\2\2\28"+
		"&\3\2\2\28+\3\2\2\28,\3\2\2\28\60\3\2\2\28\64\3\2\2\29}\3\2\2\2:;\f\22"+
		"\2\2;<\t\4\2\2<|\5\2\2\23=>\f\20\2\2>?\t\5\2\2?|\5\2\2\21@A\f\17\2\2A"+
		"B\t\6\2\2B|\5\2\2\20CD\f\16\2\2DE\t\7\2\2E|\5\2\2\17FG\f\r\2\2GH\t\b\2"+
		"\2H|\5\2\2\16IJ\f\f\2\2JK\7+\2\2K|\5\2\2\rLM\f\13\2\2MN\7,\2\2N|\5\2\2"+
		"\fOP\f\n\2\2PQ\7)\2\2Q|\5\2\2\13RS\f\t\2\2ST\7*\2\2T|\5\2\2\nUV\f\b\2"+
		"\2VW\7(\2\2W|\5\2\2\tXY\f\7\2\2YZ\7\32\2\2Z|\5\2\2\b[\\\f\31\2\2\\]\7"+
		".\2\2]^\5\2\2\2^_\7\3\2\2_|\3\2\2\2`a\f\30\2\2ac\7\4\2\2bd\5\2\2\2cb\3"+
		"\2\2\2cd\3\2\2\2di\3\2\2\2ef\7\5\2\2fh\5\2\2\2ge\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2l|\7\6\2\2mn\f\27\2\2no\7\7\2\2o|"+
		"\7\27\2\2pq\f\26\2\2qr\7\b\2\2r|\7\27\2\2st\f\25\2\2t|\t\2\2\2uv\f\21"+
		"\2\2vy\t\t\2\2wz\7\30\2\2xz\5\2\2\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{:\3"+
		"\2\2\2{=\3\2\2\2{@\3\2\2\2{C\3\2\2\2{F\3\2\2\2{I\3\2\2\2{L\3\2\2\2{O\3"+
		"\2\2\2{R\3\2\2\2{U\3\2\2\2{X\3\2\2\2{[\3\2\2\2{`\3\2\2\2{m\3\2\2\2{p\3"+
		"\2\2\2{s\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\3\3\2\2\2"+
		"\177}\3\2\2\2\u0080\u0081\7\t\2\2\u0081\5\3\2\2\2\u0082\u0083\7\n\2\2"+
		"\u0083\7\3\2\2\2\u0084\u0085\t\n\2\2\u0085\t\3\2\2\2\u0086\u0095\7\13"+
		"\2\2\u0087\u0095\7\f\2\2\u0088\u008a\7\13\2\2\u0089\u008b\7\33\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0095\3\2\2\2\u008e\u0090\7\f\2\2\u008f\u0091\7\33\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0086\3\2\2\2\u0094\u0087\3\2\2\2\u0094"+
		"\u0088\3\2\2\2\u0094\u008e\3\2\2\2\u0095\13\3\2\2\2\u0096\u0098\5\16\b"+
		"\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\r\3\2\2\2\u009b\u00a0\5\22\n\2\u009c\u00a0\5\24\13\2\u009d"+
		"\u00a0\5\26\f\2\u009e\u00a0\5\b\5\2\u009f\u009b\3\2\2\2\u009f\u009c\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\17\3\2\2\2\u00a1"+
		"\u00aa\7\27\2\2\u00a2\u00a4\7\33\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\7\27\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3"+
		"\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ad\7\r\2\2\u00ac\u00ae\5\20\t\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\16"+
		"\2\2\u00b0\u00b3\5\20\t\2\u00b1\u00b2\7\32\2\2\u00b2\u00b4\7\30\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bd\3\2\2\2\u00b5\u00b6\7\5"+
		"\2\2\u00b6\u00b9\5\20\t\2\u00b7\u00b8\7\32\2\2\u00b8\u00ba\7\30\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\7"+
		"\20\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c9\5\20\t\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7\20\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\5\n\6"+
		"\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\30\r\2\u00d2"+
		"\u00d3\7\6\2\2\u00d3\u00d4\7\16\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6"+
		"\7\17\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\5\n\6\2\u00d8\u00df\5\20\t\2\u00d9"+
		"\u00da\7\5\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\5\20\t\2\u00dc\u00de\3"+
		"\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\5\b"+
		"\5\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00d7\3\2"+
		"\2\2\u00e8\u00e5\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00ec\5\24\13\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f3\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5\34\17\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00fd\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\5\b\5\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ed\3\2\2\2\u00fc"+
		"\u00f9\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u0116\5\36\20\2\u00ff\u0116\5 \21"+
		"\2\u0100\u0104\7\16\2\2\u0101\u0103\5\34\17\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0116\7\17\2\2\u0108\u010a\7\21\2\2\u0109"+
		"\u010b\5\2\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u0116\7\20\2\2\u010d\u010e\5\2\2\2\u010e\u010f\7\20\2\2\u010f"+
		"\u0116\3\2\2\2\u0110\u0112\7\20\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u00fe\3\2\2\2\u0115\u00ff\3\2\2\2\u0115\u0100\3\2\2\2\u0115\u0108\3\2"+
		"\2\2\u0115\u010d\3\2\2\2\u0115\u0111\3\2\2\2\u0116\35\3\2\2\2\u0117\u0118"+
		"\7\22\2\2\u0118\u0119\7\4\2\2\u0119\u011a\5\2\2\2\u011a\u011b\7\6\2\2"+
		"\u011b\u0120\5\34\17\2\u011c\u011d\7\23\2\2\u011d\u011f\5\34\17\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\37\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\24\2\2\u0124\u0125"+
		"\7\4\2\2\u0125\u0126\5\2\2\2\u0126\u0127\7\6\2\2\u0127\u0128\5\34\17\2"+
		"\u0128!\3\2\2\2!)8ciy{}\u008c\u0092\u0094\u0099\u009f\u00a5\u00a9\u00ad"+
		"\u00b3\u00b9\u00bd\u00c9\u00df\u00e5\u00e8\u00ed\u00f3\u00f9\u00fc\u0104"+
		"\u010a\u0113\u0115\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}