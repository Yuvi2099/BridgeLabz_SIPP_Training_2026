package core_java_practice.gcr_codebase.Methods.scenario_based;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static int acceptUnits(Scanner sc) {

        System.out.print("Enter Units Consumed: ");
        return sc.nextInt();
    }

    public static double calculateBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 5;
        }
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
            
        }
        else {
            bill = (100 * 5) +
                   (100 * 7) +
                   ((units - 200) * 10);
        }

        return bill;
    }

    public static void displayBill(int units, double bill) {

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount    : ₹" + bill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = acceptUnits(sc);

        double bill = calculateBill(units);

        displayBill(units, bill);
    }
}