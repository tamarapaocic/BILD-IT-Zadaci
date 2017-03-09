package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.DoubleUserInput;

public class Zadatak3 {

	public static void main(String[] args) {
     
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(DoubleUserInput.getDouble(input, ""));
		}

		// Display the sum of the list
		System.out.println("Sum of list: " + sum(list));
	}

	/** Returns the sum of all numbers in an ArrayList */
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}