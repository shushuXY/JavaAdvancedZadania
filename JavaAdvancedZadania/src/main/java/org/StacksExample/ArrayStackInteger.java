package org.StacksExample;

public class ArrayStackInteger implements StackInteger {

    int index = -1; // initial top of stack
    Integer[] stackData = new Integer[100];


    @Override
    public void push(Integer element) throws FullStackException {
        if (index >= 100) {
            throw new FullStackException();
        } else {
            stackData[++index] = element;
        }
    }

    @Override
    public Integer pop() throws EmptyStackException {
        if (index < 0) {
            throw new EmptyStackException();
        } else {
            Integer temp = stackData[index];
            stackData[index--] = null;
            return temp;
        }
    }

    @Override
    public Integer peek() throws EmptyStackException {
        if (index < 0) {
            throw new EmptyStackException();
        } else {

            return stackData[index];
        }


    }

    @Override
    public boolean isEmpty() {
        if (index < 0) {
            return true;
        } else {
            return false;
        }

    }


}
