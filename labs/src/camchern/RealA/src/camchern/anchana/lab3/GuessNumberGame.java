package camchern.anchana.lab3;

/** This's a GuessNumberGame program.
 *
 */

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;
        int randomNum = minNum + (int) (Math.random()) * ((maxNum - minNum) + 1);
        int guess;
        int K;
        for (K = 2; K >= 0;  K--) {
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter a guess number(1-10): ");
            guess = user.nextInt();
            if (randomNum== guess) {
                System.out.println("Congratulations ! That's correct");
                break;
            } else if (randomNum > guess) {
                System.out.println("Please type a higher number! ");
                System.out.println("Number of remaining tries : " +K);
            } else if (randomNum < guess) {
                System.out.println("Please type a lower number! ");
                System.out.println("Number of remaining tries : " +K);
            }
        }
    }
}

