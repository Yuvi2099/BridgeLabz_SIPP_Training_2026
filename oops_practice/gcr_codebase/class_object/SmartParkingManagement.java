package oops_practice.gcr_codebase.class_object;
class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("----------------------------");
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("\n===== PARKED CARS =====");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\n===== PARKED BIKES =====");

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("HP01A1234", "Manjeet", "Car");
        vehicles[1] = new Vehicle("HP02B5678", "Rahul", "Bike");
        vehicles[2] = new Vehicle("HP03C1111", "Sneha", "Car");
        vehicles[3] = new Vehicle("HP04D2222", "Aman", "Bike");
        vehicles[4] = new Vehicle("HP05E3333", "Priya", "Car");
        vehicles[5] = new Vehicle("HP06F4444", "Rohit", "Bike");
        vehicles[6] = new Vehicle("HP07G5555", "Neha", "Car");
        vehicles[7] = new Vehicle("HP08H6666", "Karan", "Bike");
        vehicles[8] = new Vehicle("HP09I7777", "Anjali", "Car");
        vehicles[9] = new Vehicle("HP10J8888", "Vishal", "Auto-Rickshaw");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
