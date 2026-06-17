package core_java_practice.gcr_codebase.Arrays.level_1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter heights of 11 players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean Height = " + mean + " cm");

        sc.close();
    }
}