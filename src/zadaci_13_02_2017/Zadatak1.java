package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	double savingAmount = 0;
	int months = 0;
	
	try{
	System.out.print("Unesite mjesecni iznos stednje: ");
	savingAmount = sc.nextDouble();
	if (savingAmount < 0){
		System.out.println("Unesite ponovo: ");
		savingAmount = sc.nextDouble();
	}
	System.out.print("Unesite broj mjeseci: ");
	months = sc.nextInt();
	if(months < 0){
		System.out.println("Unesite pozitivan broj");
		months = sc.nextInt();
	}
	} catch(InputMismatchException e){
		System.out.println("Wrong input");
	}
	
	final double monthlyInterestRate =  0.00417;
	double compoundValue = 0;
	
	//formula za izracunavanje ukupnog iznosa
	for (int i = 1; i <= months; i++) {
		compoundValue = (savingAmount + compoundValue) * (1 + monthlyInterestRate);
	}
	//ispis i format
	System.out.printf("Iznos nakon " + months + " mjeseci: $%.2f\n", compoundValue);
}
}
	
	
	