package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{ 
		System.out.println("Unesite pocetnu godinu");
		int pocetna = sc.nextInt();
		if (pocetna < 0 ){
			System.out.println("Unesite pozitivan broj");
			pocetna = sc.nextInt();
		}
		System.out.println("Unesite krajnju godinu");
		int krajnja = sc.nextInt();
		if (krajnja < pocetna){
			System.out.println("Unesite godinu vecu od pocetne: ");
			krajnja = sc.nextInt();
		}
		int count = 0;
		sc.close();
		//ispitivanje da li su godine prestupne od pocetne do krajnje
		for (int i = pocetna; i <= krajnja ; i++){
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
			count++;
			System.out.printf(i + (count % 10 == 0 ? "\n" : " "));
		}
	}
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos");
		}
}
}