package com.bridgelabz.predicate;

import java.util.function.Predicate;

public class NumberRangeCheck {
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanZero = i -> i > 0;
        Predicate<Integer> isLessThanHundred = i -> i < 100;

        // Combined condition: number > 0 AND number < 100
        Predicate<Integer> isInRange = isGreaterThanZero.and(isLessThanHundred);


        System.out.println(isInRange.test(50));  // true
        System.out.println(isInRange.test(0));   // false
        System.out.println(isInRange.test(150)); // false
    }
}
