package core_java_practice.gcr_codebase.control_flow.level_1;

import java.util.Scanner;

public class rocketLaunchWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();
        sc.close();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");
    }
}
