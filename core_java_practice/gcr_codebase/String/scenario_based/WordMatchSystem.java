package core_java_practice.gcr_codebase.String.scenario_based;

import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {

    public static boolean isAnagram(
            String str1,
            String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Skill: ");
        String skill1 = sc.nextLine();

        System.out.print("Enter Second Skill: ");
        String skill2 = sc.nextLine();

        System.out.println("\nFirst Skill Uppercase : "
                + skill1.toUpperCase());

        System.out.println("Second Skill Uppercase : "
                + skill2.toUpperCase());

        System.out.println("Length of First Skill : "
                + skill1.length());

        System.out.println("Length of Second Skill : "
                + skill2.length());

        if (isAnagram(skill1, skill2)) {

            System.out.println(
                    "Both keywords are ANAGRAMS.");

        } else {

            System.out.println(
                    "Both keywords are NOT ANAGRAMS.");
        }

        sc.close();
    }
}