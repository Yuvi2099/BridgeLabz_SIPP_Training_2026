package core_java_practice.scenario_based_problems;

public class TowerOfHanoi {

    static int moveCount = 0;

    public static void solveHanoi(int n, char source,
                                  char auxiliary,
                                  char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from "
                    + source + " to " + destination);
            moveCount++;
            return;
        }

        solveHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from "
                + source + " to " + destination);
        moveCount++;

        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {

        int n = 3;

        solveHanoi(n, 'A', 'B', 'C');

        System.out.println("Total Moves = " + moveCount);
    }
}
