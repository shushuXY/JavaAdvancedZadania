package org.StacksExample;

public class Tuple<T> implements Comparable<T> {
    T left;
    T right;

    public Tuple() {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }


    @Override
    public int compareTo(T t) {
    return Integer.compare((Integer) this.left, (Integer) this.right);
    }
}
