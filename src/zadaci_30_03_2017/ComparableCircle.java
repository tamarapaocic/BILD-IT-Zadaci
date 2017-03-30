package zadaci_30_03_2017;

public class ComparableCircle  extends Circle2  
implements Comparable<ComparableCircle> {

	public ComparableCircle() {
	}

	/** Construct a CoparableCircle with specified radius */
	public ComparableCircle(double radius) {
		super(radius);
	}

	/** Construct a CoparableCircle with specified properties */
	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	@Override 
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}
}