package exercise_chapter5;
/*
 * 学费年增长率为5%，初始学费为10000，计算10年后的学费，计算从现在起四年的总学费。
 */
public class exercise_5_7 {

	public static void main(String[] args) {
		double tution = 10000;
		int year = 0;
		double sum = 0;
		
		while (year < 10) {
			tution *= 1.05;
			year++;
			if(year < 4) {
				sum += tution;
			}
		}
		System.out.printf("the tution after 10 years is %4.2f\n", tution);
		System.out.printf("the total tution of four years is %4.2f\n", sum);
		
	}

}
