package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak1 {

	public static void main(String[] args) {
	
	//Kreiranje nove ArrayList-e
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    //Dodavanje elemenata
    list.add(5);
    list.add(1);
    list.add(7);
    list.add(2);
    
    //Ispis najveceg elementa
    System.out.println(max(list));
	}

	public static Integer max (ArrayList<Integer> list){
		
		//Provjera da li je lista null ili sadrzi 0 elemenata
		if (list.equals(null) || list.isEmpty()) return null;
		
		//Vracanje najveceg elementa
		return Collections.max(list);
	}
}
