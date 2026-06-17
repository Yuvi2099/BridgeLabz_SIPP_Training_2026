package core_java_practice.gcr_codebase.String.scenario_based;

import java.util.Scanner;

public class SecretMessageValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Code: ");
        String code = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < code.length(); i++) {

            char ch = code.charAt(i);

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;

            } else if (Character.isDigit(ch)) {

                digits++;

            } else {

                special++;
            }
        }

        boolean strong =
                code.length() >= 8 &&
                digits >= 2 &&
                special >= 1;

        System.out.println("\n----- Report -----");
        System.out.println("Length             : "
                + code.length());

        System.out.println("Vowels             : "
                + vowels);

        System.out.println("Consonants         : "
                + consonants);

        System.out.println("Digits             : "
                + digits);

        System.out.println("Special Characters : "
                + special);

        System.out.println("Strength           : "
                + (strong ? "Strong" : "Weak"));

                sc.close();
    }
}
