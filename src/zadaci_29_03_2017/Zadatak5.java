package zadaci_29_03_2017;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
	ArrayList<Number> list = new ArrayList<>();
	list.add(5);
	list.add(2);
	list.add(7);
	list.add(4.3);
	list.add(6);
	list.add(9.1);
	list.add(8);
	System.out.println("List: " + list.toString());
	sort(list);
	System.out.println("Sorted list: " + list.toString());
				
			}

    /** Sorts an ArrayList of numbers */
	public static void sort(ArrayList<Number> list) {
	
		for (int i = 0; i < list.size() - 1; i++) {
			// Find mimimum in the list
			Number min = list.get(i);
			int minIndex = i;

		for (int j = i + 1; j < list.size(); j++) {
			if (min.doubleValue() > list.get(j).doubleValue()) {
			min = list.get(j);
		    minIndex = j;
			}
		}

		if (minIndex != i) {
      	list.set(minIndex, list.get(i));
	    list.set(i, min);
	    
					} 
				}			
		}
		}