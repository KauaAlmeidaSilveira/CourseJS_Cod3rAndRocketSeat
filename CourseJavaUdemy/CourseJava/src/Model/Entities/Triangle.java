package Model.Entities;

public class Triangle {

	public double a, b, c;
	
	public double areaTringule() {
		double p = (a+b+c)/2;
		return Math.sqrt( p*(p - a)*(p - b)*(p - c) );
	}
}

