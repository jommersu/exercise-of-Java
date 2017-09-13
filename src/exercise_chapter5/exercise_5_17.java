package exercise_chapter5;

import java.util.Scanner;

/*
 * 打印金字塔
 */
public class exercise_5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number");
		int number = input.nextInt();
		//i:打印行数， （2 * i + 1）:每行打印个数 ，空格数：j 6~0
		for(int i = 0; i < number; i++) {
			for(int j = (6-i); j >=0; j--) {
				System.out.print("  ");
			}
			for(int k = (i + 1); k >= 1; k--) {
				System.out.print(k + " ");
			}
			for(int m = 2; m <= (i + 1); m++) {
				System.out.print(m + " ");
			}
			for(int l = 6; l >=0; l--) {
				System.out.print("  ");
			}
			System.out.print("\n");
		}

	}

}
