package com.company.oopbasics;

class MyCarClass {
    private String brand;
    private int speed;

    public MyCarClass(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public MyCarClass(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

class MySecondCar extends MyCarClass{

    public MySecondCar(String brand, int speed) {
        super(brand, speed);
    }


    public static void main(String[] args) {
        MySecondCar myCar = new MySecondCar("Mazda", 50);
        myCar.getSpeed();
    }


}
