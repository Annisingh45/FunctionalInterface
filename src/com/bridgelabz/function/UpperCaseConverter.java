package com.bridgelabz.function;

import java.util.function.Function;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Function<String, String> function = (s -> s.toUpperCase());

        System.out.println(function.apply("I am learning java 8"));
    }
}
