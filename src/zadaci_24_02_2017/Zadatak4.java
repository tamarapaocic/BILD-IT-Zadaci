package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		try{
		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter a number and its width: ");
		int number = sc.nextInt();
		int width = sc.nextInt();
        while(number < 0 || width < 0){
        	System.out.println("Number and its width must be greater than 0. Enter again: ");
        	number = sc.nextInt();
        	width = sc.nextInt();
        }
		
		System.out.println(number + " formatiran -->  " + width + ": " + format(number, width));
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
	}

	//Metoda koja vraca string za broj sa prefixom od jedne ili vise nula
	public static String format(int number, int width) {
		
		String num = number + "";
		
		//Ako je broj manji od sirine vrati ga sa popunjenim nulama,ako je veci vrati broj kao string
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}
}