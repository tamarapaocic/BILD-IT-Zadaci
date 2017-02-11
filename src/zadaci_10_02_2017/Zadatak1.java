package zadaci_10_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//Korisnikov unos pocetne,krajnje vrijednosti i broja po redovima
	    Scanner sc = new Scanner(System.in);
			try {
        System.out.println("Unesite pocetnu vrijednost");
        int x = sc.nextInt();
        System.out.println("Unesite krajnju vrijednost");
        int y = sc.nextInt();
    
        while(x <= 0) {
        	System.out.println("Molimo unesite pocetni broj veci od 0");
        	x = sc.nextInt();
        }
        while(y < x) { 
		System.out.println("Molimo vas unesite krajnji broj veci od pocetnog: ");
		y = sc.nextInt();
	    }
    
        System.out.println("Unesite broj po redovima");
        int n = sc.nextInt();
        printPrime(x,y,n); //poziv metode i prosljedjivanje argumenata
 		
		} catch (Exception ex){
			System.out.println("Pogresan unos");
		}
	}

	public static boolean isPrime(int n){ //metoda za ispitivanje da li je broj prost
		for (int divisor = 2; divisor <= n / 2; divisor++) { //ispitivanje da li je djljiv sa nekim brojem 
			if (n % divisor == 0) { //ako jeste,vrati false 
				return false;
	}}
		return true; //ako je djeljiv samo sa samim sobom,vrati true
	}
	
	public static void printPrime(int x,int y,int n){ //metoda za printanje prostih brojeva
		
		int count = 0; //brojac za redove
		for (int i = x; i <= y; i++){ //poetlja od pocetne do krajnje vrijednosti
			if(isPrime(Math.abs(i))){ //provjera da li je broj prost
				count++; //povecaj brojac
				System.out.print(i + (count % n == 0 ? "\n" : " ")); //ispis brojeva,ako u redu vec ima n brojeva - predji u novi red
				                                                     //ako ne, isprintaj razmak i novi broj
			}
		}
	}
}
