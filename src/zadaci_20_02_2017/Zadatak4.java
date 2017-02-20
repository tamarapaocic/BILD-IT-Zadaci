package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int broj1 = 0;
		int broj2 = 0;
		int broj3 = 0;
		boolean wrongUserInput = true;

		while (wrongUserInput) {
			try {
				System.out.print("Unesite tri cijela broja: ");
				broj1 = sc.nextInt();
				broj2 = sc.nextInt();
				broj3 = sc.nextInt();

				wrongUserInput = false;
				
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
				sc.nextLine();
			}
		}
		System.out.println(sort(broj1,broj2,broj3));
	
		sc.close();
	}
	
    public static ArrayList<Integer> sort(int broj1,int broj2,int broj3){
    	
   ArrayList<Integer> lista = new ArrayList<>();
   lista.add(broj1);
   lista.add(broj2);
   lista.add(broj3);
   
   Collections.sort(lista);
   
   return lista;
   
    }
	}


