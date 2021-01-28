package camchern.anchana.lab4;

/**
 * This is MatrixDisplay program.
 * The program include one static 2-dimensional int array named matrix and two static int variables named rowDimension and columnDimension
 * The user can be set a the number of rows and the number of columns in the matrix.
 * If either the number of rows or the number of columns is less than or equal to zero then ask the user to input again.
 * The user can be input the member of matrix.
 * Then the program will display
 *         Matrix
 *         MatrixByRow
 *         MatrixByColumn
 *         MatrixByRowBackward
 *         MatrixByColumnBackward
 *         MatrixByRowZigzag
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 28th January 2021
 *
 */

import java.util.Scanner;

public class MatrixDisplay {
    static int matrix[][];
    static int rowDimension, columnDimension; // set a variable

    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();             // method
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByRowZigzag();
    }

    public static void inputMatrix() {
        System.out.println("Enter number of row then number of column of the matrix : ");
        Scanner UserInput = new Scanner(System.in); // accept number of row and column
        rowDimension = UserInput.nextInt();
        columnDimension = UserInput.nextInt();
        final int row = rowDimension; // max of row
        final int col = columnDimension; // max of column
        matrix = new int[row][col];
        int m;

        while (rowDimension <= 0 || columnDimension <= 0 ) {
            do {    // loop to display and accept value again when number of rows or the number of columns is less than or equal to zero
                System.out.println("Number of column and row much be positive.");
                Scanner UserInput2 = new Scanner(System.in);
                rowDimension = UserInput2.nextInt();
                columnDimension = UserInput2.nextInt();

            } while (rowDimension <= 0 || columnDimension <= 0);

        }
        System.out.println("Enter matrix by row.");
        Scanner UserMatrix = new Scanner(System.in);

        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col ; j++) {
                m = UserMatrix.nextInt();
                matrix[i][j] = m;
            }

        }

    }

    public static void showMatrix() {
        System.out.println("Showing original matrix : ");

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void showMatrixByRow() {
        System.out.print("Show matrix by rows : ");

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void showMatrixByColumn() {
        System.out.printf("Show matrix by columns : ");

        for (int i = 0 ; i < columnDimension ; i++) {
            for (int j = 0 ; j < rowDimension ; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();

    }

    public static void showMatrixByRowBackward() {
        System.out.printf("Show matrix by rows backward : ");

        for (int i = matrix.length - 1 ; i >= 0 ; i--) {
            for (int j = matrix[i].length - 1 ; j >= 0 ; j--) {
                System.out.printf(" " + matrix[i][j]);
            }
        }
        System.out.println();

    }

    public static void showMatrixByColumnBackward() {
        System.out.printf("Show matrix by column backward : ");

        for (int i = columnDimension - 1 ; i >= 0 ; i--) {
            for (int j = rowDimension - 1 ; j >= 0 ; j--) {
                System.out.printf(" " + matrix[j][i]);
            }
        }
        System.out.println();

    }
    public static void showMatrixByRowZigzag() {
        System.out.printf("Show matrix by rows zigzag : ");
        int evenRow = 0;
        int oddRow = 1;
        int row = rowDimension;
        int col = columnDimension;

        while (evenRow < row) {
            for ( int i = 0 ; i < col ; i++) {
                System.out.printf(matrix[evenRow][i] + " ");
            }
            evenRow = evenRow + 2;

            if (oddRow < row) {
                for (int i = col - 1 ; i >= 0 ; i --) {
                    System.out.printf(matrix[oddRow][i] + " ");
                }
            }
            oddRow = oddRow + 2;
        }
        System.out.println();
    }
}
