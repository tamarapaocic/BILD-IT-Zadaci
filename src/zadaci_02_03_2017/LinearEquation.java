package zadaci_02_03_2017;

public class LinearEquation {

	private double a,b,c,d,e,f;
	
	LinearEquation(double aNew,double bNew,double cNew,double dNew,double eNew,double fNew){
		a = aNew;
		b = bNew;
		c = cNew;
		d = dNew;
		e = eNew;
		f = fNew;
	}
	
	double getA(){
		return a;
	}
	 double getB(){
		return b;
	}
	 double getC(){
		return c;
	}
	double getD(){
		return d;
	}
    double getE(){
		return e;
	}
	 double getF(){
		return f;
	}
	 
	 boolean isSolvable(){
		 if (a * d - b * c != 0){ return true;}
		 return false;
	 }
	 
	 double getX(){
		 double x = (e * d - b * f)/(a * d - b * c);
		 return x;
	 }
	 
	 double getY(){
		 double y = (a * f - e * c)/(a * d - b * c);
		 return y;
	 }
	 
	 
}