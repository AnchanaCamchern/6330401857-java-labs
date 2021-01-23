package camchern.anchana.lab3;

/**
 * This is a GuessNumberGameV2 program
 * The program will use a static method to run a program
 * The program defines two subroutines, namely genAnswer(), and playGame()
 * genAnswer() subroutine for random a a answer or in the program is correctNum
 * playGame() subroutine for run a game
 * The program will display  “Congratulations!  That’s correct”: if a guess number is the same as the answer
 * The program will display  “Please type a higher number! Number of remaining tries:<n>”: if a guess number is smaller than the answer.
 * The program will display “Please type a lower number! Number of remaining tries:<n>”: if a guess number is higher than the answer
 * When the user already have a 3 tries, the program will close
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 18th January 2021
 */

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int CorrectNum;
    static int MinNum = 1, MaxNum = 10; //min and max number
    static int Tries, Guess;
    public static void main(String[] args) { // there are two subroutine
        genGame();
        playGame();
    }
    public static void genGame() { // to random a answer
        CorrectNum = MinNum + (int) (Math.random()* (MaxNum - MinNum) + 1); // random the answer
    }
    public static void playGame() { //to play a game

        for(Tries = 2; Tries >= 0;  Tries--) {
            Scanner User = new Scanner(System.in);
            System.out.printf("Please enter a guess number(1-10): ");
            Guess = User.nextInt();

            if (CorrectNum == Guess) {
                System.out.println("Congratulations ! That's correct");
                break; // stop when a guess number is a same as a answer
            } else if (CorrectNum > Guess) {
                System.out.printf("Please type a higher number! ");
                System.out.println("Number of remaining tries : " +Tries);
            } else if (CorrectNum < Guess) {
                System.out.printf("Please type a lower number! ");
                System.out.println("Number of remaining tries : " +Tries);
            }
        }
    }
}
