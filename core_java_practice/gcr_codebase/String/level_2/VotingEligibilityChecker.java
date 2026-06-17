package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class VotingEligibilityChecker {

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Age\tCan Vote");

        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter Age of Student "
                    + (i + 1) + ": ");

            ages[i] = sc.nextInt();
        }

        display(checkVoting(ages));

        sc.close();
    }
}