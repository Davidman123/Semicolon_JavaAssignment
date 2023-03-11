import java.util.Scanner;

public class ComparingIntegers{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int myNum = input.nextInt();
int numSqr = (int) Math.sqrt(myNum);
int num = 100;

if(myNum > num && numSqr > num){
System.out.printf("%d and %d > %d%n", myNum, numSqr, num);
}

if(myNum == num && numSqr == num){
System.out.printf("%d and %d = %d%n", myNum, numSqr, num);
}

if(myNum != num && numSqr != num){
System.out.printf("%d and %d != %d%n", myNum, numSqr, num);
}

if(myNum < num && numSqr < num){
System.out.printf("%d and %d < %d%n", myNum, numSqr, num);
}

}
}