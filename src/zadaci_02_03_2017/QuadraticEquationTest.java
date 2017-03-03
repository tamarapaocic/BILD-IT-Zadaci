package zadaci_02_03_2017;

import java.util.Scanner;

import metode.DoubleUserInput;

public class QuadraticEquationTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = DoubleUserInput.getDouble(input, "");
		double b = DoubleUserInput.getDouble(input, "");
		double c = DoubleUserInput.getDouble(input, "");
		
        QuadraticEquation eq1 = new QuadraticEquation(a,b,c);
        double d = eq1.getDiscriminant();

        if(d > 0){
	    System.out.println("Root1 is " + eq1.getRoot1() + " root2 is " + eq1.getRoot2());
        }
        if(d == 0){
	    System.out.println("Root1 is " + eq1.getRoot1());
        }
        if(d < 0){
	    System.out.println("The eq has no roots.");
	    
        }
	}

}