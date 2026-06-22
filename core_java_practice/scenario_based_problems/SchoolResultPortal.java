package core_java_practice.scenario_based_problems;
import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            Scanner fileReader = new Scanner(new File(inputFile));

            FileWriter writer = new FileWriter(outputFile, true); 

            writer.write("\n===== REPORT CARD =====\n");

            double total = 0;
            int count = 0;

            while (fileReader.hasNext()) {
                String name = fileReader.next();
                int marks = fileReader.nextInt();

                total += marks;
                count++;

                writer.write("Name: " + name +
                            " | Marks: " + marks + "\n");
            }

            double average = total / count;

            writer.write("----------------------\n");
            writer.write("Class Average: " + average + "\n");
            writer.write("======================\n");

            fileReader.close();
            writer.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student data file not found.");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}