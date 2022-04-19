package com.company.oopbasics;

class ParentClass {
    private static int age;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        ParentClass.age = age;
    }
}

class ChildClass extends ParentClass {
    public static void main(String[] args) {
        setAge(7);
        System.out.println(getAge());
    }
}