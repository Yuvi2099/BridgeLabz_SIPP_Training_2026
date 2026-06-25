package oops_practice.gcr_codebase.Encapsulation_Abstraction;

import java.io.*;

public class FeedbackAnalyzer {

    public static void main(String[] args)
            throws IOException {

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 1; i <= 5; i++) {

            String feedback = br.readLine();

            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println(
                "Good Feedback Count = " + count);
    }
}