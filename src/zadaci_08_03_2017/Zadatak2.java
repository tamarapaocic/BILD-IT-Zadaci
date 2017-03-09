package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(IntUserInput.getInt(input, ""));
		}

		// Stort numbers
		sort(list);

		// Display list in increasing order
		System.out.println(list.toString());
	}

	/** Sorts an ArrayList of Integers */
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}
	