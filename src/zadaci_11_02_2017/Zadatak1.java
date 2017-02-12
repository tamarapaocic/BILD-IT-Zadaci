package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//novi scanner objekat
     Scanner sc = new Scanner(System.in);
     while(true){
    	try {
			// Unos od strane korisnika
			System.out.println("Unesite cijeli broj: ");
			int number = sc.nextInt();
			// Broj mora da bude pozitivan
			while (number <= 0) {
				System.out.println("Unesite pozitivan broj: ");
				number = sc.nextInt();
			}
			if (number == 1) {
				System.out.println("Faktori broja 1: 1");
				break;
			} else {
				//pozivanje metode
				faktoriBroja(number);
				break;
			}
		} catch (InputMismatchException ex) {
			// Exception
			System.out.println("Wrong input");
		}
		sc.nextLine();
	}
	}
	
	public static void faktoriBroja(int num){
		//lista koja cuva faktore nekog broja
		ArrayList<Integer> faktori = new ArrayList<>();
		int djelilac = 2;
		
		while (num>1){
			//petlja prolazi od 2 do broja te pronalazi prvi broj s kojim je djeljiv i dodaje ga u listu faktori
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					djelilac = i;
					faktori.add(djelilac);
					break;
		}
	}
			num /= djelilac;
}
		//sortiranje liste 
 Collections.sort(faktori);
       //ispis
 System.out.println(faktori);
	}
}