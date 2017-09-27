package exercise_chapter9;

public class TestPassObject {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		int n = 5;
		printCircle(c1, n);

	}
	
	public static void printCircle(Circle myCircle, int counts) {
		
		System.out.println("Radius\t\tArea");
		while (counts >= 1) {
			System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
			myCircle.setRadius(myCircle.getRadius() + 1);
			counts--;
		}
	}
	
}

class Circle {
	
	private double radius = 1;
	private static int counts = 0;
	
	public Circle(){
		counts++;
	}
	
	public Circle(double newRadius){
		radius = newRadius;
		counts++;
	}
	
	public double getArea(){
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius >= 0 ? newRadius : 0;
	}
	
	public static int getCountsOfObjects() {
		return counts;
	}
}
