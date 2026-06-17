package core_java_practice.gcr_codebase.Methods.level_3;

import java.util.Arrays;

public class FootballTeamHeights {

    public static int sum(int[] heights) {

        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {

        int min = heights[0];

        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }

        return min;
    }

    public static int tallestHeight(int[] heights) {

        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        System.out.println("Heights: "
                + Arrays.toString(heights));

        System.out.println("Mean Height: "
                + meanHeight(heights));

        System.out.println("Shortest Height: "
                + shortestHeight(heights));

        System.out.println("Tallest Height: "
                + tallestHeight(heights));
    }
}