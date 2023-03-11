package david;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double velocity1;
        double velocity2;
        double timeSpan;

        System.out.println("Enter velocity1,velocity2, and timeSpan: ");
        velocity1 = input.nextDouble();
        velocity2 = input.nextDouble();
        timeSpan = input.nextDouble();

        double solution = (velocity1 - velocity2) / timeSpan;

        System.out.printf("The average average is %f ", solution);
    }
}
