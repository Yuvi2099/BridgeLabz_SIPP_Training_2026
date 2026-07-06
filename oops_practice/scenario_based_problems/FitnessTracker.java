package oops_practice.scenario_based_problems;

interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps, 3 km walked.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report Generated:");
        System.out.println("Steps: 5000");
        System.out.println("Calories Burned: 250");
        System.out.println("Distance: 3 km");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Daily step goal not completed!");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}