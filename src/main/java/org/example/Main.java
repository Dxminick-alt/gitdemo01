package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(getGreeting() + " " + getName());
    }

    // Method 1: Modified in branchA
    public static String getGreeting() {
        return "Good morning";
    }

    // Method 2: To be modified in branchB
    public static String getName() {
        return "World";
    }
}
