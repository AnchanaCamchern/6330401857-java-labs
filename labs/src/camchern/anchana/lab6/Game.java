/**
 * Class Game is a abstract class that's is a class and declared abstract.
   Abstract classes cannot be instantiated, but they can be subclassed.
 * Class Game has two constructors that's
   - Game()
   - Game (String gameName, int numOfPlayers)
 * Has a String variable named gameName and int variable named numOfPlayers.
 * Has getter and setter methods for gameName and numOfPlayers
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 */

package camchern.anchana.lab6;

abstract class Game { // Game is a abstract class
    protected String gameName; // set a variables
    protected int numOfPlayers;

    public Game() { //accepts no argument.
        gameName = "unknown game"; // set gameName to "unknown game"
        numOfPlayers = 0; // set numOfPlayers to 0
    }

    public Game (String gameName, int numOfPlayers) { //accepts two arguments String and int
        this.gameName = gameName;  // initiates gameName
        this.numOfPlayers = numOfPlayers; // initiates numOfPlayers
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public String toString() {
        return null;
    }

    public abstract void playGame(); // abstract class

}
