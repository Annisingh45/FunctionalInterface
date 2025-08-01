package com.bridgelabz.predicate;


import java.util.function.Predicate;

public class NumberCheck {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer i) -> i > 10; //checking number greater than 10 or not

        System.out.println(predicate.test(11)); //true
        System.out.println(predicate.test(1));  //false
    }

    ;


}
