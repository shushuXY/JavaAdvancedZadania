package org.StacksExample;

public class GenericTableClass<T> {

    int buffer = 5;
    T[] myTable = (T[]) new Object[buffer];

    public void print() {

        for (int i = 0; i < buffer; i++) {
            System.out.println(myTable[i]);
        }
    }

}
