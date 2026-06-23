package core_java_practice.gcr_codebase.Exception_handling;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } finally {
            System.out.println("Operation completed");
        }

        sc.close();
    }
}