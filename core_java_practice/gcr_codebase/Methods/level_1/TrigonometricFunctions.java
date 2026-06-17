package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(
            double angle) {

        double radian = Math.toRadians(angle);

        return new double[]{
                Math.sin(radian),
                Math.cos(radian),
                Math.tan(radian)
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();
        sc.close();

        double[] result =
                calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);
        System.out.println("Cos = " + result[1]);
        System.out.println("Tan = " + result[2]);
    }
}