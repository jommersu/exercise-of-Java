package exercise_chapter3;

import java.util.Scanner;

/*
  p75
  random exercise
 */
public class exer_random_subQuzi {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		Scanner input = new Scanner(System.in);
		if(number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println("calculate " + number1 + " - "  + number2);
		int answer = input.nextInt();
		if((number1 - number2) == answer) {
			System.out.println("you   are correct!");
		}else {
			System.out.println("your answer is wrong!" 
					+ "\n" + number1 + " - " + number2 +
					" = " + (number1-number2));
		}

	}

}
