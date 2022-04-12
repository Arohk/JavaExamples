package com.company.methods;

public class MethodParameters {
    static void myMethod(String userName) {
        System.out.println(userName + ", Hello!");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anna");
        myMethod("Pesho");
    }

}
