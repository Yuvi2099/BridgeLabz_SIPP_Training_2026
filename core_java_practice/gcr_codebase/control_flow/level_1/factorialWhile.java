package core_java_practice.gcr_codebase.control_flow.level_1;

import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number >= 0) {
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " = " + factorial);
        } else {
            System.out.println("Please enter a natural number.");
        }

        sc.close();
    }
}