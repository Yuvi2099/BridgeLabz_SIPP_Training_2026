package core_java_practice.gcr_codebase.control_flow.level_1;

import java.util.Scanner;

public class sumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter a number (0 to stop): ");
        double num = sc.nextDouble();

        while (num != 0) {
            total += num;

            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
        }
        sc.close();
        System.out.println("Total Sum = " + total);
    }
}
