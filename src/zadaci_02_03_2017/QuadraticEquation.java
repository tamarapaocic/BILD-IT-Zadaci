package zadaci_02_03_2017;

public class QuadraticEquation {
     
	private double a;
	private double b;
	private double c;
	private double d;
	
	QuadraticEquation(double aNew,double bNew,double cNew){
		a = aNew;
		b = bNew;
		c = cNew;
	}
	
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	
	 double getDiscriminant(){
		double d = b * b - 4 * a * c;
		return d;
	}
	
	 double getRoot1(){
		 if(d < 0) {return 0.0; }
		double r1 = (-b + (Math.sqrt(d))) / 2 * a;
		return r1;
	}
	
	public double getRoot2(){
		if(d < 0) {return 0.0; }
		double r2 = (-b - (Math.sqrt(d))) / 2 * a;
		return r2;
	}
	
}
