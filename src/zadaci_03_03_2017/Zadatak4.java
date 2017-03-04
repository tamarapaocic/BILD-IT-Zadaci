package zadaci_03_03_2017;

import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int number = IntUserInput.getInt(input, "Enter a positive integer: ", 0);
		
		System.out.print("The smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); 

		smallestFactors(number, stack);

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	/** Metoda koja nalazi najmanje faktore i stavlja ih u StackOfIntegers */
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; // Moguci prosti faktor
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}
}