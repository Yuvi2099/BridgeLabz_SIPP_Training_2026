package core_java_practice.gcr_codebase.Methods.level_3;
    
    public class MatrixAdvanced {

    public static int[][] randomMatrix(
            int rows,
            int cols) {

        int[][] matrix =
                new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] =
                        (int)(Math.random() * 9) + 1;
            }
        }

        return matrix;
    }

    public static int[][] transpose(
            int[][] matrix) {

        int[][] result =
                new int[matrix[0].length]
                        [matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0;
                 j < matrix[0].length;
                 j++) {

                result[j][i] =
                        matrix[i][j];
            }
        }

        return result;
    }

    public static int determinant2x2(
            int[][] m) {

        return m[0][0] * m[1][1]
                - m[0][1] * m[1][0];
    }

    public static int determinant3x3(
            int[][] m) {

        return m[0][0] *
                (m[1][1] * m[2][2]
                 - m[1][2] * m[2][1])

                - m[0][1] *
                (m[1][0] * m[2][2]
                 - m[1][2] * m[2][0])

                + m[0][2] *
                (m[1][0] * m[2][1]
                 - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(
            int[][] m) {

        int det =
                determinant2x2(m);

        if (det == 0)
            return null;

        double[][] inv =
                new double[2][2];

        inv[0][0] =
                (double)m[1][1] / det;

        inv[0][1] =
                (double)-m[0][1] / det;

        inv[1][0] =
                (double)-m[1][0] / det;

        inv[1][1] =
                (double)m[0][0] / det;

        return inv;
    }

    public static void display(
            int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {

                System.out.print(
                        value + "\t");
            }

            System.out.println();
        }
    }

    public static void displayDouble(
            double[][] matrix) {

        if (matrix == null) {

            System.out.println(
                    "Inverse Not Possible");

            return;
        }

        for (double[] row : matrix) {

            for (double value : row) {

                System.out.printf(
                        "%.2f\t",
                        value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix2 =
                randomMatrix(2, 2);

        System.out.println(
                "2x2 Matrix");

        display(matrix2);

        System.out.println(
                "\nTranspose");

        display(transpose(matrix2));

        System.out.println(
                "\nDeterminant = "
                        + determinant2x2(
                        matrix2));

        System.out.println(
                "\nInverse");

        displayDouble(
                inverse2x2(matrix2));

        int[][] matrix3 =
                randomMatrix(3, 3);

        System.out.println(
                "\n3x3 Matrix");

        display(matrix3);

        System.out.println(
                "\nDeterminant = "
                        + determinant3x3(
                        matrix3));
    }
}