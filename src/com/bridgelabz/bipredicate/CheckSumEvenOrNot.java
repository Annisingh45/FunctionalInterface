package com.bridgelabz.bipredicate;

import java.util.function.BiPredicate;

public class CheckSumEvenOrNot {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> (num1 + num2) % 2 == 0;

        System.out.println(biPredicate.test(2, 4));     //true
        System.out.println(biPredicate.test(1, 2));     //false
    }
}
