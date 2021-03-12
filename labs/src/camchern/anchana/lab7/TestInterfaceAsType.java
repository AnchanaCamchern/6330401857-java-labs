/**
 * This is a TestInterfaceAsType program.
 * TestInterfaceAsType has the static method compareRollDice(DiceGame, DiceGame) to compare roll dice of two DiceGame objects.
 * If the first game has a dice roll more than second game,
    program will display first game " has dice roll greater than " second game and display value of rollDice method in first game.
 * If the first game has a dice roll less than second game,
    program will display first game " has dice roll less than " second game. and display value of rollDice method in first game.
 * If the first game has a dice roll equal second game,
    program will display first game   " has dice roll equal to " second game and display value of rollDice method in first game.
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 12th March 2021
 */

package camchern.anchana.lab7;

import camchern.anchana.lab6.*;
import java.util.ArrayList;

public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame dice1, DiceGame dice2) { // compare roll dice of two DiceGame objects.

        if (dice1.getDiceRoll() < dice2.getDiceRoll()) {
            return 1;
        } else if (dice1.getDiceRoll() > dice2.getDiceRoll()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>(); // create an array list and method.
        games.add(new HighLowGame());  //  add a game object in the array list.
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4,"h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));

        for (int i = 0; i < (games.size() - 1); i++){ // to display a game and compare.
            DiceGame diceRoll1 = (DiceGame) games.get(i);
            DiceGame diceRoll2 = (DiceGame) games.get(i + 1);

            if(compareRollDice(diceRoll1, diceRoll2) < 0) {
                System.out.println( "Game(" + i + "): " + diceRoll1.getDiceRoll() + " has dice roll greater than " + "Game(" + (i + 1 )+ "): " + diceRoll2.getDiceRoll() );
                System.out.println("Game(" + i + "): rollDice method return " + (games.get(i).rollDice()));
            }else if (compareRollDice (diceRoll1, diceRoll2) > 0) {
                System.out.println("Game(" +  i + "): "  + diceRoll1.getDiceRoll() + " has dice roll less than " + "Game(" +  (i + 1 )+ "): " + diceRoll2.getDiceRoll());
                System.out.println("Game(" + i + "): rollDice method return " + (games.get(i).rollDice()));
            }else if(compareRollDice (diceRoll1, diceRoll2) == 0){
                System.out.println("Game(" +  i + "): " + diceRoll1.getDiceRoll() + " has dice roll equal to " + "Game(" + ( i+ 1 ) + "): " + diceRoll2.getDiceRoll());
                System.out.println("Game(" + i + "): rollDice method return " + (games.get(i).rollDice()));
            }
        }
    }
}
