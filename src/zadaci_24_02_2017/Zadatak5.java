package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi 10 brojeva");	
		int[] niz = new int[10];
		int broj;
		int count = 0;
		
		try{
		for(int i = 0; i < 10; i++){
			broj = sc.nextInt();
			if (razlicito(niz,broj)){
				niz[count] = broj;
				count++;
			}
		}
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos.");
		}
		System.out.println("\nBroj jedinstvenih brojeva je: " + count);
		System.out.print("\nJedinstveni brojevi su: " );
		
		for(int i = 0; i < niz.length; i++){
			if(niz[i] > 0){
				System.out.print(" " + niz[i] + " ");
			}
		
		}
		}
	    
	    //metoda koja provjerava da li se neki broj nazali u nizu
		public static boolean razlicito(int[] niz,int broj){
			
			for(int i = 0; i < niz.length; i++){
				if (niz[i] == broj) return false; 
				}
			return true;
			
		}
	}


