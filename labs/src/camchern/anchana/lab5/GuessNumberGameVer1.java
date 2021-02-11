/**
 * This is GuessNumberGameVer1 program, and the program will accept the number that's the user input for guess a correct number.
 * The user can be  set a minimum number, maximum number and maximum number of tries.
 * The the user can enter a guess number until the user guesses correctly or there is run out of the number of guesses.
 * The program can set a correct number.
 * If the guess number is a same as the answer the program will display "Congratulations ! That's correct"
    and show a remaining tries and close the program
 * If the guess number is more than the answer the program will display "Please type a lower number! "
    and show a remaining tries and continue the program.
 * If the guess number is less than the answer the program will display "Please type a higher number! "
    and show a remaining tries and continue the program.
 * This program have five protected variables include :
 *  - integer variables is minNum, maxNum, correctNum, and maxTries.
 *  - static integer variables is numOfGame.
 * GuessNumberGameVer1 include three constructors, that's
 *  - GuessNumberGameVer1()
 *  - GuessNumberGameVer1(int, int)
 *  - GuessNumberGameVer1(int, int, int)
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 11th February 2021
 *
 */


package camchern.anchana.lab5;

import java.util.Scanner;

class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    GuessNumberGameVer1() {  // constructors  takes no parameters
        minNum = 1;      // initializes minimum number to 1
        maxNum = 10;    // initializes maximum number to 10
        maxTries = 3;   // initializes maximum of tries to 3
        numOfGames++;   // number of game  will be incremented by 1
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1)); // set a correct number
    }

    GuessNumberGameVer1(int minNum, int maxNum) { //accepts the first integer which will be used to initialize minimum number and the second integer which will be used to initialize maximum number
        this.minNum = minNum;
        this.maxNum = maxNum;
        maxTries = 3;
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        numOfGames++;
    }

    GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {  // accepts three parameters. The first two integers will be used to initialize minNum and maxNum while the third integer will be used to initialize maxTries
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        numOfGames++;
    }

    public int getMinNum() {
        return minNum; // returns the value of the variable getMinNum
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum; // returns the value of the variable getMaxNum
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxTries() {
        return maxTries; // returns the value of the variable getMaxTries
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    public void playGame() { // method playGame to run the game.
        int maxTriers = this.maxTries;
        Scanner user = new Scanner(System.in);

        for(int i = maxTriers ; i > 0 ; i--) {
            System.out.print("Please enter a guess number(" + minNum + " - "  + maxNum + " ) :");
            int guess = user.nextInt();

            if (guess > maxNum || guess < minNum) {
                System.out.println("The guess number much be in the range " + minNum + " and " + maxNum );
                i++;

            } else if (correctNum == guess) {
                System.out.println("Congratulations ! That's correct");
                numOfGames++;
                break;

            }else if (correctNum > guess) {
                System.out.print("Please type a higher number! ");
                System.out.println("Number of remaining tries : " + (i - 1));
                numOfGames++;

            } else {
                System.out.print("Please type a lower number! ");
                System.out.println("Number of remaining tries : " + (i - 1 ));
                numOfGames++;
            }
        }
    }

    @Override
    public String toString() {
        return "GuessNumberGame with min number as " + minNum +
                " max number as " + maxNum +
                " max number of tries as " + maxTries ;
    }

    public static int getNumOfGames() {
        return numOfGames;  //returns the value of the variable numOfGames.
    }
}



