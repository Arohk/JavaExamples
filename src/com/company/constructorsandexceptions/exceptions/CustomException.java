package com.company.constructorsandexceptions.exceptions;

public class CustomException {
    public static void main(String[] args) throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {
    public MyException(String errorMessage){
        super(errorMessage);
    }

    public MyException() {
        System.out.println("Default exception message.");
    }
}

