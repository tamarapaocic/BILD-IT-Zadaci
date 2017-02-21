package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {
        //metoda koja izracunava koje pakovanje ima bolju cijenu
	public static void betterPrice(double firstPrice, double firstWeight,double secondPrice, double secondWeight) {

		double first = firstPrice / firstWeight;
		double second = secondPrice / secondWeight;

		if (first > second) {
			System.out.println("Prvo pakovanje ima bolju cijenu.");
		} else if (first == second) {
			System.out.println("Pakovanja imaju isti odnos cijene i tezine.");
		} else {
			System.out.println("Drugo pakovanje ima bolju cijenu.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean wrongUserInput = true;
		double firstPrice = 0;
		double firstWeight = 0;
        double secondPrice = 0;
        double secondWeight = 0;


		while(wrongUserInput){
		try{
		System.out.println("Unesite cijenu i tezinu prvog pakovanja: ");
		firstPrice = sc.nextDouble();
		firstWeight = sc.nextDouble();
		while(firstPrice < 0 || firstWeight < 0){
			System.out.println("Unesite ponovo cijenu i tezinu prvog pakovanja(vrijednosti moraju biti vece od 0): ");
			firstPrice = sc.nextDouble();
			firstWeight = sc.nextDouble();
		}
        wrongUserInput = false;
		System.out.println("Unesite cijenu i tezinu drugog pakovanja: ");
		secondPrice = sc.nextDouble();
		secondWeight = sc.nextDouble();
		while(secondPrice < 0 || secondWeight < 0){
			System.out.println("Unesite ponovo cijenu i tezinu drugog pakovanja(vrijednosti moraju biti vece od 0): ");
			secondPrice = sc.nextDouble();
			secondWeight = sc.nextDouble();
		}
        wrongUserInput = false;
		sc.close();
		
		}catch (InputMismatchException e){
			System.out.println("Pogresan unos.");
			sc.nextLine();
		}
		}

		//pronalazenje bolje cijene
		betterPrice(firstPrice, firstWeight, secondPrice, secondWeight);
	}
}
