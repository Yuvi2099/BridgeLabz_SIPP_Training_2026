package oops_practice.gcr_codebase.class_object;

class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    private static int totalAccounts = 0;
    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Overdraft not allowed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        }
    }

    
    public void getStatement() {
        System.out.println("\n Account Statement ");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holder);
        System.out.println("Current Balance: ₹" + balance);
    }

    
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Manjeet", 10000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 15000);
        BankAccount acc3 = new BankAccount(103, "Sneha", 20000);

        System.out.println("\nTransactions for Account 1");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(10000);

        System.out.println("\nTransactions for Account 2");
        acc2.deposit(4000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(5000);
        acc2.withdraw(12000);

        System.out.println("\nTransactions for Account 3");
        acc3.deposit(3000);
        acc3.withdraw(2500);
        acc3.deposit(1500);
        acc3.withdraw(7000);
        acc3.withdraw(10000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created = "
                + BankAccount.getTotalAccounts());
    }
}
