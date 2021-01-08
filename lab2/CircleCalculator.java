package camchern.anchana.lab2;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
public class CircleCalculator {
    public CircleCalculator() {
    }

    public static void main(String[] args) {
        double radius = 1.3D;
        double area = 3.141592653589793D * Math.pow(radius, 2.0D);
        double circum = 6.283185307179586D * radius;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("An area of a circle with radius of " + radius + " is " + df.format(area) );
        System.out.println(" A circumference is " + df.format(circum));
    }
}

