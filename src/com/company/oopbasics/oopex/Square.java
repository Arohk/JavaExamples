package com.company.oopbasics.oopex;

public class Square extends Shape{

    @Override
    Double getArea(double d) {
        return d * 2;
    }

    @Override
    Double getPerimeter(double d) {
        return d * 4;
    }
}
