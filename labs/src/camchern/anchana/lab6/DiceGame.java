/**
 * This is DiceGame program that's inherited from Game.
 * Dice game is a game where one dice is rolled and a player guesses “l” or “L” for low
   and “h” or “H” for high. The dice is low if it is less than or equal to 3.
   otherwise it is high.
 * If the user's guess is correct program will display "Congratulations! You win."
 * If the user,s guess is incorrect program will display "Sorry. You lose."
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 */

package camchern.anchana.lab6;

import java.util.Scanner;

public class DiceGame extends Game { //inherited from Game.
    protected  int diceRoll, rollDice; // set a variables
    protected String answer;

    public DiceGame() {
        super("Dice Game",1); // reuse code from  class Game
        diceRoll = (int)(Math.random()*6+1); // random number from 1-6 for set rollDice
        answer = "l"; // set a answer
    }

    public DiceGame(String answer) { // DiceGame
        super("Dice Game", 1);  // reuse code from  class Game
        this.answer = answer; // set a answer
        diceRoll = (int)(Math.random()*6+1); // random number from 1-6 for set rollDice

    }

    public int getDiceRoll() {
        return diceRoll;
    } // method getDiceRoll

    public String getAnswer() {
        return answer;
    } // method getAnswer

    public void setAnswer(String answer) {
        this.answer = answer;
    } // method setAnswer

    @Override
    public String toString() { // method toString for return String
        return "Game Name : " + gameName +
                ", Number of players : " + numOfPlayers +
                ", Dice roll : "  + diceRoll + ", Player's guess : " + answer;
    }

    @Override
    public void playGame() { // method playGame
        int point = 3;

        if (rollDice <= point && (answer.equals("H") || answer.equals("h") )
                || rollDice > point && (answer.equals("L") || answer.equals("l"))) {
                System.out.println("Sorry. You lose.");
        } else {
            System.out.println("Congratulations! You win.");
        }
    }
}
