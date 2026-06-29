package core_java_practice.gcr_codebase.Java_IO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 1; i <= 5; i++) {
            String feedback = br.readLine();

            // Convert to lowercase for case-insensitive matching
            feedback = feedback.toLowerCase();

            if (feedback.contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}