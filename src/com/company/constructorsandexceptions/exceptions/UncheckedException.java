package com.company.constructorsandexceptions.exceptions;

public class UncheckedException {
    static void divisionByZero(){
        try {
            System.out.println(2 / 0);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    static String nullPointer(){
        String one = null;
        return one;
    }
    public static void main(String[] args) {
//        divisionByZero();
        System.out.println(nullPointer().length());
    }
}
