package zadaci_13_02_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite prvi string: ");
    String prvi = sc.nextLine();
    System.out.println("Unesite drugi string: ");
    String drugi = sc.nextLine();
    int index = 0;
    int manji; //varijabla za manji string
    
    //provjera koji je manji string i dodjela njegove duzine varijabli manji
    if(prvi.length() < drugi.length()){
    	manji = prvi.length();
    } else if (drugi.length() < prvi.length()){
    	manji = drugi.length();
    } else {
    	manji = prvi.length();
    }
    //poredjenje strigova
    for(int i = 0; i < manji; i++){
    	//kada nadje razlicit karakter prekida
    	if(prvi.charAt(i) != drugi.charAt(i)){
    		index = i;
    		break;
    	} else {
    		index = manji;
    	}
    }    	
    //ispis
    System.out.println("Najveci zajednicki prefiks je " + prvi.substring(0, index));
	}

}
