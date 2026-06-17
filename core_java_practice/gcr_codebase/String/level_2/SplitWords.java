package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class SplitWords {

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

    public static String[] splitText(String text) {

        int len = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount - 1];

        int k = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            String word = "";

            for (int j = start; j < spaceIndex[i]; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = spaceIndex[i] + 1;
        }

        String lastWord = "";
        for (int i = start; i < len; i++) {
            lastWord += text.charAt(i);
        }

        words[wordCount - 1] = lastWord;

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println("\nWords using User Defined Method:");
        for (String word : userWords) {
            System.out.println(word);
        }

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nComparison Result = " + result);

        sc.close();
    }
}