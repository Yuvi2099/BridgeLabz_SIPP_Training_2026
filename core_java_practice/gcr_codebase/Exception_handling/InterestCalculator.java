package core_java_practice.gcr_codebase.Exception_handling;
public class InterestCalculator {

    // Method declares that it may throw an exception
    static double calculateInterest(double amount,
                                    double rate,
                                    int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException(
                    "Amount and rate must be positive");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {

            double interest =
                    calculateInterest(-10000, 5, 2);

            System.out.println("Interest = " + interest);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Invalid input: Amount and rate must be positive");
        }
    }
}