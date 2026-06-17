package core_java_practice.gcr_codebase.Arrays.scenario_based;

import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println(
                "Enter seat status (0=Empty, 1=Booked):");

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        int booked = 0;
        int available = 0;

        int maxLength = 0;
        int currentLength = 0;

        int start = -1;
        int end = -1;
        int tempStart = -1;

        for (int i = 0; i < n; i++) {

            if (seats[i] == 1) {
                booked++;
            } else {
                available++;
            }

            if (seats[i] == 0) {

                if (currentLength == 0) {
                    tempStart = i;
                }

                currentLength++;

                if (currentLength > maxLength) {

                    maxLength = currentLength;
                    start = tempStart;
                    end = i;
                }

            } else {
                currentLength = 0;
            }
        }

        System.out.println("\nLongest Available Block:");

        if (start != -1) {
            System.out.println(
                    "Start Position = " + start);

            System.out.println(
                    "End Position = " + end);

            System.out.println(
                    "Length = " + maxLength);
        }

        System.out.println(
                "\nBooked Seats = " + booked);

        System.out.println(
                "Available Seats = " + available);

        if (maxLength >= 5) {
            System.out.println(
                    "A group of 5 can sit together.");
        } else {
            System.out.println(
                    "A group of 5 cannot sit together.");
        }

        sc.close();
    }
}