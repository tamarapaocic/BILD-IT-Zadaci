package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter milliseconds: ");
		long millis = sc.nextLong();
        if(millis < 0){
        	System.out.println("Enter a positive number");
        	millis = sc.nextLong();
        }
		//pretvaranje milisekunda u sate:minute:sekunde
		System.out.println("hours:minuties:seconds: " + convertMillis(millis));
		sc.close();
	}catch(InputMismatchException e){
		System.out.println("Wrong input.");
	}
	} 
	//metoda za konvertovanje
	public static String convertMillis(long millis) {
		//ukupne sekunde
		millis /= 1000;

		//pronalazenje trenutne minute i sekunde
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		return millis + currentMinuteAndSecond;
	}
}