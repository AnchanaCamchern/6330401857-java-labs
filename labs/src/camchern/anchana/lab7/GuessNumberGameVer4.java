package camchern.anchana.lab7;

import camchern.anchana.lab5.GuessNumberGameVer3;

import java.util.ArrayList;

import java.util.Collections;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer4> games = new ArrayList<GuessNumberGameVer4>(0);

     GuessNumberGameVer4(int minNum,int maxNum, int maxTries) {
         super(minNum, maxNum,maxTries);
     }


    public static void initGameVer4() {
        games.add(new GuessNumberGameVer4 (1,10,3));
        games.add(new GuessNumberGameVer4 (1,10,5));
        games.add(new GuessNumberGameVer4 (1, 5,5));

        System.out.println("Unsorted");
        for(GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void initGamesList() {
         games.add(new GuessNumberGameVer4(1,10,3));
         games.add(new GuessNumberGameVer4(1,10,5));
         games.add(new GuessNumberGameVer4(1,5,5));

        System.out.println("Unsorted");
         for (GuessNumberGameVer4 game:games) {
             System.out.println(game);
         }
    }

    public static void testComparingMaxTries() {
        initGameVer4();
        Collections.sort(games, new SortByMaxTries());

        System.out.println("\nSort by max tries in descending order ");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }
    }

    public static void testComparingMaxTriesThenRamDomRange() {
         initGamesList();
         Collections.sort(games, new SortByMaxTriesThenRandomRange());

        System.out.println("\nSort by max tries in descending order and random range in ascending order ");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        }

    }

    public static void main(String[] args) {
        testComparingMaxTries();
        //testComparingMaxTriesThenRamDomRange();
    }
}



