package mini_projekat_4;

import java.util.Scanner;

import metode.IntUserInput;

public class HangmanGame {

		static int pickATopic(){
			Scanner input = new Scanner(System.in);
            System.out.println("--------------------------------------");
			System.out.println("1* Animals");
			System.out.println("2* Cities");
			System.out.println("3* Food");
			System.out.println("4* Cars");
			System.out.print("\nPick one topic: ");
			
			int topicNumber = IntUserInput.getInt(input, "", 0, 4);
			if (topicNumber < 0 || topicNumber > 4){
				System.out.println("Wrong topic number, try again: ");
				pickATopic();
			}
			return topicNumber;
		}
		
		
		/**
		 * User menu for hangman game
		 */
		static void userMenu(){
			Scanner input = new Scanner(System.in);
            System.out.println();
			System.out.println("\t>>> HANGMAN <<<\t");
			System.out.println();
			
			System.out.println("1) New Game ");
			System.out.println("0) Exit");
			int userInput = IntUserInput.getInt(input, "\nPick an option by entering its number: ");
			
			switch(userInput){
			
			case 0: {
				System.out.println("Bye :)");
				System.exit(0);
			}
			case 1: {
				int topicNumber = pickATopic();
				Hangman game = new Hangman(topicNumber);
				game.play();
				break;
			}
			default: {
				System.out.println("Wrong option number.");
				userMenu();
			}
			}
		}
		
		public static void main(String[] args) {
			userMenu();
		}
	}