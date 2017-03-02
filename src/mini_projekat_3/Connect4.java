package mini_projekat_3;

import java.util.Scanner;

import metode.IntUserInput;

public class Connect4 {
	    
	//metoda koju pokusava popuniti polje sa plocicom odredjene boje,ako je uspjesno vraca true 
	//ako je vec popunjeno vraca false
	    public static boolean putDisk(char[][] field, int column, char color) {
	    	
	        if (field[0][column] != ' ')
	            return false;

	        for (int row = 0; row < 7; ++row) {
	        	    if (field[row][column] != ' ') {
	                field[row-1][column] = color;
	                return true;
	            }
	        }
	        field[6][column] = color;
	        return true;
	    }

	    //provjera redova, da li ima 4 ili vise plocica iste boje
	    private static char getWinnerInRows(char[][] field) {
	    	
	        for (int row = 0; row < 7; ++row) {
	            int count = 0;
	            for (int column = 1; column < 7; ++column) {
	                if (field[row][column] != ' ' && field[row][column] == field[row][column-1])
	                    ++count;
	                else
	                    count = 1;
	                
	                if (count >= 4) {
	                    return field[row][column];
	                }
	            }
	        }
	        return ' ';
	    }
	    

	    //provjera kolona, da li ima 4 ili vise plocica iste boje
	    private static char getWinnerInColumns(char[][] field) {
	        for (int column = 0; column < 7; ++column) {
	            int count = 0;
	            for (int row = 1; row < 7; ++row) {
	                if (field[row][column] != ' ' &&
	                    field[row][column] == field[row-1][column])
	                    ++count;
	                else
	                    count = 1;
	                if (count >= 4) {
	                    return field[row][column];
	                }
	            }
	        }
	        return ' ';
	    }

	    //provjera dijagonala, da li ima 4 ili vise plocica iste boje
	    private static char getWinnerInDiagonals(char[][] field) {

	        for (int column = 0; column < 7; ++column) {
	            int count = 0;
	            
	            for (int row = 1; row < 7; ++row) {
	                if (column + row >= 7) break;
	                if (field[row][column+row] != ' ' &&
	                    field[row-1][column + row - 1] == field[row][column+row])
	                    ++count;
	                else
	                    count = 1;
	                if (count >= 4) return field[row][column+row];
	            }
	        }

	        for (int row = 0; row < 7; ++row) {
	            int count = 0;
	            for (int column = 1; column < 7; ++column) {
	                if (column + row >= 7) break;
	                if (field[row + column][column] != ' ' &&
	                    field[row+column - 1][column - 1] == field[row + column][column])
	                    ++count;
	                else
	                    count = 1;
	                if (count >= 4) return field[row + column][column];
	            }
	        }

	        for (int column = 0; column < 7; ++column) {
	            int count = 0;
	           
	            for (int row = 1; row < 7; ++row) {
	                if (column - row < 0) break;
	                if (field[row][column-row] != ' ' &&
	                    field[row - 1][column - row + 1] == field[row][column-row])
	                    ++count;
	                else
	                    count = 1;
	                if (count >= 4) return field[row][column-row];
	            }
	        }

	        for (int row = 0; row < 7; ++row) {
	            int count = 0;
	            for (int column = 5; column >= 0; --column) {
	                if (column - row < 0) break;
	                if (field[column - row][column] != ' ' &&
	                    field[column - row - 1][column + 1] == field[column - row][column])
	                    ++count;
	                else
	                    count = 1;
	                if (count >= 4) return field[column - row][column];
	            }
	        }
	        return ' ';
	    }

	    //metoda koja vraca pobjednika
	    public static char getWinner(char[][] field) {
	        char winner = getWinnerInRows(field);
	        if (winner != ' ') return winner;
	        winner = getWinnerInColumns(field);
	        if (winner != ' ') return winner;
	        winner = getWinnerInDiagonals(field);
	        if (winner != ' ') return winner;

	        for (int i = 0; i < field.length; ++i)
	            for (int j = 0; j < field[i].length; ++j)
	                if (field[i][j] == ' ') return ' ';

	        return 'D';
	    }

	    public static void printField(char[][] field) {
	        for (int row = 0; row < 7; ++row) {
	            System.out.print("| ");
	            for (int col = 0; col < 7; ++col)
	                System.out.print(field[row][col] + "| ");
	            System.out.println();
	        }
	        for (int col = 0; col < 7; ++col)
	            System.out.print("---");
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        char[][] field = new char[7][7];

	        for (int i = 0; i < 7; ++i)
	            for (int j = 0; j < 7; ++j)
	                field[i][j] = ' ';
	        
	        printField(field);

	        boolean isRed = true;
	        while (true) {
	            if (isRed)
	                System.out.println("Red's turn!");            
	            else 
	                System.out.println("Yellow's turn!");
	            int column = IntUserInput.getInt(input, "Choose column from 1 to 7 for a disk" , 1, 7);
	            
	            if (!putDisk(field, column - 1, isRed ? 'R' : 'Y')) {
	                System.out.println("This column is filled! Choose another one.");
	                continue;
	            }

	            printField(field);

	            char result = getWinner(field);
	            if (result == 'D') {
	                System.out.println("It is a draw!");
	                break;
	            }
	            else if (result == 'R') {
	                System.out.println("Red win!");
	                break;
	            }
	            else if (result == 'Y') {
	                System.out.println("Yellow win!");
	                break;
	            }
	            isRed = !isRed;
	        }
	    }
	}