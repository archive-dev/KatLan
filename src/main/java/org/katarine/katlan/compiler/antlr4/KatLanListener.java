// Generated from C:/Users/Egor/Documents/Java/gdx/KatLan/src/main/resources/KatLan.g4 by ANTLR 4.13.1
package org.katarine.katlan.compiler.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KatLanParser}.
 */
public interface KatLanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KatLanParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(KatLanParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(KatLanParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(KatLanParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(KatLanParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#importBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportBlock(KatLanParser.ImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#importBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportBlock(KatLanParser.ImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(KatLanParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(KatLanParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#unnamedClassDef}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#unnamedClassDef}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedClassDef(KatLanParser.UnnamedClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(KatLanParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(KatLanParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#interfaceDef}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDef(KatLanParser.InterfaceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#interfaceDef}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDef(KatLanParser.InterfaceDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#annotationDef}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDef(KatLanParser.AnnotationDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#annotationDef}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDef(KatLanParser.AnnotationDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#packageBlock}.
	 * @param ctx the parse tree
	 */
	void enterPackageBlock(KatLanParser.PackageBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#packageBlock}.
	 * @param ctx the parse tree
	 */
	void exitPackageBlock(KatLanParser.PackageBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(KatLanParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(KatLanParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#annotationClassBlock}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationClassBlock(KatLanParser.AnnotationClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#annotationClassBlock}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationClassBlock(KatLanParser.AnnotationClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KatLanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KatLanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#lineBlock}.
	 * @param ctx the parse tree
	 */
	void enterLineBlock(KatLanParser.LineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#lineBlock}.
	 * @param ctx the parse tree
	 */
	void exitLineBlock(KatLanParser.LineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KatLanParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KatLanParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(KatLanParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(KatLanParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#genericTypeName}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeName(KatLanParser.GenericTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#genericTypeName}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeName(KatLanParser.GenericTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#genericDef}.
	 * @param ctx the parse tree
	 */
	void enterGenericDef(KatLanParser.GenericDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#genericDef}.
	 * @param ctx the parse tree
	 */
	void exitGenericDef(KatLanParser.GenericDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#genericTypeUse}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeUse(KatLanParser.GenericTypeUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#genericTypeUse}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeUse(KatLanParser.GenericTypeUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExtendsStatement(KatLanParser.ExtendsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExtendsStatement(KatLanParser.ExtendsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(KatLanParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(KatLanParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#varAccess}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(KatLanParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#varAccess}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(KatLanParser.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(KatLanParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(KatLanParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#arrayAccess0}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess0(KatLanParser.ArrayAccess0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#arrayAccess0}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess0(KatLanParser.ArrayAccess0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(KatLanParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(KatLanParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#constructorDef}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDef(KatLanParser.ConstructorDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#constructorDef}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDef(KatLanParser.ConstructorDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#operatorOverDef}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOverDef(KatLanParser.OperatorOverDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#operatorOverDef}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOverDef(KatLanParser.OperatorOverDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(KatLanParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(KatLanParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KatLanParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KatLanParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(KatLanParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(KatLanParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(KatLanParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(KatLanParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#constDef0}.
	 * @param ctx the parse tree
	 */
	void enterConstDef0(KatLanParser.ConstDef0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#constDef0}.
	 * @param ctx the parse tree
	 */
	void exitConstDef0(KatLanParser.ConstDef0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#constDef1}.
	 * @param ctx the parse tree
	 */
	void enterConstDef1(KatLanParser.ConstDef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#constDef1}.
	 * @param ctx the parse tree
	 */
	void exitConstDef1(KatLanParser.ConstDef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(KatLanParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(KatLanParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#varDef0}.
	 * @param ctx the parse tree
	 */
	void enterVarDef0(KatLanParser.VarDef0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#varDef0}.
	 * @param ctx the parse tree
	 */
	void exitVarDef0(KatLanParser.VarDef0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#varDef1}.
	 * @param ctx the parse tree
	 */
	void enterVarDef1(KatLanParser.VarDef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#varDef1}.
	 * @param ctx the parse tree
	 */
	void exitVarDef1(KatLanParser.VarDef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#subVD1}.
	 * @param ctx the parse tree
	 */
	void enterSubVD1(KatLanParser.SubVD1Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#subVD1}.
	 * @param ctx the parse tree
	 */
	void exitSubVD1(KatLanParser.SubVD1Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KatLanParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KatLanParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(KatLanParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(KatLanParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(KatLanParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(KatLanParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#subSwitch0}.
	 * @param ctx the parse tree
	 */
	void enterSubSwitch0(KatLanParser.SubSwitch0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#subSwitch0}.
	 * @param ctx the parse tree
	 */
	void exitSubSwitch0(KatLanParser.SubSwitch0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchFinally(KatLanParser.TryCatchFinallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchFinally(KatLanParser.TryCatchFinallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(KatLanParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(KatLanParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#ifStatement0}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement0(KatLanParser.IfStatement0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#ifStatement0}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement0(KatLanParser.IfStatement0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopStatement(KatLanParser.WhileLoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#whileLoopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopStatement(KatLanParser.WhileLoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void enterForEachLoop(KatLanParser.ForEachLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void exitForEachLoop(KatLanParser.ForEachLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#foriLoop}.
	 * @param ctx the parse tree
	 */
	void enterForiLoop(KatLanParser.ForiLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#foriLoop}.
	 * @param ctx the parse tree
	 */
	void exitForiLoop(KatLanParser.ForiLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#foriLoop0}.
	 * @param ctx the parse tree
	 */
	void enterForiLoop0(KatLanParser.ForiLoop0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#foriLoop0}.
	 * @param ctx the parse tree
	 */
	void exitForiLoop0(KatLanParser.ForiLoop0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(KatLanParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(KatLanParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(KatLanParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(KatLanParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(KatLanParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(KatLanParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(KatLanParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(KatLanParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KatLanParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KatLanParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#anyType}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(KatLanParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#anyType}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(KatLanParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#linkType}.
	 * @param ctx the parse tree
	 */
	void enterLinkType(KatLanParser.LinkTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#linkType}.
	 * @param ctx the parse tree
	 */
	void exitLinkType(KatLanParser.LinkTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(KatLanParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(KatLanParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#nullType}.
	 * @param ctx the parse tree
	 */
	void enterNullType(KatLanParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#nullType}.
	 * @param ctx the parse tree
	 */
	void exitNullType(KatLanParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(KatLanParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(KatLanParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(KatLanParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(KatLanParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#methodCall0}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall0(KatLanParser.MethodCall0Context ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#methodCall0}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall0(KatLanParser.MethodCall0Context ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(KatLanParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(KatLanParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#annotationCall}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationCall(KatLanParser.AnnotationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#annotationCall}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationCall(KatLanParser.AnnotationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(KatLanParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(KatLanParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KatLanParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KatLanParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(KatLanParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(KatLanParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(KatLanParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(KatLanParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#logicalXor}.
	 * @param ctx the parse tree
	 */
	void enterLogicalXor(KatLanParser.LogicalXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#logicalXor}.
	 * @param ctx the parse tree
	 */
	void exitLogicalXor(KatLanParser.LogicalXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(KatLanParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#logicalNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(KatLanParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#primaryExpresion}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#primaryExpresion}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpresion(KatLanParser.PrimaryExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#arithCondExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithCondExpression(KatLanParser.ArithCondExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#arithCondExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithCondExpression(KatLanParser.ArithCondExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(KatLanParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(KatLanParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(KatLanParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(KatLanParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#modDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterModDivExpression(KatLanParser.ModDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#modDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitModDivExpression(KatLanParser.ModDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(KatLanParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(KatLanParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(KatLanParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(KatLanParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#numberExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(KatLanParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#numberExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(KatLanParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#incrExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrExpression(KatLanParser.IncrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#incrExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrExpression(KatLanParser.IncrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(KatLanParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(KatLanParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#dot_name}.
	 * @param ctx the parse tree
	 */
	void enterDot_name(KatLanParser.Dot_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#dot_name}.
	 * @param ctx the parse tree
	 */
	void exitDot_name(KatLanParser.Dot_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KatLanParser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_value(KatLanParser.Numeric_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KatLanParser#numeric_value}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_value(KatLanParser.Numeric_valueContext ctx);
}