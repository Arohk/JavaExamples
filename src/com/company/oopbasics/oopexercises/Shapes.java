package com.company.oopbasics.oopexercises;

abstract class Shapes {

    String color;
    Boolean isFilled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    abstract Double getArea();

    abstract Double getPerimeter();

}





