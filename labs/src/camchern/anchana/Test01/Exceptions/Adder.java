package camchern.anchana.Test01.Exceptions;

public class Adder {
    public static void main(String[] args) {

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int answer = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " +
                    answer);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Please provide two a argument");
        } catch (NumberFormatException ex) {
            System.err.println("Please provide two integers");
        }
    }
}