package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		try{
		Scanner unos = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = unos.nextInt();
		if (year < 0){
			System.out.println("Enter a positive number: ");
		}
		System.out.print("Enter a month: ");
		String month = unos.next();
		if(month.length() > 3){
			System.out.println("Enter Jan/Feb/Mar..");
		}
	   unos.close();
		//provjera da li je prestupna godina
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if ( month.equals("Jan") || month.equals("Mar") ||  month.equals("May") || month.equals("Jul") ||
			 month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
				System.out.println(month + " " + year + " has " + 31 + " days");
			else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
				System.out.println(month + " " + year + " has " + 30 + " days");
			else if (month.equals("Feb"))
				System.out.println(month + " " + year + " has " +((leapYear) ? 29 : 28) + " days");
			else System.out.println("Wrong input");
		
	}catch(InputMismatchException e){
		System.out.println("Wrong input");
		}
	}
}
