/**
 *
 * This is GuessNumberGameVer2 program and inherited from GuessNumberGameVer1.
 * This program is a same as GuessNumberGameVer1 and will have different path, that's
 *  - GuessNumberGameVer2 include protected variable called guesses which is an array of integers and another protected integer variable called numGuesses.
 *  - They're three constructors of GuessNumberGameVer2 that accepts no parameter, two integers, and three integers that call the constructors of the superclass (GuessNumberGameVer1)
 *  This program include three methods, that's
 *  - showGuess() -> This method will list all the user’s guesses after the game ends and the user types ‘a’
 *  - showSpecific() -> This method will display the guess number at a specific position after the user types ‘g’ and then the specific position.
 *  - playGames() -> This method will call method playGame(), showSpecific(), and showGuess() and keep running until the user types ‘q’
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 11th February 2021
 *
 */

package camchern.anchana.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected int [] guesses;          // array of integers
    protected int numGuesses = 0;      // integer variable called numGuesses

    GuessNumberGameVer2() {
        super();
        final int MAX_GUESSES = 20; //  MAX_GUESSES equal 20.
        guesses = new int[MAX_GUESSES]; // use a new operator to allocate memory space for the array guesses by assuming that there can be at most 20 guesses.
        numGuesses++;
    }

    GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        final int MAX_GUESSES = 20;
        guesses = new int[MAX_GUESSES];
        numGuesses++;
    }

    GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        final int MAX_GUESSES = 20;
        guesses = new int[MAX_GUESSES];
        numGuesses++;
    }

    @Override // to indicate and check that the method is overriding that class method
    public void playGame() {
        int maxTriers = this.maxTries ;
        Scanner user = new Scanner(System.in);
        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));

        for(numGuesses = 0 ; numGuesses < maxTriers ; numGuesses++) {
            System.out.print("Please enter a guess number(" + minNum + " - " + maxNum + " ) :");
            int guess = user.nextInt();

            if (guess > maxNum || guess < minNum) {
                System.out.println("The guess number much be in the range " + minNum + " and " + maxNum);
                numGuesses--;

            } else if (correctNum == guess) {
                System.out.println("Congratulations ! That's correct");
                guesses[numGuesses] = guess;
                numGuesses++;
                break;

            } else if (correctNum > guess) {
                System.out.print("Please type a higher number! ");
                System.out.println("Number of remaining tries : " + (maxTriers - (numGuesses + 1)));
                guesses[numGuesses] = guess;

            } else {
                System.out.print("Please type a lower number! ");
                System.out.println("Number of remaining tries : " + (maxTriers - (numGuesses + 1)));
                guesses[numGuesses] = guess;
            }
        }
    }


    public void showGuess() { // This method will list all the user’s guesses after the game ends and the user types ‘a’
        int maxTries = this.maxTries;

        for (int i = 0 ; i < numGuesses  ; i++) {
            int numberShow = guesses[i];
            System.out.print(numberShow + " ");
        }
        System.out.println(" ");
    }

    public void showSpecific() { // This method will display the guess number at a specific position after the user types ‘g’ and then the specific position.
        int showInput;

        do {
            System.out.print("Enter which guess in range (1-" + numGuesses + ") : ");
            Scanner inputNumber = new Scanner(System.in);
            showInput = inputNumber.nextInt();
        } while (showInput < 1 || showInput > numGuesses);
        System.out.println("Guess number " + showInput + " is " + guesses[showInput - 1]);
    }

    public void playGames() { // This method will call method playGame(), showSpecific(), and showGuess() and keep running until the user types ‘q’
        playGame(); // call method playGame()

        while(true) {
            Scanner user = new Scanner(System.in);
            System.out.println("If you want to play again? type 'y' to continue or 'q' to quit. ");
            System.out.println("Type 'a' to see all your guesses or type 'g' to see on a specific play. ");
            String nextStep = user.next();

            switch (nextStep) {
                case "y" -> playGame();            //  y to call method platGame()
                case "q" -> System.exit(0);  //  q to exit the program
                case "a" -> showGuess();          //   a to call method showGuess()
                case "g" -> showSpecific();       //   g to call method showSpecific()
            }
        }
    }
}
