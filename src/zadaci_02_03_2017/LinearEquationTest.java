package zadaci_02_03_2017;

import java.util.Scanner;

import metode.DoubleUserInput;

public class LinearEquationTest {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = DoubleUserInput.getDouble(input, "");
		double b = DoubleUserInput.getDouble(input, "");
		double c = DoubleUserInput.getDouble(input, "");
		double d = DoubleUserInput.getDouble(input, "");
		double e = DoubleUserInput.getDouble(input, "");
		double f = DoubleUserInput.getDouble(input, "");

		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}