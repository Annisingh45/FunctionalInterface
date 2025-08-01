package com.bridgelabz.predicate;

import java.util.function.Predicate;

public class CountSize {
    public static void main(String[] args) {
        Predicate<String> predicate=(String s) -> s.length()>5;

        System.out.println(predicate.test("Anni Singh")); //true
        System.out.println(predicate.test("Ram"));  //false
    }
}
