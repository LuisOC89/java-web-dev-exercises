package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
        /*
        Scanner methods
        Method Name	    Return Type	    Description
        hasNext()	    boolean	        Returns true if more data is present.
        hasNextInt()	boolean	        Returns true if the next item to read is an int data type.
        hasNextFloat()	boolean	        Returns true if the next item to read is a float data type.
        hasNextDouble()	boolean	        Returns true if the next item to read is a double data type.
        nextInt()	    int	            Returns the next item to read as an int data type.
        nextFloat()	    float	        Returns the next item to read as a float data type.
        nextDouble()	double	        Returns the next item to read as a double data type.
        next()	        String	        Returns the next item to read as a String data type.
        nextLine()	    String	        Returns the next line to read as a String data type.
        */

    }

}
