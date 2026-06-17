package core_java_practice.gcr_codebase.Methods.scenario_based;

public class DeliveryChargeSystem {

    
    public static double calculateCharge(
            int distance) {

        return distance * 5;
    }

    
    public static double calculateCharge(
            int distance,
            int weight) {

        return (distance * 5) +
                (weight * 10);
    }

    
    public static double calculateCharge(
            int distance,
            int weight,
            boolean expressDelivery) {

        double charge =
                (distance * 5) +
                (weight * 10);

        if (expressDelivery) {
            charge += 100;
        }

        return charge;
    }

    public static void main(String[] args) {

        System.out.println(
                "Charge 1 = ₹" +
                calculateCharge(20));

        System.out.println(
                "Charge 2 = ₹" +
                calculateCharge(20, 5));

        System.out.println(
                "Charge 3 = ₹" +
                calculateCharge(20, 5, true));
    }
}