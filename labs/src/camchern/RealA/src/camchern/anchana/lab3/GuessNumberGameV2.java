package camchern.anchana.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int K, guess;
    public static void main(String[] args) {
        genGame();
        playGame();
    }
    public static void genGame() {
        correctNum = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1);
    }
    public static void playGame() {
        for(K = 2; K >= 0;  K--) {
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter a guess number(1-10): ");
            guess = user.nextInt();
            if (correctNum== guess) {
                System.out.println("Congratulations ! That's correct");
                break;
            } else if (correctNum> guess) {
                System.out.println("Please type a higher number! ");
                System.out.println("Number of remaining tries : " +K);
            } else if (correctNum < guess) {
                System.out.println("Please type a lower number! ");
                System.out.println("Number of remaining tries : " +K);
            }
        }
    }
}
