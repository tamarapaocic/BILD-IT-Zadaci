package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//novi scanner objekat
		Scanner sc = new Scanner(System.in);
        //kreiranje liste
		ArrayList<Integer> list= new ArrayList<>();
		try {
		    int count=0;
		    double sum = 0;
		    double average = 0; 
		    int count1 = 0;
		    int count2 = 0;
		    int count3 = 0;
		    
        for(;;) {
        //korisnkov unos
        System.out.println("Unesite cijeli broj (nula prekida unos): ");
        int number = sc.nextInt();
	    //nula prekida unos
        if(number == 0){
        	break;
        }
        //dodavanje u listu
        list.add(number);
        //dodavanje broja na sumu
        sum += number;
        //povecavanje countera
        count++;
        //kada dostigne 100,prekini unos
        if(count == 100){
        	System.out.println("Unijeli ste maksimalan broj elemenata");
        	break;
        }
        } 
        //izracunavanje prosjeka
		average = (double)(sum/count);
		//ispis
		System.out.println("Prosjek je " + average);
        //for each petlja za unesene brojeve
		for (int e: list){
			if (e > average) count1++;
			else if (e == average) count3++;
			else if (e < average) count2++;
		}
		//ispis
		System.out.println("Veci od prosjeka " + count1);
		System.out.println("Manji od prosjeka " + count2);
		System.out.println("Jednaki prosjeku " + count3);
		
			}catch(InputMismatchException e){
				System.out.println("wrong input");
				}
			}

		}