package zadaci_14_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double V=0;
		double a=0;
		//referentna varijabla
		boolean process=true;
		
		do{ try{ 
		 System.out.println("Unesite brzinu u m/s (vrijednost mora biti veca od nule)");
		 V=sc.nextDouble();
		 System.out.println("Unesite ubrzanje u m/(s*s)(vrijednost mora biti veca od nule)");
		 a=sc.nextDouble();
		 process=false;
		 if (V<=0) System.out.println("Brzina mora biti veca od nule");
		 if (a<=0) System.out.println("Ubrzanje mora biti vece od nule");
		 System.out.println();
		 }
		 catch (Exception e){
			System.out.println("Pogresan unos");
			sc.nextLine();
			}
		}while(process || V<=0 || a<=0);
		//proracun duzine pomocu unesene brzine i ubrzanja
		double duzina=(V*V)/(2*a);
		System.out.printf("Duzina piste je %6.3f m",duzina);
		sc.close();
	}

}