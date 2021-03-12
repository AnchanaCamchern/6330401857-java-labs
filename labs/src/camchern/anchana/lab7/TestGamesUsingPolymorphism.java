/**
 *This is a TestGamesUsingPolymorphism program .
 *TestGamesUsingPolymorphism that the executes the codes similar to TestGame in
  TestGame class in lab6 but the main method of this class uses only one variable which is an array of
  Game objects and uses for loop to print each object information and call method playGame()
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 12th March 2021
 */

package camchern.anchana.lab7;

import camchern.anchana.lab6.*;
import java.util.ArrayList;

public class TestGamesUsingPolymorphism {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<Game>(); // create an array list and method.
        games.add(new DiceGame()); //  add a game object in the array list.
        games.add(new DiceGame("h"));
        games.add(new GuessNumberGame());
        games.add(new GuessNumberGame(1,6,1));

        for (Game game :games) { // print or display Array list
            System.out.println(game);
            game.playGame();
        }
    }
}
