package exercise_chapter6;

import java.util.Scanner;

public class exercise_6_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a nubmer: ");
		int number = input.nextInt();
		
		System.out.println("the reverse is : " + reverse(number));

	}
	
	public static int reverse(int n) {
		String str = String.valueOf(n);
		StringBuffer str2 = new StringBuffer(str);
		str2.reverse();
		return Integer.parseInt(str2.toString());
	}

}
