package core_java_practice.gcr_codebase.control_flow.level_3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        
        if (number == 0) {
            count = 1;
        } else {

            
            number = Math.abs(number);

            while (number != 0) {
                number = number / 10; 
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
