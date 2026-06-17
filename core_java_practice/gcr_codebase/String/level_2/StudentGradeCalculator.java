package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static int[][] getMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }

        return marks;
    }

    public static double[][] calculateResult(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;

            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String[] calculateGrade(double[][] result) {

        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    public static void displayScoreCard(int[][] marks,
                                        double[][] result,
                                        String[] grades) {

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-10s%n",
                "Student", "Physics", "Chem", "Maths",
                "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-10s%n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grades[i]);
        }

        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = getMarks(students);

        double[][] result = calculateResult(marks);

        String[] grades = calculateGrade(result);

        displayScoreCard(marks, result, grades);

        sc.close();
    }
}