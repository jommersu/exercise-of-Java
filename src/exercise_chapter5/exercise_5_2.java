package exercise_chapter5;

import java.util.Scanner;
/*
 	1-15之间的随机加法，记录正确个数、打印结果，统计测试时间
 	
 */
public class exercise_5_2 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUIZ = 5;
		Scanner input = new Scanner(System.in);
		int count = 0;
		int correctCount = 0;
		long stratTime = System.currentTimeMillis();
		String output = "";
		
		while (count < NUMBER_OF_QUIZ) {
			int a = (int)(1 + Math.random() * 15);
			int b = (int)(1 + Math.random() * 15);
			System.out.println("enter the answer of " + a + " + " + b);
			int answer = input.nextInt();
			String quizAnswer = "";
			
			if(answer == a + b) {
				quizAnswer = "correct";
				correctCount++;
			}else {
				quizAnswer = "wrong";
			}
			
			count++;
			output += a + " + " + b + " = " + answer + " " + quizAnswer + "\n";
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("The correct number of quiz is " + correctCount
				+ "\n" + "The test time is " + (endTime - stratTime) / 1000 + "seconds"
				+ "\n" + output);
	}

}
