package zadaci_05_04_2017;

public class Zadatak3 {
     
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}
}
