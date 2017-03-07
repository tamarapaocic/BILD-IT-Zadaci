package zadaci_06_03_2017;

public class MyCharacter {
	private char ch;

	public MyCharacter(char ch) {
		this.ch = ch;
	}

    //metoda koja vraca karakter
	public char charValue() {
		return this.ch;
	}

	//metoda koja vraca true ako je karakter slovo
	public static boolean isLetter(char ch) {
		return ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122));
	}

	//metoda koja vraca true ako je karakter broj
	public static boolean isDigit(char ch) {
		return (ch >= 48 && ch <= 57);
	}

	//metoda koja vraca true ako je karakter malo slovo
	public static boolean isLowerCase(char ch) {
		return (ch >= 97 && ch <= 122);
	}

    //metoda koja vraca true ako je karakter veliko slovo
	public static boolean isUpperCase(char ch) {
		return (ch >= 65 && ch <= 90);
	}

	//metoda koja vraca malo slovo
	public static char toLowerCase(char ch) {
		if (isLowerCase(ch)) {
			return ch;
		}
		return (char) (ch - 65 + 97);
	}

	// metoda koja vraca veliko slovo
	public static char toUpperCase(char ch) {
		if (isUpperCase(ch)) {
			return ch;
		}
		return (char) (ch - 97 + 65);
	}

	// metoda koja vraca true ako je karakter jednak odredjenom karakteru
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.charValue();
	}

	// metoda koja poredi dva karaktera
	public static int compare(char x, char y) {
		if ((int) x > (int) y)
			return 1;
		else if ((int) x < (int) y)
			return -1;
		else
			return 0;
	}

}