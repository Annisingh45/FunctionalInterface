package com.bridgelabz.function;

public class Student {
    public String studentName;
    public int studentMarks;

    public Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }
}
