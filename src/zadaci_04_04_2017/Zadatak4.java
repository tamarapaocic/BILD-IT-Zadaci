package zadaci_04_04_2017;

import java.util.Scanner;

import metode.LongUserInput;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		long n = LongUserInput.getLong(input, "Enter the number", 0);

		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}

	/* Method sums the digits in an integer */
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	/* Helper overloaded method */
	private static int sumDigits(long n, int sum) {
		if (n == 0) // Base case
			return sum;
		else // Recursive call
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}