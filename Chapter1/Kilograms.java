package david;

import java.util.Scanner;

public class Kilograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilograms = 0.454;

        System.out.println("Enter a number in pounds: ");
        double pounds = scan.nextDouble();

        double kilogram = pounds * kilograms;

        System.out.println(pounds + " pounds is " + kilogram + " kilogram");
    }
}
