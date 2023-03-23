package programmes20;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary Number is : 101
 */

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
//        Scanner declaration

        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a decimal number ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
//        closing scanner object
        scanner.close();

    }
//    Converting the decimal to binary
    public static void convertDecimalToBinary(int number){
       String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
