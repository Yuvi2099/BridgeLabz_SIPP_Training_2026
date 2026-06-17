package core_java_practice.gcr_codebase.Arrays.level_2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = Math.abs(sc.nextLong());

      
        if (number == 0) {
            System.out.println("Digit 0 occurs 1 time");
            
        }

        
        long temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        
        int[] digits = new int[count];

        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

       
        int[] frequency = new int[10];

        
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(
                        "Digit " + i +
                        " occurs " + frequency[i] + " time(s)"
                );
            }
        }

        sc.close();
    }
}