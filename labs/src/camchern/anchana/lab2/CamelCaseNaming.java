package camchern.anchana.lab2;
/* This is a CamelCaseNaming program.
 * CamelCaseNaming program wii accept two arguments : first word and second word.
 * After this program accept arguments then will change,
  first word : first letter will be a uppercase letter and all next letters will be lowercase letter.
  second word : first letter will be a uppercase letter and all next letters will be lowercase letter.
 * if have more than two arguments will display CamelCaseNaming : <First word> <Second word>
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 9th January 2021
 */


public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("CamelCaseNaming : <First word> <Second word>");
        }
        else {
            String text1, nextLetter1, text2, nextLetter2, camelCase = " " ;
            text1 = args[0].substring(0, 1);
            nextLetter1 = args[0].substring(1);
            text2 = args[1].substring(0, 1);
            nextLetter2 = args[1].substring(1);
            camelCase = (text1.toUpperCase()) + (nextLetter1.toLowerCase())
                    + (text2.toUpperCase()) + (nextLetter2.toLowerCase()) ;

            System.out.println("The first word is " +args[0]);
            System.out.println("The second word is " +args[1]);
            System.out.println("The concatenate with camel case is " + camelCase);

        }
    }
}
