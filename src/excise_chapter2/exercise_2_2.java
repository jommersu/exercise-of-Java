package excise_chapter2;

import java.util.Scanner;

public class exercise_2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//��ȡԲ����İ뾶�͸�
		System.out.println("input the radius:");
		double radius = input.nextDouble();
		System.out.println("input the length:");
		double length = input.nextDouble();
		//�������
		double volume = Math.pow(radius, 2) * 3.14159 * length;
		System.out.println("Բ��������Ϊ��" + volume);

	}

}
