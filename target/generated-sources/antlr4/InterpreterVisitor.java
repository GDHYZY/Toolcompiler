// Generated from Interpreter.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(InterpreterParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(InterpreterParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(InterpreterParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(InterpreterParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(InterpreterParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(InterpreterParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixIncDec}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncDec(InterpreterParser.PostfixIncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(InterpreterParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpression}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(InterpreterParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identify}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentify(InterpreterParser.IdentifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#apos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApos(InterpreterParser.AposContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#dquo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDquo(InterpreterParser.DquoContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(InterpreterParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(InterpreterParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(InterpreterParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intptr}
	 * labeled alternative in {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntptr(InterpreterParser.IntptrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Charptr}
	 * labeled alternative in {@link InterpreterParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharptr(InterpreterParser.CharptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#global_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_declaration(InterpreterParser.Global_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleIdentify}
	 * labeled alternative in {@link InterpreterParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleIdentify(InterpreterParser.SingleIdentifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PtrIdentify}
	 * labeled alternative in {@link InterpreterParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrIdentify(InterpreterParser.PtrIdentifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#enum_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_decl(InterpreterParser.Enum_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(InterpreterParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(InterpreterParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#parameter_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decl(InterpreterParser.Parameter_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#body_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_decl(InterpreterParser.Body_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(InterpreterParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(InterpreterParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(InterpreterParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(InterpreterParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(InterpreterParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStatement}
	 * labeled alternative in {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(InterpreterParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(InterpreterParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(InterpreterParser.While_statementContext ctx);
}