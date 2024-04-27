package org.katarine.katlan.lib.annotations;


import org.katarine.katlan.compiler.internal.MethodCall;

@Target({Target.KLTarget.METHOD_CALL, Target.KLTarget.METHOD})
public class AnnotationExample extends KLAnnotation {
    public AnnotationExample(KLAnnotatedElement annotatedObject) {
        super(annotatedObject);
    }

    @Annotations.BeforeMethodCall
    public void print() {
        System.out.println(((MethodCall) annotatedObject).ml.methodName);
    }

    @Annotations.OnMethodInit
    public void init() {
        System.out.println("init");
    }
}
