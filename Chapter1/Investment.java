package david;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();

        interestRate /= 1200;

        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        double futureInvestmentValue = amount * Math.pow(1 + interestRate, years * 12);

        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
