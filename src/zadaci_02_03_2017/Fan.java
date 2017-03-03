package zadaci_02_03_2017;

public class Fan {

	//Konstante
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	//default konstruktor
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public String getSpeed() {
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		return s;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}


	public void turnOn() {
		on = true;
    }


    public void turnOff() {
		on = false;
    }
    
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius;
		}
		else{
			return "\nFan color: " + color + ", radius: " + radius +
					 "\nFan is off\n";
		}
	}
	
}
