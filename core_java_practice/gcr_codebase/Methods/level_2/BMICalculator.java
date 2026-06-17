package core_java_practice.gcr_codebase.Methods.level_2;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] persons) {

        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double heightMeter = persons[i][1] / 100;

            persons[i][2] =
                    weight / (heightMeter * heightMeter);
        }
    }

    public static String[] getStatus(double[][] persons) {

        String[] status = new String[persons.length];

        for (int i = 0; i < persons.length; i++) {

            double bmi = persons[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Weight(kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height(cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        String[] status = getStatus(persons);

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        sc.close();
    }
}