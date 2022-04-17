package com.company.constructorsandexceptions.exercises;

public class Car {
    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    Car(String color, boolean secondHand) {
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public static void main(String[] args) {
        Car myMazdaCar = new Car("Mazda", "Red", 2005, 130, true);
        System.out.println(myMazdaCar.color);
    }

}
