package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class StringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int userLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using user-defined method = " + userLength);
        System.out.println("Length using built-in length() = " + builtInLength);

        sc.close();
    }
}