package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	
		//Korisnikov unos
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		//Poziv metode za printanje n x n matrice
		printMatrix(n);

	}

	 public static void printMatrix(int n){
		 //Kreiranje matrica sa n redova i n kolona
		 int[][] matrix = new int[n][n];
		//Nasumicno generisanje elemenata matrice 0 ili 1 	
		 for(int row = 0; row < matrix.length; row++){
				for(int column = 0; column < matrix[row].length; column++){
					matrix[row][column] = (int)(Math.random() * 2);
				}
	 }
		 //Ispis matrice
			for(int row = 0; row < matrix.length; row++){
				for(int column = 0; column < matrix[row].length; column++){
					System.out.print(matrix[row][column] + " ");
		}
				System.out.println();
			} 
}
}