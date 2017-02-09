package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //novi scanner objekat
		int broj = -1;
		int max = 0;
		int count = 0;
			
		//unos prekida nula
		while(broj != 0){
			
			System.out.println("unesite broj");
		    broj = sc.nextInt();
		    
		    //ako je broj veci od max,dodijeliti ga varijabli max i postaviti counter na 1
		    if(broj>max){
		    	max = broj;
		    	count = 1;
		    }
		    //ako se max ponavlja,povecati counter
		    else if (broj == max){
		    	count++;
		    }
		}
		//zatvoriti unos
		sc.close();
		//ispis, ako je count 1 ispisati 'put', ako nije ispisati 'puta'
		System.out.println("Najveci broj u nizu je " + max + ",ponavlja se " + count + (count == 1 ? " put." : " puta."));
	}

}
