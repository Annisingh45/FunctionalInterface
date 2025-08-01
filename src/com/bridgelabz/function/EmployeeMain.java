package com.bridgelabz.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Anni", 900000));
        empList.add(new Employee("Ravi", 1000));
        empList.add(new Employee("Khushi", 820000));
        empList.add(new Employee("Nitish", 670000));
        empList.add(new Employee("Sneha", 950000));
        empList.add(new Employee("Aditya", 5000));

        System.out.println("List of Employee");
        for (Employee employee : empList) {
            System.out.println(employee);
        }

        //Predicate for employee earning <=15000
        Predicate<Employee> predicate = (employee) -> employee.employeeSalary <= 15000;

        //Function to increase salary by 6000
        Function<Employee, Employee> function = (Employee employee) -> {
            employee.employeeSalary = employee.employeeSalary + 6000;
            return employee;
        };
        System.out.println("Employee having salary <= 15000");
        for (Employee employee : empList) {
            if (predicate.test(employee)) {
                System.out.println(employee);
            }
        }

        //Apply function to eligible employee and storing in the list
        ArrayList<Employee> updatedEmplist = new ArrayList<>();
        for (Employee emp : empList) {
            if (predicate.test(emp)) {
                Employee e = function.apply(emp);
                updatedEmplist.add(e);
            }
        }
        System.out.println("Employee who got hike");
        for (Employee emp : updatedEmplist) {
            System.out.println(emp);
        }
    }
}
