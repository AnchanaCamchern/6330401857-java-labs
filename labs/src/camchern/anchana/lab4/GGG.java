import java.util.Scanner;

public class GGG {
    static int matrix[][];
    static int rowDimension, columnDimension;
    /**static int MAX_NUMBER_OF_COURSES = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSES];
    static int[] term = new int[MAX_NUMBER_OF_COURSES];
    static String[] courseName = new String[MAX_NUMBER_OF_COURSES];
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSES];
    static String[] grade = new String[MAX_NUMBER_OF_COURSES];
    static int numberOfCourses = 0;
    public static void main(String[] args) {
        final int row = 5;
        final int col = 5;
        int [][] matrix = new int[row][col];
        int m;

        System.out.println("Enter matrix by row.");
        Scanner UserMatrix = new Scanner(System.in);

        for ( int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int yearInput = UserMatrix.nextInt();
                int termInput = UserMatrix.nextInt();
                String courseNameInput = UserMatrix.next();
                int courseCreditInput = UserMatrix.nextInt();
                String gradeInput = UserMatrix.next();
                m = UserMatrix.nextInt();
                matrix[i][j] = m;
                year[i] = yearInput;
                term[i] = termInput;
                courseName[i] = courseNameInput;
                courseCredit[i] = courseCreditInput;
                grade[i] = gradeInput;
            }System.out.println();

        }
        System.out.println();
    }
     */
    public static void main (String[] args) {
        showMatrix();

        System.out.println("Enter number of row then number of column of the matrix : ");
        Scanner UserInput = new Scanner(System.in);
        rowDimension = UserInput.nextInt();
        columnDimension = UserInput.nextInt();
        final int row = rowDimension;
        final int col = columnDimension;
        matrix = new int[row][col];
        int m;

        while (rowDimension <= 0 || columnDimension <= 0 ) {
            do {
                System.out.println("Number of column and row much be positive.");
                Scanner UserInput2 = new Scanner(System.in);
                rowDimension = UserInput2.nextInt();
                columnDimension = UserInput2.nextInt();

            } while (rowDimension <= 0 || columnDimension <= 0);


        }
        System.out.println("Enter matrix by row.");
        Scanner UserMatrix = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m = UserMatrix.nextInt();
                matrix[i][j] = m;
            }

        }

    }

    public static void showMatrix() {
        System.out.println("Showing original matrix : ");

        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}

