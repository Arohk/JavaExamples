package com.company.oopbasics;

class Addition {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two numbers :" + c);
    }

    void sum(int a, int b, int e) {
        int c = a + b + e;
        System.out.println("Addition of three numbers :" + c);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum(30, 15);
        obj.sum(10, 20, 50);
    }
}