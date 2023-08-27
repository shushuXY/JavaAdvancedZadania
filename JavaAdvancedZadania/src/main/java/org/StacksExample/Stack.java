package org.StacksExample;

import java.util.ArrayList;
import java.util.List;

public interface Stack  {


    public void push(String string) throws FullStackException;

    public void pop();

    public void peek();

    public void isEmpty();




}
