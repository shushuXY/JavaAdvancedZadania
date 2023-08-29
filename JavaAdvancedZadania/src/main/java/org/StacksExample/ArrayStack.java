package org.StacksExample;

public class ArrayStack implements Stack {

    int index = -1; // initial top of stack
    String[] stackData = new String[100];


    @Override
    public void push(String element) throws FullStackException {
        if (index >= 100) {
            throw new FullStackException();
        } else {
            stackData[++index] = element;
        }
    }

    @Override
    public String pop() throws EmptyStackException {
        if (index < 0) {
            throw new EmptyStackException();
        } else {
            String temp = stackData[index];
            stackData[index--] = null;
            return temp;
        }
    }

    @Override
    public String peek() throws EmptyStackException {
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
