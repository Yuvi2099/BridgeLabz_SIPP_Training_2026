package oops_practice.gcr_codebase.Java_Interface;
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
        System.out.println("Activity Logged: 5000 steps.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Drink Water!");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nJava allows multiple interface implementation.");
        System.out.println("Java does NOT allow multiple class inheritance.");
    }
}
