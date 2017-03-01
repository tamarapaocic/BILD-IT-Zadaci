package mini_projekat_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
	String[][] board = getBoard();
	String[] tokens = {" X "," O "};
	int result;
	do {
		print(board);
		int[] cell = getCell(board, tokens[0]);
		placeToken(board, cell, tokens[0]);
		result = gameStatus(board, tokens[0]);
		if (result == 2) {
			swap(tokens);
		}
	} while (result == 2);

	print(board);
	if (result == 0)
		System.out.println(tokens[0] + "player won");
	else
		System.out.println("Players draw");
		}

	/**
	 * metoda koja pravi 3x3 matricu/prazna polja
	 * @return
	 */
		public static String[][] getBoard(){
			String[][] m = new String[3][3];
			for (int row = 0; row < 3; row++){
				for (int col = 0; col < 3; col++){
					m[row][col] = "   ";
				}
			}
			return m;
		}
		
		/**
		 * metoda za printanje okvira
		 * @param m
		 */
		public static void print(String[][] m){
			System.out.println("\n-------------");
			for (int row = 0; row < m.length; row++){
				for (int col = 0; col < m[0].length; col++){
					System.out.print("|" + m[row][col]);
				}
				System.out.println("\n-------------");
			}
		}
		
		/**
		 * metoda za unos poteza u matricu koja vraca njegovu lokaciju
		 * @param m
		 * @param t
		 * @return
		 */
		public static int[] getCell(String[][] m, String t){
			Scanner input = new Scanner(System.in);
			char[] cellChar = new char[2];
			int [] cell = new int[2];
			try{
			do{
			
				System.out.println("Enter a row(0, 1, or 2) for player " + t + ": ");
				cellChar[0] = input.next().charAt(0);
				while(!Character.isDigit(cellChar[0])){
					System.out.println("Enter a row(0, 1, or 2) for player " + t + ": ");
					cellChar[0] = input.next().charAt(0);
				}
				cell[0] = Character.getNumericValue(cellChar[0]);
				
				System.out.print("Enter a column(0, 1, or 2) for player " + t + ": ");
				cellChar[1] = input.next().charAt(0);
				while(!Character.isDigit(cellChar[1])){
					System.out.println("Enter a row(0, 1, or 2) for player " + t + ": ");
					cellChar[1] = input.next().charAt(0);
				}
				cell[1] = Character.getNumericValue(cellChar[1]);
			
			}
			while (!isValidCell(m,cell));
			
			}catch(InputMismatchException e){
				System.out.println("Invalid input");
			}
			return cell;
		}
		
		
		/**
		 * Metoda koja provjerava da li je celija validna i da li je vec popunjena
		 * @param m
		 * @param cell
		 * @return
		 */
		public static boolean isValidCell(String[][] m, int[] cell){
			for (int i = 0; i < cell.length; i++){
				if (cell[i] < 0 || cell[i] >= 3){
					System.out.println("Invalid cell");
					return false;
				}
				}
			if (m[cell[0]][cell[1]] != "   "){
				System.out.println("\nRow " + cell[0] + " column " + cell[1] + " is filled");
					return false;
					}
			return true;
			}
		
		/**
		 * metoda za postavljanje tokena X i O u zeljenu celiju
		 * @param m
		 * @param e
		 * @param t
		 */
	   public static void placeToken(String[][] m, int[] e, String t){
		m[e[0]][e[1]] = t;
	   }

	   
	   /**
	    * metoda za zamjenu tokena
	    * @param p
	    */
	   public static void swap(String[] p) {
			String temp = p[0];
			p[0] = p[1];
			p[1] = temp;
		}
	  
	   public static int gameStatus(String[][] m, String e) {
			if (isWin(m, e))
				return 0; // Win
			else if (isDraw(m))
				return 1; // Draw
			else
				return 2; // Continue
		}

	   /**
	    * metoda koja provjerava da li je pobjeda horizontalna,vertikalna ili dijagonalna
	    * @param m
	    * @param t
	    * @return
	    */
	   public static boolean isWin(String[][] m, String t) { 
			return isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t);
		}
	   
	   /**
	    * metoda koja provjerava da li je nerijeseno
	    * @param m
	    * @return
	    */
	   public static boolean isDraw(String[][] m) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] == "   ")
						return false;
				}
			}
			return true;
		}
	   
	   
	   public static boolean isHorizontalWin(String[][] m, String t) {
			for (int i = 0; i < m.length; i++) {
				int count = 0;
				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] == t)
						count++;
				}
				if (count == 3)
					return true;
			}
			return false;
		}
	   
	   
	   public static boolean isVerticalWin(String[][] m, String t) {
			for (int i = 0; i < m.length; i++) {
				int count = 0;
				for (int j = 0; j < m[i].length; j++) {
					if (m[j][i] == t)
						count++;
				}
				if (count == 3)
					return true;
			}
			return false;
		}
	   
	   public static boolean isDiagonalWin(String[][] m, String t) {
			int count = 0;
			for (int i = 0; i < m.length; i++) {
				if (m[i][i] == t)
					count++;
				if (count == 3)
					return true;
			}
			count = 0;
			for (int i = 0, j = m[i].length - 1; j >= 0 ; j--, i++) {
				if (m[i][j] == t)
					count++;
				if (count == 3)
					return true;
			}
			return false;
		}
	}
