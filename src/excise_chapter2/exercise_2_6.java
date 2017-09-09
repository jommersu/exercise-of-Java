package excise_chapter2;

import java.util.Scanner;

public class exercise_2_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number between 0~1000");
		int number = input.nextInt();
		int lastNumber = number % 10;
		number = number / 10;
		int number2 = number % 10;
		number = number /10;
		int number3 = number % 10;
		int sum = lastNumber + number2 + number3;
		System.out.println("the sum is " + sum);
	}
}
