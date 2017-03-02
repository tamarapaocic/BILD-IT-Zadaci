package mini_projekat_3;

import java.util.Scanner;

public class ConnectFour {
	
		private char[][] field; 
		private char player; 

		/** Konstrukotor koji kreira tablu 6*7 i postavlja crvenog igraca kao prvog */
		ConnectFour() {
			field = new char[6][7];
			player = 'R';
		}

		/**
		 * Popunjavanje table sa praznim mjestima
		 */
		void initialize() {
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[0].length; j++) {
					field[i][j] = ' ';
				}
			}
		}

		/**
		 * Printanje okvira
		 */
		void printField() {
			System.out.println();
			for (int i = 0; i < field.length; i++) {
				System.out.print("|");
				for (int j = 0; j < field[0].length; j++) {
					System.out.print("| " + field[i][j] + " |");
				}
				System.out.print("|");
				System.out.println();
			}
			System.out.println("-------------------------------------");
		}

		/**
		 * @return  String sa imenom boje igraca
		 */
		String colorOfTheDisk() {
			if (player == 'R') {
				return "red";
			} else {
				return "yellow";
			}
		}

		/**
		 * Provjera da li ima slobodnih mjesta u odredjenoj koloni
		 * @param column  broj kolone koja se provjerava
		 * @return true ako ima slobodno mjesto,inace false
		 */
		boolean availableField(int column) {
			for (int i = 0; i < field.length; i++) {
				if (field[i][column] == ' ') {
					return true;
				}
			}
			return false;
		}

		/**
		 * Igrac upisuje broj kolone u koju zeli staviti disk
		 * @return broj kolone
		 */
		int playersMove() {
			String diskColor = colorOfTheDisk(); 
			boolean isValid = false;
			int playersInput = -1;
			
			while (!isValid) {
				isValid = true;
				System.out.print("Insert a " + diskColor + " disk in the column (0 - 6): ");
				
				try {
					Scanner input = new Scanner(System.in);
					playersInput = input.nextInt(); 
					
				} catch (Exception e) {
					System.out.println("Wrong input.");
					isValid = false;
				}
				if (playersInput < 0 || playersInput > 6) {
					System.out.println("Wrong input, column are marked from 0 to 6, try again. ");
					isValid = false;
				}
				if (!availableField(playersInput)) {
					System.out.println("Unavaible field in that column, try again. ");
					isValid = false;
				}

			}
			return playersInput;
		}

		/**
		 *Postavljanje diska u odredjenu kolonu na prvo slobodno mjesto odozdo 
		 * @param column broj kolone u koju disk treba biti stavljen
		 */
		void putDisk(int column) {
			for (int i = field.length - 1; i >= 0; i--) {
				if (field[i][column] == ' ') {
					field[i][column] = player;
					break;
				}
			}
		}

		void swap() {
			if (player == 'R') {
				player = 'Y';
			} else {
				player = 'R';
			}
		}

		boolean checkDiskColorsForWin(char diskOne, char diskTwo, char diskThree,char diskFour) {
			if (diskOne != ' ' && diskOne == diskTwo && diskTwo == diskThree	&& diskThree == diskFour) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Provjera da li ima pobjede u redovima
		 * @return true ako ima pobjede
		 */
		boolean winnerInRows() {
			for (int i = field.length - 1; i >= 0; i--) {
				for (int j = 0; j <= 3; j++) {
					if (checkDiskColorsForWin(field[i][j], field[i][j + 1],
							field[i][j + 2], field[i][j + 3])) {
						return true;
					}
				}
			}

			return false;
		}

		/**
		 * Provjera da li ima pobjede u kolonama
		 * @return true ako ima,u suprotnom false
		 */
		boolean winnerInColumns() {
			for (int i = field[0].length - 1; i >= 0; i--) {
				for (int j = 0; j < 3; j++) {
					if (checkDiskColorsForWin(field[j][i], field[j + 1][i],
							field[j + 2][i], field[j + 3][i])) {
						return true;
					}
				}
			}
			return false;
		}

		/**
		 * Provjera da li ima pobjede u dijagonalama
		 * @return true ako ima
		 */
		boolean winnerInDiagonals() {
			
			for (int i = field.length - 1; i >= 3; i--) {
				for (int j = 3; j >= 0; j--) {
					if (checkDiskColorsForWin(field[i][j], field[i - 1][j + 1],
							field[i - 2][j + 2], field[i - 3][j + 3])) {
						return true;
					}
				}
			}

			for (int i = field.length - 1; i >= 3; i--) {
				for (int j = field[0].length - 1; j >= 3; j--) {
					if (checkDiskColorsForWin(field[i][j], field[i - 1][j - 1],
							field[i - 2][j - 2], field[i - 3][j - 3])) {
						return true;
					}
				}
			}

			return false;
		}

		/**
		 * Provjera da li ima pobjednika u redovima, da li ima u kolonama i zatim po dijagonalama
		 * ako ima, vraca true
		 */
		boolean checkForWin() {
			if (winnerInRows() || winnerInColumns() || winnerInDiagonals()) {
				return true;
			} else {
				return false;
			}
		}

		void printWinner() {
			String winner = colorOfTheDisk(); 
			System.out.println("The " + winner + " player won!");
			System.exit(0);
		}

		/**
		 * Provjera da li su sva polja popunjena
		 * @return true/false
		 */
		boolean isFilledBoard() {
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[0].length; j++) {
					if (field[i][j] == ' ') {
						return false;
					}
				}
			}
			return true;
		}

		/**
		 * Pocetak nove igre 
		 */
		void newGame() {
			initialize(); 
			printField(); 
		
			while (!isFilledBoard()) {
			
				int column = playersMove();
				putDisk(column);
				printField();
				if (checkForWin()) {
					printWinner();
				}
				swap();
			}
			
            //ako su sva polja popunjena i nema pobjednika, onda je nerijeseno
			System.out.println("We have a draw!");
		}

		void printHeader() {
			System.out.println("\t **** CONNECT 4 ****");
			System.out.println("\n");
			
			}
	}
