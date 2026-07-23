package gcr_codebase.RecursionAndBacktracking;
import java.util.*;
public class SensorPlacement {

    static List<List<String>> result = new ArrayList<>();

    static boolean isSafe(int row, int col, int[] queenCol) {

        for (int i = 0; i < row; i++) {

            if (queenCol[i] == col)
                return false;

            if (Math.abs(queenCol[i] - col) == Math.abs(i - row))
                return false;
        }

        return true;
    }

    static List<String> buildBoard(int n, int[] queenCol) {

        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            char[] row = new char[n];
            Arrays.fill(row, '.');

            row[queenCol[i]] = 'Q';

            board.add(new String(row));
        }

        return board;
    }

    static void backtrack(int n, int row, int[] queenCol) {

        if (row == n) {
            result.add(buildBoard(n, queenCol));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, queenCol)) {

                queenCol[row] = col;

                backtrack(n, row + 1, queenCol);
            }
        }
    }

    static List<List<String>> solveNQueens(int n) {

        result.clear();

        int[] queenCol = new int[n];

        backtrack(n, 0, queenCol);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        List<List<String>> ans = solveNQueens(n);

        System.out.println("\nSolutions:");

        for (List<String> board : ans) {

            for (String row : board)
                System.out.println(row);

            System.out.println();
        }

        sc.close();
    }
}