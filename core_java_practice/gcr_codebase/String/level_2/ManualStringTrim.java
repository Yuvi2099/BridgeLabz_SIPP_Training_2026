package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class ManualStringTrim {

    public static int[] trimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compare(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int[] indexes = trimIndexes(str);

        String userTrim =
                substring(str, indexes[0], indexes[1]);

        String builtInTrim = str.trim();

        System.out.println("User Trim    : " + userTrim);
        System.out.println("Built-in Trim: " + builtInTrim);
        System.out.println("Matched      : "
                + compare(userTrim, builtInTrim));

        sc.close();
    }
}