package mini_projekat_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	Scanner sc = new Scanner(System.in);
	
	private static final String[] animals = {"ANT","ALLIGATOR","ANTELOPE","BEAR","BUTTERFLY","CHIMPANZEE","CAT","COW","DEER","DONKEY","DOG",
	        "EAGLE","ELEPHANT","FISH","FROG","FLAMINGO","FOX","GUINEA PIG","HAMSTER","HEDGEHOG","HORSE","IGUANA","JELLYFISH","KANGAROO","KOALA",
	        "LION","LIZARD","OTTER","SEAHORSE","WARTHOG","WOLF","ZEBRA"};
	
	private static final String[] cities= {"LOS ANGELES","LAS VEGAS","NEW YORK","SAN FRACISCO","CHICAGO","MIAMI","DUBAI","PARIS","ROME","BERLIN",
			"BARCELONA","MADRID","SHANGAI","BEIJING","ISTANBUL","TOKYO","MOSCOW","CAIRO","MEXICO CITY","LIMA","LONDON","BANGKOK","BOGOTA",
			"RIO DE JANEIRO","SYDNEY","JOHANNESBURG","CAPE TOWN","BUENOS AIRES","KIEV","SALVADOR"}; 
	
	private static final String[] food = {"PIZZA","STEAK","PANCAKES","CORN FLAKES","MACARONI AND CHEESE","SUSHI","PEANUT BUTTER","CHICKEN NUGGET",
			"PIE","PUDDING","BAKED POTATO","SALMON","EGGS","ICE CREAM","SOUP"};
	
	private static final String [] cars = {"AUDI", "ASTON MARTIN","ALFA ROMEO", "BENTLY", "BMW", "BUGATTI", "CADILLAC", "CITROEN",
			"DODGE", "DACIA", "FERRARI", "FIAT", "FORD", "HONDA", "JAGUAR","KIA", "LADA", "LEXUS", "LAMBORGHINI", "MAZDA", "MERCEDES",
			"MASERATI", "MITSUBISHI", "NISSAN", "OPEL", "PEUGEOT", "PORSCHE","RENAULT", "SAAB", "TESLA", "TOYOTA", "VOLKSWAGEN", "VOLVO" };
	
	private ArrayList<Character> correct ;
	private ArrayList<Character> wrong ;
	private char[] board ;
	private char guess = ' ';
	private String secret ;

	/**
	 * Default constructor
	 */
	Hangman(){
		Random rand = new Random();
		int randomNum = rand.nextInt(animals.length); 
		secret = animals[randomNum]; 
		board = new char[secret.length()];
		correct = new ArrayList<Character>();
		wrong = new ArrayList<Character>();
	}

	/**
	 * Constructor that takes number of topic,generates secret word from that topic
	 * @param topicNum
	 */
	Hangman(int topicNum){
		String[] topics;
		
		if(topicNum == 1){
		 topics = animals;
		}else if (topicNum == 2){
		topics = cities;
		}else if (topicNum == 3){
		topics = food;
		}else{
		topics = cars;
		}
		
		Random rand = new Random();
		int randomNum = rand.nextInt(topics.length);
		secret = topics[randomNum]; 
		board = new char[secret.length()];
		correct = new ArrayList<Character>();
		wrong = new ArrayList<Character>();
	}
	
	/**
	 * initialization of game board
	 */
	void initiateBoardWord() {
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == ' ') {
				board[i] = ' ';
			} else {
				board[i] = '_';
			}
		}
		}
	
	/**
	 * printing board
	 */
	void printBoardWord() {
		System.out.println("\n");
		for (int i = 0; i < board.length; i++) {
			System.out.print(board[i] + " ");
		}
	 }

	/**
	 * Checking if guess from user is valid
	 */
	void getGuess(){
	    System.out.println();
		System.out.println("\nEnter a guess: ");
		guess = ' ';
		char userGuess = ' ';
	    boolean isValid = false;
	    
	    while(!isValid){
	    	isValid = true;
	    	userGuess = sc.next().charAt(0);
	    	
	    if(!Character.isLetter(userGuess) || correct.contains(Character.toUpperCase(userGuess)) || wrong.contains(Character.toUpperCase(userGuess)))
	    	{
	    		isValid = false;
	    		userGuess = ' ';
	    		System.out.println("Wrong input. Enter a character.");
	    	} else {
	    		userGuess = Character.toUpperCase(userGuess);
	    	}
	      }
	     this.guess = userGuess;
	 }
		
	
	 boolean isGoodGuess(){
			if(secret.contains(guess + "")){
				return true;
			} else {
				return false;}
		}
	
	
	 void goodGuess(){
		System.out.println("\tGood guess!");
		for(int i = 0; i < secret.length(); i++){
			if(this.guess == secret.charAt(i)){
				board[i] = guess;
				correct.add(guess);
			}
		}
		guess = ' ';
	}
	
	void badGuess(){
		System.out.println("\tBad guess!");
		wrong.add(guess);
		guess = ' ';
	}
	
	void printWrongGuesses(){
		if (wrong.size() > 0){
			System.out.println();
			System.out.println("\nBad guesses: ");
			System.out.println(wrong.toString());
			
		}
	}
	
	boolean gameOver(){
		if (wrong.size() == 6){
			return true;
		}
		else {
			return false;}
	}
	
	boolean isWin(){
		for(int  i = 0; i < secret.length(); i++){
			if (board[i] != secret.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Game play
	 */
	void play(){
		 HangmanDisplay display = new HangmanDisplay();
		 display.printHangman(wrong);
		 initiateBoardWord();
		 printBoardWord();
		 
		while(!gameOver()){
			printWrongGuesses();
			getGuess();
			if(isGoodGuess()){
				goodGuess();
			} else {
				badGuess();
			}
			display.printHangman(wrong);
			printBoardWord();
			if(isWin()){
				display.winner();
				break;
			} 
		}
		
		if(gameOver()){
			display.looser(secret);
		}
		
		System.out.println("0) Back to the user menu");
		int endInput = sc.nextInt();
		if (endInput == 0){
			HangmanGame.userMenu();
		}
		else {
			System.exit(0);
		}
		}
}
