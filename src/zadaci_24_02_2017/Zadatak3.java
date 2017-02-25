package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		try{
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter the number: ");
		Short broj = unos.nextShort();
		while(broj < 0){
			System.out.println("Enter poisitive number: ");
			broj = unos.nextShort();
		}
		
		System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(broj))));
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
	}

}
