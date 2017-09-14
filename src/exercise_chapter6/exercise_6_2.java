package exercise_chapter6;

import java.util.Scanner;

public class exercise_6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = input.nextInt();
		System.out.println("the sum is : " + sumDigit(n));

	}
	
	public static int sumDigit(int n) {
		int remain = n;
		int sum = 0;
		int last = 0;
		
		while (remain >= 10) {
			int digit = remain % 10;
			remain /= 10;
			sum += digit;
			last = remain;
		}
		return sum + last;
	}

}
