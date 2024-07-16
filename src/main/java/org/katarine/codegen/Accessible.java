package org.katarine.codegen;

public interface Accessible {
    boolean isStatic();
    boolean isFinal();
    boolean isPublic();
    boolean isPrivate();
    boolean isProtected();
    boolean isAbstract();

    <T extends Accessible> T static_();
    <T extends Accessible> T final_();
    <T extends Accessible> T public_();
    <T extends Accessible> T private_();
    <T extends Accessible> T protected_();
    <T extends Accessible> T abstract_();
}
