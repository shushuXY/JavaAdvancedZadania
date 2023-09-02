package org.StacksExample;

public class Tuple <T> {

    T left;
    T right;


    public Tuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
