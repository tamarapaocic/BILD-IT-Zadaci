package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		double[][] matrix1 = getmatrix(1);
		double[][] matrix2 = getmatrix(2);

		double[][] matrix3 = addMatrix(matrix1, matrix2);

		print(matrix1, matrix2, matrix3);
	}
	
	public static double[][] getmatrix(int n) {
		double[][] m = new double[3][3];
		try{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matrix" + n + ": ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				m[i][j] = input.nextDouble();
		}
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
		return m;
	}

	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void print(double[][] m, int r) {	
		for (int j = 0; j < m[r].length; j++) {
			System.out.print(m[r][j] + " ");
		}	
	}
	
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("");
		
		for (int i = 0; i < 3; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(m3, i);
			System.out.println();
		}
	}
}