package com.company.constructorsandexceptions;


class A{
    public A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A{
    public B() {
        System.out.println("Constructor of class B");
    }
}

class C extends B{
    public C() {
        System.out.println("Constructor of class C");
    }

    public static void main(String[] args) {
        C myC = new C();
    }
}
