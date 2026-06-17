package core_java_practice.gcr_codebase.String.level_3;

import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    public static void findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {

                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        System.out.println("Character\tFrequency");

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {

                System.out.println(chars[i] + "\t\t" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        findFrequency(text);

        sc.close();
    }
}