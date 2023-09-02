package org.StacksExample;

public class ArrayStackGenerics <T>  {

    int index = -1; // initial top of stack
    T [] stackData = (T[]) new Object[100];



    public void push(T element) throws FullStackException {
        if (index >= 100) {
            throw new FullStackException();
        } else {
            stackData[++index] = element;
        }
    }


    public T pop() throws EmptyStackException {
        if (index < 0) {
            throw new EmptyStackException();
        } else {
            T temp = stackData[index];
            stackData[index--] = null;
            return temp;
        }
    }


    public T peek() throws EmptyStackException {
        if (index < 0) {
            throw new EmptyStackException();
        } else {

            return stackData[index];
        }


    }


    public boolean isEmpty() {
        if (index < 0) {
            return true;
        } else {
            return false;
        }

    }


}
