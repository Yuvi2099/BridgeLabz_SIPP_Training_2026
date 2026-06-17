package core_java_practice.gcr_codebase.Arrays.level_2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics Marks: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry Marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths Marks: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 ||
                marks[i][1] < 0 ||
                marks[i][2] < 0) {

                System.out.println("Marks cannot be negative.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 80)
                grade[i] = 'B';
            else if (percentage[i] >= 70)
                grade[i] = 'C';
            else if (percentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\nRESULT SHEET");
        System.out.println("------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%d\t%.0f\t%.0f\t\t%.0f\t%.2f\t\t%c%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}
