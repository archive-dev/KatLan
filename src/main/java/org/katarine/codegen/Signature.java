package org.katarine.codegen;

public class Signature {
    private final String signature;

    public Signature(String signature) {
        this.signature = signature;
    }

    public Signature() {
        this.signature = null;
    }

    public String getSignature() {
        return signature;
    }
}
