package excise_chapter2;

import java.util.Scanner;

public class exercise_2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ‰»Î∑÷÷” ˝£∫");
		long total = input.nextLong();
		long hours = total / 60;
		long days = hours / 24 ;
		long years = days / 365;
		long remainDays = days % 365;
		System.out.println("The total minutes is " + total 
				+ ". It is approximately " + years + " years"
				+ " and " + remainDays + " days.") ;
		
	}

}
