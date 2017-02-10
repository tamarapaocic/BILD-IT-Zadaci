package zadaci_10_02_2017;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//scanner objekat
        Scanner input = new Scanner(System.in);
		System.out.println("Unesi 10 double brojeva");
		//kreiranje niza od 10 elemenata i njihov unos
		double[] niz = new double[10];
		for(int i=0;i<10;i++){
			niz[i] = input.nextDouble();
		}
		//poziv metode i ispis
		System.out.println(min(niz));
	}
	   //metoda za pronalak najmanjeg elementa u nizu
	public static double min(double[] niz)
	{
		Arrays.sort(niz); //sortiranje niza od najmanjeg ka najvecem
		return niz[0]; //vrati prvi element
	}

}
