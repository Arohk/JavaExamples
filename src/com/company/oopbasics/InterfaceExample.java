package com.company.oopbasics;

// Interface
interface Vehicles {

    // interface method (does snot have a body)
    void changeGear(int a);

    // interface method (does not have a body)
    void speedUp(int a);
    // interface method (does not have a body)
}

// Bicycle "implements" the Vehicle interface
class Bicycle implements Vehicles {

    // The body of changeGear() is provided here
    public void changeGear(int a) {
        System.out.println("gear is: " + a);
    }

    // The body of speedUp() is provided here
    public void speedUp(int a) {
        System.out.println("speed is: " + a);
    }
}

class MyVehiclesClass {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.changeGear(27);
        myBicycle.speedUp(30);
    }
}
