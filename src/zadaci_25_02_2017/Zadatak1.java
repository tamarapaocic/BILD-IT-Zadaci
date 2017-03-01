package zadaci_25_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		// novi niz cija je duzina 100
		int[] array = new int[100];
		// niz koji ce nam sluziti za brojanje koliko je puta neki broj unesen
		int[] counter = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			int num = (int)(Math.random() * 10);
			array[i] = num;
			counter[num]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			// ispisujemo samo brojeve koji su se pojavili
			if (counter[i] != 0) {
				System.out.println("Broj " + i + " se pojavljuje " + counter[i] + (counter[i] == 1 ? " put." : " puta."));
			}
		}
	}

}
