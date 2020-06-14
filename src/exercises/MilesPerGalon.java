package exercises;

import java.util.Scanner;

public class MilesPerGalon {
    public static void main(String[] args) {
        float miles;
        float galons;
        float milesPerGalon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How may miles have you driven? ");
        miles = input.nextFloat();

        System.out.println("How many gallons did you consume? ");
        galons = input.nextFloat();
        input.close();

        milesPerGalon = miles / galons;
        System.out.println("There were ".concat(String.valueOf(milesPerGalon)).concat(" miles-per-galon consumed."));
    }
}
