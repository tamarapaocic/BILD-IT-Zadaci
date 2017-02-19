package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri grada");
		
		String grad1 = sc.nextLine();
		String grad2 = sc.nextLine();
		String grad3 = sc.nextLine();
		
		ArrayList<String> gradovi = new ArrayList<>();
		gradovi.add(grad1);
		gradovi.add(grad2);
		gradovi.add(grad3);
		
		//sortiranje elemenata u listi
		Collections.sort(gradovi);
		
		System.out.println(gradovi);
		
	}

}
