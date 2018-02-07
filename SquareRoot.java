import java.util.Scanner;
public class SquareRoot {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter any double value");
		double input = keyboard.nextDouble();
		double squareRoot = Math.sqrt(input);
		System.out.println("The square root of " + input + " is " + squareRoot);
	}

}

