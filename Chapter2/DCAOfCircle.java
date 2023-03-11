import java.util.Scanner;

public class DCAOfCircle{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

double pi = 3.14159;
System.out.print("Enter the radius of a circle: ");
int radius = input.nextInt();

int diameter = 2 * radius;
double circumference = 2 * pi * radius;
double area = pi * radius * radius;

System.out.printf("The diameter is %d%nThe circumference is %f%nThe area is %f%n", diameter, circumference, area);

}
}