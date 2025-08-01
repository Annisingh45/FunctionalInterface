package com.bridgelabz.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Predicate<User> predicate = (User u) -> u.userName.equals("Anni") && u.userPassword.equals("Anni@000000");

        System.out.println("Enter user name:");
        String userName = sc.next();
        System.out.println("Enter user password:");
        String userPassword = sc.next();

        User user = new User(userName, userPassword);
        if (predicate.test(user)) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Incorrect Credentials");
        }
    }
}
