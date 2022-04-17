package com.company.methods;

import com.company.methods.MathOperations;

public class Calculator {

    public static void main(String[] args) {
        double[] numbers = {3.4, 6.6, 5};
        double sum = MathOperations.addition(numbers);
        System.out.println(sum);

        MathOperations myMath = new MathOperations();
        myMath.a = 6;
    }


}
