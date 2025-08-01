package com.bridgelabz.predicate;

import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = i -> i > 0;     // Checks if number is positive
        Predicate<Integer> predicate2 = i -> i < 0;     // Checks if number is negative

        Predicate<Integer> predicate3 = predicate1.and(predicate2); // Logical AND of both

        System.out.println(predicate3.test(5));   // false
        System.out.println(predicate3.test(-5));  // false
    }
}
