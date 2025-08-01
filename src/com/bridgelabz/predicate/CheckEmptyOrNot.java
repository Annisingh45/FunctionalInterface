package com.bridgelabz.predicate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CheckEmptyOrNot {
    public static void main(String[] args) {
        Predicate<Collection<Integer>> predicate = (collection -> collection.isEmpty());

        Set<Integer> set = new HashSet<>();
        System.out.println(predicate.test(set));  //true

        set.add(12);
        System.out.println(predicate.test(set));  //false
    }
}
