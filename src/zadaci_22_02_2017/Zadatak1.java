package zadaci_22_02_2017;

public class Zadatak1 {

	public static void main(String[] args) {
	
		//generisemo nasumicno broj mjeseca te pozivamo metodu za ispis Januar,Februar..
		int mjesec = (int)(1 + Math.random() * 11 );
		System.out.println("Mjesec: " + mjesec(mjesec) );

	}
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
