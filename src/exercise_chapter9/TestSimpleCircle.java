package exercise_chapter9;

public class TestSimpleCircle {

	public static void main(String[] args) {
		SimpleCircle circle1 = new SimpleCircle();
		SimpleCircle circle2 = new SimpleCircle(25.0);

		double area1 = circle1.getArea();
		double area2 = circle2.getArea();
		
		System.out.println("area1 = "+ area1
				+ "\narea2 = " + area2);
	}

}

class SimpleCircle {
	double radius;
	
	SimpleCircle(){
		radius = 1;
	}
	
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
}
