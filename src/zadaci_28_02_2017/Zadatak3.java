package zadaci_28_02_2017;

public class Zadatak3 {

		 private double startTime;
		 private double endTime;
		 
		 double startTime(){
			 return System.currentTimeMillis();
		 }
		 void start(){
			 startTime = System.currentTimeMillis();
		 }
		 void stop(){
			 endTime = System.currentTimeMillis();
		 }
		 double getElapsedTime(){
			 return endTime-startTime;
		 }
		}
