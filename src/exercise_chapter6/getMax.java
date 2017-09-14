package exercise_chapter6;

import java.util.Scanner;

public class getMax {

	public static void main(String[] args) {
		System.out.println("input two numbers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("the max is : " + max(a, b));

	}
	public static int max(int num1, int num2) {
		return (num1 >= num2) ? num1 : num2;
	}

}
