package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String str = sc.nextLine();
		
		System.out.println("Duzina stringa je " + str.length() + "\nPrvo slovo stringa je " + str.charAt(0));
		

	}

}
