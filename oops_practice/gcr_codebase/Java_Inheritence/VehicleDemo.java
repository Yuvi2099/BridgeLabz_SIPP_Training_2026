package oops_practice.gcr_codebase.Java_Inheritence;

interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends Vehicle
        implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " is refueling...");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla", 250);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        ev.charge();
        pv.refuel();
    }
}