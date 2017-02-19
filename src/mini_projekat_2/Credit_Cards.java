package mini_projekat_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Credit_Cards {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
            try {
			System.out.print("Enter a credit card number as a long integer: ");
			long number = input.nextLong();

			System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
            }catch(InputMismatchException e){
            	System.out.println("Wrong input.");
            }
		}

		//metoda koja vraca da li je validan broj kartice
		public static boolean isValid(long number) {
			boolean valid =	(getSize(number) >= 13 && getSize(number) <= 16) &&	(prefixMatched(number, 4) 
			|| prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) 
			&&((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

			return valid;
		}
		
		//metoda koja vraca broj cifara
		public static int getSize(long n) {
			String num = n + "";
			return num.length();
		}
		
		//metoda koja vraca broj ako je jednocifren,ako je dvocifren vraca sumu cifara
		public static int getDigit(int number) {
			if (number < 9)
				return number;
			else
				return number / 10 + number % 10;
		}
		
		//suma duplih cifara na parnim pozicijama
		public static int sumOfDoubleEvenPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 2; i >= 0; i -= 2) {
				sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
			}
			return sum;
		}
		
		
		// suma cifara na neparnih pozicijama
		public static int sumOfOddPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 1; i >= 0; i -= 2) {
				sum += Integer.parseInt(num.charAt(i) + "");
			}
			return sum;
		}
		
		//metoda za provjeru da li je neki broj prefix
		public static boolean prefixMatched(long number, int n) {
			return getPrefix(number, getSize(n)) == n;
		}
		
		//vraca prvih n cifara broja, ako je broj cifara u broju manji od n, vraca broj
		public static long getPrefix(long number, int n) {
			if (getSize(number) > n)  {
				String num = number + "";
				return  Long.parseLong(num.substring(0, n));
			}
			return number;
		}
	}