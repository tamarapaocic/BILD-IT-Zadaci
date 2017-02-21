package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
	
	public static void reverse (int number){
		
		String str = number + "";
		
		for (int i = str.length() - 1; i >= 0; i-- ){
			System.out.print(str.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean wrongUserInput = true;
		int broj = 0;
		
		while (wrongUserInput) {
			try {
				System.out.print("Unesite cijeli broja: ");
				broj = sc.nextInt();
				while (broj < 0){
					System.out.println("Unesite broj veci od 0");
					broj = sc.nextInt();
				}
				wrongUserInput = false;
				
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
				sc.nextLine();
			}
		}
		reverse(broj);
	
	}

}

