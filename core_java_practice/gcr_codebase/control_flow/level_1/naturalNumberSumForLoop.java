package core_java_practice.gcr_codebase.control_flow.level_1;

import java.util.Scanner;

public class naturalNumberSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int forLoopSum = 0;

            for (int i = 1; i <= n; i++) {
                forLoopSum += i;
            }

            System.out.println("Sum using Formula = " + formulaSum);
            System.out.println("Sum using For Loop = " + forLoopSum);

            if (formulaSum == forLoopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results do not match.");
            }
        } else {
            System.out.println(n + " is not a natural number.");
        }

        sc.close();
    }
}
