package com.company.oopbasics.oopexercises;

public class Rectangle extends Shapes{
    private Double sideA;
    private Double sideB;

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    @Override
    Double getArea() {
        return (sideA * sideB);
    }

    @Override
    Double getPerimeter() {
        return (sideA * 2 + sideB * 2);
    }
}
