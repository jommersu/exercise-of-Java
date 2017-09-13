package exercise_chapter5;

import java.util.Scanner;

public class exercise_5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		double sum = 0;
		int count1 = 0;
		int count2 = 0;
		
		while (input.hasNext()) {
			int number = input.nextInt();
			
			if(number == 0) {
				break;
			}else if(number > 0) {
				count1++;
			}else {
				count2++;
			}
			
			sum += number;
		}
		
		double average = sum / (count1 + count2);
		System.out.println("The number of positives is " + count1);
		System.out.println("The number of negatives is " + count2);
		System.out.printf("The sum is %4.2f and the average is %4.2f", sum, average);

	}

}
