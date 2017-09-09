package exercise_chapter4;

public class FormatDemo {

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "degrees","radians",
				"sine" , "cosine" , "tangent");
		int degree = 30;
		double radians = Math.toRadians(degree);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f", degree, 
				radians , Math.sin(radians) , Math.cos(radians) , Math.tan(radians));
	}

}
