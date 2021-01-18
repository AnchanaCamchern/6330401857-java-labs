package camchern.anchana.lab3;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum, maxNum;
    static int maxTriers;
    int K, guess;
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
        System.out.printf("Pleas enter the number of tries : ");
        maxTriers = userNumber.nextInt();
        //System.out.println(minNum);
        //System.out.println(maxNum);

    }
    public static void genGame() {
        correctNum = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1);
    }
    public static void playGames() {
        Scanner user = new Scanner(System.in);
        int reTries;
        for (reTries = maxTriers; reTries >= 1; reTries--) {
            System.out.print("Please enter a guess number: " );
            int guess = user.nextInt();
            if (guess > 20 || guess < 1) {
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
        System.out.print("If you want to q or y");
        String qOry = user.next();
        if (qOry.equals("y")) {
            genGame();
            playGames();
        } else  if (qOry.equals("q")) {
            System.exit(0);
        }
    }
}

