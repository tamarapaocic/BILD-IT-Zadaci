package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer number = IntUserInput.getInt(input, "Enter a sequence of numbers ending wih 0: ");
		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		// Display the largest number in the input 
		System.out.println("The largest number in the input is " + max(list));
	}

	/** Return the maximum value in an ArrayList of integers */
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
}