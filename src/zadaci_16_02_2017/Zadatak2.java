package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
        //konstanta
		final double RADIUS = 6371.01;

		
		System.out.print("Unesite sirinu u stupnjevima za tacku 1: ");
		double x1 = sc.nextDouble();
		if((x1 > 90) || (x1 < -90)){
			System.out.println("Unesite sirinu u stupnjevima od -90 do 90: ");
			x1 = sc.nextDouble();
		}
		System.out.print("Unesite duzinu u stupnjevima za tacku 1: ");
		double y1 = sc.nextDouble();
		if((y1 > 180) || (y1 < -180)){
			System.out.println("Unesite duzinu u stupnjevima od -180 do 180: ");
			y1 = sc.nextDouble();
		}
		System.out.print("Unesite sirinu u stupnjevima za tacku 2: ");
		double x2 = sc.nextDouble();
		if((x2 > 90) || (x2 < -90)){
			System.out.println("Unesite sirinu u stupnjevima od -90 do 90: ");
			x2 = sc.nextDouble();
		}
		System.out.print("Unesite duzinu u stupnjevima za tacku 2: ");
		double y2 = sc.nextDouble();
		if((y2 > 180) || (y2 < -180)){
			System.out.println("Unesite duzinu u stupnjevima od -180 do 180: ");
			y2 = sc.nextDouble();
		}

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
        
		//proracun distance po formuli
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		System.out.println("Distanca izmedju dvije tacke je " + distance);
		}catch(InputMismatchException e){
			System.out.println("Wrong input");
		}
	}
}