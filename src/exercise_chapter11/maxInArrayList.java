package exercise_chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class maxInArrayList {

	public static void main(String[] args) {
		Integer[] numbers = {2, 3, 5, 32, 8, 9};
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
		
		//getMax
		int max = getMax(numberList);
		System.out.println(numberList);
		System.out.println("the max is " + max);
	}
	
	public static Integer getMax(ArrayList<Integer> list) {
		return java.util.Collections.max(list);
	}
	
}
