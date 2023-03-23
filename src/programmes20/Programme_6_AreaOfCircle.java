package programmes20;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r)
 */

public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //Scanner declaration for reading from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius= scanner.nextDouble();
        areOfCircle(radius);
        //closing the scanner object
        scanner.close();

    }
    //Calculating the area of circle
    public static void areOfCircle(double radius){
      double pi= Math.PI;
      double area = (pi * radius * radius);
        System.out.println("The Area of Circle is " + area);
    }
}
