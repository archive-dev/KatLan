package org.katarine.katlan.lib.struct;

public sealed interface Either<A, B> {
    boolean isLeft();
    boolean isRight();

    A left();
    B right();

    record Left<A, B>(A left) implements Either<A, B> {
        @Override
        public boolean isLeft() {
            return true;
        }

        @Override
        public boolean isRight() {
            return false;
        }

        @Override
        public B right() {
            return null;
        }
    }

    record Right<A, B>(B right) implements Either<A, B> {
        @Override
        public boolean isLeft() {
            return false;
        }

        @Override
        public boolean isRight() {
            return true;
        }

        @Override
        public A left() {
            return null;
        }
    }
}