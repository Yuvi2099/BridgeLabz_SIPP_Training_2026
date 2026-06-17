package core_java_practice.gcr_codebase.control_flow.level_2;

import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (number >= 0 && power >= 0) {

            long result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + "^" + power + " = " + result);

        } else {
            System.out.println("Please enter positive integers.");
        }

        sc.close();
    }
}