// Generated from C:/Users/edfmg/Documents/GitHub/EPN_XML/src\grammarEPN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarEPNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DIGIT=12, LETRA=13, WS=14;
	public static final int
		RULE_expr = 0, RULE_statement = 1, RULE_if_statement = 2, RULE_condition = 3, 
		RULE_any = 4, RULE_having = 5, RULE_different = 6, RULE_same = 7, RULE_within = 8, 
		RULE_operador = 9, RULE_time = 10, RULE_tipo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "statement", "if_statement", "condition", "any", "having", "different", 
			"same", "within", "operador", "time", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'if'", "'or'", "'any of'", "'having'", "'within'", "'different'", 
			"'same'", "'greater than'", "'minutes'", "'hours'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DIGIT", "LETRA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "grammarEPN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarEPNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				statement();
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				if_statement();
				setState(30);
				match(T__0);
				setState(31);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				if_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__1);
				setState(38);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__1);
				setState(40);
				condition();
				setState(41);
				match(T__0);
				setState(42);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__1);
				setState(45);
				condition();
				setState(46);
				match(T__2);
				setState(47);
				condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
		public WithinContext within() {
			return getRuleContext(WithinContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				setState(53);
				any();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(T__4);
				setState(55);
				having();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T__5);
				setState(57);
				within();
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

	public static class AnyContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(grammarEPNParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(grammarEPNParser.LETRA, i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_any);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					match(LETRA);
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETRA );
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

	public static class HavingContext extends ParserRuleContext {
		public DifferentContext different() {
			return getRuleContext(DifferentContext.class,0);
		}
		public SameContext same() {
			return getRuleContext(SameContext.class,0);
		}
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterHaving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitHaving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_having);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				different();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				same();
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

	public static class DifferentContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(grammarEPNParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(grammarEPNParser.LETRA, i);
		}
		public DifferentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_different; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterDifferent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitDifferent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitDifferent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifferentContext different() throws RecognitionException {
		DifferentContext _localctx = new DifferentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_different);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__6);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					match(LETRA);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETRA );
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

	public static class SameContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(grammarEPNParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(grammarEPNParser.LETRA, i);
		}
		public SameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterSame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitSame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitSame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SameContext same() throws RecognitionException {
		SameContext _localctx = new SameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_same);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__7);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(LETRA);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETRA );
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

	public static class WithinContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public WithinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterWithin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitWithin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitWithin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithinContext within() throws RecognitionException {
		WithinContext _localctx = new WithinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_within);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				time();
				setState(93);
				operador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				time();
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__8);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(grammarEPNParser.DIGIT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_time);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(DIGIT);
				setState(104);
				tipo();
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarEPNVisitor ) return ((grammarEPNVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__10);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\6\6A\n\6\r\6\16\6B\5\6E\n\6\3\7\3"+
		"\7\3\7\5\7J\n\7\3\b\3\b\3\b\6\bO\n\b\r\b\16\bP\5\bS\n\b\3\t\3\t\3\t\6"+
		"\tX\n\t\r\t\16\tY\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\13\3\13\5\13"+
		"g\n\13\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\5\rq\n\r\3\r\2\2\16\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\2\2\2}\2\34\3\2\2\2\4$\3\2\2\2\6\63\3\2\2\2\b<\3"+
		"\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16R\3\2\2\2\20[\3\2\2\2\22b\3\2\2\2\24f\3"+
		"\2\2\2\26k\3\2\2\2\30p\3\2\2\2\32\35\3\2\2\2\33\35\5\4\3\2\34\32\3\2\2"+
		"\2\34\33\3\2\2\2\35\3\3\2\2\2\36%\3\2\2\2\37 \5\6\4\2 !\7\3\2\2!\"\5\4"+
		"\3\2\"%\3\2\2\2#%\5\6\4\2$\36\3\2\2\2$\37\3\2\2\2$#\3\2\2\2%\5\3\2\2\2"+
		"&\64\3\2\2\2\'(\7\4\2\2(\64\5\b\5\2)*\7\4\2\2*+\5\b\5\2+,\7\3\2\2,-\5"+
		"\b\5\2-\64\3\2\2\2./\7\4\2\2/\60\5\b\5\2\60\61\7\5\2\2\61\62\5\b\5\2\62"+
		"\64\3\2\2\2\63&\3\2\2\2\63\'\3\2\2\2\63)\3\2\2\2\63.\3\2\2\2\64\7\3\2"+
		"\2\2\65=\3\2\2\2\66\67\7\6\2\2\67=\5\n\6\289\7\7\2\29=\5\f\7\2:;\7\b\2"+
		"\2;=\5\22\n\2<\65\3\2\2\2<\66\3\2\2\2<8\3\2\2\2<:\3\2\2\2=\t\3\2\2\2>"+
		"E\3\2\2\2?A\7\17\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"D>\3\2\2\2D@\3\2\2\2E\13\3\2\2\2FJ\3\2\2\2GJ\5\16\b\2HJ\5\20\t\2IF\3\2"+
		"\2\2IG\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KS\3\2\2\2LN\7\t\2\2MO\7\17\2\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RK\3\2\2\2RL\3\2\2\2S\17"+
		"\3\2\2\2T\\\3\2\2\2UW\7\n\2\2VX\7\17\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z\\\3\2\2\2[T\3\2\2\2[U\3\2\2\2\\\21\3\2\2\2]c\3\2\2\2^_\5\26"+
		"\f\2_`\5\24\13\2`c\3\2\2\2ac\5\26\f\2b]\3\2\2\2b^\3\2\2\2ba\3\2\2\2c\23"+
		"\3\2\2\2dg\3\2\2\2eg\7\13\2\2fd\3\2\2\2fe\3\2\2\2g\25\3\2\2\2hl\3\2\2"+
		"\2ij\7\16\2\2jl\5\30\r\2kh\3\2\2\2ki\3\2\2\2l\27\3\2\2\2mq\3\2\2\2nq\7"+
		"\f\2\2oq\7\r\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\31\3\2\2\2\21\34$\63<"+
		"BDIPRY[bfkp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}