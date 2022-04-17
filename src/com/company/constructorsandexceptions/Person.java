package com.company.constructorsandexceptions;

public class Person {

    String name;
    int age;

    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
        super();
    }
    Person() {
    }

    public static void main(String[] args) {
        Person myPerson = new Person("Larry", 32);
    }
}
