package camchern.anchana.lab2;
/*
 * This PrimitiveDataType Program
 * In the program declare 8 variables of primitive data type.
 * There are 8 primitive data types, namely byte, short, int, long, float, double, char, and boolean
 * The output will display the value that's set in the variable.
 *
 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 9th January 2021
 */

public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean value1 = true; // boolean 'true' or 'false'
        byte value2 = 120; // byte 8 bits
        double value3 = 1.12345F; // double 64 bits, Ex : double <d> = 100.2d; or double <d> = 100.2D;
        long value4 =9000000000000000000L; // long 64 bits, Ex : long <l> = 100000; or long <l2> = 100000l;
        int value5 = 2000000000; // int 32 bits, Ex : int <i> = 91; or int octal = 035;
        char value6 = 'G'; // A char literal is a single one character enclosed in single quote marks
        short value7 = 3200; //short 16 bits
        float value8 = 1.12345F; // float 32 bits, Ex : float <f> =100.5f; or float <f> = 100.5F;

        System.out.println(value1); // display value1, Data type is boolean
        System.out.println(value2); // display value2, Data type is byte
        System.out.println(value3); // display value3, Data type is double
        System.out.println(value4); // display value4, Data type is long
        System.out.println(value5); // display value5, Data type is int
        System.out.println(value6); // display value6, Data type is char
        System.out.println(value7); // display value7, Data type is short
        System.out.println(value8); // display value8, Data type is float

    }
}
