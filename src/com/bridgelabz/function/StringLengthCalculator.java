package com.bridgelabz.function;

import java.util.function.Function;

public class StringLengthCalculator {
    public static void main(String[] args) {
        Function<String, Integer> function = (String s) -> s.length();

        int stringLength = function.apply("Anni Singh");
        System.out.println("String length: " + stringLength);

    }
}
