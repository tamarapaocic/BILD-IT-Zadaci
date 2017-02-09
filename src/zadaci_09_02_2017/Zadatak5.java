package zadaci_09_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//Korisnikov unos
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj bacanja: ");
		int num = sc.nextInt();
		//Poziv metode 
		flipCoin(num);
	}

	private static void flipCoin(int num) { //metoda za bacanje novcica
		int heads = 0;
		for (int i = 0; i < num; i++) { //petlja za dati broj bacanja
			int coin = (int)(Math.random() * 2); //generisanje brojeva 0-glava ili 1-pismo
			if (coin == 0) { //ako je 0
				heads++; //povecati broj glava
			}
		}
    System.out.println("Glava se pojavila " + heads + " puta, a pismo " + (num - heads) + " puta.");
    
	}

}