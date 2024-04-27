package org.katarine.katlan.lib;

public interface Accessible {
    Access access();
    void checkAccess(Object caller) throws IllegalAccessException;
}
