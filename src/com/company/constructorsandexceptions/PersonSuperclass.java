package com.company.constructorsandexceptions;

public class PersonSuperclass {

    String name;
    int age;

    PersonSuperclass(String name) {
        this.name = name;
    }
    PersonSuperclass(String name, int age) {
        super();
    }
    PersonSuperclass() {
    }

    public static void main(String[] args) {
        PersonSuperclass myPerson = new PersonSuperclass("Larry", 32);
    }
}
