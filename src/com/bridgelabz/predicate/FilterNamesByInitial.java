package com.bridgelabz.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anni");
        names.add("khushi");
        names.add("Nitish");
        names.add("Ram");
        names.add("kamlesh");

        Predicate<String> predicate = (s -> s.charAt(0) == 'k');

        System.out.println("List of name start with k: ");
        for (String name : names) {
            if (predicate.test(name)) {
                System.out.println(name);
            }
        }

    }
}
