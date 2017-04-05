package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String value = input.next();

		reverseDisplay(value);
		input.close();
	}

	/** Method displays the characters in a string reversely */
	private static void reverseDisplay(String value) {
		if (value.length() == 1) // Base case
			System.out.println(value);
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1)); // Recursive call
		}
	}
	}