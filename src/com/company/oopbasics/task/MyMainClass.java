package com.company.oopbasics.task;

import java.util.Scanner;

public class MyMainClass {
    public static void main(String[] args) {

        Circle s1 = new Circle();
        System.out.println(s1.getArea(3.0));
        System.out.println(s1.getPerimeter(6.0));

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println(s2.getArea(3.0));
        System.out.println(s2.getPerimeter(6.0));

        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s2.getPerimeter(5.0));

//        Square s4 = new Shape();

        Square s5 = new Square();
        System.out.println(s5.getArea(4.0));
        System.out.println(s5.getPerimeter(4.0));

    }
}
