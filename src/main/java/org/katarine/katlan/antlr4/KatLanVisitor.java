// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.katlan.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KatLanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KatLanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KatLanParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(KatLanParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(KatLanParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#importBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportBlock(KatLanParser.ImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(KatLanParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#importStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatic(KatLanParser.ImportStaticContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#unnamedClassDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(KatLanParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#interfaceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDef(KatLanParser.InterfaceDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#annotationDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDef(KatLanParser.AnnotationDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#packageBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageBlock(KatLanParser.PackageBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(KatLanParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#annotationClassBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationClassBlock(KatLanParser.AnnotationClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KatLanParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#lineBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineBlock(KatLanParser.LineBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(KatLanParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(KatLanParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#genericTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeName(KatLanParser.GenericTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#genericDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDef(KatLanParser.GenericDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#genericTypeUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeUse(KatLanParser.GenericTypeUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#genericExtendsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericExtendsStatement(KatLanParser.GenericExtendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(KatLanParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#varAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(KatLanParser.VarAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(KatLanParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#arrayAccess0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess0(KatLanParser.ArrayAccess0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#methodDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(KatLanParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#constructorDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDef(KatLanParser.ConstructorDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#operatorOverDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOverDef(KatLanParser.OperatorOverDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(KatLanParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KatLanParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(KatLanParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(KatLanParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#constDef0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef0(KatLanParser.ConstDef0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#constDef1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef1(KatLanParser.ConstDef1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(KatLanParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#varDef0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef0(KatLanParser.VarDef0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#varDef1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef1(KatLanParser.VarDef1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#subVD1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubVD1(KatLanParser.SubVD1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KatLanParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(KatLanParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(KatLanParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#subSwitch0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSwitch0(KatLanParser.SubSwitch0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchFinally(KatLanParser.TryCatchFinallyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KatLanParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#ifStatement0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement0(KatLanParser.IfStatement0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopStatement(KatLanParser.WhileLoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#forEachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoop(KatLanParser.ForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#foriLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForiLoop(KatLanParser.ForiLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#foriLoop0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForiLoop0(KatLanParser.ForiLoop0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(KatLanParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(KatLanParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(KatLanParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(KatLanParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KatLanParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#anyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(KatLanParser.AnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#linkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkType(KatLanParser.LinkTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(KatLanParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#nullType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullType(KatLanParser.NullTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(KatLanParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(KatLanParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#methodCall0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall0(KatLanParser.MethodCall0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(KatLanParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#annotationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationCall(KatLanParser.AnnotationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(KatLanParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KatLanParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(KatLanParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(KatLanParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#logicalXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalXor(KatLanParser.LogicalXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#logicalNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(KatLanParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#primaryExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#arithCondExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithCondExpression(KatLanParser.ArithCondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(KatLanParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(KatLanParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#modDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModDivExpression(KatLanParser.ModDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(KatLanParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#powerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(KatLanParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#numberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(KatLanParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#incrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrExpression(KatLanParser.IncrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(KatLanParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#dot_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_name(KatLanParser.Dot_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#numeric_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_value(KatLanParser.Numeric_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KatLanParser#extends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends(KatLanParser.ExtendsContext ctx);
}