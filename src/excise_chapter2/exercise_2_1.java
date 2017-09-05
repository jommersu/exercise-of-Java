package excise_chapter2;

import java.util.Scanner;

public class exercise_2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the temperature£º");
		double temp = input.nextDouble();
		double fahrenheit = (9.0 / 5.0) * temp + 32;
		System.out.println("the fahrenheit is:" + fahrenheit);
						
		}

	}


