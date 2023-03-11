public class PyramidGiza{

public static void main(String[] args){
int noOfStones = 20000000;
int weightOfStones = 15;
int noOfYears = 20;

double noOfStonesYr = (noOfStones * weightOfStones) / 20;
double noOfStonesHr = noOfStonesYr /(24 * 365);
double noOfStonesMin = noOfStonesHr /(60 * 24);

System.out.printf("Estimated number of stones used per year: %f%n", noOfStonesYr);
System.out.printf("Estimated number of stones used per hour: %f%n", noOfStonesHr);
System.out.printf("Estimated number of stones used per minutes: %f%n", noOfStonesMin);

}
}