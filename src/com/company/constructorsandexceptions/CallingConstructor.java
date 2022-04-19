package com.company.constructorsandexceptions;

class Employee {
    private String firstName = null;
    private String lastName = null;
    private int birthYear = 0;

    public Employee(String first, String last, int year) {
        firstName = first;
        lastName = last;
        birthYear = year;
    }

    public Employee(String first, String last) {
        this(first, last, 1990);
        // some code here.
    }

    public static void main(String[] args) {
        Employee myEmployee = new Employee("John", "Atanasov");
    }
}
