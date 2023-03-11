package david;

import java.util.Scanner;

public class Meters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = scanner.nextDouble();

        double convert = feet * 0.305;

        System.out.println(feet +" feet is " + convert+" meters");
    }
}
