package zadaci_13_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    try{
    	System.out.println("Unesite 10 cijelih brojeva: ");
    	//nova arraylista za unesene brojeve
    	ArrayList<Integer> brojevi = new ArrayList<>();
    	//korisnikov unos i dodavanje u listu
    	for(int i = 0; i < 10; i++){
    		int broj = sc.nextInt();
    		brojevi.add(broj);
    	}
    	//inverzija elemenata u listi
    	Collections.reverse(brojevi);
    	System.out.println(brojevi);
    }catch(InputMismatchException e){
    	System.out.println("Wrong input");
    }
	}

}
