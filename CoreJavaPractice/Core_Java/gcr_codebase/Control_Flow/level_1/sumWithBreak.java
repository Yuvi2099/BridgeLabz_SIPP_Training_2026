package CoreJavaPractice.gcr_codebase.Control_Flow.level_1;
import java.util.Scanner;

public class sumWithBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }
        sc.close();

        System.out.println("Total Sum = " + total);
    }
}
