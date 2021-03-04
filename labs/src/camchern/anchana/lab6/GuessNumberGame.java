/**
 * This is GuessNumberGame that's inherited from Game class.
 * This is basically the GuessNumberGameVer1 in lab5.
 * Has variables minNum, maxNum, correctNum, maxTries, numOfGames.
 * Has getter and setter methods for minNum, maxNum, maxTries.
 * Has three constructors GuessNumberGame(), GuessNumberGame(int, int), GuessNumberGame(int, int, int)
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 *
 *
 */

package camchern.anchana.lab6;

import java.util.Scanner;

class GuessNumberGame extends Game {
    protected int minNum; // set a variables
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    public GuessNumberGame() { // accepts no argument.
        super("Guess Number Game", 1); // reuse code
        minNum = 1; // set mini number to 1
        maxNum = 10; // set maximum number to 10
        maxTries = 3; // set maximum of tries to 3
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1)); // set a correct number
    }

    public GuessNumberGame(int minNum, int maxNum) { // accepts two argument.
        super("Guess Number Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
    }

    public GuessNumberGame(int minNum, int maxNum, int maxTries) {// accepts three argument.
        super("Guess Number Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    @Override
    public String toString() {
        return "Game Name : "+ gameName +
                ", Number of players : " + numOfPlayers +
                ", Min is " + minNum +
                ", Max is " + maxNum +
                ", Number of tries is " + maxTries;
    }

    @Override
    public void playGame() {

        for(int i = maxTries ; i > 0 ; i--) {
            Scanner user = new Scanner(System.in);
            System.out.print("Please enter a guess number(" + minNum + " - "  + maxNum + " ) : ");
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
}
