package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki string");
        String str = sc.nextLine();
        System.out.println("Koji karakter zelite da prebrojite: ");
        Character a = sc.next().charAt(0);
       
        System.out.println(count(str,a));
	}
	
	//metoda koja broji koliko puta se neki karakter pojavio u stringu
	public static int count (String str,char a){
		
		int counter = 0 ;
		for (int i = 0; i < str.length(); i++){
			if(str.charAt(i) == a){
				counter++;
			}
		}
			return  counter;
 		
	}

}
