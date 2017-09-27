package exercise_chapter9;

public class objectArray {

	public static void main(String[] args) {
		Circle2[] cicleArray= new Circle2[5];
		cicleArray = generateArray(cicleArray.length);
		printCircleArray(cicleArray);
	}
	
	public static void printCircleArray(Circle2[] array) {
		System.out.println("Radius\t\tArea");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%4.4f\t\t%4.4f\n",array[i].getRadius(), array[i].getArea());
		}
	}
	
	public static Circle2[] generateArray(int len) {
		Circle2[] result = new Circle2[len];
		
		for(int i = 0; i < len; i++) {
			result[i] = new Circle2((double) Math.random() * 10);
		}

		
		return result;
	}
}

class Circle2 {
	
	private double radius = 1;
	private static int counts = 0;
	
	public Circle2() {
		counts++;
	}
	
	public Circle2(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) { 
		radius = newRadius;
	}
	
	public int getCounts() {
		return counts;
	}
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
}