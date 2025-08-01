package com.bridgelabz.supplier;

import java.util.function.Supplier;

public class PasswordGenerator {
    public static void main(String[] args) {
        String password = "";
        Supplier<Integer> digit = () -> (int) (Math.random() * 10);

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Supplier<Character> character = () -> s.charAt((int) (Math.random() * 26));
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                password += digit.get();       // even index → digit
            } else {
                password += character.get();   // odd index → letter
            }
        }

        System.out.println(password);
    }
}
