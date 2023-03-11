package david;

import java.util.Scanner;

public class Financial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        double balance = scan.nextDouble();
        double interestRate = scan.nextDouble();

        double interest = balance * (interestRate / 1200);

        System.out.println("The interest is " + interest);

    }
}

