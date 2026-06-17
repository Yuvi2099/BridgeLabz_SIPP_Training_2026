package core_java_practice.gcr_codebase.Methods.level_2;

import java.util.Scanner;

public class YoungestAndTallest {

    public static int findYoungest(int[] ages) {

        int index = 0;

        for (int i = 1; i < ages.length; i++) {

            if (ages[i] < ages[index]) {
                index = i;
            }
        }

        return index;
    }

    public static int findTallest(double[] heights) {

        int index = 0;

        for (int i = 1; i < heights.length; i++) {

            if (heights[i] > heights[index]) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {
                "Amar",
                "Akbar",
                "Anthony"
        };

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Age of "
                    + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter Height of "
                    + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngest =
                findYoungest(ages);

        int tallest =
                findTallest(heights);

        System.out.println(
                "\nYoungest Friend: "
                        + names[youngest]);

        System.out.println(
                "Tallest Friend: "
                        + names[tallest]);

        sc.close();
    }
}