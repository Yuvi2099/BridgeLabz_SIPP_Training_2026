package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class CharacterTypeAnalyzer {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static String[][] analyze(String str) {

        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {

            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharacter(str.charAt(i));
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Character\tType");

        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        display(analyze(str));

        sc.close();
    }
}