package com.bridgelabz.function;

import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        Function<String,String> function=(String s)->s.replaceAll(" ","");

        System.out.println(function.apply("A   n  n  i"));
    }
}
