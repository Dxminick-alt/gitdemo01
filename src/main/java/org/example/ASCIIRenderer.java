package org.example;

/**
 * ASCIIRenderer - A utility class for rendering text with ASCII art styling
 */
public class ASCIIRenderer {
    
    /**
     * Renders text in a simple ASCII box
     * @param text the text to render
     * @return the text surrounded by ASCII box
     */
    public static String renderInBox(String text) {
        int length = text.length();
        StringBuilder sb = new StringBuilder();
        
        // Top border
        sb.append("┌").append("─".repeat(length + 2)).append("┐\n");
        
        // Text with side borders
        sb.append("│ ").append(text).append(" │\n");
        
        // Bottom border
        sb.append("└").append("─".repeat(length + 2)).append("┘");
        
        return sb.toString();
    }
    
    /**
     * Renders text with ASCII stars decoration
     * @param text the text to render
     * @return the text with star decoration
     */
    public static String renderWithStars(String text) {
        return "*** " + text + " ***";
    }
    
    /**
     * Creates a simple ASCII banner
     * @param text the text for the banner
     * @return formatted banner
     */
    public static String createBanner(String text) {
        String stars = "*".repeat(text.length() + 4);
        return stars + "\n* " + text + " *\n" + stars;
    }
}