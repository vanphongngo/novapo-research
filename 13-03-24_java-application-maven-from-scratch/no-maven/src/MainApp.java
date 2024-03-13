package src;

import org.apache.commons.lang3.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        String text = "Hello, world!";
        
        // Using StringUtils to check if the text is empty or blank
        boolean isEmpty = StringUtils.isEmpty(text);
        boolean isBlank = StringUtils.isBlank(text);
        
        System.out.println("Is empty: " + isEmpty);
        System.out.println("Is blank: " + isBlank);
        
        // Using StringUtils to capitalize the text
        String capitalizedText = StringUtils.capitalize(text);
        System.out.println("Capitalized text: " + capitalizedText);
        
        // Using StringUtils to reverse the text
        String reversedText = StringUtils.reverse(text);
        System.out.println("Reversed text: " + reversedText);
    }
}