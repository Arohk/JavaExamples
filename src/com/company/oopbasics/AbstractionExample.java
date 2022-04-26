package com.company.oopbasics;

import java.util.ArrayList;
import java.util.List;

interface MyInterface{
    void myMethod();
}
// Abstract class
abstract class Shape implements MyInterface{
    // Abstract method (does not have a body and their implementation is provided later on)
    abstract void numberOfSides();

    // Regular method
    void whatAmI() {
        System.out.println("I'm a shape.");
    }
}

// Subclass (inherit from Shape)
class Triangle extends Shape {

    @Override
    void numberOfSides() {
        System.out.println("I have 3 sides!");
    }

    @Override
    public void myMethod() {

    }
}

class MyShapeClass {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(); // Create a Triangle object
        myTriangle.numberOfSides();
        myTriangle.whatAmI();
    }

}
