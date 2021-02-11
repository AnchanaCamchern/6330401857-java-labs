package camchern.anchana.lab4;
/**
 * This is GuessNumberGameV4 program.
 * GuessNumberGameV4 is same  as GuessNumberGameV3 program.
 * The user can set minimum and maximum number and number of tries to play a game.
 * Method showGuesses() and showSpecific() will be called in method playGames().
 * After the game ends, the user can type in ‘a’ in order to list all the user’s guesses
 * Also after the game ends, the user can type in ‘g’ to see the guess at a particular play.
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section 2
 * Date 28th January 2021
 *
 */
import java.util.Scanner;

public class GuessNumberGameV4 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int maxTriers = 3;
    static int[] guesses;
    static int numGuesses = 0;

    public static void main(String[] args) {
        configGame();
        genAnswer();
        playGames();
    }

    public static void showGuess() { // method to show a guess number
        for (int i = 0 ; i < guesses.length ; i++) {
            int numberShow = guesses[i];
                System.out.printf(numberShow + " ");
            }
        System.out.println(" ");

    }

    public static void showSpecific() {
       int showInput;

        do {
            System.out.printf("Enter which guess in range (1-" + numGuesses + ") : ");
            Scanner inputNumber = new Scanner(System.in);
            showInput = inputNumber.nextInt();
        } while(showInput < 1 || showInput > numGuesses);

        System.out.println("Guess number " + showInput + " is " + guesses[showInput - 1]);

    }

    public static void configGame() { //accept a minimum and maximum number from the user
        Scanner userNumber = new Scanner(System.in);
        System.out.printf("Please enter the min and max value : ");
        minNum = userNumber.nextInt();
        maxNum = userNumber.nextInt();

        if (minNum > maxNum) { // loop to find minimum and maximum number
            int number = minNum;
            minNum = maxNum;
            maxNum = number;
        }

        System.out.printf("Pleas enter the number of tries : ");
        maxTriers = userNumber.nextInt();
    }

    public static void genAnswer() { // random the answer

        correctNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
    }

    public static void playGame() { // run the game
        Scanner user = new Scanner(System.in);
        guesses = new int[maxTriers];
        numGuesses = 0;

        for(int reTries = 0 ; reTries < maxTriers ; reTries++) {
            System.out.printf("Please enter a guess number(" + minNum + "-" + maxNum + "): ");
            int guess = user.nextInt();

            if (guess > maxNum || guess < minNum) {
                System.out.println("The guess number much be in the range " + minNum + " and " + maxNum);
                reTries = reTries - 1;
            } else if (correctNum == guess) {
                    System.out.println("Congratulations ! That's correct");
                    guesses[reTries] = guess;
                    numGuesses++;
                    break;
            }else if (correctNum > guess) {
                    System.out.printf("Please type a higher number! ");
                    System.out.println("Number of remaining tries : " + (maxTriers - (reTries+1)));
                    guesses[reTries] = guess;
                    numGuesses++;
            } else if (correctNum < guess) {
                    System.out.printf("Please type a lower number! ");
                    System.out.println("Number of remaining tries : " + (maxTriers - (reTries+1)));
                    guesses[reTries] = guess;
                    numGuesses++;
            }
        }
    }

    public static void playGames() { // ask user to play again
        playGame(); // call playGame() method

        while(true) {
            Scanner user = new Scanner(System.in);
            System.out.println("If you want to play again? type 'y' to continue or 'q' to quit : ");
            System.out.println("Type 'a' to see all your guesses or type 'g' to see on a specific play. ");
            String nextStep = user.next();

            if (nextStep.equals("y")) { //type y to play again
                genAnswer();
                playGame();
            } else if (nextStep.equals("q")) { // type q to exit the program
                System.exit(0);
            } else if (nextStep.equals("a")) { // type a to see a guess number
                showGuess();
            } else if (nextStep.equals("g")) { //type g to see a specific number that user want
                showSpecific();
            }
        }
    }
}
