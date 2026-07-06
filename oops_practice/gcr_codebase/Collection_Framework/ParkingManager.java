package oops_practice.gcr_codebase.Collection_Framework;

import java.util.*;

public class ParkingManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    static void exitVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle not found.");
    }

    static void searchVehicle(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is parked.");
        else
            System.out.println("Vehicle not found.");
    }

    static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        enterVehicle("UP32AB1234");
        enterVehicle("DL01CD5678");
        enterVehicle("HR26EF1111");

        searchVehicle("DL01CD5678");

        exitVehicle("UP32AB1234");

        displayVehicles();
    }
}