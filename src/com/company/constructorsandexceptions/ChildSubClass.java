package com.company.constructorsandexceptions;

public class ChildSubClass extends PersonSuperclass {

    private String childName;

    ChildSubClass() {
        super("John");
        this.childName = name;
    }

    public static void main(String[] args) {
        ChildSubClass myChild = new ChildSubClass();
        System.out.println(myChild.childName);
    }
}
