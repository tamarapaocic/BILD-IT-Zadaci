package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    try{  
    	System.out.println("unesite neki string");
    	String unos = sc.nextLine();
    	//ispis i poziv metode
    	System.out.println("Broj slova: " + countLetters(unos));
    }
    catch(Exception e){
    	e.printStackTrace();
    }
	}
	//metoda koja broji karaktere u nekom stringu
	 public static int countLetters(String s){
		 int count = 0;
		 for(int i = 0; i < s.length(); i++){
			 if(Character.isLetter(s.charAt(i)))
					count ++;
		 }
		 return count;
	 }
}
