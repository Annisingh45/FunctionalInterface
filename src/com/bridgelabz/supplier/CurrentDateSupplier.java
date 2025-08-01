package com.bridgelabz.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Supplier<Date> supplier=()-> new Date();
        System.out.println(supplier.get());

        Thread.sleep(5000);
        System.out.println(supplier.get());
    }
}
