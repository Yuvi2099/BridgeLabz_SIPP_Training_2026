package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int n) {

        if (n > 0)
            return 1;

        if (n < 0)
            return -1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println(checkNumber(n));
    }
}
