package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// novi scanner objekat
        Scanner input = new Scanner(System.in);
        try {
		//unos prvog niza
		System.out.println("Unesite 5  brojeva");	
		int[] niz1 = new int[5];
		for(int i=0;i<5;i++){
			niz1[i] = input.nextInt();
		}
		//unos drugog niza
		System.out.println("Unesite 5  brojeva");	
		int[] niz2 = new int[5];
		for(int i=0;i<5;i++){
			niz2[i] = input.nextInt();
		}
		//poziv metode i ispis da li su nizovi jednaki
		System.out.println(equals(niz1,niz2));
		}
        catch(InputMismatchException e){
        	System.out.println("Wrong input");
        }
	}
	    //metoda za ispitivanje da li svi njihovi elementi na istim pozicijama jednaki
		public static boolean equals(int niz1[],int niz2[]){
			if (Arrays.equals(niz1, niz2)) return true;
			return false;
		}
		
	}

