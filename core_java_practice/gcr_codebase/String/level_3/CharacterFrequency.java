package core_java_practice.gcr_codebase.String.level_3;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {

            if (frequency[i] > 0) {

                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);

                index++;
            }
        }

        return result;
    }

    public static void display(String[][] result) {

        System.out.println("Character\tFrequency");

        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        display(result);

        sc.close();
    }
}