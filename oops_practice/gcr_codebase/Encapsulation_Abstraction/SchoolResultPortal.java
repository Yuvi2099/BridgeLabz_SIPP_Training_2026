package oops_practice.gcr_codebase.Encapsulation_Abstraction;

import java.io.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            FileWriter fw = new FileWriter("reportcard.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double avg = (double) total / (data.length - 1);

                bw.write("Name: " + name +
                        ", Average: " + avg);
                bw.newLine();
            }

            System.out.println("Report card generated.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error processing file.");
        }
    }
}
