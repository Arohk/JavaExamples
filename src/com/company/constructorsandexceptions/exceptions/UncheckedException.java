package com.company.constructorsandexceptions.exceptions;

public class UncheckedException {

    static String nullPointer(){
        String one = null;
        return one;
    }
    public static void main(String[] args) {
        System.out.println(nullPointer().length());
    }
}
