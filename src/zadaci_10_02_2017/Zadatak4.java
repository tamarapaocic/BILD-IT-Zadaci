package zadaci_10_02_2017;

import java.util.InputMismatchException;

public class Zadatak4 {

	public static void main(String[] args) {
		//novi scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try{
		//unos broja redova i kolona
		System.out.println("Unesite broj redova");
		int r = sc.nextInt();
		System.out.println("Unesite broj kolona");
		int c = sc.nextInt();
		//kreiranje matrica sa r redova i c kolona
		 double[][] matrix = new double[r][c];
		
		 System.out.println("Unesite " + matrix.length + " reda i " + matrix[0].length + " kolone");
         //unos elemenata
		 for(int row = 0; row < matrix.length; row++){
		 	for(int column = 0; column < matrix[row].length; column++){
		 		matrix[row][column] = sc.nextDouble();
		 	}
		 }
		 //zatvaranje unosa
		 sc.close();
		 //novi niz i poziv metode koja vraca taj niz 
		 int[] location = locateLargest(matrix);
		 //ispis lokacije
		 System.out.println("Lokacija najveceg elementa je (" + location[0] + "," + location[1] + ")");
		 
	     } catch(InputMismatchException e){
	    	 System.out.println("error");
	    	 }
	     }

         public static int[] locateLargest(double[][] a){ //metoda prima unesenu matricu a vraca lokaciju najveceg el. kao niz
         double max = 0; //temporary varijabla
         int [] maxx = new int[2]; //novi niz koji ce sadrzavat lokaciju
         //prolazak kroz sve redove i kolone
	     for(int row = 0; row < a.length; row++){
		 	for(int column = 0; column < a[row].length; column++){
		 		if(a[row][column] > max){ //ako je a[row][column] vece od max
		 			max = a[row][column]; //max varijabla dobija tu vrijednost
		 			maxx[0] = row; //nizu dodjeljujemo red od max el. kao prvi elemenat
		 			maxx[1] = column; //a kolonu od max kao drugi elemenat
		 		}
		 	}
		 	}
		 	return maxx; //vracanje niza
            }
}