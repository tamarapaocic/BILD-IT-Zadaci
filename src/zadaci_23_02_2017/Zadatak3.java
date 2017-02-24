package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite Social Security broj u formatu DDD-DD-DDDD");
		
		String broj = unos.nextLine();
		
		//provjera da li uneseni broj odgovara odredjenom formatu tj da li je validan
		System.out.print((broj.matches("\\d{3}-\\d{2}-\\d{4}") ? "Broj je validan" : "Broj nije validan"));
	}

}