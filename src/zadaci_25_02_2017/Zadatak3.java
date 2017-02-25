package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		try{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int number = sc.nextInt();
        while(number <= 0){
        	System.out.println("Enter the number greater than 0");
        	number = sc.nextInt();
        }
        int[] values = new int[number];
        System.out.println("Enter the values");
        for(int i = 0; i < values.length; i++){
        	values[i] = sc.nextInt();
        }

		System.out.println("The list has" + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
	}

	//metoda koja provjerava da li u nizu imaju 4 uzastopna broja iste vrijednosti
	public static boolean isConsecutiveFour(int[] values){
	
		int count = 1; 
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) 
				count++;
			
			if (count >= 4) 
				return true;
	
			if (values[i] != values[i + 1])
				count = 1;	
		}
		return false;
	}
}
