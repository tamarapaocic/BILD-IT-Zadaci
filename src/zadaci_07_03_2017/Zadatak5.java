package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer number = IntUserInput.getInt(input,"Enter a list of integers ending with 0: ");

		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		// Invoke shuffle 
		shuffle(list);

		// Display shuffled list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/** Shuffles the elements in an ArrayList of integers */
	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
}