package exercise_chapter5;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class GuessNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 100);
		System.out.println("input a guess between 0 ~100");
		
		Scanner input = new Scanner(System.in);
		int guess = -1;
	
		while (guess != number) {
			System.out.println("enter the guess:");
			guess = input.nextInt();
			
			if(guess == number) {
				System.out.println("right!");
			}else if(guess > number){
				System.out.println("too high");
			}else {
				System.out.println("too low");
			}
		}

	}

}
