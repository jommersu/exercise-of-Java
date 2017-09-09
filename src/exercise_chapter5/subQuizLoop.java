package exercise_chapter5;

import java.util.Scanner;

public class subQuizLoop {

	public static void main(String[] args) {
		final int NUMBER_OF_QUIZ = 5;
		int correctCout = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner input = new Scanner(System.in);
		
		while (count < 5) {
			//Generate the number
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			if(number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			//enter the answer
			System.out.println("What is " 
			+ number1 + " - " + number2 + " ?");
			int answer = input.nextInt();
			
			//count the correct answer
			if(answer == (number1 - number2)) {
				System.out.println("right");
				correctCout++;
			}else {
				System.out.println("wrong. The correct answer is "
						+ (number1 - number2));
			}
			
			count++;
			
			output += number1 + "-" + number2 + "="+ answer + " "
					+ ((number1 - number2 == answer) ? "correct" : "wrong")
					+ "\n";
					
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Test time is " + (endTime - startTime) /1000
				+ "seconds" + "\n" + output);

	}

}
