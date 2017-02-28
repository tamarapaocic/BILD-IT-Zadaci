package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LokacijaTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int red = 0;
		int kolona = 0;
		
		try{
			System.out.println("Unesite broj redova u nizu");
			red = sc.nextInt();
			while(red < 0){
				System.out.println("Molim unesite pozitivan broj redova: ");
				red = sc.nextInt();
			}
			System.out.println("Unesite broj kolona u nizu");
			kolona = sc.nextInt();
			while(kolona < 0){
				System.out.println("Molim unesite pozitivan broj kolona: ");
				kolona = sc.nextInt();
			}
		
		double[][] niz = new double[red][kolona];
		System.out.println("Unesite niz");

		
			for (int i = 0; i < niz.length; i++) {
				for (int j = 0; j < niz[i].length; j++) {
					niz[i][j] = sc.nextDouble();
				}
			}
			Lokacija max = locirajMax(niz);
			System.out.println("Lokacija najveceg elementa je " + max.max + " u " + max.red + ". redu i " + max.kolona + ". koloni.");
		
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos.");
		}
		catch(ArrayIndexOutOfBoundsException a){
	
		}
		
		sc.close();
		
	}
	//metoda koja vraca lokaciju najveceg elementa u prosljedjenom nizu
	public static Lokacija locirajMax(double[][] a){
		return new Lokacija(a);
	}
}
