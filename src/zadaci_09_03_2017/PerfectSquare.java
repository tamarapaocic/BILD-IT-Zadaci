package zadaci_09_03_2017;

import java.util.Scanner;

import metode.IntUserInput;

public class PerfectSquare {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int m = IntUserInput.getInt(input, "Enter an integer: ");
	
	boolean negative = false;
	if (m < 0) {
		negative = true;
	}
	for (int n = 1;; n++) {
		double sqrt = Math.sqrt(Math.abs(m) * n);
		int sqrt1 = (int)Math.sqrt(Math.abs(m) * n);
		if ( Math.pow(sqrt, 2)== Math.pow(sqrt1, 2)) {
			System.out.println("The smallest number n for m * n to be a perfect square is " + ((negative) ? (-1*n) : (n)));
			break;
		}
	}
	input.close();
}


}
