package exercise_chpater10;

import java.util.Scanner;

import exercise_chapter7.reverse;

public class PalindromeIgnoreNonAlphanumeric {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("is " + s + 
				" a palindrome ignoring nonalphanumeric charachters? "
				+ isPalindrome(s));

	}   
	
	public static boolean isPalindrome(String s) {
		String s1 = filter(s);
		String s2 = reverseString(s1);
		return s2.equals(s1);
	}
	
	public static String filter(String s) {
	
		StringBuilder string = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				string.append(s.charAt(i));
			}
		}
		
		return string.toString();
	}
	
	public static String reverseString(String s) {
		
		StringBuilder string = new StringBuilder(s);
		string.reverse();
		return string.toString();
	}

}
