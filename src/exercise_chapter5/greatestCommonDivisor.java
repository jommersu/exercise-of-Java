package exercise_chapter5;

import java.util.Scanner;

public class greatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input two numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int gcd = 1;
		for(int k = 2; (k <= (a/2) && k <= (b/2) ); k ++) {
			if(a % k == 0 && b % k == 0) {
				gcd = k;
			}
		}
		System.out.println("a is " + a
				+ ". And b is " + b
				+ ". the gereatest divisor is " + gcd);

	}

}
