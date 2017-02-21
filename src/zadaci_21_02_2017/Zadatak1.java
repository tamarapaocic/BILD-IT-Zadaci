package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	    //metoda za proracun napojnice i ukupnog iznosa racuna
        public static void calculate(double racun, double procenat) {
		
		double iznosNapojnice = racun * (procenat / 100);
		double iznosRacuna = racun + iznosNapojnice;

		System.out.println("Ukupna vrijednost racuna je: " + iznosRacuna);
		System.out.println("Napojnica iznosi: " + iznosNapojnice);
	}

	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean userInput = false;
		
		while(!userInput) { 
			try {
			System.out.print("Unesite iznos racuna: ");
			double racun = sc.nextDouble();
			while (racun < 0){
				System.out.println("Unesite iznos veci od 0: ");
				racun = sc.nextDouble();
			}
			System.out.print("Unesite iznos napojnice u procentima: ");
			double procenat = sc.nextDouble();
			while (procenat < 0){
            System.out.println("Unesite procenat veci od 0: ");
            procenat = sc.nextDouble();
			}
            userInput = true;
			// racunanje i ispis iznosa napojnice i ukupnog racuna
			calculate(racun, procenat);

		  } catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
		}
			}
	}

}