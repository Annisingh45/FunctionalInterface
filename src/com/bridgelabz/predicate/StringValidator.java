package com.bridgelabz.predicate;

import java.util.function.Predicate;

public class StringValidator {
    public static void main(String[] args) {
        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        Predicate<String> isLengthGreaterThanFive = s -> s.length() > 5;

        // Combine all predicates using .and()
        Predicate<String> isValidString = isNotNull
                .and(isNotEmpty)
                .and(isLengthGreaterThanFive);


        System.out.println(isValidString.test("Hello"));         // false (length <= 5)
        System.out.println(isValidString.test("Anni Singh"));    // true
        System.out.println(isValidString.test(""));              // false (empty)
        System.out.println(isValidString.test(null));           // false (null)
    }
}
