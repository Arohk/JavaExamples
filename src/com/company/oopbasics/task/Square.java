package com.company.oopbasics.task;

public class Square extends Shape {
    @Override
    Double getArea(double d) {
        return (d * d);
    }

    @Override
    Double getPerimeter(double d) {
        return (4 * d);
    }
}
