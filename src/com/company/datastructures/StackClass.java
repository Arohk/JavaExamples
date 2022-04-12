package com.company.datastructures;

import java.util.Stack;

public class StackClass {
    public static void main(String args[])
    {
        Stack<String> elements = new Stack<>();

        // Pushing new items to the Stack
        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println(elements);
        elements.pop();
        elements.push("Test5");
        System.out.println("Stack => " + elements);

    }

}
