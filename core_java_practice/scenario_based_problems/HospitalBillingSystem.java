package core_java_practice.scenario_based_problems;

import java.util.Scanner;


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[] patients = {"Rahul", "Priya", "Aman", "Neha"};

        try {
            
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            
            System.out.print("Enter number of bill items: ");
            int items = Integer.parseInt(sc.nextLine());

            
            double avgBill = totalBill / items;
            System.out.println("Average bill per item: " + avgBill);

            
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            if (payment < totalBill) {
                throw new InsufficientFundsException(
                    "Payment failed! Insufficient funds."
                );
            }

            System.out.println("Payment Successful!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of bill items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index entered.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        sc.close();
    }
}
