package oops_practice.gcr_codebase.Encapsulation_Abstraction;

import java.io.*;

public class GroceryBillReader {

    public static void main(String[] args) {

        int lineCount = 0;

        try (
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("bill.txt"))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                lineCount++;
            }

            System.out.println(
                    "\nTotal Lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}