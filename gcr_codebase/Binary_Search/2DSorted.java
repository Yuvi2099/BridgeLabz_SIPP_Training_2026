package Binary_Search;
import java.util.*;

public class 2DSorted {

    static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target)
                return true;

            if (matrix[r][c] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println(searchMatrix(matrix, target));
    }
}