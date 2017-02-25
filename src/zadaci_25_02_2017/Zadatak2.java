package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ten numbers to exclude from random numbers: ");

		int[] numbers = new int[10];

		try{
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			while(numbers[i] < 1 || numbers[i] > 54){
				System.out.println("Enter number from 0 to 54: ");
				numbers[i] = sc.nextInt();
			}
			}
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
		sc.close();

		System.out.println("\nThe 100 random numbers: ");

		int counter = 0;

		for (int i = 0; i < 100; i++) {
			counter++;
			System.out.print(counter % 15 == 0 ? getRandom(numbers) + "\n" : getRandom(numbers) + " "); }
			
		}

	//metoda koja vraca random broj koji nije iskljucen od 1 do 54
	public static int getRandom(int... brojevi) {
		int broj;	
		boolean iskljucen; 
		
		do { 
			iskljucen = false;
			broj = 1 + (int)(Math.random() * 54);
			for (int e: brojevi) {
				if (broj == e)
					iskljucen = true;
			}
		} while (iskljucen); 
		return broj;
	}
}

