package com.bridgelabz.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void display(Predicate<Employee> predicate, ArrayList<Employee> empList) {
        for (Employee employee : empList) {
            if (predicate.test(employee)) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anni", 9000000, "Bangalore", "Java developer"));
        employees.add(new Employee("Rahul", 20000, "Hyderabad", "Frontend Developer"));
        employees.add(new Employee("Sneha", 25000, "Pune", "Data Analyst"));
        employees.add(new Employee("Vikram", 950000, "Chennai", "DevOps Engineer"));
        employees.add(new Employee("Priya", 500000, "Delhi", "Backend Developer"));
        employees.add(new Employee("Aman", 1300000, "Bangalore", "Manager"));

        // to print details of manager
        Predicate<Employee> managerDetails = (Employee employee) -> employee.employeeDesignation.equals("Manager");
        display(managerDetails, employees);

        System.out.println("------------------------");

        //print employee whose salary greater than 60k
        Predicate<Employee> salaryCheck = (Employee employee) -> employee.employeeSalary < 60000;
        display(salaryCheck, employees);

        System.out.println("---------------------");

        //print employee location in bangalore
        Predicate<Employee> bangaloreLocation = (Employee employee) -> employee.employeeLocation.equals("Bangalore");
        display(bangaloreLocation, employees);

        System.out.println("-------------------------------");
        // manager  and bangalore
        Predicate<Employee> bangloreManager = managerDetails.and(bangaloreLocation);
        display(bangloreManager, employees);

    }
}
