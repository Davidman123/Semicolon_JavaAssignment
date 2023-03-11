import java.util.Scanner;

public class Multiples{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num1 = input.nextInt() * 3;

System.out.print("Enter a number: ");
int num2 = input.nextInt();

if(num1 % (num2 + num2) == 0){
System.out.printf("%d is a multiple of %d%n", num1, (num2 + num2));
}else{
System.out.printf("%d is not a multiple of %d%n", num1, (num2 + num2));
}
 
}
}