package camchern.anchana.lab4;
import java.util.Scanner;

public class Demo1 {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int maxTriers = 3;
    static int[] guesses;
    static int numGuesses = 0;

    public static void main(String[] args) {
        configGame();
        genAnswer();
        playGame();
    }

    public static void showGuess() {
        /**int i = 0 ;
         while (true){
         //int numberShow = guesses[number];
         System.out.printf(guesses[numGuesses] + " ");
         break;
         }
         */
        for (int i = 0 ; i < numGuesses; i++) {
            System.out.printf(guesses[i] + " ");
        }
        System.out.println(" ");
    }

    public static void showSpecific() {
        /**int showInput;
         do {
         System.out.printf("Enter which guess in range (1-" + numGuesses + ") : ");
         Scanner inputNumber = new Scanner(System.in);
         showInput = inputNumber.nextInt();
         } while(showInput < 1 || showInput > numGuesses);

         System.out.println("Guess number " + showInput + " is " + guesses[showInput - 1]);
         */
        while (true) {
            System.out.printf("Enter which guess in range (1-" + numGuesses + ") : ");
            Scanner inputNumber = new Scanner(System.in);
            int show = inputNumber.nextInt();
            if (show >= 1 && show<= numGuesses) {
                System.out.println("Guess number " + show + " is " + guesses[(show - 1)]);
                break;
            }

        }
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

        correctNum = minNum + (int)(Math.random() * (double)(maxNum - minNum) + 1);
    }

    public static void playGame() {
        Scanner user = new Scanner(System.in);
        guesses = new int[maxTriers];
        numGuesses = 0;

        for(int reTries = maxTriers - 1; reTries >= 0; reTries--) {
            System.out.print("Please enter a guess number(" + minNum + " " + maxNum + "): ");
            int guess = user.nextInt();
            if (guess > maxNum || guess < minNum) {
                System.out.print("Please enter a guess number(" + minNum + " and  " + maxNum + "): ");
                reTries = reTries - 1;
            }else {
                if (correctNum == guess) {
                    System.out.println("Congratulations ! That's correct");
                    guesses[reTries] = guess;
                    numGuesses++;
                    break;
                } else if (correctNum > guess) {
                    System.out.println("Please type a higher number! ");
                    System.out.println("Number of remaining tries : " + reTries);
                    guesses[reTries] = guess;
                    numGuesses++;
                } else if (correctNum < guess) {
                    System.out.println("Please type a lower number! ");
                    System.out.println("Number of remaining tries : " + reTries);
                    guesses[reTries] = guess;
                    numGuesses++;
                } else {
                    System.out.println("The guess number much be in the range " + minNum + " and " + maxNum);
                    ++reTries;
                }
            }
        }playGames();
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
