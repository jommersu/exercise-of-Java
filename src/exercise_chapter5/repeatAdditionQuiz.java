package exercise_chapter5;

import java.util.Scanner;

public class repeatAdditionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		System.out.println("What is " + a + " + " + b + " ?");
		int answer = input.nextInt();
		while(answer != (a + b)) {
			System.out.println("wrong! try again:");
			answer = input.nextInt();
		}
		
		System.out.println("right!");
	}

}
