package exercise_chapter5;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a dec number:");
		int decimal = input.nextInt();
		int dec = decimal;
		String hex = "";
		while (decimal != 0) {
			
			int hexValue = decimal % 16;
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
					(char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hex = hexDigit + hex;
			decimal = decimal / 16;
		}
		
		System.out.println("Dec number is " + dec );
		System.out.println("Hex number is " + hex);;

	}

}
