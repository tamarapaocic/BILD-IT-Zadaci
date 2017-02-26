package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("Duzina stringa je " + str.length());

		char prvoSlovo = 'a';
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				prvoSlovo = str.charAt(i);
				break;
			}
		}
		
		System.out.println("Prvo slovo je " + prvoSlovo);


	}

}
