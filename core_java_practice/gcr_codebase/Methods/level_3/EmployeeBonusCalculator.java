package core_java_practice.gcr_codebase.Methods.level_3;

public class EmployeeBonusCalculator {

    public static double[][] generateData() {

        double[][] employees =
                new double[10][2];

        for (int i = 0; i < 10; i++) {

            employees[i][0] =
                    (int)(Math.random()
                            * 90000) + 10000;

            employees[i][1] =
                    (int)(Math.random()
                            * 10) + 1;
        }

        return employees;
    }

    public static double[][] calculateBonus(
            double[][] employees) {

        double[][] result =
                new double[10][2];

        for (int i = 0; i < 10; i++) {

            double salary =
                    employees[i][0];

            double years =
                    employees[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] =
                    salary + bonus;

            result[i][1] =
                    bonus;
        }

        return result;
    }

    public static void main(String[] args) {

        double[][] employees =
                generateData();

        double[][] result =
                calculateBonus(employees);

        double oldSalary = 0;
        double newSalary = 0;
        double totalBonus = 0;

        System.out.println(
                "OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < 10; i++) {

            System.out.printf(
                    "%.0f\t\t%.0f\t%.2f\t%.2f%n",
                    employees[i][0],
                    employees[i][1],
                    result[i][1],
                    result[i][0]);

            oldSalary += employees[i][0];
            newSalary += result[i][0];
            totalBonus += result[i][1];
        }

        System.out.println(
                "\nTotal Old Salary = "
                        + oldSalary);

        System.out.println(
                "Total Bonus = "
                        + totalBonus);

        System.out.println(
                "Total New Salary = "
                        + newSalary);
    }
}