// Generated from C:/Users/edfmg/Documents/GitHub/EPN_XML/src\grammarEPN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarEPNParser}.
 */
public interface grammarEPNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammarEPNParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammarEPNParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(grammarEPNParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(grammarEPNParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(grammarEPNParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(grammarEPNParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammarEPNParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammarEPNParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(grammarEPNParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(grammarEPNParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#having}.
	 * @param ctx the parse tree
	 */
	void enterHaving(grammarEPNParser.HavingContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#having}.
	 * @param ctx the parse tree
	 */
	void exitHaving(grammarEPNParser.HavingContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#within}.
	 * @param ctx the parse tree
	 */
	void enterWithin(grammarEPNParser.WithinContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#within}.
	 * @param ctx the parse tree
	 */
	void exitWithin(grammarEPNParser.WithinContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(grammarEPNParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(grammarEPNParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(grammarEPNParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(grammarEPNParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(grammarEPNParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(grammarEPNParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarEPNParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(grammarEPNParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarEPNParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(grammarEPNParser.TipoContext ctx);
}