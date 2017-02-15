package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		
		double 	investicija = 0;
		double interesnaStopa = 0;
		int brGodina = 0;
		//referentna varijabla
		boolean process=true;
		do{ 
			try{ 
		System.out.println("Unesite iznos investicije, godisnju iteresnu stopu i broj godina vracanja: ");
		investicija = sc.nextInt();
		interesnaStopa=sc.nextDouble();
		brGodina=sc.nextInt();
		process=false;
		}
		catch (Exception e){
			System.out.println("Pogresan unos");
			sc.nextLine();}
		//uslov ponavljanja
		}while(process || investicija<=0 || interesnaStopa<=0 || brGodina<=0);
		double buducaVrijednost = investicija * (Math.pow((1 + interesnaStopa/1200),brGodina*12));
		//ispis rezultata
		System.out.printf("Buduca vrijednost investicije je %6.2f",buducaVrijednost);
		sc.close();

	}

}