package camchern.anchana.lab3;

/**
 * This's a GuessNumberGameV3 program
 * The program defines three subroutines, namely configGame(), genAnswer(), and playGame()
 * configGame()
    The program lets a user specify these values
    : The minimum and maximum values of the guess number
    : The number of guesses that the user can try
 * genAnswer() to random a correct number
 * playGame() to run the game
 * The user can be input to set a minimum, maximum number and number of tries
 * If a user enters a number outside the minimum and maximum range,the program reports that the entered number should be in the range. In this case, the number of tries still remains the same.
 * The program will display  “Congratulations!  That’s correct”: if a guess number is the same as the answer
 * The program will display  “Please type a higher number! Number of remaining tries:<n>”: if a guess number is smaller than the answer
 * The program will display “Please type a lower number! Number of remaining tries:<n>”: if a guess number is higher than the answer
 * After the game ends, the program asks whether a user wants to continue to play. The user can give type ‘y’ to continue to play or ‘q’ to quit
 *
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 18th January 2021
 */

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum, maxNum;
    static int maxTriers;
    public static void main(String[] args) {
        configGame();
        genGame();
        playGames();
    }
    public static void configGame() {
        System.out.printf("Please enter the min and max value : " );
        Scanner userNumber = new Scanner(System.in);
        minNum = userNumber.nextInt();
        maxNum = userNumber.nextInt();

        System.out.printf("Pleas enter the number of tries : ");
        maxTriers = userNumber.nextInt();

    }
    public static void genGame() {
        correctNum = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1);
    }
    public static void playGames() {
        Scanner user = new Scanner(System.in);
        int reTries;
        for (reTries = maxTriers; reTries >= 1; reTries--) {
            System.out.print("Please enter a guess number: " );
            int guess = user.nextInt();
            if (guess > maxNum || guess < minNum) {
                System.out.println("The guess number much be in the range "  + (+ minNum + " and " + maxNum));
                reTries = reTries+1;
            } else if (correctNum == guess) {
                System.out.println("Congratulations ! That's correct");
                break;
            } else if (correctNum > guess) {
                System.out.println("Please type a higher number! ");
                System.out.println("Number of remaining tries : " + (reTries-1) );
            } else if (correctNum < guess) {
                System.out.println("Please type a lower number! ");
                System.out.println("Number of remaining tries : " + (reTries-1));
            }
        }
        System.out.print("If you want to play again? type 'y' to continue or 'q' to quit : "); //  ask the user to type 'y' ( to continuous) or 'q' (to quit the program)
        String ContinueOrQuit = user.next();
        if (ContinueOrQuit.equals("y")) { // if yhe user type 'y' the program will continuous and run again
            genGame();
            playGames();
        } else  if (ContinueOrQuit.equals("q")) { // if the user type 'q' the program will close
            System.exit(0); // leave the program
        }
    }
}

