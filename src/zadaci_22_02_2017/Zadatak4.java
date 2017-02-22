package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

		public static int sumDigits(long n) {
			//  koristimo Math.abs() metodu da bi program radio i sa negativnim brojevima
			int broj = (int) Math.abs(n);
			int sum = 0;

			while (broj != 0) {
				int cifra = broj % 10; //zadnja cifru broja
				sum += cifra; // povecavamo sumu za zadnju cifru broja
				broj = broj / 10; // dobijamo novi broj, manji za jednu cifru
			}

			return sum;
		}

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int broj = 0;
			try{
			System.out.print("Unesite cijeli broj: ");
			broj = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos");
			}
			sc.close();

			System.out.println("Zbir svih cifara za broj " + broj + " je " + sumDigits(broj));
		}
	}
