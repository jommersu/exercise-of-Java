package exercise_chapter7;

import java.util.Scanner;

public class input_array {

	public static void main(String[] args) {
		System.out.println("enter a number of items:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double sum = 0;
		double average = 0;
		
		double [] myArray = new double[n];
		System.out.println("enter numbers:");
		for(int i = 0; i < n; i++) {
			myArray[i] = input.nextDouble();
			sum += myArray[i];
		}
		average = sum / n;
		
		int count = 0;
		for(double e : myArray) {
			if(e > average) {
				count++;
			}
		}
		
		System.out.println("the average is " + average
				+ "\nthe number above the average is " + count);
	}

}
