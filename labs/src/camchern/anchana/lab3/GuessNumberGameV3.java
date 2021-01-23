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
    static int CorrectNum;
    static int MinNum, MaxNum;
    static int MaxTriers;
    public static void main(String[] args) {
        configGame();
        genGame();
        playGames();
    }
    public static void configGame() {
        System.out.printf("Please enter the min and max value : " );
        Scanner UserNumber = new Scanner(System.in);
        MinNum = UserNumber.nextInt();
        MaxNum = UserNumber.nextInt();

        if (MinNum > MaxNum) {
            int NumberValue = MinNum;
            MinNum = MaxNum;
            MaxNum = NumberValue;
        }


        System.out.printf("Pleas enter the number of tries : ");
        MaxTriers = UserNumber.nextInt();

    }
    public static void genGame() {

        CorrectNum = MinNum + (int) (Math.random() * (MaxNum - MinNum) + 1);
    }
    public static void playGame() {
        Scanner user = new Scanner(System.in);
        int ReTries;

        for (ReTries = MaxTriers; ReTries >= 1; ReTries--) {
            System.out.print("Please enter a guess number: " );
            int Guess = user.nextInt();
            if (Guess > MaxNum || Guess < MinNum) {
                System.out.println("The guess number much be in the range "  + (+ MinNum + " and " + MaxNum));
                ReTries = ReTries+1;
            } else if (CorrectNum == Guess) {
                System.out.println("Congratulations ! That's correct");
                break;
            } else if (CorrectNum > Guess) {
                System.out.printf("Please type a higher number! ");
                System.out.println("Number of remaining tries : " + (ReTries-1) );
            } else if (CorrectNum < Guess) {
                System.out.printf("Please type a lower number! ");
                System.out.println("Number of remaining tries : " + (ReTries-1));
            }
        }
    }
    public static void playGames() {
        playGame();

        while (true) {
            Scanner User = new Scanner(System.in);
            System.out.print("If you want to play again? type 'y' to continue or 'q' to quit : "); //  ask the user to type 'y' ( to continuous) or 'q' (to quit the program)
            String ContinueOrQuit = User.next();
            if (ContinueOrQuit.equals("y")) { // if the user type 'y' the program will continuous and run again
                genGame();
                playGame();
            } else if (ContinueOrQuit.equals("q")) { // if the user type 'q' the program will close
                System.exit(0); // leave the program
            }
        }
    }
}

