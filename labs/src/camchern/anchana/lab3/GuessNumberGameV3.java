package anchana.lab3Test;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGameV3 {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to the Guessing game!");
        System.out.println("Please Choose a number 0 - 1.");
        int numberOftries = 3;
        Random guessOne = new Random();
        int randomNum = guessOne.nextInt(1);

        Scanner Playerguess = new Scanner(System.in);
        int PlayerOneguess = Playerguess.nextInt();

        while (PlayerOneguess != randomNum && numberOftries == 9) {
            System.out.println("Try Again");
            numberOftries++;
            if(PlayerOneguess == randomNum){
                System.out.println("Good Guess, you are correct!");
            }
        }

    }

}

