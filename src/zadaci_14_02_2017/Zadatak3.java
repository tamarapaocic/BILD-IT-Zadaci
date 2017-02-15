package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		if(number<0){
			System.out.println("Enter positive number: ");
			number = sc.nextInt();
		}
		sc.close();
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	} catch(InputMismatchException e){
		System.out.println("Pogresan unos.");
	}
	}
	//metoda koja provjerava da li je broj isti kao kad se okrene naopako
	public static boolean isPalindrome(int number){
		return number == reverse(number) ? true : false;
	}
	//metoda koja stavlja broj u string te ga ispisuje naopako i vraca kao integer
	public static int reverse(int number){
		String reverse = "";
		String n = number + "";
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}

}
