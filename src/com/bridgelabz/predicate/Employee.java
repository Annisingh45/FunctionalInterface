package com.bridgelabz.predicate;

public class Employee {
    String employeeName;
    int employeeSalary;
    String employeeLocation;
    String employeeDesignation;

    public Employee(String employeeName, int employeeSalary, String employeeLocation, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeLocation = employeeLocation;
        this.employeeDesignation = employeeDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeLocation='" + employeeLocation + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                '}';
    }
}
