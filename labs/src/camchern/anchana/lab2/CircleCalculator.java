package camchern.anchana.lab2;
/*
 * This is CircleCalculator program.
 * CircleCalculator program can find a circle area and  circle circumference from radius of circle.
 * When you put radius of circle program will display
   An area of a circle with radius of <radius> is <circle area>
   A circumference is <circle circumference >
 * If circle radius less than
   program will display "CircleCalculculator <radius of a circle>"

 * Autor : Anchana  Camchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 9th January 2021
 */

import java.text.DecimalFormat;
public class CircleCalculator {
    public CircleCalculator() {
    }
    public static void main(String[] args) {
        if (args.length != 0){
        double radius = Double.parseDouble(args[0]); // accept circle radius and change the string to double
            double circleArea = (Math.PI*(radius*radius)); // Find a circle area
            DecimalFormat decimalFormat1 = new DecimalFormat("#.##"); //
            System.out.printf("An area of a circle with radius of " + radius + " is "
                    + decimalFormat1.format(circleArea) );
            double circumference = (2 * Math.PI * radius);
            DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
            System.out.println("");
            System.out.println("A circumference is " + (decimalFormat2.format(circumference)));
        } else {
            System.err.println("CircleCalculculator <radius of a circle>");
        }

    }
}

