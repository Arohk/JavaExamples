package com.company.oopbasics;

// Interface
interface Vehicles {
    // interface method (does snot have a body)
    void changeGear(int a);

    // interface method (does not have a body)
    void speedUp(int a);
}

// Bicycle "implements" the Vehicle interface
class Bicycle implements Vehicles {

    @Override
    public void changeGear(int a) {
        System.out.println("Current Bicycle gear is " + a);
    }

    @Override
    public void speedUp(int a) {
        System.out.println("Current Bicycle speed is " + a);
    }
}

class MyVehiclesClass {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.changeGear(27);
        myBicycle.speedUp(30);
    }
}
