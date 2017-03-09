package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The element value is " + 	array[input.nextInt()]);
			input.close();
		} catch (InputMismatchException e){
			System.out.println("Invalid input.");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}
