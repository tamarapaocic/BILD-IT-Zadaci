package zadaci_02_03_2017;

public class FanTest {

	public static void main(String[] args) {

		//kreiranje prvog objekta
		Fan fan1 = new Fan();
		fan1.setSpeed(1);
		fan1.setColor("yellow");
		fan1.setRadius(10);
		fan1.turnOn();
		
		//kreiranje drugog objekta
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setColor("blue");
		fan2.setRadius(5);
		fan2.turnOff();

	    System.out.println(fan1.toString());
	    System.out.println(fan2.toString());
	}

}
