package com.company.methods;

import java.io.IOException;

class Example {
    public static void myMethod(){
        System.out.println("Hello!");
    }
}

class Example2 extends Example{

    public void myChildMethod(){
        myMethod();
    }


    public static void main(String[] args){
      myMethod();
      Example2 myExample2 = new Example2();
      myExample2.myChildMethod();
    }
}
