package core_java_practice.gcr_codebase.String.level_1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    
    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        if (start > end) {
            throw new IllegalArgumentException(
                "Start index cannot be greater than end index."
            );
        }

        System.out.println(text.substring(start, end));
    }

    public static void handleException(String text) {

        try {

            int start = 5;
            int end = 2;

            if (start > end) {
                throw new IllegalArgumentException(
                    "Start index cannot be greater than end index."
                );
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Runtime Exception handled.");
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
