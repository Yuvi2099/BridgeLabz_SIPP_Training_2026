package oops_practice.gcr_codebase.class_object;
class Drone {

    private String droneId;
    private int batteryPercentage;

    static String companyName = "SkyLogistics";

    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " started delivery.");
        } else {
            System.out.println(droneId +
                    " cannot start delivery. Low battery!");
        }
    }

    public void displayStatus() {
        System.out.println("\nDrone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
    }
}

public class DroneDemo {

    public static void main(String[] args) {

        Drone d1 = new Drone("DR101", 85);
        Drone d2 = new Drone("DR102", 60);
        Drone d3 = new Drone("DR103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("\nChanging company name...");

        Drone.companyName = "AeroExpress";

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}