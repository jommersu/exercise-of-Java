package exercise_chapter3;

import java.util.Scanner;

public class theChineseZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a year:");
		int year = input.nextInt();
		int remain = year % 12;
		String zodiac = "";
		switch (remain) {
		case 0:
			zodiac = "monkey";
			break;
		case 1:
			zodiac = "rooster";
			break;
		case 2:
			zodiac = "dog";
			break;
		case 3:
			zodiac = "pig";
			break;
		case 4:
			zodiac = "rat";
			break;
		case 5:
			zodiac = "ox";
			break;
		case 6:
			zodiac = "tiger";
			break;
		case 7:
			zodiac = "rabbit";
			break;
		case 8:
			zodiac = "dragon";
			break;
		case 9:
			zodiac = "snake";
			break;
		case 10:
			zodiac = "horse";
			break;
		case 11:
			zodiac = "sheep";
			break;
		default:
			System.out.println("input again");
			break;
		}
		System.out.println("the zodiaz is " + zodiac);

	}

}
