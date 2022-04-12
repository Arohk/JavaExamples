package com.company;

public class ArraySimpleExample {
    public static void main(String[] args) {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};


        for (String name : carBrands) {
            System.out.println(name);
        }

        for (int i = 0; i < carBrands.length; i++) {
            System.out.println(carBrands[i]);
        }
    }


}
