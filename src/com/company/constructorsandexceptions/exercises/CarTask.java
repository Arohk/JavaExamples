package com.company.constructorsandexceptions.exercises;

public class CarTask {
    String carName;
    String carColor;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    public CarTask(String carName, String carColor, int releaseYear, int horsePower, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public CarTask(String carName, String carColor, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.secondHand = secondHand;
        releaseYear = -1;
        horsePower = -1;
    }

    public CarTask(String carName, String carColor, int releaseYear, int horsePower) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        secondHand = false;
    }

    public CarTask(String carName, int releaseYear, int horsePower, boolean secondHand) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
        carColor = "N/A";
    }

    public CarTask() {
    }

    public static void main(String[] args) {
        CarTask myMazdaCar = new CarTask("Mazda", "Red", true);
        CarTask myFordCar = new CarTask("Ford", "Blue", 2005, 120);
        System.out.println(myMazdaCar.carColor);
        System.out.println(myFordCar.secondHand);
    }
}
