package core_java_practice.gcr_codebase.Java_IO;

import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            
            br = new BufferedReader(new FileReader("students.txt"));

            bw = new BufferedWriter(new FileWriter("reportcard.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int total = 0;
                int subjects = data.length - 1;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / subjects;

                bw.write("Name : " + name);
                bw.newLine();

                bw.write("Average : " + String.format("%.2f", average));
                bw.newLine();

                bw.write("------------------------");
                bw.newLine();
                bw.newLine();
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");

        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid marks found in file.");

        } finally {
            try {
                if (br != null)
                    br.close();

                if (bw != null)
                    bw.close();

            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}