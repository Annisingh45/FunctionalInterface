package com.bridgelabz.bifunction;

import java.util.function.BiFunction;

public class FindMultiplication {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (integer, integer2) -> integer * integer;

        System.out.println(biFunction.apply(12, 12));
    }
}
