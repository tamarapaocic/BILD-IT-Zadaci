package zadaci_15_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite password");
		
		String pass = sc.nextLine();
		
		boolean valid = true;
		int count = 0;
		
		sc.close();
		
		if(pass.length() < 8){
			valid = false;
		}
		
		else{
			for (int i = 0; i < pass.length(); i++){
				//provjera da li se sadrzi neke druge karaktere osim slova i brojeva, ako sadrzi prekida se
				if(!Character.isLetterOrDigit(pass.charAt(i))){
					valid = false;
					break;
				}
				//brojac koliko ima brojeva u pass
				if (Character.isDigit(pass.charAt(i))){
					count++;
				}
			}
			if (count < 2){
				valid = false; 
				}
			
		}
		if (valid){
			System.out.println("Password je validan");
			}
		else{
			System.out.println("Password nije validan.");
		}
		}
	
			}