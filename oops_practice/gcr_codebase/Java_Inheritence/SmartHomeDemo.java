package oops_practice.gcr_codebase.Java_Inheritence;

class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId,String status,int temperatureSetting) {

        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: "
                + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t =
                new Thermostat("TH101",
                        "ON",
                        24);

        t.displayStatus();
    }
}
