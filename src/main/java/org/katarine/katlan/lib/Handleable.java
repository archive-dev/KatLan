package org.katarine.katlan.lib;

import java.util.ArrayList;

abstract class Handleable {
    @FunctionalInterface
    public interface PreHandler extends Handler {
        void handle(Object caller, Object... args);
    }

    @FunctionalInterface
    public interface PostHandler extends Handler {
        void handle(Object caller, Object returned, Object... args);
    }

    public final ArrayList<PreHandler> preHandlers = new ArrayList<>();
    public final ArrayList<PostHandler> postHandlers = new ArrayList<>();
}
