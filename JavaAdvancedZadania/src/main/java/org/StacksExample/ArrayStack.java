package org.StacksExample;

public class ArrayStack implements Stack  {

    int index = 0;
    String[] stackData = new String[100];


    @Override
    public void push(String string) throws FullStackException {
        if (index < 100) {
            stackData[index] = string;
            index++;
        } else {
            throw new FullStackException();
        }
    }

    @Override
    public void pop() {

        System.out.println(stackData[index]);
        stackData[index] = null;

    }

    @Override
    public void peek() {

    }

    @Override
    public void isEmpty() {

    }


}
