/**
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 4th March 2021
 *
 *
 */

package camchern.anchana.lab6;

import java.util.ArrayList;

public class TestGame extends ArrayList<Game> {
    public static void main(String[] args) {
        DiceGame game1 = new DiceGame();
        System.out.println(game1);
        game1.playGame();
        DiceGame game2 = new DiceGame("h");
        System.out.println(game2);
        game2.playGame();
        GuessNumberGame game3 = new GuessNumberGame();
        System.out.println(game3);
        game3.playGame();

        Game game4;
        game4 = new DiceGame("l");
        System.out.println(game4);
        game4.playGame();
        game4 = new GuessNumberGame(1,6,1);
        System.out.println(game4);
        game4.playGame();

    }
}
