package com.company.oopbasics;

class Vehicle {
    String brand;
    String model;
    double length;
    double width;
    double weight;
    int horsePower;
    int maxSpeed;

    Vehicle(String brand, String model, double length, double width, double weight) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    protected void honk() {
        System.out.println("beep beep");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    Car(String brand, String model, double length, double width, double weight, int numberOfDoors) {
        super(brand, model, length, width, weight);
        this.numberOfDoors = numberOfDoors;
    }

    private boolean doorClosed = true;

    public void closeOpenDoor() {
        this.doorClosed = !doorClosed;

        if (this.doorClosed) {
            System.out.println("The door is closed");
        } else {
            System.out.println("The door is opened");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Rav4", 4.4, 1.5, 2, 4);
        c.closeOpenDoor();
        c.honk();
    }
}


