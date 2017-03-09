package zadaci_06_03_2017;

public class MyStringBuilder1Test {

	public static void main(String[] args) {
		MyStringBuilder1 str1 = new MyStringBuilder1("TEST");

		System.out.println("\nAppend the string \" MyStringBuilder1\" to string: " + 
			str1.append(new MyStringBuilder1(" MyStringBuilder5")));

		// Display string with the integer 101 append to it
		System.out.println("\nAppend integer 101 to the string: " + str1.append(101));
        
		// Display the length of str1
		System.out.println("\nLength of string: " + str1.length());

		// Display character at index 2
		System.out.println("\nCharacter at index 2: " + str1.charAt(2));

		// Display str1 as lowercase
		System.out.println("\nString to lower case: " + str1.toLowerCase());

		// Display the substring of str1 from index 1 to 3
		System.out.println("\nSubstring of string from index 1 to 3: " + 
			str1.substring(1, 3));

		// Return the string
		System.out.println("\nDisplay string: " + str1.toString());
	}
}