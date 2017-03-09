package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak5 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.print("Enter five integers for list1: ");
		fill(list1);
		System.out.print("Enter five integers for list2: ");
		fill(list2);

		// Union
		ArrayList<Integer> list3 = union(list1, list2);

		System.out.print("The combined list is: ");
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
	}

	/** Returns the union of two array lists of integers */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		return list3;
	}	

	/** Adds user input to a list */
	public static void fill(ArrayList<Integer> list) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			list.add(IntUserInput.getInt(input, ""));
		}
	}
}