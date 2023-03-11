public class WorldPopulation{

public static void main(String[] args){
long currentPop = 7_000_000_000L;
int annualPop = 67_000_000;
long yrOne = currentPop + annualPop;
long yrTwo = yrOne + annualPop;
long yrThree = yrTwo + annualPop;
long yrFour = yrThree + annualPop;
long yrFive = yrFour + annualPop;

System.out.printf("Current population: %d%n", currentPop);
System.out.printf("Annual population: %d%n", annualPop);
System.out.printf("Estimated population after one year: %d%n", yrOne);
System.out.printf("Estimated population after two years: %d%n", yrTwo);
System.out.printf("Estimated population after three years: %d%n", yrThree);
System.out.printf("Estimated population after four years : %d%n", yrFour);
System.out.printf("Estimated population after five years: %d%n", yrFive);
}
}