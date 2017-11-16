package exercise_chapter11;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class maxInArrayList {

	public static void main(String[] args) {
		//Integer[] numbers = {2, 3, 5, 32, 8, 9};
		//ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

		ArrayList<Integer> numberList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("input numbers end with 0");

		int value;
		do{
			value = input.nextInt();
			numberList.add(value);
		}while (value != 0);

		//getMax
		int max = getMax(numberList);
		System.out.println(numberList);
		System.out.println("the max is " + max);
	}
	
	public static Integer getMax(ArrayList<Integer> list) {
		return java.util.Collections.max(list);
	}
	
}
