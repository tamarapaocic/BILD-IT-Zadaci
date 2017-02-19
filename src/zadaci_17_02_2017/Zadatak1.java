package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			int startYear = 0;
			int endYear = 0;
			boolean wrongUserInput = true;

			while (wrongUserInput) {
				try {
					System.out.print("Unesite pocetnu godinu");
					startYear = sc.nextInt();
                    System.out.println("Unesite krajnju godinu");
					endYear = sc.nextInt();
                    wrongUserInput = false;

					if (startYear < 0) {
						System.out.println("Pogresan unos. Morate unijeti cijeli broj veci od 0");
						wrongUserInput = true;
					}
					if (endYear < startYear){
						System.out.println("Pogresan unos. Morate unijeti krajnju godinu vecu od pocetne.");
						wrongUserInput = true;
					}
				} catch (Exception ex) {
					System.out.println("Pogresan unos.");		
					sc.nextLine();
				}
		}
	        
			System.out.println("Year     Days in year"); 
			//poziv metode u petlji od pocetne do krajnje godine
			for (int i = startYear; i <= endYear; i++) {
				System.out.println(i + "         " + numberOfDaysInAYear(i));
			}
		}
		//Metoda koja vraca broj dana u godini
		public static int numberOfDaysInAYear(int year){
			if (isLeapYear(year))
				return 366;
			else
				return 365;
		}

		//Metoda koja provjerava da li je godina prestupna
		public static boolean isLeapYear(int year) {
			return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		}
	}