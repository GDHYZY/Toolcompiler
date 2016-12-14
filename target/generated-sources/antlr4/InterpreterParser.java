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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, NUM=29, Eq=30, Assign=31, Mul=32, 
		Div=33, Add=34, Sub=35, Inc=36, Dec=37, Ne=38, Le=39, Shl=40, Lt=41, Ge=42, 
		Shr=43, Gt=44, Lor=45, Or=46, Lan=47, And=48, Xor=49, Mod=50, Brak=51, 
		Cond=52, Til=53, Not=54, Identifier=55, Constant=56, StringLiteral=57, 
		Whitespace=58, Newline=59, BlockComment=60, LineComment=61;
	public static final int
		RULE_apos = 0, RULE_dquo = 1, RULE_expr = 2, RULE_comment = 3, RULE_type = 4, 
		RULE_program = 5, RULE_global_declaration = 6, RULE_id = 7, RULE_enum_decl = 8, 
		RULE_variable_decl = 9, RULE_function_decl = 10, RULE_parameter_decl = 11, 
		RULE_body_decl = 12, RULE_statement = 13, RULE_labeledStatement = 14, 
		RULE_compoundStatement = 15, RULE_blockItemList = 16, RULE_blockItem = 17, 
		RULE_expressionStatement = 18, RULE_selectionStatement = 19, RULE_iterationStatement = 20, 
		RULE_jumpStatement = 21;
	public static final String[] ruleNames = {
		"apos", "dquo", "expr", "comment", "type", "program", "global_declaration", 
		"id", "enum_decl", "variable_decl", "function_decl", "parameter_decl", 
		"body_decl", "statement", "labeledStatement", "compoundStatement", "blockItemList", 
		"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
		"jumpStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'\"'", "'('", "')'", "']'", "','", "'.'", "'->'", "'int'", 
		"'char'", "'enum'", "'{'", "'}'", "';'", "':'", "'case'", "'default'", 
		"'if'", "'else'", "'switch'", "'while'", "'do'", "'for'", "'goto'", "'continue'", 
		"'break'", "'return'", null, null, "'=='", "'='", "'*'", "'/'", "'+'", 
		"'-'", "'++'", "'--'", "'!='", "'<='", "'<<'", "'<'", "'>='", "'>>'", 
		"'>'", "'||'", "'|'", "'&&'", "'&'", "'^'", "'%'", "'['", "'?'", "'~'", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "NUM", "Eq", "Assign", "Mul", "Div", "Add", 
		"Sub", "Inc", "Dec", "Ne", "Le", "Shl", "Lt", "Ge", "Shr", "Gt", "Lor", 
		"Or", "Lan", "And", "Xor", "Mod", "Brak", "Cond", "Til", "Not", "Identifier", 
		"Constant", "StringLiteral", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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
		enterRule(_localctx, 0, RULE_apos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
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
		enterRule(_localctx, 2, RULE_dquo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
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
		public TerminalNode Constant() { return getToken(InterpreterParser.Constant, 0); }
		public TerminalNode StringLiteral() { return getToken(InterpreterParser.StringLiteral, 0); }
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(49);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new IdentifyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				id();
				}
				break;
			case 3:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(Constant);
				}
				break;
			case 4:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(StringLiteral);
				}
				break;
			case 5:
				{
				_localctx = new SubExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__2);
				setState(54);
				expr(0);
				setState(55);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(58);
				expr(14);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Add) | (1L << Sub) | (1L << And) | (1L << Til) | (1L << Not))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(61);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(67);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(68);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(70);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Shl || _la==Shr) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(71);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(73);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Lt || _la==Gt) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(74);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(76);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Le || _la==Ge) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(77);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Eq || _la==Ne) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(80);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(82);
						((BinaryExprContext)_localctx).op = match(And);
						setState(83);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(85);
						((BinaryExprContext)_localctx).op = match(Xor);
						setState(86);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(88);
						((BinaryExprContext)_localctx).op = match(Or);
						setState(89);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(91);
						((BinaryExprContext)_localctx).op = match(Lan);
						setState(92);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(94);
						((BinaryExprContext)_localctx).op = match(Lor);
						setState(95);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(97);
						((BinaryExprContext)_localctx).op = match(Assign);
						setState(98);
						expr(2);
						}
						break;
					case 12:
						{
						_localctx = new SubscriptContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(100);
						match(Brak);
						setState(101);
						expr(0);
						setState(102);
						match(T__4);
						}
						break;
					case 13:
						{
						_localctx = new FunctionCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(105);
						match(T__2);
						setState(107);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
							{
							setState(106);
							expr(0);
							}
						}

						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__5) {
							{
							{
							setState(109);
							match(T__5);
							setState(110);
							expr(0);
							}
							}
							setState(115);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(116);
						match(T__3);
						}
						break;
					case 14:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(118);
						match(T__6);
						setState(119);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(121);
						match(T__7);
						setState(122);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new PostfixIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(124);
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
						setState(125);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(126);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(129);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(127);
							match(NUM);
							}
							break;
						case 2:
							{
							setState(128);
							expr(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(135);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode BlockComment() { return getToken(InterpreterParser.BlockComment, 0); }
		public TerminalNode LineComment() { return getToken(InterpreterParser.LineComment, 0); }
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
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==BlockComment || _la==LineComment) ) {
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new IntptrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__8);
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
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new CharptrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(T__9);
				setState(148); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(147);
						match(Mul);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150); 
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
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				global_declaration();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << BlockComment) | (1L << LineComment))) != 0) );
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				enum_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				variable_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				function_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new SingleIdentifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				}
				break;
			case 2:
				_localctx = new PtrIdentifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul) {
					{
					{
					setState(166);
					match(Mul);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
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
			setState(175);
			match(T__10);
			setState(177);
			_la = _input.LA(1);
			if (_la==ID || _la==Mul) {
				{
				setState(176);
				id();
				}
			}

			setState(179);
			match(T__11);
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

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(185);
				match(T__5);
				setState(186);
				id();
				setState(189);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(187);
					match(Assign);
					setState(188);
					match(NUM);
					}
				}

				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__12);
			setState(197);
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
			setState(199);
			type();
			setState(200);
			id();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(201);
				match(T__5);
				setState(202);
				id();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			setState(210);
			type();
			setState(211);
			id();
			setState(212);
			match(T__2);
			setState(213);
			parameter_decl();
			setState(214);
			match(T__3);
			setState(215);
			match(T__11);
			setState(216);
			body_decl();
			setState(217);
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
			setState(236);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				type();
				setState(220);
				id();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(221);
					match(T__5);
					setState(222);
					type();
					setState(223);
					id();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BlockComment || _la==LineComment) {
					{
					{
					setState(230);
					comment();
					}
					}
					setState(235);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8 || _la==T__9) {
					{
					{
					setState(238);
					variable_decl();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Identifier) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(244);
					statement();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BlockComment || _la==LineComment) {
					{
					{
					setState(250);
					comment();
					}
					}
					setState(255);
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
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				labeledStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				compoundStatement();
				}
				break;
			case T__2:
			case T__13:
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
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				expressionStatement();
				}
				break;
			case T__17:
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				selectionStatement();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				iterationStatement();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				jumpStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(InterpreterParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_labeledStatement);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Identifier);
				setState(267);
				match(T__14);
				setState(268);
				statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__15);
				setState(270);
				expr(0);
				setState(271);
				match(T__14);
				setState(272);
				statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__16);
				setState(275);
				match(T__14);
				setState(276);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__11);
			setState(281);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Identifier) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
				{
				setState(280);
				blockItemList(0);
				}
			}

			setState(283);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(289);
					blockItem();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BlockItemContext extends ParserRuleContext {
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockItem);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				variable_decl();
				}
				break;
			case T__2:
			case T__11:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
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
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				statement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
				{
				setState(299);
				expr(0);
				}
			}

			setState(302);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	 
		public SelectionStatementContext() { }
		public void copyFrom(SelectionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends SelectionStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(SelectionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends SelectionStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchStatementContext(SelectionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selectionStatement);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__17);
				setState(305);
				match(T__2);
				setState(306);
				expr(0);
				setState(307);
				match(T__3);
				setState(308);
				statement();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(309);
					match(T__18);
					setState(310);
					statement();
					}
					break;
				}
				}
				break;
			case T__19:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__19);
				setState(314);
				match(T__2);
				setState(315);
				expr(0);
				setState(316);
				match(T__3);
				setState(317);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends IterationStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterationStatement);
		int _la;
		try {
			setState(350);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__20);
				setState(322);
				match(T__2);
				setState(323);
				expr(0);
				setState(324);
				match(T__3);
				setState(325);
				statement();
				}
				break;
			case T__21:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__21);
				setState(328);
				statement();
				setState(329);
				match(T__20);
				setState(330);
				match(T__2);
				setState(331);
				expr(0);
				setState(332);
				match(T__3);
				setState(333);
				match(T__13);
				}
				break;
			case T__22:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(T__22);
				setState(336);
				match(T__2);
				setState(338);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
					{
					setState(337);
					expr(0);
					}
				}

				setState(340);
				match(T__13);
				setState(342);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
					{
					setState(341);
					expr(0);
					}
				}

				setState(344);
				match(T__13);
				setState(346);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
					{
					setState(345);
					expr(0);
					}
				}

				setState(348);
				match(T__3);
				setState(349);
				statement();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpStatementContext {
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends JumpStatementContext {
		public TerminalNode Identifier() { return getToken(InterpreterParser.Identifier, 0); }
		public GotoStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends JumpStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends JumpStatementContext {
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jumpStatement);
		int _la;
		try {
			setState(364);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__23);
				setState(353);
				match(Identifier);
				setState(354);
				match(T__13);
				}
				break;
			case T__24:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__24);
				setState(356);
				match(T__13);
				}
				break;
			case T__25:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(T__25);
				setState(358);
				match(T__13);
				}
				break;
			case T__26:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(T__26);
				setState(361);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << NUM) | (1L << Mul) | (1L << Add) | (1L << Sub) | (1L << Inc) | (1L << Dec) | (1L << And) | (1L << Til) | (1L << Not) | (1L << Constant) | (1L << StringLiteral))) != 0)) {
					{
					setState(360);
					expr(0);
					}
				}

				setState(363);
				match(T__13);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 15);
		case 16:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0171\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\5\4C\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\7\4\u0086"+
		"\n\4\f\4\16\4\u0089\13\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u0091\n\6\r\6\16"+
		"\6\u0092\3\6\3\6\6\6\u0097\n\6\r\6\16\6\u0098\5\6\u009b\n\6\3\7\6\7\u009e"+
		"\n\7\r\7\16\7\u009f\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\7\t\u00aa\n"+
		"\t\f\t\16\t\u00ad\13\t\3\t\5\t\u00b0\n\t\3\n\3\n\5\n\u00b4\n\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ba\n\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\7\n\u00c2\n\n\f\n"+
		"\16\n\u00c5\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ce\n\13\f\13"+
		"\16\13\u00d1\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\r\7\r\u00ea\n\r"+
		"\f\r\16\r\u00ed\13\r\5\r\u00ef\n\r\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5"+
		"\13\16\3\16\7\16\u00f8\n\16\f\16\16\16\u00fb\13\16\3\16\7\16\u00fe\n\16"+
		"\f\16\16\16\u0101\13\16\5\16\u0103\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u010b\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0118\n\20\3\21\3\21\5\21\u011c\n\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u0125\n\22\f\22\16\22\u0128\13\22\3\23\3\23\5\23\u012c\n"+
		"\23\3\24\5\24\u012f\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u013a\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0142\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0155\n\26\3\26\3\26\5\26\u0159\n\26\3\26\3\26\5\26\u015d"+
		"\n\26\3\26\3\26\5\26\u0161\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u016c\n\27\3\27\5\27\u016f\n\27\3\27\2\4\6\"\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\13\3\2&\'\6\2\"\"$%\62\62\678\4"+
		"\2\"#\64\64\4\2**--\4\2++..\4\2)),,\4\2  ((\3\2$%\3\2>?\u01a2\2.\3\2\2"+
		"\2\4\60\3\2\2\2\6B\3\2\2\2\b\u008a\3\2\2\2\n\u009a\3\2\2\2\f\u009d\3\2"+
		"\2\2\16\u00a5\3\2\2\2\20\u00af\3\2\2\2\22\u00b1\3\2\2\2\24\u00c9\3\2\2"+
		"\2\26\u00d4\3\2\2\2\30\u00ee\3\2\2\2\32\u0102\3\2\2\2\34\u010a\3\2\2\2"+
		"\36\u0117\3\2\2\2 \u0119\3\2\2\2\"\u011f\3\2\2\2$\u012b\3\2\2\2&\u012e"+
		"\3\2\2\2(\u0141\3\2\2\2*\u0160\3\2\2\2,\u016e\3\2\2\2./\7\3\2\2/\3\3\2"+
		"\2\2\60\61\7\4\2\2\61\5\3\2\2\2\62\63\b\4\1\2\63C\7\37\2\2\64C\5\20\t"+
		"\2\65C\7:\2\2\66C\7;\2\2\678\7\5\2\289\5\6\4\29:\7\6\2\2:C\3\2\2\2;<\t"+
		"\2\2\2<C\5\6\4\20=@\t\3\2\2>A\7\37\2\2?A\5\6\4\2@>\3\2\2\2@?\3\2\2\2A"+
		"C\3\2\2\2B\62\3\2\2\2B\64\3\2\2\2B\65\3\2\2\2B\66\3\2\2\2B\67\3\2\2\2"+
		"B;\3\2\2\2B=\3\2\2\2C\u0087\3\2\2\2DE\f\16\2\2EF\t\4\2\2F\u0086\5\6\4"+
		"\17GH\f\f\2\2HI\t\5\2\2I\u0086\5\6\4\rJK\f\13\2\2KL\t\6\2\2L\u0086\5\6"+
		"\4\fMN\f\n\2\2NO\t\7\2\2O\u0086\5\6\4\13PQ\f\t\2\2QR\t\b\2\2R\u0086\5"+
		"\6\4\nST\f\b\2\2TU\7\62\2\2U\u0086\5\6\4\tVW\f\7\2\2WX\7\63\2\2X\u0086"+
		"\5\6\4\bYZ\f\6\2\2Z[\7\60\2\2[\u0086\5\6\4\7\\]\f\5\2\2]^\7\61\2\2^\u0086"+
		"\5\6\4\6_`\f\4\2\2`a\7/\2\2a\u0086\5\6\4\5bc\f\3\2\2cd\7!\2\2d\u0086\5"+
		"\6\4\4ef\f\25\2\2fg\7\65\2\2gh\5\6\4\2hi\7\7\2\2i\u0086\3\2\2\2jk\f\24"+
		"\2\2km\7\5\2\2ln\5\6\4\2ml\3\2\2\2mn\3\2\2\2ns\3\2\2\2op\7\b\2\2pr\5\6"+
		"\4\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v\u0086"+
		"\7\6\2\2wx\f\23\2\2xy\7\t\2\2y\u0086\7\36\2\2z{\f\22\2\2{|\7\n\2\2|\u0086"+
		"\7\36\2\2}~\f\21\2\2~\u0086\t\2\2\2\177\u0080\f\r\2\2\u0080\u0083\t\t"+
		"\2\2\u0081\u0084\7\37\2\2\u0082\u0084\5\6\4\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0086\3\2\2\2\u0085D\3\2\2\2\u0085G\3\2\2\2\u0085"+
		"J\3\2\2\2\u0085M\3\2\2\2\u0085P\3\2\2\2\u0085S\3\2\2\2\u0085V\3\2\2\2"+
		"\u0085Y\3\2\2\2\u0085\\\3\2\2\2\u0085_\3\2\2\2\u0085b\3\2\2\2\u0085e\3"+
		"\2\2\2\u0085j\3\2\2\2\u0085w\3\2\2\2\u0085z\3\2\2\2\u0085}\3\2\2\2\u0085"+
		"\177\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\7\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\t\n\2\2\u008b\t\3\2"+
		"\2\2\u008c\u009b\7\13\2\2\u008d\u009b\7\f\2\2\u008e\u0090\7\13\2\2\u008f"+
		"\u0091\7\"\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u009b\3\2\2\2\u0094\u0096\7\f\2\2\u0095"+
		"\u0097\7\"\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u008c\3\2\2\2\u009a"+
		"\u008d\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0094\3\2\2\2\u009b\13\3\2\2"+
		"\2\u009c\u009e\5\16\b\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a6\5\22\n"+
		"\2\u00a2\u00a6\5\24\13\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\5\b\5\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\17\3\2\2\2\u00a7\u00b0\7\36\2\2\u00a8\u00aa\7\"\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\36\2\2\u00af\u00a7\3"+
		"\2\2\2\u00af\u00ab\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b3\7\r\2\2\u00b2"+
		"\u00b4\5\20\t\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\7\16\2\2\u00b6\u00b9\5\20\t\2\u00b7\u00b8\7!\2\2\u00b8"+
		"\u00ba\7\37\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c3\3"+
		"\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bf\5\20\t\2\u00bd\u00be\7!\2\2\u00be"+
		"\u00c0\7\37\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\17"+
		"\2\2\u00c7\u00c8\7\20\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cf"+
		"\5\20\t\2\u00cb\u00cc\7\b\2\2\u00cc\u00ce\5\20\t\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\20\2\2\u00d3\25\3\2\2\2\u00d4"+
		"\u00d5\5\n\6\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5"+
		"\30\r\2\u00d8\u00d9\7\6\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\5\32\16\2"+
		"\u00db\u00dc\7\17\2\2\u00dc\27\3\2\2\2\u00dd\u00de\5\n\6\2\u00de\u00e5"+
		"\5\20\t\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\5\n\6\2\u00e1\u00e2\5\20\t\2"+
		"\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ef\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00ea\5\b\5\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00dd\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00f2\5\24\13"+
		"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\5\34\17\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\5\b\5\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u00f3\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0103\33\3\2\2\2\u0104\u010b\5\36\20\2\u0105\u010b\5 \21"+
		"\2\u0106\u010b\5&\24\2\u0107\u010b\5(\25\2\u0108\u010b\5*\26\2\u0109\u010b"+
		"\5,\27\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\35\3\2\2"+
		"\2\u010c\u010d\79\2\2\u010d\u010e\7\21\2\2\u010e\u0118\5\34\17\2\u010f"+
		"\u0110\7\22\2\2\u0110\u0111\5\6\4\2\u0111\u0112\7\21\2\2\u0112\u0113\5"+
		"\34\17\2\u0113\u0118\3\2\2\2\u0114\u0115\7\23\2\2\u0115\u0116\7\21\2\2"+
		"\u0116\u0118\5\34\17\2\u0117\u010c\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0114"+
		"\3\2\2\2\u0118\37\3\2\2\2\u0119\u011b\7\16\2\2\u011a\u011c\5\"\22\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\17"+
		"\2\2\u011e!\3\2\2\2\u011f\u0120\b\22\1\2\u0120\u0121\5$\23\2\u0121\u0126"+
		"\3\2\2\2\u0122\u0123\f\3\2\2\u0123\u0125\5$\23\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127#\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012c\5\24\13\2\u012a\u012c\5\34\17\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c%\3\2\2\2\u012d\u012f\5\6\4\2"+
		"\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\7\20\2\2\u0131\'\3\2\2\2\u0132\u0133\7\24\2\2\u0133\u0134\7\5\2\2\u0134"+
		"\u0135\5\6\4\2\u0135\u0136\7\6\2\2\u0136\u0139\5\34\17\2\u0137\u0138\7"+
		"\25\2\2\u0138\u013a\5\34\17\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u0142\3\2\2\2\u013b\u013c\7\26\2\2\u013c\u013d\7\5\2\2\u013d\u013e"+
		"\5\6\4\2\u013e\u013f\7\6\2\2\u013f\u0140\5\34\17\2\u0140\u0142\3\2\2\2"+
		"\u0141\u0132\3\2\2\2\u0141\u013b\3\2\2\2\u0142)\3\2\2\2\u0143\u0144\7"+
		"\27\2\2\u0144\u0145\7\5\2\2\u0145\u0146\5\6\4\2\u0146\u0147\7\6\2\2\u0147"+
		"\u0148\5\34\17\2\u0148\u0161\3\2\2\2\u0149\u014a\7\30\2\2\u014a\u014b"+
		"\5\34\17\2\u014b\u014c\7\27\2\2\u014c\u014d\7\5\2\2\u014d\u014e\5\6\4"+
		"\2\u014e\u014f\7\6\2\2\u014f\u0150\7\20\2\2\u0150\u0161\3\2\2\2\u0151"+
		"\u0152\7\31\2\2\u0152\u0154\7\5\2\2\u0153\u0155\5\6\4\2\u0154\u0153\3"+
		"\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\7\20\2\2\u0157"+
		"\u0159\5\6\4\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\7\20\2\2\u015b\u015d\5\6\4\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\6\2\2\u015f\u0161\5\34"+
		"\17\2\u0160\u0143\3\2\2\2\u0160\u0149\3\2\2\2\u0160\u0151\3\2\2\2\u0161"+
		"+\3\2\2\2\u0162\u0163\7\32\2\2\u0163\u0164\79\2\2\u0164\u016f\7\20\2\2"+
		"\u0165\u0166\7\33\2\2\u0166\u016f\7\20\2\2\u0167\u0168\7\34\2\2\u0168"+
		"\u016f\7\20\2\2\u0169\u016b\7\35\2\2\u016a\u016c\5\6\4\2\u016b\u016a\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\7\20\2\2\u016e"+
		"\u0162\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u0167\3\2\2\2\u016e\u0169\3\2"+
		"\2\2\u016f-\3\2\2\2*@Bms\u0083\u0085\u0087\u0092\u0098\u009a\u009f\u00a5"+
		"\u00ab\u00af\u00b3\u00b9\u00bf\u00c3\u00cf\u00e5\u00eb\u00ee\u00f3\u00f9"+
		"\u00ff\u0102\u010a\u0117\u011b\u0126\u012b\u012e\u0139\u0141\u0154\u0158"+
		"\u015c\u0160\u016b\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}