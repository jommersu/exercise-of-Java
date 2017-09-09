package exercise_chapter3;

import java.util.Scanner;

public class exercise_3_1 {

	public static void main(String[] args) {
		//判断一元二次方程有几个根
		System.out.println("input a b c");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double z = Math.pow(b, 2) - 4 * a * c;
		if(z > 0) {
			double r1 = (-b + Math.sqrt(z)) / 2 /a;
			double r2 = (-b - Math.sqrt(z)) / 2 /a;
			System.out.println("方程有2个根" + r1 + "和" + r2);
		}else if(z == 0) {
			double r1 = (-b) / 2 /a;
			System.out.println("方程有1个根" + r1);
		}else {
			System.out.println("方程没有根");
		}

	}

}
