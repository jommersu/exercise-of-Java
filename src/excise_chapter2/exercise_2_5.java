package excise_chapter2;

import java.util.Scanner;

public class exercise_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入费用与费率：");
		double amount = input.nextDouble();
		double rate = input.nextDouble() / 100.0;
		double gratuity = amount * rate;
		double total = amount + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $"+ total);

	}

}
