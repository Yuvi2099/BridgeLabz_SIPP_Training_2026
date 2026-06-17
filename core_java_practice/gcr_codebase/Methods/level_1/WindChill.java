package core_java_practice.gcr_codebase.Methods.level_1;

import java.util.Scanner;

public class WindChill {

    public static double calculateWindChill(
            double temperature,
            double windSpeed) {

        return 35.74
                + 0.6215 * temperature
                - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature
                * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        double speed = sc.nextDouble();
        sc.close();

        System.out.println(
                "Wind Chill = "
                        + calculateWindChill(temp, speed));
    }
}
