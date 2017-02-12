package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
     System.out.println("unesite tri broja");
     try{
 		// korisnikov unos
    	 double num1 = sc.nextDouble();
    	 double num2 = sc.nextDouble();
    	 double num3 = sc.nextDouble();
    	 //poziv metode
         displaySortedNumbers(num1, num2, num3);
    	 
     } catch(InputMismatchException e){
    	 System.out.println("wrong input");
     }
	}
	public static void displaySortedNumbers(double num1, double num2, double num3){
		//lista za spremanje unesenih brojeva
		ArrayList<Double> list = new ArrayList<>();
		list.add(num1);
	    list.add(num2);
	    list.add(num3);
	    //sortiramo brojeve u listi rastucim redoslijedom
	    Collections.sort(list);
	    //ispis brojeva
	    System.out.println(list);
	}
}
