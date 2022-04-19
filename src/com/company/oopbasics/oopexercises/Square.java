package com.company.oopbasics.oopexercises;

class Square extends Shapes {

    Double side;
    String color;
    Boolean isFilled;

    public Square(Double side, String color, Boolean isFilled) {
        this.side = side;
        this.color = color;
        this.isFilled = isFilled;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    @Override
    Double getArea() {
        return side * side;
    }

    @Override
    Double getPerimeter() {
        return side * 4;
    }
}