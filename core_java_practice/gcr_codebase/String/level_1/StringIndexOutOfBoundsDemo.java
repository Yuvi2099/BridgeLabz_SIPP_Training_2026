package core_java_practice.gcr_codebase.String.level_1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String text) {

        
        System.out.println(text.charAt(text.length()));
    }

    
    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

       

        handleException(text);

        sc.close();
    }
}
