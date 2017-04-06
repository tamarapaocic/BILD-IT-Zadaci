package zadaci_05_04_2017;

import java.util.ArrayList;

public class Zadatak1 {
	
	public static <E extends Comparable<E>> 
	ArrayList<E> removeDuplicates(ArrayList<E> list) {
    
		for (int i = 0; i < list.size() - 1; i++) {
	for (int j = i + 1; j < list.size(); j++) {
		if (list.get(i).compareTo(list.get(j)) == 0)
			list.remove(j);
	}
   }
   return list;
} 
}
