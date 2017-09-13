package exercise_chapter5;

public class FutureTuition {

	public static void main(String[] args) {
		double tution = 10000;
		int year = 0;
		while (tution < 20000) {
			tution *= 1.07;
			year++;
		}
		System.out.println("Year is " + year);
		System.out.printf("And the tution is %4.2f" , tution);
	}

}
