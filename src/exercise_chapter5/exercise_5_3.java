package exercise_chapter5;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * ת��ǧ���������ʾΪ���
 * ���ʾ����
  	ǧ��		��
  	1		2.2
  	3		6.6
 */
public class exercise_5_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the kilograms, it is end with 0: ");
		
		System.out.println("ǧ��" + "\t" + "��");
		while (input.hasNext()) {
			int kilograms = input.nextInt();
			if(kilograms == 0) {
				break;
			}
			double pounds = kilograms * 2.2;
			System.out.printf("%d\t%4.2f\n", kilograms, pounds);
		}

	}

}
