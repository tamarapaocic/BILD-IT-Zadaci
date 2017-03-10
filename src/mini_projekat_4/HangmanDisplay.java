package mini_projekat_4;

import java.util.ArrayList;

public class HangmanDisplay {

	public HangmanDisplay(){}
	
	void winner(){
		System.out.println("\nYou won! Congratulations! :D");
	}
	
	void looser(String secret){
		System.out.println("\nYou are hanged! :(");
		System.out.println("The secret word was " +  secret);
	}
	
	void printHangman(ArrayList<Character> wrong) {
		int numOfWrongGuesses = wrong.size();
		System.out.println("_______");
		System.out.println("|     |");
		if (numOfWrongGuesses >= 1) {
			System.out.println("|     O");
		} else {
			System.out.println("|");
		}
		if (numOfWrongGuesses >= 2) {
			if (numOfWrongGuesses == 2) {
				System.out.println("|     |");
			} else if (numOfWrongGuesses == 3) {
				System.out.println("|    /|");
			} else if (numOfWrongGuesses >= 4) {
				System.out.println("|    /|\\");
			}
		} else {
			System.out.println("|");
		}
		if (numOfWrongGuesses == 5) {
			System.out.println("|    /");
		} else if (numOfWrongGuesses == 6) {
			System.out.println("|    / \\");
		} else {
			System.out.println("|");
		}
		System.out.println("|");
		System.out.println("|");

	}
}
