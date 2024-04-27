package org.katarine.katlan.lib;

import java.util.ArrayList;

abstract class FieldHandleable extends Handleable {
    @FunctionalInterface
    public interface PreHandler extends Handler {
        void handle(Object caller);
    }

    @FunctionalInterface
    public interface PostHandler extends Handler {
        void handle(Object caller, Object returned);
    }

    public final ArrayList<PreHandler> preSetHandlers = new ArrayList<>();
    public final ArrayList<PostHandler> postSetHandlers = new ArrayList<>();

    public final ArrayList<PreHandler> preGetHandlers = new ArrayList<>();
    public final ArrayList<PostHandler> postGetHandlers = new ArrayList<>();
}
