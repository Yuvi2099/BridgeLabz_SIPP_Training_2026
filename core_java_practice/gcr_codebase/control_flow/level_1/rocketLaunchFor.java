package core_java_practice.gcr_codebase.control_flow.level_1;

import java.util.Scanner;

public class rocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();
        sc.close();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
    }
}