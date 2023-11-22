import java.util.Scanner;

public class MinOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
//Take input from user.
System.out.println("Please Enter 1st Number");
double num1 = scanner.nextDouble();
System.err.println("Please Enter 2nd Number");
double num2 =scanner.nextDouble();
System.out.println("Please Enter 3rd Number.");
double num3 =scanner.nextDouble();

//Now find the minimum of 3 numbers

double min1 =findmin(num1, num2, num3);

System.out.println("The Minimum Number of 3 is : "+ min1);

	}
	
// Here is the Method to Find the Minimum of 3 Numbers
	private static double findmin(double a, double b, double c) {
		double Min=a;
		if (b < Min) {
			Min = b;
		}
		if (c < Min) {
			
			Min = c;
		}
		return Min;
	}
}
