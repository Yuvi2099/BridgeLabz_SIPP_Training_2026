package core_java_practice.gcr_codebase.String.level_1;

import java.util.Scanner;

public class NumberFormatDemo {

    
    public static void generateException(String text) {

        int num = Integer.parseInt(text);

        System.out.println("Number = " + num);
    }

    
    public static void handleException(String text) {

        try {

            int num = Integer.parseInt(text);

            System.out.println("Number = " + num);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Runtime Exception handled.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

       

        handleException(text);

        sc.close();
    }
}