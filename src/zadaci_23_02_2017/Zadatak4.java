package zadaci_23_02_2017;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.util.converter.LocalDateStringConverter;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println("Trenutacno vrijeme i datum: ");
        System.out.println(vrijeme());        
	}

	//metoda koja vraca trenutacno vrijeme i datum
	public static String vrijeme(){
	
		//format za datum i vrijeme
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String datumVrijeme = dtf.format(now);
		return datumVrijeme;
	}
}
