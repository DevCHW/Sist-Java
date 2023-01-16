package my.day18.a.Inteface;

public class Circle implements Figure {

	@Override
	public double area(double x, double y) {
		return 0;
	}

	@Override
	public double area(double r) {
		
		return r*r*PI;
	}


}
