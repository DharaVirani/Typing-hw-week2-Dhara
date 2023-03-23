package programmes20;

import java.util.Scanner;

/**
 * Write a Java programme that makes three numbers as input to calculate and print the average of the numbers
 */

public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
//        Scanner declaration
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the 3rd number : ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
//        closing the scanner object
        scanner.close();
    }
//    Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c){
        double average = (a + b + c)/3;
        System.out.println("The average of " + a + " , " + b + " and " + c +" is : " + average);
    }
}
