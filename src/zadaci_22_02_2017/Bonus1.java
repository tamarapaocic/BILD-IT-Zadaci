package zadaci_22_02_2017;

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your message? ");
		String str = sc.nextLine();
		char prvi = str.charAt(0);
		System.out.println("The first character is at position 0 and is " + prvi);
		char zadnji = str.charAt(str.length()-1);
		System.out.println("The last character is at position 30 and is " + zadnji);
		System.out.println("\nHere are all the characters, one at a time: ");
		System.out.println();
		
		for (int i = 0; i <= str.length() - 1; i++){
			System.out.println(i + "-" + str.charAt(i));
		}

	}

}
