package zadaci_10_03_2017;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws Exception {
			Scanner input = new Scanner(System.in);
			File file = new File("");
            try{
			// Prompt the user to a file
			System.out.print("Enter a file of scores: ");
			 file = new File(input.nextLine());
            }catch(InputMismatchException e){
            	System.out.println("Wrong input");
            }
			// Check if file exists
			if (!file.exists()) {
				System.out.println("File " + file + " does not exist");
				System.exit(1);
			}

			int count = 0; 		// Counts scores
			double total = 0;	// Accumulates total

			try (
				Scanner inputFile = new Scanner(file);
			) {
				while (inputFile.hasNext()) {
					total += inputFile.nextInt();
					count++;
				}
			}
            input.close();
			// Display results
			System.out.println("File " + file.getName());
			System.out.println("Total scores: " + total);
			System.out.println("Average scores: " + (total / count));
		}
	}