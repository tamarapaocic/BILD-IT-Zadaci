package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(IntUserInput.getInt(input, ""));
		}

		removeDuplicate(list);

		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/** Removes the duplicate elements from an array list of integers */
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> tempList = new ArrayList<>(list);

		list.clear();

		for (int i = 0; i < tempList.size(); i++) {
			if (!list.contains(tempList.get(i))) {
				list.add(tempList.get(i));
			}
		}
	}

}