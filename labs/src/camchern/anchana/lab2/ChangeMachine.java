package camchern.anchana.lab2;
/*
 * This is ChangeMachine program.
 * This program accept four arguments : 1-bath coins, 2-bath coins, 5-bath coins, 10-bath coins
 * This program will display the arguments that you input and total it.
 * And this program will count banknote from total of you arguments.
 * If arguments that you input have more than four, the program will display
   ChangeMachine <1-bath coins> <2-bath coins> <5-bath coins> <10-bath coins>
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 9th January 2021
 */

public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length == 4 ) {
            int oneBath = Integer.parseInt(args[0]);
            System.out.println("1-bath coins : " + args[0]);
            int twoBath = Integer.parseInt(args[1]);
            System.out.println("2-bath coins : " + args[1]);
            int fiveBath = Integer.parseInt(args[2]);
            System.out.println("5-bath coins : " + args[2]);
            int tenBath = Integer.parseInt(args[3]);
            System.out.println("10-bath coins : " + args[3]);
            System.out.println("Total amount : " + (oneBath + twoBath * 2 + fiveBath * 5 + tenBath * 10));

            System.out.println(" ");
            int total  = (oneBath + twoBath * 2 + fiveBath * 5 + tenBath * 10);
            System.out.println("1000-bath bill : " + (total / 1000));
            int bill1000 = total - ((total / 1000) * 1000);
            System.out.println("500-bath bill : " + (bill1000 / 500));
            int bill500 = bill1000 - ((bill1000 / 500) * 500);
            System.out.println("100-bath bill : " + (bill500 / 100));
            int bill100 = bill500 - ((bill500 / 100) * 100);
            System.out.println("20-bath bill : " + (bill100 / 20));
            double moneyRemain = (total / 1000 + bill1000 /500 + bill500 / 100 + bill100 / 20 );
            System.out.println("Money remain : " + moneyRemain );
        }
        else {
            System.err.println("ChangeMachine <1-bath coins> <2-bath coins> <5-bath coins> <10-bath coins>");
        }

    }
}
