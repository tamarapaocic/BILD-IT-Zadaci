package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	
	//sortiranje redova u kopiranoj matrici
	public static double[][] sortRows(double[][] m) {
		double[][] result = copy(m);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < result[i].length; k++) {
					if (result[i][j] < result[i][k]) {
						double temp = result[i][j];
						result[i][j] = result[i][k];
						result[i][k] = temp;
					}
				}
			}
		}

		return result;
	}

	//metoda za kopiranje matrice
	public static double[][] copy(double[][] arr) {
		double[][] copy = new double[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				copy[i][j] = arr[i][j];
			}
		}

		return copy;
	}

	//printanje 
	public static void printArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	//metoda za unos elemenata u matricu
	public static void enterMatrix(double[][] matrix) {
		
		Scanner input = new Scanner(System.in);
		try{
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
	}

	public static void main(String[] args) {
		
		double[][] array = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		enterMatrix(array);
		System.out.println("\nOriginal array: ");
		printArray(array);
		double[][] sortedArray = sortRows(array);
		System.out.println("\nSorted array: ");
		printArray(sortedArray);
	}

}
