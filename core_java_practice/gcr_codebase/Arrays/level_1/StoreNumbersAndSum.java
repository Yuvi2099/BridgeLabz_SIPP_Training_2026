package core_java_practice.gcr_codebase.Arrays.level_1;

import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            if (index == 10) {
                System.out.println("Array is full.");
                break;
            }

            System.out.print("Enter a positive number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nNumbers Entered:");

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal Sum = " + total);

        sc.close();
    }
}
