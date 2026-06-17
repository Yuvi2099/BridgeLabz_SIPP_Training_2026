package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(
            int chocolates, int children) {

        return new int[]{
                chocolates / children,
                chocolates % children
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        sc.close();

        int[] result =
                findRemainderAndQuotient(chocolates, children);

        System.out.println(
                "Each child gets = " + result[0]);

        System.out.println(
                "Remaining chocolates = " + result[1]);
    }
}
