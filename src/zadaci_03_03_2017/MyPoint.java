package zadaci_03_03_2017;

public class MyPoint {
        
	private double x;
	private double y;

	/** Konstruktor koji kreira tacku (0, 0) */
	MyPoint() {
		this(0, 0);
	}

	/** Konstruktor koji kreira tacku sa specificnim vrijednostima */
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/** Vraca udaljenost od ove tacke do specificne tacke tipa MyPoint */
   public double distance(MyPoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +  Math.pow(myPoint.getY() - y, 2));
   }

   /** Vraca udaljenost od ove tacke do druge tacke sa specificnim x i y koridinatama */
 	public double distance(double x, double y) {
 		return distance(new MyPoint(x, y));
 	}
}