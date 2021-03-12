/**
 *  This is a GuessNumberGameVer4 program that was inherited from GuessNumberGameVer3 in lab5.
 *  GuessNumberGameVer4 have 3 class to compare the GuessNumberGame that's
    SortByMaxTries to compare the GuessNumberGame  by maximum of tries in each game.
    SortByRandomRange to compare the GuessNumberGame by the range in that game.
    SortByMaxTriesThenRandomRang  to compare which guess number game is likely to
    win more. The criteria that we consider is that the higher max tries is and the smaller range random numbers.
 *  After compare in GuessNumberGame, this program will sort a GuessNumberGame with a compare by maximum of tries, by random range
    and by maximum of tries then the range random when the game has a maximum of tries is equal.
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 12th March 2021
 */

package camchern.anchana.lab7;

import camchern.anchana.lab5.GuessNumberGameVer3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer4> games = new ArrayList<GuessNumberGameVer4>(0);

     GuessNumberGameVer4(int minNum,int maxNum, int maxTries) {
         super(minNum, maxNum, maxTries);
     }

    public static void initGameVer4() {
        games.add(new GuessNumberGameVer4 (1,10,3));
        games.add(new GuessNumberGameVer4 (1,10,5));
        games.add(new GuessNumberGameVer4 (1, 5,5));

        System.out.println("Unsorted");  // display GuessNumberGameVer that's Unsorted.
        for(GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void initGamesList() {
         games.add(new GuessNumberGameVer4(1,10,3));
         games.add(new GuessNumberGameVer4(1,10,5));
         games.add(new GuessNumberGameVer4(1,5,5));

         System.out.println("Unsorted"); // display GuessNumberGameVer that's Unsorted.
         for (GuessNumberGameVer4 game:games) {
             System.out.println(game);
         }
    }

    public static class SortByMaxTries implements Comparator<GuessNumberGameVer4> {  // compare by maximum of tries
        public int compare(GuessNumberGameVer4 maxTries1, GuessNumberGameVer4 maxTries2) {
            return maxTries2.getMaxTries() - maxTries1.getMaxTries();
        }
    }

    public static class SortByRandomRange implements Comparator<GuessNumberGameVer4> {  // compare by random range

        public int compare(GuessNumberGameVer4 guessNum1, GuessNumberGameVer4 guessNum2) {
            return (guessNum1.getMaxNum() - guessNum1.getMinNum()) - (guessNum2.getMaxNum()  - guessNum2.getMinNum());
        }
    }

    public static class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer4> {  // compare by maximum of tries and when the game has equal in maximum of tries, the program will compare by random range.
        public int compare(GuessNumberGameVer4 guess1, GuessNumberGameVer4 guess2) {
            int maxTriesCompare = new SortByMaxTries().compare(guess1, guess2);
            int rangeCompare = new SortByRandomRange().compare(guess1, guess2);

            if(maxTriesCompare == 0) {
                return rangeCompare;
            }else  {
                return maxTriesCompare;
            }
        }
    }

    public static void testComparingMaxTries() {
        initGameVer4();
        Collections.sort(games, new SortByMaxTries());

        System.out.println("\nSort by max tries in descending order "); // display sort by maximum of tries in a GuessNumberGame
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void testComparingMaxTriesThenRamDomRange() {
         initGamesList();
         Collections.sort(games, new SortByMaxTriesThenRandomRange());

        System.out.println("\nSort by max tries in descending order and random range in ascending order "); // display sort by maximum of tries then sort by random range  in a GuessNumberGame
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void main(String[] args) {
        //testComparingMaxTries();
        testComparingMaxTriesThenRamDomRange();
    }
}



