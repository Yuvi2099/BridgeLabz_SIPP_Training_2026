package core_java_practice.gcr_codebase.Exception_handling;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(
            String message,
            double balance,
            double requestedAmount) {

        super(message);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

class ATM {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance",
                    balance,
                    amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Available Balance: ₹" + e.getBalance());
            System.out.println("Requested Amount: ₹" + e.getRequestedAmount());
        }
    }
}
