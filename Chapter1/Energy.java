package david;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of water: ");
        double water = scan.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scan.nextDouble();


        System.out.println("Enter the final temperature: ");
        double finalTemperature = scan.nextDouble();

        double energy = water * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
