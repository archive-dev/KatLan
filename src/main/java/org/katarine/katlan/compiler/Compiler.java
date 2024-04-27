package org.katarine.katlan.compiler;

import com.google.common.reflect.ClassPath;
import org.katarine.katlan.compiler.antlr4.KatLanLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;
import org.katarine.katlan.compiler.antlr4.KatLanParser;
import org.katarine.katlan.compiler.visitors.*;
import org.katarine.katlan.lib.ClassLink;
import org.katarine.katlan.lib.annotations.AnnotationExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Compiler {
    public final HashMap<String, Object> imports = new HashMap<>();
    {
        imports.put("obj",    Object.class);
        imports.put("str",    String.class);
        imports.put("float",  float.class);
        imports.put("int",    int.class);
        imports.put("void",   void.class);
        imports.put("null",   void.class);
        imports.put("bool",   boolean.class);
        imports.put("byte",   byte.class);
        imports.put("char",   char.class);
        imports.put("short",  short.class);
        imports.put("long",   long.class);
        imports.put("double", double.class);
        imports.put("System", System.class);

        imports.put("AbstractMethodError", AbstractMethodError.class);
        imports.put("Appendable", Appendable.class);
        imports.put("ArithmeticException", ArithmeticException.class);
        imports.put("ArrayIndexOutOfBoundsException", ArrayIndexOutOfBoundsException.class);
        imports.put("ArrayStoreException", ArrayStoreException.class);
        imports.put("AssertionError", AssertionError.class);
        imports.put("AutoCloseable", AutoCloseable.class);
        imports.put("Boolean", Boolean.class);
        imports.put("BootstrapMethodError", BootstrapMethodError.class);
        imports.put("Byte", Byte.class);
        imports.put("Character", Character.class);
        imports.put("CharSequence", CharSequence.class);
        imports.put("Class", Class.class);
        imports.put("ClassCastException", ClassCastException.class);
        imports.put("ClassCircularityError", ClassCircularityError.class);
        imports.put("ClassFormatError", ClassFormatError.class);
        imports.put("ClassLoader", ClassLoader.class);
        imports.put("ClassNotFoundException", ClassNotFoundException.class);
        imports.put("ClassValue", ClassValue.class);
        imports.put("Cloneable", Cloneable.class);
        imports.put("CloneNotSupportedException", CloneNotSupportedException.class);
        imports.put("Comparable", Comparable.class);
        imports.put("Compiler", Compiler.class);
        imports.put("Deprecated", Deprecated.class);
        imports.put("Double", Double.class);
        imports.put("Enum", Enum.class);
        imports.put("EnumConstantNotPresentException", EnumConstantNotPresentException.class);
        imports.put("Error", Error.class);
        imports.put("Exception", Exception.class);
        imports.put("ExceptionInInitializerError", ExceptionInInitializerError.class);
        imports.put("Float", Float.class);
        imports.put("FunctionalInterface", FunctionalInterface.class);
        imports.put("IllegalAccessError", IllegalAccessError.class);
        imports.put("IllegalAccessException", IllegalAccessException.class);
        imports.put("IllegalArgumentException", IllegalArgumentException.class);
        imports.put("IllegalCallerException", IllegalCallerException.class);
        imports.put("IllegalMonitorStateException", IllegalMonitorStateException.class);
        imports.put("IllegalStateException", IllegalStateException.class);
        imports.put("IllegalThreadStateException", IllegalThreadStateException.class);
        imports.put("IncompatibleClassChangeError", IncompatibleClassChangeError.class);
        imports.put("IndexOutOfBoundsException", IndexOutOfBoundsException.class);
        imports.put("InheritableThreadLocal", InheritableThreadLocal.class);
        imports.put("InstantiationError", InstantiationError.class);
        imports.put("InstantiationException", InstantiationException.class);
        imports.put("Integer", Integer.class);
        imports.put("InternalError", InternalError.class);
        imports.put("InterruptedException", InterruptedException.class);
        imports.put("Iterable", Iterable.class);
        imports.put("LayerInstantiationException", LayerInstantiationException.class);
        imports.put("LinkageError", LinkageError.class);
        imports.put("Long", Long.class);
        imports.put("Math", Math.class);
        imports.put("Module", Module.class);
        imports.put("ModuleLayer", ModuleLayer.class);
        imports.put("NegativeArraySizeException", NegativeArraySizeException.class);
        imports.put("NoClassDefFoundError", NoClassDefFoundError.class);
        imports.put("NoSuchFieldError", NoSuchFieldError.class);
        imports.put("NoSuchFieldException", NoSuchFieldException.class);
        imports.put("NoSuchMethodError", NoSuchMethodError.class);
        imports.put("NoSuchMethodException", NoSuchMethodException.class);
        imports.put("NullPointerException", NullPointerException.class);
        imports.put("Number", Number.class);
        imports.put("NumberFormatException", NumberFormatException.class);
        imports.put("Object", Object.class);
        imports.put("OutOfMemoryError", OutOfMemoryError.class);
        imports.put("Override", Override.class);
        imports.put("Package", Package.class);
        imports.put("Process", Process.class);
        imports.put("ProcessBuilder", ProcessBuilder.class);
        imports.put("ProcessHandle", ProcessHandle.class);
        imports.put("Readable", Readable.class);
        imports.put("Record", Record.class);
        imports.put("ReflectiveOperationException", ReflectiveOperationException.class);
        imports.put("Runnable", Runnable.class);
        imports.put("Runtime", Runtime.class);
        imports.put("RuntimeException", RuntimeException.class);
        imports.put("RuntimePermission", RuntimePermission.class);
        imports.put("SafeVarargs", SafeVarargs.class);
        imports.put("SecurityException", SecurityException.class);
        imports.put("Short", Short.class);
        imports.put("StackOverflowError", StackOverflowError.class);
        imports.put("StackTraceElement", StackTraceElement.class);
        imports.put("StackWalker", StackWalker.class);
        imports.put("StrictMath", StrictMath.class);
        imports.put("String", String.class);
        imports.put("StringBuffer", StringBuffer.class);
        imports.put("StringBuilder", StringBuilder.class);
        imports.put("StringIndexOutOfBoundsException", StringIndexOutOfBoundsException.class);
        imports.put("SuppressWarnings", SuppressWarnings.class);
        imports.put("Thread", Thread.class);
        imports.put("ThreadGroup", ThreadGroup.class);
        imports.put("ThreadLocal", ThreadLocal.class);
        imports.put("Throwable", Throwable.class);
        imports.put("TypeNotPresentException", TypeNotPresentException.class);
        imports.put("UnknownError", UnknownError.class);
        imports.put("UnsatisfiedLinkError", UnsatisfiedLinkError.class);
        imports.put("UnsupportedClassVersionError", UnsupportedClassVersionError.class);
        imports.put("UnsupportedOperationException", UnsupportedOperationException.class);
        imports.put("VerifyError", VerifyError.class);
        imports.put("VirtualMachineError", VirtualMachineError.class);
        imports.put("Void", Void.class);
        imports.put("print", "System.out.println");

        try {
            ClassPath.from(ClassLoader.getSystemClassLoader())
                    .getAllClasses()
                    .stream().filter(c -> c.getPackageName().startsWith("org.katarine.katlan.lib") || c.getPackageName().startsWith("org.katarine.compiler"))
                    .forEach(c -> {
                        imports.put(c.getSimpleName(), c);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        imports.put("AnnotationExample", AnnotationExample.class);
    }

    public final HashMap<String, FieldMaker> fields = new HashMap<>();
    public String package_;
    public ClassLink classLink;

    public static void main(String[] args) throws IOException {
        for (var f : args) {
            new Compiler().compile(f);
        }
    }

    public void compile(String fileName) throws IOException {
        CharStream cs;

        cs = CharStreams.fromFileName(fileName);
        KatLanLexer klx = new KatLanLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(klx);
        KatLanParser klp = new KatLanParser(cts);

        KatLanParser.ClassContext cc = klp.class_();
        var ibc = cc.importBlock();
        var pc = cc.package_();
        package_ = new KLPackageVisitor().visit(pc);
        imports.putAll(new KLImportVisitor().visit(ibc));
        ParserRuleContext r = new KLClassVisitor().visitClass(cc);
        String className = fileName.substring(0, fileName.lastIndexOf('.'));
        className = className.substring(0, 1).toUpperCase() + className.substring(1);
        className = className.substring(className.indexOf("/")+1);
        ClassMaker cm;

        if (r instanceof KatLanParser.ClassDefContext) {
            System.out.println("compiling class");
            className = ((KatLanParser.ClassDefContext) r).name(0).getText();
            cm = ClassMaker.beginExternal(className).extend(Object.class).public_();
            imports.put(cm.name(), cm);
            cm.addConstructor().public_();
            fields.putAll( new KLFieldsVisitor(cm, this).visitClassDef((KatLanParser.ClassDefContext) r));
            if (((KatLanParser.ClassDefContext) r).ABSTRACT_KEYWORD() != null) cm.abstract_();

            new KLMethodDefVisitor(cm, this).visitClassDef((KatLanParser.ClassDefContext) r);
        } else if (r instanceof KatLanParser.UnnamedClassDefContext) {
            System.out.println("compiling unnamed class");
            cm = ClassMaker.beginExternal(className).public_();
            imports.put(cm.name(), cm);
            cm.addConstructor();
            fields.putAll(new KLFieldsVisitor(cm, this).visitUnnamedClassDef((KatLanParser.UnnamedClassDefContext) r));

            new KLMethodDefVisitor(cm, this).visitUnnamedClassDef((KatLanParser.UnnamedClassDefContext) r);
        } else {
            System.out.println("compiling interface");
            className = ((KatLanParser.InterfaceDefContext) r).name(0).getText();
            cm = ClassMaker.beginExternal(className).public_().interface_();
            imports.put(cm.name(), cm);
            fields.putAll(new KLFieldsVisitor(cm, this).visitInterfaceDef((KatLanParser.InterfaceDefContext) r));
            cm.interface_();
            new KLMethodDefVisitor(cm, this).visitInterfaceDef((KatLanParser.InterfaceDefContext) r);
        }

        StringBuilder pathBuilder = new StringBuilder();
        for (int i = 0; i < fileName.split("/").length-1; i++) {
            pathBuilder.append(fileName.split("/")[i]).append("/");
        }
        System.out.println(pathBuilder);
        pathBuilder.append(cm.name()).append(".class");
        System.out.println(pathBuilder);
        File output = new File(pathBuilder.toString());
        try (FileOutputStream fos = new FileOutputStream(output)) {
            cm.finishTo(fos);
        }

//        ClassMaker cm = ClassMaker.beginExternal().public_();
//        MethodMaker mm = cm.addMethod(null, "main", String[].class);

//        mm = mm.public_().static_();
    }
}
