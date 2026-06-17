package core_java_practice.gcr_codebase.control_flow.level_3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();

        
        double heightM = heightCm / 100;

       
        double bmi = weight / (heightM * heightM);

        System.out.printf("BMI = %.2f%n", bmi);

      
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        sc.close();
    }
}