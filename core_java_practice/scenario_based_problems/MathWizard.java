package core_java_practice.scenario_based_problems;

public class MathWizard {

    
    int instanceVar = 100;

    
    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    
    public long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    
    
    public double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    
    public void fibonacci(int n) {

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

   
    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void demonstrateScope() {

        int instanceVar = 50;

        System.out.println("Local Variable = " + instanceVar);
        System.out.println("Instance Variable = " + this.instanceVar);
    }

    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (17): " + mw.isPrime(17));

        System.out.println("Factorial (5): " + mw.factorial(5));

        System.out.println("Factorial (5.0): " + mw.factorial(5.0));

        mw.fibonacci(10);

        System.out.println("GCD of 24 and 36: " + mw.gcd(24, 36));

        System.out.println("LCM of 24 and 36: " + mw.lcm(24, 36));

        System.out.println("2^5 = " + mw.power(2, 5));

        System.out.println("\nScope Demonstration:");
        mw.demonstrateScope();
    }
}