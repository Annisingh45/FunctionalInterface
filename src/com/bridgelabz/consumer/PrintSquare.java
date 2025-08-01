package com.bridgelabz.consumer;

import java.util.function.Consumer;

public class PrintSquare {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (integer -> System.out.println(integer * integer));
        consumer.accept(10);
    }
}
