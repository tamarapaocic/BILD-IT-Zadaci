package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		//Novi scanner objekat
		Scanner sc = new Scanner(System.in);
		
		//Unos
		System.out.println("Unesite neki string");
		
		//Inicijalizacija stringa
		String unos = "";
		
		//Ucitavanje stringa
		unos = sc.nextLine();
		
		int brojSamoglasnika = 0;
		int brojSuglasnika = 0;
		 
		//Prebacivanje cijelog stringa u mala slova
		unos.toLowerCase();
		 
		//Prolazak kroz petlju
		for(int i = 0; i < unos.length(); i++){
			
			//Provjera da li je slovo
			if (Character.isLetter(unos.charAt(i))){
				
		//Trazenje samoglasnika i povecavanje countera ako ga pronadje
		if (unos.charAt(i) == 'a' || unos.charAt(i) == 'e' || unos.charAt(i) == 'i' || unos.charAt(i) == 'o' || unos.charAt(i) == 'u'){
			brojSamoglasnika++;
		}
		
		//Ako nije samoglasnik, povecava se broj suglasnika
		else brojSuglasnika++;
	    }}
		
		//Ispis  
		System.out.println("Broj samoglasnika je " + brojSamoglasnika + ", a broj suglasnika je " + brojSuglasnika);
	}
}
