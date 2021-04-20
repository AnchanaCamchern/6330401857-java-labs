package camchern.anchana.lab3;

import  java.util.Scanner ;

public class Test {
    public static void main(String args[]) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter positive number :");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Please enter positive number");
                System.exit(1);
                break;
            }
            if (num % 2 == 0) {
                System.out.println(+num + " is odd ");
            } else {
                System.out.println(+num + " is even ");
            }
        }
    }
}