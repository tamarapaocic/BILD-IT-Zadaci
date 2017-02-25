package zadaci_24_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter the character");
		String kod = unos.nextLine();
		char ch = kod.charAt(0);
        //pretvaranje iz karaktera u unicode
		System.out.println("The unicode for " + kod.charAt(0) + " is " + ((int)ch));
		
			}
}
