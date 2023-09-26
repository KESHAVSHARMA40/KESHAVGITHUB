package Sample1;

public class ConstantDemo {

	public static void main(String[] args) {
		// calculate the area of circle
		double AreaofCircle,Radius;
		final double Pi=3.14;
		Radius=2.5;
		AreaofCircle = Pi * Radius * Radius;
		System.out.println("Area of circle is :"+String.format("%.2f", AreaofCircle));
	}

}
