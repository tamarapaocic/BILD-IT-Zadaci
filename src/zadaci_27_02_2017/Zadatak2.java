package zadaci_27_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

import metode.DoubleUserInput;

public class Zadatak2 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.println("Enter matrix1: ");

			double[][] matrix1 = new double[3][3];
			
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[0].length; j++) {
					matrix1[i][j] = DoubleUserInput.getDouble(input," ");
				}
			}

			System.out.println("\nEnter matrix2: ");

			double[][] matrix2 = new double[3][3];
			
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[0].length; j++) {
					matrix2[i][j] = DoubleUserInput.getDouble(input," ");
				}
			}

			input.close();

			double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

			print(matrix1, matrix2, matrix3);
		}
		
	
		//metoda za mnozenje dvije matrice
		public static double[][] multiplyMatrix(double[][] a, double[][] b) {
			double[][] c = new double[a.length][a[0].length];

			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = a[i][j] * b[i][j];
				}
			}
			return c;
		}
		
		//printanje elemenata
		public static void print(double[][] m, int r) {	
			for (int j = 0; j < m[r].length; j++) {
				System.out.print(m[r][j] + " ");
			}	
		}
		
		//printanje sve tri matrice
		public static void print(double[][] m1, double[][] m2, double[][] m3) {
			System.out.println("");
			
			for (int i = 0; i < 3; i++) {
				print(m1, i);
				System.out.print((i == 1 ? "  *  " : "     "));
				print(m2, i);
				System.out.print((i == 1 ? "  =  " : "     "));
				print(m3, i);
				System.out.println();
			}
		}
	}