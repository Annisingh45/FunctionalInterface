package com.bridgelabz.bipredicate;

import java.util.function.BiPredicate;

public class EmployeeMain {
    public static void main(String[] args) {
        BiPredicate<Employee, Integer> biPredicate = (Employee employee, Integer thresholdSalary) -> employee.employeeSalary > thresholdSalary;
        Employee employee1 = new Employee("Anni", 50000);
        Employee employee2 = new Employee("Mahi", 25000);

        System.out.println(biPredicate.test(employee1, 30000));
        System.out.println(biPredicate.test(employee2, 100000));
    }
}
