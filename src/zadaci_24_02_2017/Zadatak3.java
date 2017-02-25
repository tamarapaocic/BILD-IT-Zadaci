package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		try{
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter the number: ");
		short broj = unos.nextShort();
		String bits = "";

		
		for (int i = 0; i < 16; i++) {
			bits = (broj & 1) + bits;
			broj >>= 1;
		}

		System.out.println("The bits are " + bits);
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
	}

}
