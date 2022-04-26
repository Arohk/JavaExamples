package com.company.oopbasics.employeetask;

public class Employee {
    final int id = 5;
    final String firstName = "John";
    final String lastName = "Atanasov";

    private double salary;

    public String getName() {
        return firstName + ' ' + lastName;
    }

    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        System.out.println(myEmployee.getName());
    }


}
