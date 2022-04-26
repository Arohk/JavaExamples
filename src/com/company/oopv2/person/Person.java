package com.company.oopv2.person;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String language;
    private String job;
    private final String nationality;
    private final String EGN;
    private final int dateOfBirth;
    private final int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String EGN, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = String.valueOf(addEGN());
        this.countryOfResidence = countryOfResidence;

        // TODO: Add date of birth and age logic based on EGN numbers.
        this.dateOfBirth = 0;
        this.age = 0;

        // TODO: IF WRONG SEX IS PROVIDED - CONTINUE PROGRAM AND PRINT RELEVANT MESSAGE.

    }

    public static void main(String[] args) {
        Person myPerson = new Person("John", "Male", "Muslim", "France", "123", "123", "123", "123");
        System.out.println(myPerson.EGN);
        myPerson.sayHello();
    }

    Long addEGN() {
        Scanner myEGNScanner = new Scanner(System.in);
        System.out.println("Add EGN of 10 numbers");
        String EGNString = myEGNScanner.nextLine();
        if (EGNString.chars().count() != 10) {
            throw new InputMismatchException("EGN can only be 10 numbers!");
        }
        return Long.valueOf(EGNString);
    }

    void sayHello() {
        switch (language) {
            case "Italy":
                System.out.println("Salve, " + this.name);
                break;
            case "France":
                System.out.println("Bonjour, " + this.name);
                break;
            default:
                System.out.println("Hello, " + this.name);
        }
    }

    String celebrateEaster(String name) {
        return this.name + " says hello, " + name;
    }

}

class Italian extends Person{

    public Italian(String name, String sex, String religion, String language, String job, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, language, job, nationality, EGN, countryOfResidence);
    }

    @Override
    String celebrateEaster(String name) {
        return "says hello from override, " + name;
    }

    public static void main(String[] args) {
        Italian italian = new Italian("John", "Male", "Muslim", "Italy", "123", "123", "123", "123");
        italian.sayHello();

        System.out.println(italian.celebrateEaster("bla"));

        Scanner ms = new Scanner(System.in);

    }
}
