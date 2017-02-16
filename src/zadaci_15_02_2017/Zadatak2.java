package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	    try{ 
		Scanner unos = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = unos.nextInt();
		if (year < 0){
			System.out.println("Enter a positive number: ");
		}
		System.out.print("Enter a month: ");
		Integer month = unos.nextInt();
		if(month > 12 || month <1){
			System.out.println("Enter month 1-12");
			month = unos.nextInt();
		}
	   unos.close();
		//provjera da li je prestupna godina
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		
		
		if ( month.equals(1) || month.equals(3) ||  month.equals(5) || month.equals(7) ||
			 month.equals(8) || month.equals(10) || month.equals(12))
				System.out.println(nameOfMonth(month) + " " + year + " has " + 31 + " days");
			else if (month.equals(4) || month.equals(6) || month.equals(9) || month.equals(11))
				System.out.println(nameOfMonth(month) + " " + year + " has " + 30 + " days");
			else if (month.equals(2))
				System.out.println(nameOfMonth(month) + " " + year + " has " +((leapYear) ? 29 : 28) + " days");
			else System.out.println("Wrong input");
		
	}catch(InputMismatchException e){
		System.out.println("Wrong input");
		}
	}
	
	//metoda za ime mjeseca
	public static String nameOfMonth(int month) {
		 
				String monthh="";
				switch(month){
				case 1: monthh="January";break;
				case 2:monthh="February";break;
				case 3:monthh="March";break;
				case 4:monthh="April";break;
				case 5:monthh="May";break;
				case 6:monthh="June";break;
				case 7:monthh="July";break;
				case 8:monthh="August";break;
				case 9:monthh="September";break;
				case 10:monthh="October";break;
				case 11:monthh="November";break;
				case 12:monthh="December";break;
				}
				return monthh;	
			}
}
