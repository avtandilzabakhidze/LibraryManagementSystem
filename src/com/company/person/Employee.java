package com.company.person;

public class Employee extends Person {
    private final int employeeId;

    public Employee(String personalNo, String firstName, String lastName, int age, int employeeId) {
        super(personalNo, firstName, lastName, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }
}
