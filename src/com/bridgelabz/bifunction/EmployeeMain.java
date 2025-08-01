package com.bridgelabz.bifunction;

import java.util.function.BiFunction;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Anni Singh", 1500);
        TimeSheet timeSheet = new TimeSheet(101, 31);

        BiFunction<Employee, TimeSheet, Integer> biFunction = (Employee emp, TimeSheet time) ->

                emp.employeeDailyWages * time.employeeWorkingDays;
        System.out.println(biFunction.apply(employee, timeSheet));

    }
}
