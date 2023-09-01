package org.StacksExample;

public interface StackInteger {


    public void push(Integer integer) throws FullStackException;

    public Integer pop() throws EmptyStackException;

    public Integer peek() throws EmptyStackException;

    public boolean isEmpty();




}
