package org.katarine.katlan.compiler;

import com.google.common.reflect.ClassPath;
import org.antlr.v4.runtime.*;
import org.cojen.maker.ClassMaker;
import org.cojen.maker.FieldMaker;
import org.katarine.katlan.compiler.antlr4.KatLanLexer;
import org.katarine.katlan.compiler.antlr4.KatLanParser;
import org.katarine.katlan.compiler.visitors.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        imports.put("KLPackage", Package.class);
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
                    .forEach(c -> imports.put(c.getSimpleName(), c));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final HashMap<String, FieldMaker> fields = new HashMap<>();
    public String package_;

    public static void main(String[] args) throws IOException {
        for (var f : args) {
            new Compiler().compile(f);
        }
    }

    public void compile(String fileName) throws IOException {
        CharStream cs = CharStreams.fromFileName(fileName);
        KatLanLexer klx = new KatLanLexer(cs);
        CommonTokenStream cts = new CommonTokenStream(klx);
        KatLanParser klp = new KatLanParser(cts);

        KatLanParser.ClassContext cc = klp.class_();
        ParserRuleContext r = new KLClassVisitor().visitClass(cc);
        String className = extractClassName(fileName);
        String packagePath = new KLPackageVisitor().visit(cc.package_());
        File output = prepareOutputFile(packagePath, className, r);

        try (URLClassLoader loader = new URLClassLoader(new URL[]{output.getParentFile().toURI().toURL()})) {
            ClassMaker cm = setupClassMaker(loader, packagePath, className, r);
            handleImportsAndFields(cm, cc);
            handleMethods(cm, r);
            writeClassToFile(cm, output);
        }
    }

    private String extractClassName(String fileName) {
        String className = fileName.substring(0, fileName.lastIndexOf('.'));
        className = className.substring(className.lastIndexOf('/') + 1);
        return Character.toUpperCase(className.charAt(0)) + className.substring(1);
    }

    private File prepareOutputFile(String packagePath, String className, ParserRuleContext r) throws IOException {
        className = resolveClassName(r, className);

        String path = packagePath.replace(".", "/") + "/" + className + ".class";
        File output = new File(path);
        if (!output.getParentFile().exists() && !output.getParentFile().mkdirs()) {
            throw new IOException("Failed to create output directory.");
        }
        return output;
    }

    private ClassMaker setupClassMaker(URLClassLoader loader, String packagePath, String className, ParserRuleContext r) {
        String superName = "obj"; // default superclass
        className = resolveClassName(r, className);

        ClassMaker cm = ClassMaker.beginExplicit(packagePath + "." + className, loader, null).public_();
        if (r instanceof KatLanParser.ClassDefContext && ((KatLanParser.ClassDefContext) r).ABSTRACT_KEYWORD() != null) {
            cm.abstract_();
        } else if (r instanceof KatLanParser.InterfaceDefContext) {
            cm.interface_();
        }
        return cm;
    }

    private String resolveClassName(ParserRuleContext r, String className) {
        if (r instanceof KatLanParser.ClassDefContext) {
            return ((KatLanParser.ClassDefContext) r).name(0).getText();
        } else if (r instanceof KatLanParser.InterfaceDefContext) {
            return ((KatLanParser.InterfaceDefContext) r).name(0).getText();
        }
        return className;
    }

    private void handleImportsAndFields(ClassMaker cm, KatLanParser.ClassContext r) {
        KLImportVisitor importVisitor = new KLImportVisitor(cm);
        imports.putAll(importVisitor.visit(r.importBlock()));
        KLFieldsVisitor fieldsVisitor = new KLFieldsVisitor(cm, this);
        fields.putAll(fieldsVisitor.visit(r));
    }

    private void handleMethods(ClassMaker cm, ParserRuleContext r) {
        KLMethodDefVisitor methodVisitor = new KLMethodDefVisitor(cm, this);
        methodVisitor.visit(r);
    }

    private void writeClassToFile(ClassMaker cm, File output) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(output)) {
            cm.finishTo(fos);
        }
    }

    private ArrayList<Object> getClasses(List<String> names) {
        ArrayList<Object> ret = new ArrayList<>();
        try {
            for (String name : names) {
                Object o = imports.get(name);
                if (o == null)
                    throw new ClassNotFoundException("Class not found: " + name);
                ret.add(o);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ret;
    }
}
