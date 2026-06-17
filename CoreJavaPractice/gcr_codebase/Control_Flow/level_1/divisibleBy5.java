package CoreJavaPractice.gcr_codebase.Control_Flow.level_1;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        boolean result = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
