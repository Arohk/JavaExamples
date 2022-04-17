package com.company.constructorsandexceptions;

public class StackOverflow {

    // method of this class
    public static void test(int i) {
        // No correct as base condition leads to
        // non-stop recursion.
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }

    public static void main(String[] args) {
        test(5);
    }
}

