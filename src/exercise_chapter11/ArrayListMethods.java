package exercise_chapter11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		//exercise1
		String[] list = {"a", "b", "c"};
		ArrayList<String> array= new ArrayList<>(Arrays.asList(list));
		System.out.println(array.toString());
		
		String[] list2 = new String[array.size()];
		array.toArray(list2);
		System.out.println(array);

		//sort
		Integer[] numbers = {2,3,45,46,56,74};
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(numbers));
		java.util.Collections.sort(numbersList);
		System.out.println(numbersList);
		java.util.Collections.shuffle(numbersList);
		System.out.println(numbersList);
	}

}
