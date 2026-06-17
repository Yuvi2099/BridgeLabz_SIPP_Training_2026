package core_java_practice.scenario_based_problems;

import java.util.HashMap;

public class SpyAgency {
    public static void main(String[] args) {

        String message = "madam";

      
        String reversed = new StringBuilder(message).reverse().toString();
        System.out.println("Reversed Message: " + reversed);

    
        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        
        int vowels = 0, consonants = 0;

        for (char ch : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

       
        String intercept1 = "listen";
        String intercept2 = "silent";

        char[] a1 = intercept1.toLowerCase().toCharArray();
        char[] a2 = intercept2.toLowerCase().toCharArray();

        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);

        if (java.util.Arrays.equals(a1, a2)) {
            System.out.println("Anagram: Yes");
        } else {
            System.out.println("Anagram: No");
        }

        
        String log = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char firstNonRepeating = '\0';

        for (char ch : log.toCharArray()) {
            if (map.get(ch) == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}
