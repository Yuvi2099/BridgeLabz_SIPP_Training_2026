package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        sc.close();

        System.out.println("Maximum Handshakes = "
                + calculateHandshakes(students));
    }
}