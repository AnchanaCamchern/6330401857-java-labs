/**
 * This is MonopolyGame that's inherited from DiceGame and implements interfaces HasRule, UseDice, UseBoard.
 * The game can be played with 2-8 players. It has a board and uses 2 dice to play.
 * The players will be given 1,500 cash at the beginning of the game
 * Has method playGame().
 * Has method setUpBoard().
 * Has method rollDice() which will simulate rolling two dice.
 * Has method gameRule().
 * Override method toString().
 * Has method getCash() and setCash().
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 *
 *
 */

package camchern.anchana.lab6;

class MonopolyGame extends DiceGame implements HasRule, UseDice, UseBoard {
    protected int[] cash = new int[8]; // array cash
    protected final int numOfDice = 2;

    public MonopolyGame() { // accepts no argument.
        gameName = "MonopolyGame"; // set the gameName to “Monopoly Game”.
        numOfPlayers = 2; // set numOfPlayers to 2.

        for(int i = 0; i < numOfPlayers; i++) { // set the value of cash for each player to 1500.
            cash [i] = 1500;
        }
        diceRoll = rollDice();
    }


    public MonopolyGame(int numOfPlayers) { //  accepts one int
        gameName = "MonopolyGame";
        this.numOfPlayers = numOfPlayers;

        for(int i = 0; i < numOfPlayers; i++) {
            cash [i] = 1500;
        }
        diceRoll = rollDice();

    }

    @Override
    public void playGame() {
        System.out.println("Playing Monopoly game");

    }
    @Override
    public void setUpBoard() {
        System.out.println("Setting up Monopoly board");
    }

    @Override
    public int rollDice() {
        return rollDice;
    }

    @Override
    public String gameRule() {
        return gameRule();
    } // return rule of game

    @Override
    public String toString() { // return string
        return "Game name : " + gameName +
                ", Number of players : " + numOfPlayers;
    }

    public String getCash() { // method getCash() for return cash of each player
        String cash1 = " ";
        for(int i = 0; i < numOfPlayers; i++) {
            cash1 = cash1 + cash[i] + " ";
        }
        return cash1; // return cash1
    }

    public void setCash(int[] cash) {
        this.cash = cash;
    }
}
