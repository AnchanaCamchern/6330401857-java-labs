import java.util.Scanner;

public class GGG {
    static int MAX_NUMBER_OF_COURSES = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSES];
    static int[] term = new int[MAX_NUMBER_OF_COURSES];
    static String[] courseName = new String[MAX_NUMBER_OF_COURSES];
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSES];
    static String[] grade = new String[MAX_NUMBER_OF_COURSES];
    static int numberOfCourses = 0;

    public static void main(String[] args) {
        inputGrade();
        showGPA();
    }

    public static void inputGrade() {
        final int row = 150;
        final int col = 5;

        System.out.println("Enter grades of student (year term name_course credit grade).");
        System.out.println("Finish when enter year with 0 ");
        Scanner userGPA = new Scanner(System.in);

        for (int i = 0; i < MAX_NUMBER_OF_COURSES ; i++) {
            int yearInput = userGPA.nextInt();
            if (yearInput == 0){
                break;
            }
            numberOfCourses++;

            int termInput = userGPA.nextInt();
            String courseNameInput = userGPA.next();
            int courseCreditInput = userGPA.nextInt();
            String gradeInput = userGPA.next();
            year[i] = yearInput;
            term[i] = termInput;
            courseName[i] = courseNameInput;
            courseCredit[i] = courseCreditInput;
            grade[i] = gradeInput;
        }
        showGPA();
    }

    public static void userGPA() {

        for (int i = 0 ; i < numberOfCourses ; i++) {
            System.out.println(year[i] + " " + term[i] +  " " + courseName[i] + " "+ courseCredit[i] + " " +grade[i]);
        }
        System.out.println(" ");
    }

    public static void convertGPA() {
        double gradeNumber = 0;
        double sumPoints = 0;
        double totalCredits = 0;

        for (int i = 0 ; i < numberOfCourses ; i++) {
            if (grade[i].equals("A")) {
                gradeNumber = 4;
            } else if (grade[i].equals("B+")) {
                gradeNumber = 3.5;
            } else if (grade[i].equals("B")) {
                gradeNumber = 3;
            } else if (grade[i].equals("C+")) {
                gradeNumber = 2.5;
            } else if (grade[i].equals("C")) {
                gradeNumber = 2;
            } else if (grade[i].equals("D+")) {
                gradeNumber = 1.5;
            } else if (grade[i].equals("D")) {
                gradeNumber = 1;
            } else if (grade[i].equals("F")) {
                gradeNumber = 0;
            }
        }
    }

    public static void specific() {
        double gradeNumber = 0;
        double sumPoints = 0;
        double totalCredits = 0;
        Scanner inputTermYear = new Scanner(System.in);
        int yearInput = inputTermYear.nextInt();
        int termInput = inputTermYear.nextInt();
        convertGPA();
        for(int i = 0; i < numberOfCourses ; ++i) {
            if (year[i] == yearInput && term[i] == termInput) {
                sumPoints += (int) courseCredit[i] * ((int) gradeNumber);
                totalCredits += courseCredit[i];
            }
        }
        double accumulated = sumPoints / totalCredits;
        System.out.println("Accumulated GPA is " + " " + accumulated);
    }

    public static void accumulatedGPA() {
        double gradeNumber = 0;
        double sumPoints = 0;
        double totalCredits = 0;
        convertGPA();
        for(int i = 0; i < numberOfCourses ; ++i) {
            sumPoints += (int) courseCredit[i] * ((int) gradeNumber);
            totalCredits += courseCredit[i];
        }
        double accumulated = sumPoints / totalCredits;
        System.out.println("Accumulated GPA is " + " " + accumulated);
    }

    public static void showGPA() {

        while (true) {
            System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, " +
                    " 't' for GPA for specific term or 'q' to exit ");
            Scanner userSelect = new  Scanner(System.in);
            String nextStep = userSelect.next();

            if (nextStep.equals("o")) {
                System.out.println("year  term  name_course  credit  grade");
                userGPA();
            }
            else if (nextStep.equals("a")) {
                accumulatedGPA();
            }
            else if (nextStep.equals("t")) {
                System.out.println("Enter which year and term do you want to see GPA");
                specific();
            }
            else if (nextStep.equals("q")) {
                System.exit(0); // leave the program.
            }
        }
    }
}