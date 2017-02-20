package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// niz koji ce nam sluziti za brojanje koliko je puta neki broj unesen
		int[] counter = new int[100];
		try {
		System.out.println("Unesite niz cijelih brojeva (1-100) : ");
		// nova lista
		ArrayList<Integer> lista = new ArrayList<>();
		
		// dodavanje elemenata u niz, nula prekida unos
		while(true){
			
			int num = sc.nextInt();
			if (num == 0) break;
			else if (num < 1 || num > 100){
				System.out.println("Unesite broj u rasponu od 1 do 100");
				num = sc.nextInt();
			}
			lista.add(num);
			counter[num]++;
			
		}
		} catch(InputMismatchException e){
			System.out.println("Pogresan unos");
		}
		// ispis rezultata
		for (int i = 0; i < counter.length; i++) {
			// ispisujemo samo brojeve koji su se pojavili
			if (counter[i] != 0) {
			System.out.println("Broj " + i + " se pojavljuje " + counter[i] + (counter[i] == 1 ? " put." : " puta."));
			}
		}
		sc.close();
	}

}
