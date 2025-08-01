package com.bridgelabz.bipredicate;

import java.util.function.BiPredicate;

public class PrefixChecker {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (string, prefix) -> string.toLowerCase().startsWith(prefix.toLowerCase());

        System.out.println(biPredicate.test("Bridgelabz", "bridge"));  //true
        System.out.println(biPredicate.test("Bridgelabz", "Bridge"));  //true
    }
}
