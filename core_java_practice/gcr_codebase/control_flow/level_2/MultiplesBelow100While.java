package core_java_practice.gcr_codebase.control_flow.level_2;

import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {

            int counter = 100;

            System.out.println("Multiples of " + number + " below 100:");

            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
