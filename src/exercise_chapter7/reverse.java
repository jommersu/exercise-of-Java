package exercise_chapter7;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the length of array:");
		int n = input.nextInt();
		
		int[] myArray = new int[n];
		myArray = generateArray(myArray);
		System.out.println("the array is :");
		printArray(myArray);
		int[] reverseArray = new int[n];
		reverseArray = getReverse(myArray);
		System.out.println("\nthe reverse array is :");
		printArray(reverseArray);
	}
	
	public static void printArray(int [] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	public static int[] generateArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		return array;
	}

	public static int[] getReverse(int[] array) {
		int [] result = new int[array.length];
		for(int i = 0, j = array.length-1; 
				i < array.length; i++, j--) {
			result[j] = array[i];
		}
		
		return result;
	}
}
