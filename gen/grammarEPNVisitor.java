// Generated from C:/Users/edfmg/Documents/GitHub/EPN_XML/src\grammarEPN.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarEPNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarEPNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammarEPNParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(grammarEPNParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(grammarEPNParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grammarEPNParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(grammarEPNParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(grammarEPNParser.HavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#different}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferent(grammarEPNParser.DifferentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#same}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame(grammarEPNParser.SameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#within}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin(grammarEPNParser.WithinContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(grammarEPNParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(grammarEPNParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarEPNParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(grammarEPNParser.TipoContext ctx);
}