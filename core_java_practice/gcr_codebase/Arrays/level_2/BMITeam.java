package core_java_practice.gcr_codebase.Arrays.level_2;

import java.util.Scanner;

public class BMITeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            double heightInMeter = height[i] / 100;

            bmi[i] = weight[i] /
                    (heightInMeter * heightInMeter);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            }
            else if (bmi[i] < 25) {
                status[i] = "Normal Weight";
            }
            else if (bmi[i] < 30) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report");

        System.out.println("----------------------------------------------");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t%s%n",
                    height[i],
                    weight[i],
                    bmi[i],
                    status[i]);
        }

        sc.close();
    }
}