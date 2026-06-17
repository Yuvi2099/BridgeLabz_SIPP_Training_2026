package CoreJavaPractice.gcr_codebase.Programming_Elements.Level_1;
import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}