package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitWords(String text) {
        String[] words = text.split(" ");
        return words;
    }

    public static String[] findShortestLongest(String[] words) {

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[] result = findShortestLongest(words);

        System.out.println("Shortest Word : " + result[0]);
        System.out.println("Longest Word  : " + result[1]);

        sc.close();
    }
}