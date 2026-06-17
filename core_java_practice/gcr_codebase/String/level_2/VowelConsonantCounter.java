package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static int[] countVC(String str) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            String result = checkCharacter(str.charAt(i));

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int[] result = countVC(str);

        System.out.println("Vowels     : " + result[0]);
        System.out.println("Consonants : " + result[1]);

        sc.close();
    }
}