/**
 * This is HighLowGame that's inherited from DiceGame and implements interfaces HasRule and UseDice.
 * The user can choose the number of dice to play with.
 * The user can guess l” or “L” for low and “h” or “H” for high in the game.
 * Has one protected variable named numOfDice.
 * Has public getter and setter methods for numofDice.
 * Has three constructors include
  - HighLowGame ()
  - HighLowGame(int numOfDice)
  - HighLowGame(int numOfDice, String answer)
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 *
 *
 */

package camchern.anchana.lab6;

class HighLowGame extends DiceGame implements HasRule, UseDice { // HighLowGame is inherited from DiceGame
    protected int numOfDice, MiddleNumber;
    protected String answer;

    public int getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public HighLowGame () {   //accepts no argument.
        gameName = "High-Low Game"; // set gameName to “High-Low Game”.
        numOfPlayers = 1; // set numOfPlayer to 1.
        numOfDice = 3; // set numOfDice  to 3.
        answer = "l"; // set a answer to "l"
        diceRoll = rollDice();
        MiddleNumber = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1; // set a middle number.
    }

    public HighLowGame(int numOfDice) { //  accepts one int for numOfDice
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice;
        answer = "l";
        diceRoll = rollDice();
        MiddleNumber = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;
    }

    public HighLowGame(int numOfDice, String answer) { // accepts one int for numOfDice and one string for answer
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice;
        this.answer = answer;
        diceRoll = rollDice();
        MiddleNumber = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;
    }

    @Override
    public void playGame() { // method playGame

        if (diceRoll <= MiddleNumber && (answer.equals("H") || answer.equals("h") )
                || diceRoll > MiddleNumber && (answer.equals("L") || answer.equals("l"))) {
            System.out.println("Sorry. You lose.");
        } else {
            System.out.println("Congratulations! You win.");
        }
    }

    @Override
    public String toString() { // method toString() for return string that outputs the result.
        return "Game name : " + gameName +
                ", Number of players : " + numOfPlayers +
                ", Dice roll : " + rollDice +
                ", Player's guess : " + answer +
                ", Number of dice is " + numOfDice ;
    }

    public String gameRule() {
        return gameRule();
    } // method gameRule() for display a rule of the game.

    @Override
    public int getDiceRoll() {
        return super.getDiceRoll();
    }

    @Override
    public int rollDice() {
        return rollDice;
    } // method rollDice() that will simulate rolling dice for the game
}


