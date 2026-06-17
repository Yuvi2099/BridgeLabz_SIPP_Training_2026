package core_java_practice.scenario_based_problems;

import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();

            double tax;
            String bracket;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                bracket = "5%";
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                bracket = "15%";
            } else {
                tax = incomes[i] * 0.30;
                bracket = "30%";
            }

            totalTaxCollected += tax;

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
        }

        System.out.println("Total Tax Collected: " + totalTaxCollected);

        sc.close();
    }
}
