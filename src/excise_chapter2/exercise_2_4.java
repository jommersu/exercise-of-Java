package excise_chapter2;

import java.util.Scanner;

public class exercise_2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the pounds:");
		double pounds = input.nextDouble();
		double kilograms =pounds * 0.454;
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}
