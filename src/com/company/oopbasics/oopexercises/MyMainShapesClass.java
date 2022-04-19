package com.company.oopbasics.oopexercises;

public class MyMainShapesClass {
    public static void main(String[] args) {
        Shapes s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
//        System.out.println(s1);
//        System.out.println(s1.getColor());
//        System.out.println(s1.getPerimeter());
//        System.out.println(s1.getFilled());
//        System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1; // Downcast back to Circle
//        System.out.println(c1);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.getColor());
//        System.out.println(c1.getFilled());
//        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // Abstract class cannot be instantiated

        Shapes s3 = new Rectangle(4.3, 5.7); // Upcast
//        System.out.println(s3);
//        System.out.println(s3.getArea());
//        System.out.println(s3.getPerimeter());
//        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3; //Downcast
//        System.out.println(r1.getArea());

        Shapes s4 = new Square(6.6, "red", true); // Upcast Square to shape
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());
    }
}
