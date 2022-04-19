package com.company.oopbasics.oopexercises;

class Circle extends Shapes {

    Double radius;
    String color;
    Boolean isFilled;

    public Circle(Double radius, String color, Boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    @Override
    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    @Override
    Double getArea() {
        return (Math.PI  * Math.pow(radius, 2));
    }

    @Override
    Double getPerimeter() {
        return (Math.PI * 2 * radius);
    }
}
