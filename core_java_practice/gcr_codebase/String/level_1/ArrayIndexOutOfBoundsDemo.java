package core_java_practice.gcr_codebase.String.level_1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    
    public static void generateException(String[] names) {

        System.out.println(names[names.length]); // Invalid index
    }

    
    public static void handleException(String[] names) {

        try {

            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("Runtime Exception handled.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        

        handleException(names);

        sc.close();
    }
}
