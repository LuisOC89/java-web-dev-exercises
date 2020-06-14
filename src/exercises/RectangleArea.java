package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int largo;
        int ancho;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle (m): ");
        largo = input.nextInt();

        System.out.println("Enter the width of the rectangle (m): ");
        ancho = input.nextInt();
        input.close();

        area = largo * ancho;
        System.out.println("The area of the rectangle is: ".concat(String.valueOf(area)).concat("m2"));
    }
}
