package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(getGreeting() + " " + getName());
    }

    // Method 1: To be modified in branchA
    public static String getGreeting() {
        return "Hello";
    }

    // Method 2: Modified in branchB
    public static String getName() {
        return "Universe";
    }
}
