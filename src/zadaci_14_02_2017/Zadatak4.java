package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	    try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String str = sc.nextLine();
		
		sc.close();
		
		for (int i = 0; i < str.length() ; i += 2){
			System.out.print(str.charAt(i));
		}
	
	}catch (Exception e){
		System.out.println("Greska");
	}
}
}