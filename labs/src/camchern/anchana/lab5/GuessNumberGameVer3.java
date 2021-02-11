/**
 * This is GuessNumberGameVer3 program and inherited from GuessNumberGameVer2.
 * This program is a same as GuessNumberGameVer1 and GuessNumberGameVer2, but this program will have different path, that's
   GuessNumberGameVer3 three new methods which are guessAverage(), guessMin() and guessMax()
   to calculate the average, minimum and maximum of the guesses respectively.
 * When the program end, the user can
   Type in ‘v’ the program will call method guessAverage() to display the average value of all the guesses
   Types in ‘m’ the program will call the method guessMin() to show the minimum of the guesses the user entered
   Types in ‘x’ the program should call the method guessMax() to display the maximum of all the guesses
 * When a user types in incorrect command, the program repeats the question
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 11th February 2021
 *
 */

package camchern.anchana.lab5;

import java.util.Scanner;

public class GuessNumberGameVer3 extends GuessNumberGameVer2 {

    GuessNumberGameVer3() {
        super();
    }

    GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
    }

    GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

    public void showGuess() { // This method will list all the user’s guesses after the game ends and the user types ‘a’

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
        } while(showInput < 1 || showInput > numGuesses);
        System.out.println("Guess number " + showInput + " is " + guesses[showInput - 1]);
    }

    public void guessAverage() { //method to calculate the average
        double avg = 0;
        double sum = 0;
        double count = numGuesses;

        for(int i = 0 ; i < numGuesses ; i++) {
            sum += guesses[i];
        }
        avg = sum / count;
        System.out.println("Average = " + avg);
    }

    public void guessMin() { //method to calculate the minimum number
        int numItems1 = numGuesses;
        int min = guesses[0];

        for (int i = 1 ; i < numItems1 ; i++) {

            if (guesses[i] < min) {
                min = guesses[i];
            }
        }
        System.out.println("min = " + min);
    }

    public void guessMax() { //method to calculate the maximum number
        int numItems2 = guesses.length;
        int max = guesses[0];

        for (int i = 1; i < numItems2; i++) {

            if (guesses[i] > max) {
                max = guesses[i];
            }
        }
        System.out.println("max = " + max);
    }

    public void playGames() { // ask user to play again
        playGame(); // call playGame() method

        while(true) { // loop to running the program
            Scanner user = new Scanner(System.in);
            System.out.println("If you want to play again? type 'y' to continue or 'q' to quit. ");
            System.out.println("Type 'a' to see all your guesses or type 'g' to see on a specific play. ");
            System.out.println("Type 'v' to see average or 'm' to see a minimum " +
                    "or 'x' to see maximum of all your guesses");
            String nextStep = user.next();

            switch (nextStep) {
                case "y" -> playGame();           //  y to call method platGame()
                case "q" -> System.exit(0); //  q to exit the program()
                case "a" -> showGuess();          //  a to call method showGuess()
                case "g" -> showSpecific();       //  g to call method showSpecific()
                case "v" -> guessAverage();       //  v to call method guessAverage()
                case "m" -> guessMin();           //  m to call method guessMin()
                case "x" -> guessMax();           //  x to call method guessMax()
            }
        }
    }
}
