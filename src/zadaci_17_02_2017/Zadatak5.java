package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi string");
        String str = sc.next();
        System.out.println("Unesite drugi string");
        String str2 = sc.next();
        
        if(str2.length() > str.length()){
        	System.out.println("Drugi string mora biti manji od prvog.");
        	str2 = sc.next();
        }
        
        if(str.contains(str2)){
        	System.out.println(str2 + " je substring od " + str);
        } else {
        	System.out.println(str2 + " nije substring od " + str);
        }

	}

}
