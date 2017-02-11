package zadaci_10_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	    public static void main(String[] args) {
	    //nova 3x3 matrica
		double[][] array = new double[3][3];
		
		System.out.println("Unesite 3x3 matricu red po red ");
		//poziv metode za unos elemenata u matricu
		enterMatrix(array);
		//ispis,metoda za printanje orginalne matrice
		System.out.println("Orinalni niz: ");
		printArray(array);
		//nova matrica, poziv metode koja sortira redove i vraca sortiranu matricu
		double[][] sortedArray = sortRows(array);
		//ispis,metoda za printanje sortirane matrice
		System.out.println("\nSortirani niz: ");
		printArray(sortedArray);
	    }
	    
	    public static void enterMatrix(double[][] matrix) { //metoda za unos elemenata u matricu
			Scanner input = new Scanner(System.in);
			try{
			//prolazak kroz sve redove i kolone i unos el.
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}
			}} catch(InputMismatchException e){
				System.out.println("Wrong input");
			}
		}
	    
	    public static void printArray(double[][] arr) { //metoda za printanje matrica
			//prolazak kroz sve redove i kolone i ispis elemenata i razmaka izmedju njih
	    	for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	    
	    public static double[][] copy(double[][] arr) { // metoda za kopiranje matrice u drugu
			double[][] copy = new double[arr.length][arr[0].length]; //dodjeljivanje istog broja redova i kolona novoj matrici
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					copy[i][j] = arr[i][j]; //kopiranj elemenata
				}
			}
			return copy; //vracanje kopije
		}
	    
		public static double[][] sortRows(double[][] m) { //metoda za sortiranje redova
			double[][] result = copy(m); //spremanje kopirane matrice u novu
			for (int i = 0; i < result.length; i++) { //sortiranje redova
				for (int j = 0; j < result[i].length; j++) {
					for (int k = 0; k < result[i].length; k++) {
						if (result[i][j] < result[i][k]) {
							//zamjena elemenata
							double temp = result[i][j]; 
							result[i][j] = result[i][k];
							result[i][k] = temp;
						}
					}
				}
			}
			return result; //vracanje sortirane matrice
		}
	}
