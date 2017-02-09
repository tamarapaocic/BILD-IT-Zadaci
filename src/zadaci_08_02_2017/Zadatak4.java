package zadaci_08_02_2017;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
        
		int[] list = new int[100]; //niz od 100 brojeva
		int[] count = new int [10]; //niz za brojac
		
		for(int i = 0; i < list.length; i++){
		  int number = ((int)(Math.random() * 10)); //generisanje random brojeva od 0 do 9 
		  list[i] = number; //dodjeljivanje brojeva u niz
		  count[number]++; //povecavanje countera za taj broj
		} 
		
		for(int i = 0; i < count.length; i++){
			if(count[i] != 0){ //ako se broj pojavljuje
				System.out.println("Broj " + i + ": " + count[i]); //ispis koliko puta
			}
		}
	}

}
