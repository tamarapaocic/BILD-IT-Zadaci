package zadaci_18_02_2017;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak3 {

	public static void main(String[] args) {
		
        Time vrijeme =new Time(System.currentTimeMillis());
		
		Calendar kalendar=new GregorianCalendar();
		
		//pozivamo metode za dobijanje dana,mjeseca i godine
		String mjesec=mjesec(kalendar.get(Calendar.MONTH)+1);
		int godina=kalendar.get(Calendar.YEAR);
		int dan=kalendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.print("\nTrenutni datum i vrijeme: "+ dan + "." + mjesec+" "+ godina +" "+ vrijeme.toString());
	}
	
	   //metoda koja vraca ime mjeseca
       public static String mjesec(int mj){
		
		String mjesec="";
		switch(mj){
		
		case 1:  mjesec= "januar";break;
		case 2:  mjesec= "februar";break;
		case 3:  mjesec= "mart";break;
		case 4:  mjesec= "april";break;
		case 5:  mjesec= "maj";break;
		case 6:  mjesec= "juni";break;
		case 7:  mjesec= "juli";break;
		case 8:  mjesec= "avgust";break;
		case 9:  mjesec= "septembar";break;
		case 10: mjesec= "oktobar";break;
		case 11: mjesec="novembar";break;
		case 12: mjesec="decembar";
		
	}
		return mjesec;
	}
	}