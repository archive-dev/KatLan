package org.katarine.katlan.compiler;

import org.katarine.codegen.Type;
import org.katarine.katlan.antlr4.KatLanParser;
import org.katarine.katlan.lib.Access;
import org.katarine.katlan.lib.MethodModifier;
import org.katarine.katlan.lib.Modifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompilerContext {
    public static final class ClassContext {
        private final ImportContext imports;

        private final String name;
        private final String pkg;

        private final List<MethodContext> methods = new ArrayList<>();
        private final List<FieldContext> fields = new ArrayList<>();

        public ClassContext(ImportContext imports, String name, String pkg, KatLanParser.ClassContext ctx) {
            this.imports = imports;
            this.name = name;
            this.pkg = pkg;

            if (ctx.classDef()!=null) {
                for (var child : ctx.classDef().classBlock().children) {
                    if (child instanceof KatLanParser.ClassDefContext ||
                            child instanceof KatLanParser.InterfaceDefContext ||
                            child instanceof KatLanParser.AnnotationDefContext) {
                        continue;
                    }

                    if (child instanceof KatLanParser.VarContext varContext) {
                        if (varContext.varDef()!=null &&
                            varContext.varDef().varDef0()!=null) {
                            this.fields.add(FieldContext.from(imports, varContext.varDef()));
                        } else if (varContext.constDef().constDef0() != null) {
                            this.fields.add(FieldContext.from(imports, varContext.constDef()));
                        }
                    }

                    if (child instanceof KatLanParser.MethodDefContext) {
                        methods.add(MethodContext.from(imports, this, ((KatLanParser.MethodDefContext) child)));
                    }

                    if (child instanceof KatLanParser.OperatorOverDefContext) {
                        methods.add(MethodContext.from(imports, this, ((KatLanParser.OperatorOverDefContext) child)));
                    }

                    if (child instanceof KatLanParser.ConstructorDefContext) {
                        methods.add(MethodContext.from(imports, this, ((KatLanParser.ConstructorDefContext) child)));
                    }
                }
            }
        }

        public ImportContext getImports() {
            return imports;
        }

        public String getName() {
            return name;
        }

        public String getPkg() {
            return pkg;
        }

        public List<MethodContext> getMethods() {
            return methods;
        }

        public List<FieldContext> getFields() {
            return fields;
        }
    }

    public static final class MethodContext {
        private final ImportContext imports;
        private final ClassContext classContext;
        private final String name;
        private final List<Modifier> modifiers = new ArrayList<>();
        private final Access access;
        private final List<Type> parameters = new ArrayList<>();
        private final Type returnType;

        public static MethodContext from(ImportContext imports, ClassContext classContext, KatLanParser.MethodDefContext ctx) {
            return new MethodContext(imports, classContext, ctx);
        }

        public static MethodContext from(ImportContext imports, ClassContext classContext, KatLanParser.OperatorOverDefContext ctx) {
            return new MethodContext(imports, classContext, ctx);
        }

        public static MethodContext from(ImportContext imports, ClassContext classContext, KatLanParser.ConstructorDefContext ctx) {
            return new MethodContext(imports, classContext, ctx);
        }

        private MethodContext(ImportContext imports, ClassContext classContext, KatLanParser.MethodDefContext ctx) {
            this.imports = imports;
            this.classContext = classContext;

            this.name = ctx.name().getText();

            if (ctx.access() == null) this.access = Access.PACKAGE_PRIVATE;
            else if (ctx.access().PUBLIC() != null) this.access = Access.PUBLIC;
            else if (ctx.access().PRIVATE() != null) this.access = Access.PRIVATE;
            else if (ctx.access().PROTECTED() != null) this.access = Access.PROTECTED;
            else this.access = Access.PACKAGE_PRIVATE;

            if (ctx.access().FINAL() != null) this.modifiers.add(Modifier.FINAL);
            if (ctx.access().STATIC() != null) this.modifiers.add(Modifier.STATIC);

            if (ctx.methodModifier().ABSTRACT_KEYWORD()!=null) this.modifiers.add(Modifier.ABSTRACT);
            if (ctx.methodModifier().POST_MOD()!=null) this.modifiers.add(MethodModifier.POST);
            if (ctx.methodModifier().PRE_MOD()!=null) this.modifiers.add(MethodModifier.PRE);
            if (ctx.methodModifier().OVERRIDE()!=null) this.modifiers.add(MethodModifier.OVERRIDE);

            for (var param : ctx.parameters().parameter()) {
                parameters.add(imports.get(param.type().getText()));
            }

            this.returnType = imports.get(ctx.type().getText());
        }

        private MethodContext(ImportContext imports, ClassContext classContext, KatLanParser.OperatorOverDefContext ctx) {
            this.imports = imports;
            this.classContext = classContext;

            String methodName = "__";
            if (ctx.operator().DIV()!=null) {
                methodName += "div";
            } else if (ctx.operator().DIVIDE()!=null) {
                methodName += "divide";
            } else if (ctx.operator().MULTIPLY()!=null) {
                methodName += "mul";
            } else if (ctx.operator().PLUS()!=null) {
                methodName += "plus";
            } else if (ctx.operator().MINUS()!=null) {
                methodName += "minus";
            } else if (ctx.operator().POWER()!=null) {
                methodName += "pow";
            } else if (ctx.operator().MOD()!=null) {
                methodName += "mod";
            }

            methodName += "__";

            this.name = methodName;
            this.access = Access.PUBLIC;
            this.modifiers.add(Modifier.STATIC);

            parameters.add(imports.get(classContext.getName()));
            parameters.add(imports.get(classContext.getName()));

            this.returnType = imports.get(classContext.getName());
        }

        private MethodContext(ImportContext imports, ClassContext classContext, KatLanParser.ConstructorDefContext ctx) {
            this.imports = imports;
            this.classContext = classContext;

            this.name = "<init>";
            this.modifiers.add(Modifier.STATIC);

            if (ctx.access() == null) this.access = Access.PACKAGE_PRIVATE;
            else if (ctx.access().PUBLIC() != null) this.access = Access.PUBLIC;
            else if (ctx.access().PRIVATE() != null) this.access = Access.PRIVATE;
            else if (ctx.access().PROTECTED() != null) this.access = Access.PROTECTED;
            else this.access = Access.PACKAGE_PRIVATE;

            for (var param : ctx.parameters().parameter()) {
                parameters.add(imports.get(param.type().getText()));
            }

            this.returnType = Type.VOID;
        }

        public ImportContext getImports() {
            return imports;
        }

        public ClassContext getClassContext() {
            return classContext;
        }

        public String getName() {
            return name;
        }

        public List<Modifier> getModifiers() {
            return modifiers;
        }

        public Access getAccess() {
            return access;
        }

        public List<Type> getParameters() {
            return parameters;
        }

        public Type getReturnType() {
            return returnType;
        }
    }

    public static final class FieldContext {
        private final ImportContext imports;
        private final Type type;
        private final String name;
        private final Access access;
        private final boolean isFinal;
        private final boolean isStatic;

        public static FieldContext from(ImportContext imports, KatLanParser.ConstDefContext ctx) {
            return new FieldContext(imports, ctx);
        }

        public static FieldContext from(ImportContext imports, KatLanParser.VarDefContext ctx) {
            return new FieldContext(imports, ctx);
        }

        private FieldContext(ImportContext imports, KatLanParser.ConstDefContext ctx) {
            this.imports = imports;
            if (ctx.constDef0() == null) throw new IllegalArgumentException();

            var cd0 = ctx.constDef0();
            this.name = cd0.name().getText();
            this.type = imports.get(cd0.type().getText());
            if (ctx.access() == null) this.access = Access.PACKAGE_PRIVATE;
            else if (ctx.access().PUBLIC() != null) this.access = Access.PUBLIC;
            else if (ctx.access().PRIVATE() != null) this.access = Access.PRIVATE;
            else if (ctx.access().PROTECTED() != null) this.access = Access.PROTECTED;
            else this.access = Access.PACKAGE_PRIVATE;

            this.isFinal = true;
            this.isStatic = true;
        }

        private FieldContext(ImportContext imports, KatLanParser.VarDefContext ctx) {
            this.imports = imports;
            if (ctx.varDef0() == null) throw new IllegalArgumentException();

            var vd0 = ctx.varDef0();
            this.name = vd0.name().getText();
            this.type = imports.get(vd0.type().getText());
            if (ctx.access() == null) this.access = Access.PACKAGE_PRIVATE;
            else if (ctx.access().PUBLIC() != null) this.access = Access.PUBLIC;
            else if (ctx.access().PRIVATE() != null) this.access = Access.PRIVATE;
            else if (ctx.access().PROTECTED() != null) this.access = Access.PROTECTED;
            else this.access = Access.PACKAGE_PRIVATE;

            this.isFinal = ctx.access().FINAL() != null;
            this.isStatic = ctx.access().STATIC() != null;
        }

        public ImportContext getImports() {
            return imports;
        }

        public Type getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public Access getAccess() {
            return access;
        }

        public boolean isFinal() {
            return isFinal;
        }

        public boolean isStatic() {
            return isStatic;
        }
    }

    public static final class ImportContext {
        private final HashMap<String, Type> imports = new HashMap<>();

        public ImportContext(KatLanParser.ImportBlockContext ctx) {
            if (ctx.importStatement() != null && !ctx.importStatement().isEmpty()) {
                for (var import_ : ctx.importStatement()) {
                    String shortName;
                    String fullName = import_.name(0).NAME0().getText();
                    Type t = new Type.SimpleType(fullName);
                    if (import_.AS_KEYWORD() != null) {
                        shortName = import_.name(1).getText();
                    } else if (import_.name(0).dot_name() != null) {
                        shortName = import_.name(0).dot_name().NAME0().getLast().getText();
                    } else {
                        shortName = import_.name(0).NAME0().getText();
                    }
                    imports.put(shortName, t);
                }
            }
        }

        public Type get(String key) {
            return imports.get(key);
        }
    }

    private final HashMap<Type, ClassContext> classes = new HashMap<>();
    // ctx for compiler, must contain fields, methods, etc.

    private void init(KatLanParser.ClassContext ctx) {

    }

    public final ClassContext getContext(Type typeName) {
        return classes.get(typeName);
    }
}
