package core_java_practice.gcr_codebase.programming_elements.level_2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        // 1 square inch = 6.4516 square cm
        double areaInches = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is "
                + areaInches + " and sq cm is " + areaCm);

        input.close();
    }
}
