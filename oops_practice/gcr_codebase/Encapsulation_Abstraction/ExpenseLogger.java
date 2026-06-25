package oops_practice.gcr_codebase.Encapsulation_Abstraction;

import java.io.*;
import java.util.Scanner;

public class ExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Expense Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        try (
            FileWriter fw =
                    new FileWriter("expenses.txt", true);
            BufferedWriter bw =
                    new BufferedWriter(fw)
        ) {

            bw.write(type + " - " + amount);
            bw.newLine();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println(
                    "Error writing expense.");
        }

        sc.close();
    }
}