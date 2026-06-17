package core_java_practice.scenario_based_problems;

public class Ravi_Bonus {
    public static void main(String[] args) {
       
        String name = "Ravi";
        int age = 25;
        String rank = "Senior Member";
        double salary = 50000;
        float membershipFee = 1499.75f;

        
        int annualBonus = (int) (salary * 0.12);

        System.out.println("  WELCOME TO THE GUILD  ");
        System.out.println();
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : Rs " + salary);
        System.out.println("Membership Fee : Rs " + membershipFee);
        System.out.println("Annual Bonus   : Rs " + annualBonus);
        System.out.println();
        System.out.println("Welcome, " + name + "To Coding Guild.");
        
    }
}
