import java.util.Scanner;

public class DivisibleBy3{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = input.nextInt();

if(num % 3 == 0){
System.out.printf("%d is divisible by 3", num);
}
else{
System.out.printf("%d is not divisible by 3", num);
}

}
}