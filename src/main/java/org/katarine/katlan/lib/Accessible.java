package org.katarine.katlan.lib;

import java.io.Serializable;

public interface Accessible extends Serializable {
    Access access();
    void checkAccess(Object caller) throws IllegalAccessException;
}
