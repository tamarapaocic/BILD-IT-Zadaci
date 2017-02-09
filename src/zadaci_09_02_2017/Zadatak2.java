package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in); 
		System.out.println("Unesite broj pitanja: ");
		int num = sc.nextInt();  //Korisnikov unos
		question(num); //Poziv metode za pitanja
	}

	public static void question(int number) { //metoda koja prima broj pitanja
		
		int count = 0; //counter tacnih odgovora
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < number; i++) {
			//generisanje nasumicnih brojeva i pitanja
			int num1 = (int)(Math.random() * 10); 
			int num2 = (int)(Math.random() * 10);
			int result = num1 - num2;
			
			System.out.println("Koliko je " + num1 + " - " + num2 + "?");
			int answer = sc.nextInt(); //Korisnikov odgovor
			
			if (answer == result) { //Ako je korisnikov odgovor jedak rezultatu
				count++; //Povecati brojac
			}
		}
		
		System.out.println("Broj tacnih odgovora: " + count); //Ispis broja tacnih odgovora
		System.out.println("Broj netacnih odgovora " + (number - count)); //Ispis broja netacnih odgovora
	}

}
