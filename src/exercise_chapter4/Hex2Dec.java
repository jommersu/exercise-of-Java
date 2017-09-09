package exercise_chapter4;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueBase;

public class Hex2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a hex number:");
		String hexString = input.nextLine();
		if(hexString.length() !=1 ) {
			System.out.println("You must enter one character!");
			System.exit(1);
		}
		char ch = Character.toUpperCase(hexString.charAt(0));
		int value = 0;
		if(ch >= 'A' && ch <= 'F') {
			value = ch - 'A' + 10;
		}else {
			value = Integer.parseInt(hexString);
		}
		System.out.println(value);
	}

}
