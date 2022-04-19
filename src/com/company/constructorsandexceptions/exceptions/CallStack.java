package com.company.constructorsandexceptions.exceptions;

class NestedExceptionsExample {
    public static void throwit() {
        System.out.println("throwit");
        throw new RuntimeException();
    }

    public static void notThrowit() {
        throwit();
    }

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            notThrowit();
        } catch (RuntimeException e) {
            System.out.println("caught");
        } finally {
            System.out.println("finally");
        }

        System.out.println("after out of finally block");

    }
}


