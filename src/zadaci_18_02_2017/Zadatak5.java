package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
        
		try{
		System.out.println("Unesite niz cijelih brojeva, unos prekida nula");
		int data = unos.nextInt();
		int count = 0;
		int positive = 0;
		int negative = 0;
		double sum = 0;
        
		//0 prekida unos, povecavamo brojac za poz. ili neg. brojeve
		while (data != 0){
		if (data < 0){
			negative++;
		}
		else {
			positive++;
		} 
		sum += data;
		count++;
		data = unos.nextInt();
			}
		
		System.out.println("Broj pozitivnih: " + positive);
		System.out.println("Broj negativnih: " + negative);
		System.out.println("Suma je " + (double)sum);
		System.out.println("Prosjek je " + (double)(sum/count));
		
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos.");
		}
			}

		}
