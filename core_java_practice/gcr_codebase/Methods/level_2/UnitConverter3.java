package core_java_practice.gcr_codebase.Methods.level_2;

import java.util.Scanner;

public class UnitConverter3 {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + fahrenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));

        System.out.print("Enter Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms = " + poundsToKilograms(pounds));

        System.out.print("Enter Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds = " + kilogramsToPounds(kg));

        System.out.print("Enter Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters = " + gallonsToLiters(gallons));

        System.out.print("Enter Liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons = " + litersToGallons(liters));

        sc.close();
    }
}