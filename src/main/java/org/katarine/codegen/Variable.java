package org.katarine.codegen;

import org.objectweb.asm.MethodVisitor;

import java.util.function.Consumer;

public class Variable { // todo: all ways to call method or do smth else should refer to this class or it's inheritors
    private final Type type;
    private final String name;

    private final CodeScope ownerScope;
    private final Method method;

    private final int index;

    public Variable(Type type, String name, CodeScope ownerScope, Method method, int index) {
        this.type = type;
        this.name = name;
        this.ownerScope = ownerScope;
        this.method = method;
        this.index = index;
    }

    public Variable set(Object value) {
        Consumer<MethodVisitor> setter = (mv) -> {
            mv.visitLdcInsn(value);
            mv.visitVarInsn(this.type.getLoadCode(), index);
        };
        method.addInsn(setter);
        return this;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public CodeScope getOwnerScope() {
        return ownerScope;
    }
}
