package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String args[]){
        List<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }

}
