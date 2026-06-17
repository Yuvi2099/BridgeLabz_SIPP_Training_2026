package core_java_practice.scenario_based_problems;

import java.util.HashSet;

public class Warehouse {
    public static void main(String[] args) {

        int[] stock = {10, 20, 30, 40, 20, 50, 10};
        int k = 2;

        
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int item : stock) {
            if (item > max) max = item;
            if (item < min) min = item;
            total += item;
        }

        System.out.println("Max Stock: " + max);
        System.out.println("Min Stock: " + min);
        System.out.println("Total Stock: " + total);

        
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int item : stock) {
            if (!set.add(item)) {
                System.out.print(item + " ");
            }
        }
        System.out.println();

        
        k %= stock.length;
        int[] rotated = new int[stock.length];

        for (int i = 0; i < stock.length; i++) {
            rotated[(i + k) % stock.length] = stock[i];
        }

        System.out.print("Rotated Array: ");
        for (int item : rotated) {
            System.out.print(item + " ");
        }
        System.out.println();

        
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        
        int[][] transpose = new int[shelf[0].length][shelf.length];

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[0].length; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("Transposed Shelf Grid:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
