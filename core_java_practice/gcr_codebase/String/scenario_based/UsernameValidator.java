package core_java_practice.gcr_codebase.String.scenario_based;

import java.util.Scanner;

public class UsernameValidator {

    public static boolean containsSpaces(String username) {
        return username.contains(" ");
    }

    public static boolean isPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.println("Contains Spaces : "
                + containsSpaces(username));

        System.out.println("Total Characters : "
                + username.length());

        System.out.println("Uppercase Username : "
                + username.toUpperCase());

        System.out.println("Palindrome : "
                + isPalindrome(username));

        sc.close();
    }
}