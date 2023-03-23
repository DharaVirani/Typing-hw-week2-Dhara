package programmes20;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 *and convert to degree Celsius ((F - 32) x 5/9 = 0C).
 */

public class Programme_7_TempConversion {
    public static void main(String[] args) {
//        Scanner declaration for reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
//        Object Creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
//        scanner object closing
        scanner.close();

    }
//    Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c= ((temp - 32) * 5 /9);
        System.out.println("The temperature " + temp + " Fahrenheit is equal to " + c + " degree celsius ");
    }
}
