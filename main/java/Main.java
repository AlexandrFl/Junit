import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {6, 4}};
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int x = 2;

        System.out.println("Поворот матрицы на 90 градусов");
        System.out.println("Исходная матрица");
        printMatrix(matrix1);
        System.out.println("Новая матрица");
        printMatrix(rotation90(matrix1));
        System.out.println();

        System.out.println("Деление матрицы на число " + x);
        System.out.println("Исходная матрица");
        printMatrix(matrix2);
        System.out.println("Новая матрица");
        printMatrix(divideMatrix(matrix2, x));
        System.out.println();

        System.out.println("Сравнение матриц");
        System.out.println("Матрица 1");
        printMatrix(matrix3);
        System.out.println("Матрица 2");
        printMatrix(matrix2);
        boolean e = equalsMatrix(matrix3, matrix2);
        System.out.println("Матрицы равны? " + e);


   }


    public static int[][] divideMatrix(int[][] m1, int dev) {
        int[][] resMatrix = new int[m1.length][m1.length];
        if (dev > 0) {
            for (int i = 0; i < resMatrix.length; i++) {
                for (int j = 0; j < resMatrix.length; j++) {
                    resMatrix[i][j] = m1[i][j] / dev;
                }
            }
        }
        return resMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", ints[j]);
            }
            System.out.println();
        }
    }
    public static boolean equalsMatrix(int[][] m1, int [][] m2) {
        return Arrays.deepEquals(m1, m2);
    }

    public static int[][] rotation90(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return newMatrix;
    }
}



