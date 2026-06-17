package core_java_practice.gcr_codebase.Methods.level_3;

import java.util.Scanner;


public class NumberChecker1 {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {

        int count = countDigits(number);

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }

        return false;
    }

    public static boolean isArmstrong(int number,
                                      int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    public static void largestSecondLargest(
            int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest
                    && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest = "
                + largest);

        System.out.println("Second Largest = "
                + secondLargest);
    }

    public static void smallestSecondSmallest(
            int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest
                    && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest = "
                + smallest);

        System.out.println("Second Smallest = "
                + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Duck Number: "
                + isDuckNumber(digits));

        System.out.println("Armstrong Number: "
                + isArmstrong(number, digits));

        largestSecondLargest(digits);

        smallestSecondSmallest(digits);

        sc.close();
    }
}