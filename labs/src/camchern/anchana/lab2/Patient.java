package camchern.anchana.lab2 ;
/*
* This Patient program is to accept three arguments :  patient's name , patient's age and country that the patient from.
* Its output format is
* - Patient's name  is <Patient name>
* - Patient's ages is <Patient ages>
* - <Patient name> come from <Partient's country>
* if have more than three arguments will display Patien :<patien name> <patien age> <country>
*
* Autor : Anchana  Camchern
* Student ID : 633040185-7
* Section : 2
* Date : 9th January 2021
*/


public class Patient {
    public static void main(String[] args) {
        if (args.length == 3) {
            System.out.println("Patient's name is " + args[0]) ; // accept Patient's name and display
            System.out.println("Patient's ages is " + args[1]) ; // accept and display Patient's age
            System.out.println(args[0] + " come from " + args[2]) ; // accept and display Patient's country
        }
        else {
            System.err.println("Patien : <patien name> <patien age> <country>");
        }
    }
}
