package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a string and a character: ");
	String[] str = input.nextLine().split("[ ]");

		
	System.out.println("The number of occurences of the character \'" + str[1] + "\' in the string \"" + str[0] + "\" is " + count(str[0], str[1].charAt(0)));
	input.close();
	}

	/** Method counts the number of occurrences 
	  * of a specified character in a string */
	public static int count(String str, char a) {
		int index = 0;
		int count = 0;
		return count(str, a, index, count);
	}

	/** Helper count method */
	private static int count(String str, char a, int i, int count) {
		if (i == str.length())
			return count;
		else if (str.charAt(i) == a)
			return count(str, a, ++i, ++count);
		else
			return count(str, a, ++i, count);
	}
}