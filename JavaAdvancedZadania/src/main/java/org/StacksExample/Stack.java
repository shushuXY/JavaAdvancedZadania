package org.StacksExample;

import java.util.ArrayList;
import java.util.List;

public interface Stack  {


    public void push(String string) throws FullStackException;

    public String pop() throws EmptyStackException;

    public String peek() throws EmptyStackException;

    public boolean isEmpty();




}
