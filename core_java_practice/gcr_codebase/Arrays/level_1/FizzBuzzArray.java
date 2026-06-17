package core_java_practice.gcr_codebase.Arrays.level_1;

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            
        }

        String[] result = new String[number + 1];

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[i] = "Buzz";
            }
            else {
                result[i] = String.valueOf(i);
            }
        }

        System.out.println("\nFizzBuzz Results:");

        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}
