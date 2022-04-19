package com.company.oopbasics;

// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void numberOfSides();

    // Regular method
    void whatAmI() {
        System.out.println("I'm a shape.");
    }
}

// Subclass (inherit from Shape)
class Triangle extends Shape {
    public void numberOfSides() {
        // The body of Shape() is provided here
        System.out.println("I have 3 sides!");
    }
}

class MyShapeClass {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(); // Create a Triangle object
        myTriangle.numberOfSides();
        myTriangle.whatAmI();
    }
}
