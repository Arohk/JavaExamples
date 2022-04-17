package com.company.constructorsandexceptions;

public class Child extends Person {

    private String childName;

    Child() {
        super("John");
        this.childName = name;
    }

    public static void main(String[] args) {
        Child myChild = new Child();
        System.out.println(myChild.childName);
    }
}
