package zadaci_20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean wrongUserInput = true;
		int broj1 = 0;
		int broj2 = 0;
		
		while (wrongUserInput) {
			try {
				System.out.print("Unesite dva cijela broja: ");
				broj1 = sc.nextInt();
				if (broj1 < 0){
					System.out.println("Unesite broj veci od 0");
					broj1 = sc.nextInt();
				}
				
				broj2 = sc.nextInt();
				if (broj2 < 0){
					System.out.println("Unesite broj veci od 0");
					broj2 = sc.nextInt();
				}
				wrongUserInput = false;
				
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
				sc.nextLine();
			}
		}
	
       if (broj1 > broj2) {
			int temp = broj2;
			broj2 = broj1;
			broj1 = temp;
		}
		int min = 1;
		// Nalazenje najmanjeg zajednickog djelioca veceg od 1
		for (int i = 2; i <= broj1; i++) {
			if (broj1 % i == 0 && broj2 % i == 0) {
				min = i;
				break;
			}
		}
		int max = 1;
		// Nalazenje najveceg zajednickog djelioca
		for (int i = 2; i <= broj1; i++) {
			if (broj1 % i == 0 && broj2 % i == 0) {
				max = i;

			}
		}
		
	System.out.println("Najmanji zajednicki djelilac je " + min + ", a najveci zajednicki djelilac je " + max);
}
}
