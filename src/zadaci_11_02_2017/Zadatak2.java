package zadaci_11_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvih devet cifara");
		try {
			//unos cifara
		int isbn = unos.nextInt();
		//broj ne moze biti negativan
        while(isbn < 0){
        	System.out.println("Cifre moraju biti pozitivne. Pokusajte ponovo");
        	isbn = unos.nextInt();
        }
        //broj mora imati tacno 9 cifara
        while(String.valueOf(isbn).length() < 9 || String.valueOf(isbn).length() > 9){
        	System.out.println("Morate unijeti 9 cifara.Pokusajte ponovo");
        	isbn = unos.nextInt();
        }
        //racunamo svaku cifru
		int c1 = isbn / 100000000;
		int c2 = (isbn % 100000000 ) / 10000000;
		int c3 = (isbn % 10000000) / 1000000;
		int c4 = (isbn % 1000000) / 100000;
		int c5 = (isbn % 100000) / 10000;
		int c6 = (isbn % 10000) / 1000;
		int c7 = (isbn % 1000) / 100;
		int c8 = (isbn % 100) / 10;
		int c9 = (isbn % 10);
		
		//koristimo formulu za dobijanje 10.cifre
		int c10 = (c1 * 1 + c2 * 2 + c3 * 3 + c4 * 4 + c5 * 5 + c6 * 6 + c7 * 7 + c8 * 8 + c9 * 9) % 11;

		if (c10 == 10){
			System.out.println("ISBN-10 broj je: " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + "X");
		}
		else {
			System.out.println("ISBN-10 broj je: " + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10);
		}
		} 
		catch (InputMismatchException e){
			System.out.println("wrong input");
		}
			}

		}
