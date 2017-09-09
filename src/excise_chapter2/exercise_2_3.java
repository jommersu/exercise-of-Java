package excise_chapter2;

import java.util.Scanner;
/*
  feet to meters
 */
public class exercise_2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the feet:");
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + "feet is " + meters + " meters");

	}

}
