import java.util.Scanner;
public class NumberCharacterConversion {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		while (!input.equalsIgnoreCase("quit")) {
			System.out.println("Enter a number or character");
			input = keyboard.next();

		if ((input.charAt(0) >=65 && input.charAt(0) <=90) || (input.charAt(0) >=97 && input.charAt(0) <=122)) {
			System.out.println("The letter " + input.charAt(0) + " in binary is " + Integer.toBinaryString((int)input.charAt(0)));	
			System.out.println("The letter " + input.charAt(0) + " in hexadecimal is " + Integer.toHexString((int)input.charAt(0)));	
		} else {
			
			System.out.println("The number " + input + " in binary is " + Integer.toBinaryString(Integer.parseInt(input)));	
			System.out.println("The number " + input + " in hexadecimal is " + Integer.toHexString(Integer.parseInt(input)));	
		}
	}
}
}
