import java.util.Scanner;

public class NegPosZeroVal{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int negativeInt = 0, positiveInt = 0, zero = 0;

int i = 0;
while(i < 5){
System.out.print("Input a digit: ");
int num = input.nextInt();
if(num > 0){
if(num % 2 == 0){
positiveInt++;
}
}

if(num % 2 != 0){
negativeInt++;
}

if(num == 0){
zero++;
}
i++;
}

System.out.printf("It has %d negative numbers %d positive numbers and %d zeros%n",negativeInt, positiveInt, zero);

}
}