package com.company.oopbasics.oopexercises;

public class Form extends Shapes{

    Double side;

    public Form(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    Double getArea() {
        return null;
    }

    @Override
    Double getPerimeter() {
        return side * 10;
    }
}
