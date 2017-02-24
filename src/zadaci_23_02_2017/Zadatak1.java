package zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Unesite cijeli trocifreni broj");
        int broj = sc.nextInt();
        while(broj < 100 || broj > 999){
        	System.out.println("Unesite cijeli trocifreni broj: ");
        	broj = sc.nextInt();
        }
        System.out.print(broj + (Palindrom(broj) ? " jeste palindrom." : " nije palindrom."));
		}catch(InputMismatchException ex){
			System.out.println("Pogresan unos.");
		}
	}

	//metoda za okretanje broja naopako
    public static int obrnuto(int broj) {
			String obrnuto = ""; 	
			String n = broj + ""; 
			
			for (int i = n.length() - 1; i >= 0; i--) {
				obrnuto += n.charAt(i); }
			return Integer.parseInt(obrnuto); }
    
    //provjera da li je broj palindrom
    public static boolean Palindrom(int broj) {
		return broj == obrnuto(broj) ? true : false; }

    

}
