package zadaci_29_03_2017;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(4.3);
		list.add(6);
		list.add(9.1);
		list.add(8);
		System.out.println("List: " + list.toString());
		shuffle(list);
		System.out.println("Shuffled list: " + list.toString());
	}

	/** Shuffles an ArrayList of numbers */
	public static void shuffle(ArrayList<Number> list) {
		java.util.Collections.shuffle(list);
	}
}