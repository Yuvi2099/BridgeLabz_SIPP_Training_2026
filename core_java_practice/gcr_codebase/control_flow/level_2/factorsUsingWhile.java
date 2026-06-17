package core_java_practice.gcr_codebase.control_flow.level_2;

import java.util.Scanner;

public class factorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            int counter = 1;

            System.out.println("Factors of " + number + " are:");

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
