package camchern.anchana.lab4;
import java.util.Scanner;

public class GuessNumberGameV4 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int maxTriers = 3;
    static int[] guesses;
    static int numGuesses = 0;

    public GuessNumberGameV4() {
    }

    public static void main(String[] var0) {
        configGame();
        genAnswer();
        playGame();
    }

    public static void showGuess() {
        for(int number = 0; number < numGuesses; ++number) {
            int var10001 = guesses[number];
            System.out.print(var10001 + " ");
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

    public static void configGame() {
        Scanner userNumber = new Scanner(System.in);
        System.out.printf("Please enter the min and max value : ");
        minNum = userNumber.nextInt();
        maxNum = userNumber.nextInt();
        if (minNum > maxNum) {
            int minMaxnum = minNum;
            minNum = maxNum;
            maxNum = minMaxnum;
        }

        System.out.printf("Pleas enter the number of tries : ");
        maxTriers = userNumber.nextInt();
    }

    public static void genAnswer() {

        correctNum = minNum + (int)(Math.random() * (double)(maxNum - minNum) + 1.0D);
    }

    public static void playGame() {
        Scanner user = new Scanner(System.in);
        guesses = new int[maxTriers];
        numGuesses = 0;

        for(int reTries = maxTriers - 1; reTries >= 0; --reTries) {
            System.out.print("Please enter a guess number: ");
            int guess = user.nextInt();
            if (guess <= maxNum && guess >= minNum) {
                if (correctNum == guess) {
                    System.out.println("Congratulations ! That's correct");
                    guesses[reTries] = guess;
                    ++numGuesses;
                    break;
                }

                if (correctNum > guess) {
                    System.out.println("Please type a higher number! ");
                    System.out.println("Number of remaining tries : " + reTries);
                    guesses[reTries] = guess;
                    ++numGuesses;
                } else if (correctNum < guess) {
                    System.out.println("Please type a lower number! ");
                    System.out.println("Number of remaining tries : " + reTries);
                    guesses[reTries] = guess;
                    ++numGuesses;
                }
            } else {
                System.out.println("The guess number much be in the range " + minNum + " and " + maxNum);
                ++reTries;
            }
        }

        playGames();
    }

    public static void playGames() {
        while(true) {
            Scanner user = new Scanner(System.in);
            System.out.println("If you want to play again? type 'y' to continue or 'q' to quit : ");
            System.out.println("Type 'a' to see all your guesses or type 'g' to see on a specific play. ");
            String ContinueOrQuit = user.next();
            if (ContinueOrQuit.equals("y")) {
                genAnswer();
                playGame();
            } else if (ContinueOrQuit.equals("q")) {
                System.exit(0);
            } else if (ContinueOrQuit.equals("a")) {
                showGuess();
            } else if (ContinueOrQuit.equals("g")) {
                showSpecific();
            }
        }
    }
}
