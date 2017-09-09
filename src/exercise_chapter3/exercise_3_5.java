package exercise_chapter3;

import java.util.Scanner;

public class exercise_3_5 {

	public static void main(String[] args) {
		System.out.println("enter a day of Today ,input a numer between 0~1:");
		Scanner input = new Scanner(System.in);
		int today = input.nextInt();
		switch (today) {
		case 0:
			System.out.println("Sunday");
			break; 
		case 1:
			System.out.println("Monday");
			break;
		default:
			break;
		}
	}

}
