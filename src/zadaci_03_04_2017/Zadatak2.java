package zadaci_03_04_2017;

import java.util.Scanner;

import metode.IntUserInput;

public class Zadatak2 {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two integers: ");
		int m = IntUserInput.getInt(input, "");
		int n = IntUserInput.getInt(input, "");

		// Calucate and display the GCD
		System.out.println("The greatest common divisor of " + m + " and " + n + " is " + gcd(m, n));
	}

	/** Method for computing GCD */
	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n; // Base case
		else // Recursive call
			return gcd(n, m % n);
	}
}