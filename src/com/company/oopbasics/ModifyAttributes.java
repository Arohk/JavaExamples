package com.company.oopbasics;

class ClassExample {

    int x;

     void printName(){
        System.out.println("I'm a static method");
    }

    public static void main(String[] args) {
        ClassExample myClassExample = new ClassExample();
        myClassExample.printName();
    }

}

