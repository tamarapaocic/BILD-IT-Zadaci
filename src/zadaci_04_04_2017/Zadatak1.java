package zadaci_04_04_2017;

import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int value = IntUserInput.getInt(input," Enter an integer: ");

		reverseDisplay(value);
	}

	/** Method displays an int value reversely */
	private static void reverseDisplay(int value) {
		if (value < 10) // Base case
			System.out.println(value);
		else { 
			System.out.print(value % 10);
			reverseDisplay(value / 10); // Recursive call
		}
	}
}