package core_java_practice.gcr_codebase.programming_elements.level_2;

import java.util.Scanner;

public class TotalPurchaseprice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);

        input.close();
    }
}
