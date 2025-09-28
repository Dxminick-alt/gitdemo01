package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(getGreeting() + " " + getName());
        
        // Mongolian greeting with ASCII rendering
        System.out.println("\n" + ASCIIRenderer.renderInBox("Сайн уу дэлхий!"));
        System.out.println(ASCIIRenderer.renderWithStars(getMongolianGreeting()));
        System.out.println("\n" + ASCIIRenderer.createBanner("Мэндвт!"));
    }

    // Method 1: To be modified in branchA
    public static String getGreeting() {
        return "Hello";
    }

    // Method 2: To be modified in branchB
    public static String getName() {
        return "World";
    }
    
    // Mongolian greeting method for branchC
    public static String getMongolianGreeting() {
        return "Танд сайхан өдөр хүсье!";
    }
}
