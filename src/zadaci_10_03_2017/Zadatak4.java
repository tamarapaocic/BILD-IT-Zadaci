package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws Exception {
	
			//uzima prvi argument iz main metode
			String fileName = args[0];
			//Broj karaktera,rijeci,linija
			int numChar = 0;
			int numWords = 0;
			int numLines = 0;
			
			//putanja do fajla i objekat reader za citanje sadrzaja iz fajla
			try { Path path = Paths.get(fileName);
			      BufferedReader reader = Files.newBufferedReader(path);
			try {
				  String line="";
				//prolazak kroz svaku liniju u fajlu
				while((line = reader.readLine()) != null){
					//povecavanje countera za broj linija
					numLines++;
					//split linije na rijeci i spremanje u niz
					String [] rijeci = line.split(" ");  
					//suma broja rijeci 
					numWords += rijeci.length;
					//counter za karaktere
					for (int i = 0; i < line.length(); i++){
						if(line.charAt(i) != ' ')
						numChar ++;
					}
					}
			}
				finally {
					//ispis
				System.out.println("Broj karaktera je: " + numChar);
				System.out.println("Broj rijeci je: " + numWords);
				System.out.println("Broj linija je: " + numLines);
				//zatvaranje readera
	            reader.close();
				}
				} catch(Exception e){
					e.printStackTrace();
				}
		}
	}
