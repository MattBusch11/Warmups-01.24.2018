import java.util.Scanner;
public class FullNamePrompt {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first and last name");
		String input = keyboard.nextLine();
		int k = input.lastIndexOf(' ');
		String firstName = input.substring(0, k);
		String lastName = input.substring(k + 1);
		System.out.println("Hello Mr/Mrs " + lastName);

	}

}

