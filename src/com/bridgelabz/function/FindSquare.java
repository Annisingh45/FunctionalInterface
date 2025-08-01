package com.bridgelabz.function;

import java.util.function.Function;

public class FindSquare {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (i) -> i * i;

        System.out.println(function.apply(10));
    }
}
