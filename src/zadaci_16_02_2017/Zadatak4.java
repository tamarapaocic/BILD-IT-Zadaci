package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		try{
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite neodreðen broj cijelih brojeva (unos prekida nula)");

		int broj = unos.nextInt();
		int count = 1;
		int najveciBroj = broj;
        
		
		while (broj > 0 ){
			broj = unos.nextInt();
			//ako je uneseni broj veci od najveceg broja,dodjeljujemo mu uneseni i brojimo da se jednom pojavio
			if (broj > najveciBroj){
				najveciBroj = broj;
				count = 1;
			}
			//ako je jednak najvecem broju povecavamo brojac
			else if (broj == najveciBroj){
				count++;
			}
		}
		System.out.println("Najveci broj je " + najveciBroj);
		System.out.println("Ponavlja se " + count);
		unos.close();
		
			} catch(InputMismatchException e){
				System.out.println("Pogresan unos");
			}
	}
		}
