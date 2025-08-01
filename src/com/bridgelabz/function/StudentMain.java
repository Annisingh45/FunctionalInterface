package com.bridgelabz.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anni", 90));
        studentList.add(new Student("Aryan", 80));
        studentList.add(new Student("Ravi", 85));
        studentList.add(new Student("Khushi", 92));
        studentList.add(new Student("Nitish", 88));
        studentList.add(new Student("Sneha", 79));
        studentList.add(new Student("Aditya", 55));
        studentList.add(new Student("Simran", 83));
        studentList.add(new Student("Pooja", 41));
        studentList.add(new Student("Rahul", 46));
        studentList.add(new Student("Deepak", 39));

        // Function to assign grade based on marks
        Function<Student, String> function = (Student student) -> {
            int marks = student.getStudentMarks();  // using getter method
            if (marks > 90) {
                return "A [Distinction]";
            } else if (marks >= 80) {
                return "B [First Class]";
            } else if (marks >= 70) {
                return "C [Second Class]";
            } else if (marks >= 60) {
                return "D [Third Class]";
            } else if (marks > 35) {
                return "E [Average]";
            } else {
                return "F [Fail]";
            }
        };

        // Print student details and grade
        for (Student student : studentList) {
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Marks: " + student.getStudentMarks());
            System.out.println("Grade: " + function.apply(student));
            System.out.println();
        }
    }
}
