package core_java_practice.gcr_codebase.Arrays.scenario_based;

import java.util.Scanner;

public class WarehouseStockRecovery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int zeroIndex = -1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (stock[i] == 0) {
                zeroIndex = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int average = sum / count;

        stock[zeroIndex] = average;

        System.out.println("\nMissing Stock Position = "
                + zeroIndex);

        System.out.println("Average Non-Zero Stock = "
                + average);

        System.out.print("Updated Inventory: ");

        for (int value : stock) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
