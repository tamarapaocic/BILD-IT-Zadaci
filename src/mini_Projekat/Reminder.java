package Mini_Projekat;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class Reminder {

	private String note;
	private LocalDate date;
	
	public Reminder(){
		note = "";
	}
	
	public Reminder(String note, LocalDate date) {
		this.note = note;
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Datum: " + date + ", " + "podsjetnik -->> " + note + "" ;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public int getYear(){
	int year = date.getYear(); 
	return year;
	}
	
	public int getDay(){
	int day = date.getDayOfMonth();
	return day;
	} 
	
	public int getMonth(){
	int monthAsInt = date.getMonthValue();
	return monthAsInt;
	}

}
