package com.company.constructorsandexceptions.exceptions;

public class CustomException {
    public static void main(String[] args) throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {

    // Constructor 1
    public MyException(String errorMessage){
        super(errorMessage);
    }

    // Constructor 2
    public MyException() {
        System.out.println("Default exception message.");
    }
}

