package core_java_practice.gcr_codebase.Methods.level_3;

import java.util.Scanner;

public class DistanceAndLineEquation {

    public static double distance(
            double x1, double y1,
            double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2)
                        + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(
            double x1, double y1,
            double x2, double y2) {

        double slope =
                (y2 - y1)
                        / (x2 - x1);

        double intercept =
                y1 - slope * x1;

        return new double[]{
                slope,
                intercept
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance =
                distance(
                        x1, y1,
                        x2, y2);

        double[] line =
                lineEquation(
                        x1, y1,
                        x2, y2);

        System.out.println(
                "Distance = "
                        + distance);

        System.out.println(
                "Slope = "
                        + line[0]);

        System.out.println(
                "Y-Intercept = "
                        + line[1]);

        System.out.println(
                "Equation: y = "
                        + line[0]
                        + "x + "
                        + line[1]);

        sc.close();
    }
}