package core_java_practice.gcr_codebase.Arrays.scenario_based;

import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int countAbove75 = 0;
        int sum = 0;

        for (int mark : marks) {

            if (mark > highest)
                highest = mark;

            if (mark < lowest)
                lowest = mark;

            if (mark > 75)
                countAbove75++;

            sum += mark;
        }

        double average = (double) sum / n;

        System.out.println("\nHighest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);
        System.out.println("Students Scored Above 75 = " + countAbove75);
        System.out.println("Average Marks = " + average);

        System.out.print("Marks Greater Than Average: ");

        for (int mark : marks) {
            if (mark > average)
                System.out.print(mark + " ");
        }
        sc.close();
    }
}