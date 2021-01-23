package camchern.anchana.lab4;

import java.util.Scanner;

public class GuessNumberGameV5 {
    static int correctNum;
    static int minNum, maxNum;
    static int maxTriers;
    public static void main(String[] args) {
        configGame();
        genGame();
        playGames();
    }
    public static void configGame() {
        System.out.printf("Please enter the min and max value : " );
        Scanner userNumber = new Scanner(System.in);
        minNum = userNumber.nextInt();
        maxNum = userNumber.nextInt();

        if (minNum > maxNum) {
            int number = minNum;
            minNum = maxNum;
            maxNum = number;
        }


        System.out.printf("Pleas enter the number of tries : ");
        maxTriers = userNumber.nextInt();

    }
    public static void genGame() {
        correctNum = minNum + (int) (Math.random() * (maxNum - minNum) + 1);
    }
    public static void playGame() {
        Scanner user = new Scanner(System.in);
        int reTries;
        for (reTries = maxTriers; reTries >= 1; reTries--) {
            System.out.print("Please enter a guess number: " );
            int guess = user.nextInt();
            if (guess > maxNum || guess < minNum) {
                System.out.println("The guess number much be in the range "  + (+ minNum + " and " + maxNum));
                reTries = reTries+1;
            } else if (correctNum == guess) {
                System.out.println("Congratulations ! That's correct");
                break;
            } else if (correctNum > guess) {
                System.out.println("Please type a higher number! ");
                System.out.println("Number of remaining tries : " + (reTries-1) );
            } else if (correctNum < guess) {
                System.out.println("Please type a lower number! ");
                System.out.println("Number of remaining tries : " + (reTries-1));
            }
        }
    }
    public static void playGames() {
        playGame();

        while (true) {
            Scanner user2 = new Scanner(System.in);
            System.out.print("If you want to play again? type 'y' to continue or 'q' to quit : "); //  ask the user to type 'y' ( to continuous) or 'q' (to quit the program)
            String ContinueOrQuit = user2.next();
            if (ContinueOrQuit.equals("y")) { // if yhe user type 'y' the program will continuous and run again
                genGame();
                playGame();
            } else if (ContinueOrQuit.equals("q")) { // if the user type 'q' the program will close
                System.exit(0); // leave the program
            }
        }
    }
}
