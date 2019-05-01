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
		RULE_any = 4, RULE_having = 5, RULE_within = 6, RULE_operador = 7, RULE_value = 8, 
		RULE_time = 9, RULE_tipo = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "statement", "if_statement", "condition", "any", "having", "within", 
			"operador", "value", "time", "tipo"
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(24);
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
				setState(23);
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
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
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
				setState(27);
				if_statement();
				setState(28);
				match(T__0);
				setState(29);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statement);
		try {
			setState(57);
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
				setState(35);
				match(T__1);
				setState(36);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__1);
				setState(38);
				condition();
				setState(39);
				match(T__0);
				setState(40);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__1);
				setState(43);
				condition();
				setState(44);
				match(T__2);
				setState(45);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(T__1);
				setState(48);
				condition();
				setState(49);
				match(T__0);
				setState(50);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(T__1);
				setState(53);
				condition();
				setState(54);
				match(T__2);
				setState(55);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
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
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__3);
				setState(61);
				any();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				setState(63);
				having();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(T__5);
				setState(65);
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
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_any);
		int _la;
		try {
			setState(74);
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
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(LETRA);
					}
					}
					setState(72); 
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
		public List<TerminalNode> LETRA() { return getTokens(grammarEPNParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(grammarEPNParser.LETRA, i);
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
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_having);
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
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__6);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(LETRA);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETRA );
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
	}

	public final WithinContext within() throws RecognitionException {
		WithinContext _localctx = new WithinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_within);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				setState(94);
				value();
				setState(95);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				time();
				setState(98);
				value();
				setState(99);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				time();
				setState(102);
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
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operador);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(grammarEPNParser.DIGIT, 0); }
		public List<TerminalNode> LETRA() { return getTokens(grammarEPNParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(grammarEPNParser.LETRA, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarEPNListener ) ((grammarEPNListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(DIGIT);
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					match(LETRA);
					}
					}
					setState(115); 
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
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_time);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(DIGIT);
				setState(121);
				tipo();
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__8:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3"+
		"\6\6\6I\n\6\r\6\16\6J\5\6M\n\6\3\7\3\7\3\7\6\7R\n\7\r\7\16\7S\3\7\3\7"+
		"\6\7X\n\7\r\7\16\7Y\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\5\to\n\t\3\n\3\n\3\n\6\nt\n\n\r\n\16\nu"+
		"\5\nx\n\n\3\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\5\f\u0082\n\f\3\f\2\2"+
		"\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0092\2\32\3\2\2\2\4\"\3\2\2\2\6;"+
		"\3\2\2\2\bD\3\2\2\2\nL\3\2\2\2\f[\3\2\2\2\16j\3\2\2\2\20n\3\2\2\2\22w"+
		"\3\2\2\2\24|\3\2\2\2\26\u0081\3\2\2\2\30\33\3\2\2\2\31\33\5\4\3\2\32\30"+
		"\3\2\2\2\32\31\3\2\2\2\33\3\3\2\2\2\34#\3\2\2\2\35\36\5\6\4\2\36\37\7"+
		"\3\2\2\37 \5\6\4\2 #\3\2\2\2!#\5\6\4\2\"\34\3\2\2\2\"\35\3\2\2\2\"!\3"+
		"\2\2\2#\5\3\2\2\2$<\3\2\2\2%&\7\4\2\2&<\5\b\5\2\'(\7\4\2\2()\5\b\5\2)"+
		"*\7\3\2\2*+\5\b\5\2+<\3\2\2\2,-\7\4\2\2-.\5\b\5\2./\7\5\2\2/\60\5\b\5"+
		"\2\60<\3\2\2\2\61\62\7\4\2\2\62\63\5\b\5\2\63\64\7\3\2\2\64\65\5\6\4\2"+
		"\65<\3\2\2\2\66\67\7\4\2\2\678\5\b\5\289\7\5\2\29:\5\6\4\2:<\3\2\2\2;"+
		"$\3\2\2\2;%\3\2\2\2;\'\3\2\2\2;,\3\2\2\2;\61\3\2\2\2;\66\3\2\2\2<\7\3"+
		"\2\2\2=E\3\2\2\2>?\7\6\2\2?E\5\n\6\2@A\7\7\2\2AE\5\f\7\2BC\7\b\2\2CE\5"+
		"\16\b\2D=\3\2\2\2D>\3\2\2\2D@\3\2\2\2DB\3\2\2\2E\t\3\2\2\2FM\3\2\2\2G"+
		"I\7\17\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LF\3\2\2\2"+
		"LH\3\2\2\2M\13\3\2\2\2N\\\3\2\2\2OQ\7\t\2\2PR\7\17\2\2QP\3\2\2\2RS\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\\\3\2\2\2UW\7\n\2\2VX\7\17\2\2WV\3\2\2\2XY\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[N\3\2\2\2[O\3\2\2\2[U\3\2\2\2\\"+
		"\r\3\2\2\2]k\3\2\2\2^_\5\24\13\2_`\5\20\t\2`a\5\22\n\2ab\5\b\5\2bk\3\2"+
		"\2\2cd\5\24\13\2de\5\22\n\2ef\5\b\5\2fk\3\2\2\2gh\5\24\13\2hi\5\b\5\2"+
		"ik\3\2\2\2j]\3\2\2\2j^\3\2\2\2jc\3\2\2\2jg\3\2\2\2k\17\3\2\2\2lo\3\2\2"+
		"\2mo\7\13\2\2nl\3\2\2\2nm\3\2\2\2o\21\3\2\2\2px\3\2\2\2qs\7\16\2\2rt\7"+
		"\17\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wp\3\2\2\2wq"+
		"\3\2\2\2x\23\3\2\2\2y}\3\2\2\2z{\7\16\2\2{}\5\26\f\2|y\3\2\2\2|z\3\2\2"+
		"\2}\25\3\2\2\2~\u0082\3\2\2\2\177\u0082\7\f\2\2\u0080\u0082\7\r\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\27\3\2\2\2\21\32"+
		"\";DJLSY[jnuw|\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}