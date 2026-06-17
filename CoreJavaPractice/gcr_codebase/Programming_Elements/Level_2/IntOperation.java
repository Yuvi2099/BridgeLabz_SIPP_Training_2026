package CoreJavaPractice.gcr_codebase.Programming_Elements.Level_2;

import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        int result1 = a + b * c;  
        int result2 = a * b + c;   
        int result3 = c + a / b;   
        int result4 = a % b + c;   

        System.out.println("The results of Int Operations are: "
            + "\na + b * c = " + result1
            + "\na * b + c = " + result2
            + "\nc + a / b = " + result3
            + "\na % b + c = " + result4);

        input.close();
    }
}
