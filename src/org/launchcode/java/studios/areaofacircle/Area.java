package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Double radius = 0.0;
            do {
                System.out.print("Enter a radius: ");
                radius = input.nextDouble();
            } while (radius <= 0.0);
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        } catch (Exception e) {
            System.err.println("Stop!");
        }
    }
}

