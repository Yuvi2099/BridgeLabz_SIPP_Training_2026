package core_java_practice.gcr_codebase.Arrays.level_2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics Marks: ");
            physics[i] = sc.nextDouble();

            System.out.print("Chemistry Marks: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Maths Marks: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 ||
                chemistry[i] < 0 ||
                maths[i] < 0) {

                System.out.println("Marks cannot be negative.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

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

        System.out.println("\nRESULT");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            System.out.println("Physics   : " + physics[i]);
            System.out.println("Chemistry : " + chemistry[i]);
            System.out.println("Maths     : " + maths[i]);
            System.out.printf("Percentage: %.2f%n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);

            System.out.println();
        }

        sc.close();
    }
}