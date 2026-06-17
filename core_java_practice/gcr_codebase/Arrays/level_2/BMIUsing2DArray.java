package core_java_practice.gcr_codebase.Arrays.level_2;

import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid Input! Enter positive values.");
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100;

            personData[i][2] =
                    personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI REPORT");
        System.out.println("---------------------------------------------");
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < number; i++) {

            System.out.printf("%.1f\t%.1f\t%.2f\t%s%n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}