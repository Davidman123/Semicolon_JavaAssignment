package david;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        double kilogramsPerPound = 0.45359237;
        double metersPerPound = 0.0254;

        System.out.println("Enter your height: ");
        double height = input.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();

        height = height * metersPerPound;
        weight = weight * kilogramsPerPound;

        double bMI = weight / Math.pow(height, 2);

        System.out.printf("Your Body Mass Index is: %f", bMI);
    }
}
