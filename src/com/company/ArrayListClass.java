package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));

        Collections.shuffle(cars);
        System.out.println(cars);
    }
}
