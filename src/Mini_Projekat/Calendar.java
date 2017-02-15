package Mini_Projekat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) throws Exception {
		List<String> reminderi = ucitajIzFajla();
		printMenu(reminderi);
	}
	
	//metoda koja printa neki mjesec u godini
	public static void printMonth(int year,int month){
		monthTitle(year,month);
		monthBody(year,month);
	}
	
	//metoda za naslov
	public static void monthTitle(int year,int month){
		System.out.println("       " + getMonth(month) + " " + year);
		System.out.println("----------------------------");
		System.out.println(" Ned Pon Uto Sri Cet Pet Sub");
	}
	
	//metoda koja uzima mjesec kao int i vraca njegovo ime kao string
	public static String getMonth(int month){
		String monthName = "";
		switch (month) {
		case 1: monthName = "Januar";break;
		case 2: monthName = "Februar"; break;
		case 3: monthName = "Mart"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "Maj"; break;
		case 6: monthName = "Juni"; break;
		case 7: monthName = "Juli"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "Septembar"; break;
		case 10: monthName = "Oktobar"; break;
		case 11: monthName = "Novembar"; break;
		case 12: monthName = "Decembar";
		}
		return monthName;
	}

	//metoda za printanje 'tijela' nekog mjeseca
	public static void monthBody(int year,int month){
		int startDay = getStartDay(year,month);
		int numOfDaysInMonth = getNumOfDaysInMonth(year,month);
		
		 int i = 0;
		 for (i = 0; i < startDay; i++)
		     System.out.print("    ");
		
		 for (i = 1; i <= numOfDaysInMonth; i++) {
		     System.out.printf("%4d", i);
		
		     if ((i + startDay) % 7 == 0)
		     System.out.println();
		 }
		 System.out.println();
		 }
		
		 //metoda koja vraca pocetni dan mjesec/1/godina
	     public static int getStartDay(int year, int month) {
		 final int START_DAY_FOR_JAN_1_1800 = 3;
		 // Suma svih dana od 1/1/1800 do mjesec/1/godina
		 int totalNumOfDays = getTotalNumOfDays(year, month);
		
		// Vraca pocetni dan za zeljeni mjesec
		 return (totalNumOfDays + START_DAY_FOR_JAN_1_1800) % 7;
		 }
		
		 // Metoda za broj dana od 1. Januara, 1800. 
	     public static int getTotalNumOfDays(int year, int month) {
		 int total = 0;
		
		 // Suma svih dana od 1800 do 1/1/godina
		 for (int i = 1800; i < year; i++)
		 if (isLeapYear(i))
		 total = total + 366;
		 else
		 total = total + 365;
		
		 // Dodavanje dana od Januara do mjeseca prije kalendarskog
		 for (int i = 1; i < month; i++)
		 total = total + getNumOfDaysInMonth(year, i);
		
		 return total;
		 }
		
		//metoda za broj dana u mjesecu
		public static int getNumOfDaysInMonth(int year, int month) {
		 if (month == 1 || month == 3 || month == 5 || month == 7 ||
		 month == 8 || month == 10 || month == 12)
		 return 31;
		
		 if (month == 4 || month == 6 || month == 9 || month == 11)
		 return 30;
	
		 if (month == 2) return isLeapYear(year) ? 29 : 28;
		 return 0;
	     }
		
		//metoda za provjeru da li je godina prestupna
		 public static boolean isLeapYear(int year) {
			return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			 }
		
		//printanje menija
		 public static void printMenu(List<String> reminderi) {
			Scanner sc = new Scanner(System.in);
			int izbor = -1;
			try{
			do {
				System.out.println();
				System.out.println("--- KORISNICKI MENI ---");
				System.out.println();
				System.out.println("  1) Prikazi kalendar");
				System.out.println("  2) Prikazi istoriju remindera");
				System.out.println("  3) Prikazi reminder za odredjeni datum");
				System.out.println("  4) Dodaj reminder");
				System.out.println("  5) Obrisi reminder");
			
				System.out.println("  6) Exit");
				
				System.out.println();
				
				System.out.print("Unesite izbor: ");
				izbor = sc.nextInt();
				
				if (izbor < 1 || izbor > 6) {
					System.out.println("Pogresan izbor. Molimo izaberite 1-6.");
				}
			} while (izbor < 1 || izbor > 6);
			
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos. ");
			}
			
			switch (izbor) {
			
			case 1: //prikaz kalendara
				try{
				System.out.println("Unesite godinu: ");
				int year = sc.nextInt();
				if (year < 1800){
					System.out.println("Unesite godinu vecu od 1800: ");
					year = sc.nextInt();
				}
				System.out.println("Unesite mjesec: ");
				int month = sc.nextInt();
				while(month < 1 || month > 12){
					System.out.println("Unesite mjesec od 1 do 12: ");
					month = sc.nextInt();
				}
				System.out.println();
				printMonth(year,month);
				} catch(InputMismatchException e) {
					System.out.println("Pogresan unos! ");
				}
				break;
				
			case 2: //prikaz svih remindera
				ispisiListuRemindera(reminderi);
				break;
				
			case 3: //prikaz remindera za odredjeni datum
				reminderSpecifican(reminderi);
				break;
				
			case 4: //dodavanje remindera
				dodajReminder(reminderi);
				break;
				
			case 5: //brisanje
				obrisiReminder(reminderi);
				break;
				
			case 6:
				System.out.println("");
				break;
			}
			
			if (izbor != 6) {
				printMenu(reminderi);
			}
			}
		
		 //metoda za snimanje liste remindera u .txt fajl
		 public static void snimiUFajl(List<String> reminderi) {
		    	
				File file = new File("Reminderi.txt");
				PrintWriter pw =  null;
				try {
				    pw = new PrintWriter(file);
					for (String reminder : reminderi) {
						pw.println(reminder);
					}
				
				} catch (IOException e){
					e.printStackTrace();
				} finally {
					pw.close();
				}
			}

		   //metoda za citanje liste iz fajla
		   public static List<String> ucitajIzFajla() throws IOException {

				List<String> reminderi = new ArrayList<String>();
				BufferedReader br = null;

				try {
					br = new BufferedReader(new FileReader("Reminderi.txt"));
					String lineFromFile = "";
					
					while ((lineFromFile = br.readLine()) != null) {
						reminderi.add(new String(lineFromFile));
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					br.close();
				}
				return reminderi;
			}	
			    
		      //metoda za dodavanje remindera u listu i u fajl
			  public static void dodajReminder(List<String> reminderi) {
					
					Scanner sc = new Scanner(System.in);
					LocalDate date = null;
					try{
					System.out.println("\nUnesite datum (dd/MM/yyyy): ");
					String datum = sc.nextLine();
					//formatiranje datuma u LocalDate
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				    date = LocalDate.parse(datum, formatter);
				   
				    System.out.println("\nUnesite podsjetnik");
					String note = sc.nextLine();
					
					Reminder noviReminder = new Reminder(note,date);
					
						reminderi.add(noviReminder.toString());
						snimiUFajl(reminderi);

						System.out.println("\n\tReminder uspjesno dodan!");
					}catch(DateTimeParseException e){
						System.out.println("\n\t Pogresan unos. ");
					}
					}
			    
			   //metoda za ispis remindera za trazeni datum
			    public static void reminderSpecifican(List<String> reminderi) {
					boolean on = true;
					Scanner sc = new Scanner(System.in);
					
					while (!reminderi.isEmpty() && on) { try { 
						System.out.println("Unesite datum (dd/MM/yyyy) za koji zelite pogledati reminder: ");
						String datum = sc.next();
						LocalDate date = null;
						//Formatiranje iz Stringa u LocalDate
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
					    date = LocalDate.parse(datum, formatter);
					
						BufferedReader br = null;

							br = new BufferedReader(new FileReader("Reminderi.txt"));
							String line = "";

							while ((line = br.readLine()) != null) {
							    //razdvajanje linije po zarezu u niz
								String[] notes = line.split(",");
								//provjera da li prvi elemenat sadrzi datum za koji zelimo vidjeti reminder
								if (notes[0].contains(date.toString())) {
										for (String st : notes) {
											System.out.print(st + " ");
										}
										System.out.println();
									} else {
										System.out.println("\n\tZa " + datum + " nemate remindera.");
										break;
									}
								}
								on = false;
							} catch (Exception e) {
								System.out.println("\n\tPogresan unos.");
							}
					} if (reminderi.isEmpty()) System.out.println("Lista remindera je prazna");
                    }
			    
			    //ispis cijele liste remindera 
			    public static void ispisiListuRemindera(List<String> reminderi) {
					for (String reminder : reminderi) {
						System.out.println("\n" + reminder);
					}
					if(reminderi.isEmpty()){
						System.out.println("\n\tNemate remindera. ");
					}
				}
			    
                //metoda za brisanje remindera
			    public static void obrisiReminder(List<String> reminderi) {
					if(reminderi.isEmpty()){
						System.out.println("\n\tLista remindera je prazna.");
		
					} else {
			    	Scanner sc = new Scanner(System.in);
			    	try {
					System.out.println("Unesite datum (dd/MM/yyyy) za koji zelite obrisati reminder: ");
					String datum =sc.nextLine();
					LocalDate date = null;
					
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;

				    date = LocalDate.parse(datum, formatter);
				 	
					BufferedReader br = null;

						br = new BufferedReader(new FileReader("Reminderi.txt"));
						String line = "";

						while ((line = br.readLine()) != null) {
							String[] notes = line.split(",");
							if (notes[0].contains(date.toString())) {
									reminderi.remove(line);
									snimiUFajl(reminderi);
									System.out.println("\n\tReminder izbrisan!");
								} 
					}
                    }catch (Exception e) {
	                System.out.println("\n\tPogresan unos.");;
                    }
			    } 
					} 
              }
