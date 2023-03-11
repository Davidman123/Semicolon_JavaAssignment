package david;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double sideY1 = input.nextDouble();
        double sideX1 = input.nextDouble();
        double sideX2 = input.nextDouble();
        double sideY2 = input.nextDouble();
        double sideY3 = input.nextDouble();
        double sideX3 = input.nextDouble();


        double side1 = Math.pow(Math.pow(sideX2 - sideX1, 2) + Math.pow(sideY2 - sideY1, 2), 0.5);
        double side2 = Math.pow(Math.pow(sideX3 - sideX2, 2) + Math.pow(sideY3 - sideY2, 2), 0.5);
        double side3 = Math.pow(Math.pow(sideX1 - sideX3, 2) + Math.pow(sideY1 - sideY3, 2), 0.5);

        double s = (side1 +  side2 + side3)/2;
        double area = Math.pow(s*(s - side1) * (s - side2) * (s - side3), 0.5);

        System.out.printf("Area of the triangle is equals to %f", area);

    }
}
