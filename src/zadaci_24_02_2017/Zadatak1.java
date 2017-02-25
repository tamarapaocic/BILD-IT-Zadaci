package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter ASCII code 0 - 127: ");
		int kod = sc.nextInt();
        while (kod <= 0 || kod > 127){
        	System.out.println("Enter ASCII code from 0 to 127: ");
        	kod = sc.nextInt();
        }
        //pretvaranje iz ascii koda u karakter
		System.out.println("The character is " + ((char)kod));
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input.");
		}
			}

		}
