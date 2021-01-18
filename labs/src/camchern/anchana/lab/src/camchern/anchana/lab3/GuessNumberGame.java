package camchern.anchana.lab3;

/**
 * This's a GuessNumberGame program.
 * The program will random a answer number from range 1 and 10 and recorded it.
 * Then program will accept a guess number from the user.
 * The user can guesses number for 3 time.
 * If the guess number is a same as the answer the program will display "Congratulations ! That's correct" and show a remaining tries and close the program
 * If the guess number is more than the answer the program will display "Please type a lower number! " and show a remaining tries.
 * If the guess number is less than the answer the program will display "Please type a higher number! " and show a remaining tries.
 * If the guess number is not correct and the user already have a 3 tries the program will close.
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 18th January 2021
 *
 */

import java.util.Scanner; // import scanner

public class GuessNumberGame {
    public static void main(String[] args) {
        int minNum = 1; // set a type  and value of variables
        int maxNum = 10;
        int answerNumber = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1); // random a answer
        int guessNumber;
        int Tries;
        for (Tries = 2; Tries >= 0;  Tries--) {
            Scanner user = new Scanner(System.in); // accept a
            System.out.printf("Please enter a guess number(1-10): "); // ask user to  input a guess number
            guessNumber = user.nextInt();
            if (answerNumber == guessNumber) {
                System.out.println("Congratulations ! That's correct"); //when the guess number is same the answer
                break; // stop or exit the program.
            } else if (answerNumber > guessNumber) {
                System.out.println("Please type a higher number! "); // when the guess number is less than the answer
                System.out.printf("Number of remaining tries : " +Tries); // show a remaining tries
            } else if (answerNumber < guessNumber) {
                System.out.printf("Please type a lower number! "); // when the guess number is more than the answer
                System.out.println("Number of remaining tries : " +Tries); // show a remaining tries
            }
        }
    }
}

