package exercise_chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int value;
		
		System.out.println("Enter numbers: ");
		
		do {
			value = input.nextInt();
			
			if(!numbers.contains(value) && value != 0) {
				numbers.add(value);
			}
			
		} while (value != 0);
		
		System.out.println(numbers);

	}
	


}
