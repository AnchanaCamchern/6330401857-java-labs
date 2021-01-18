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
    static int correctNum;
    static int minNum = 1, maxNum = 10; //min and max number
    static int Tries, guess;
    public static void main(String[] args) { // there are two subroutine
        genGame();
        playGame();
    }
    public static void genGame() { // to random a answer
        correctNum = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1); // random the answer
    }
    public static void playGame() { //to play a game
        for(Tries = 2; Tries >= 0;  Tries--) {
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter a guess number(1-10): ");
            guess = user.nextInt();
            if (correctNum== guess) {
                System.out.println("Congratulations ! That's correct");
                break; // stop when a guess number is a same as a answer
            } else if (correctNum> guess) {
                System.out.println("Please type a higher number! ");
                System.out.println("Number of remaining tries : " +Tries);
            } else if (correctNum < guess) {
                System.out.println("Please type a lower number! ");
                System.out.println("Number of remaining tries : " +Tries);
            }
        }
    }
}
