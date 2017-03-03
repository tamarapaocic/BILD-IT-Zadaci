package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		System.out.println("Unesite elemente 1. niza");
		int[][] niz1 = getArray();
		
		System.out.println("Unesite elemente 2. niza"); 
		int[][] niz2 = getArray();
	
		System.out.println("Two arrays are " + (equals(niz1,niz2) ? " " : " not ") + "identical");
	   }
	
	    //metoda za unos elemenata u niz
	    public static int[][] getArray() {
			Scanner sc = new Scanner(System.in);
		int[][] m = new int[3][3];
		try{
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos");
			sc.close();
		}
	
		return m;

	}
	
	    //metoda za provjeru da li su dva niza identicna
	    public static boolean equals(int[][] m1, int[][] m2){
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
		if (m1[i][j] != m2[i][j])
			return false;
			}	
	}
		return true;
}
}
