package exercise_chapter3;

import java.util.Scanner;

public class Lottery_p84 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 100);
		int lottery1 = lottery / 10;
		int lottery2 = lottery % 10;
		
		//input the guess number
		System.out.println("guess  the lottery, input two numbers:");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int number1 = guess / 10;
		int number2 = guess % 10;
		
		//compare the guess and the lottery
		if(lottery == guess) {
			System.out.println("The lottery number is " + lottery
					+ "\n" + "You win $10000!");
		}else if(lottery1 == number2 && lottery2 == number1){
			System.out.println("The lottery number is " + lottery
					+ "\n" + "You win $3000!");
		}else if(lottery1 == number1 || lottery1 == number2
				|| lottery2 == number1 || lottery2 == number2){
			System.out.println("The lottery number is " + lottery
					+ "\n" + "You win $1000!");
		}else {
			System.out.println("The lottery number is " + lottery
					+ "\n" + "Sorry!");
		}
		
	}

}
