package CoreJavaPractice.gcr_codebase.Programming_Elements.Level_2;
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are: "
            + "\na + b * c = " + result1
            + "\na * b + c = " + result2
            + "\nc + a / b = " + result3
            + "\na % b + c = " + result4);

        input.close();
    }
}