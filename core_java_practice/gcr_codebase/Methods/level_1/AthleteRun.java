package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class AthleteRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds Required = "
                + calculateRounds(a, b, c));
    }
}