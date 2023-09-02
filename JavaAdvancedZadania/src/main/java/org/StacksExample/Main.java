package org.StacksExample;

public class Main {

    public static void main(String[] args) throws FullStackException, EmptyStackException {

        ArrayStack myStack = new ArrayStack();
        ArrayStackInteger stackInteger = new ArrayStackInteger();
        ArrayStackGenerics stackGenerics = new ArrayStackGenerics<String>();

        //testing push
        for (int i = 0 ; i<10; i++){
            myStack.push("Element tablicy nr: " + i);
        }

        //testing peek
        System.out.println(myStack.peek());

        //testing is empty
        System.out.println(myStack.isEmpty());

        //testing pop
        for (int i =0; i<10; i++) {
            System.out.println(myStack.pop());
        }

        //is empty check
        System.out.println(myStack.isEmpty());




        //testing push
        for (int i = 0 ; i<10; i++){
            stackInteger.push( i);
        }

        //testing peek
        System.out.println(stackInteger.peek());

        //testing is empty
        System.out.println(stackInteger.isEmpty());

        //testing pop
        for (int i =0; i<10; i++) {
            System.out.println(stackInteger.pop());
        }

        //is empty check
        System.out.println(stackInteger.isEmpty());







    }



}
