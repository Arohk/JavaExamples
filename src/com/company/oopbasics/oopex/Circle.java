package com.company.oopbasics.oopex;

public class Circle extends Shape {
    @Override
    Double getArea(double d) {
        return (Math.PI * Math.pow(d, 2));
    }

    @Override
    Double getPerimeter(double d) {
        return (Math.PI * 2 * d);
    }
}
