package exercise_chapter6;


public class exercise_6_1 {

	public static void main(String[] args) {
		
		int flag = 0;
		for(int i = 1; i < 100; i++) {
			System.out.print(getPentagonalNumber(i) + " ");
			flag++;
			if(flag % 10 == 0) {
				System.out.print("\n");
			}
		}

	}
	
	public static int getPentagonalNumber(int n) {
		
		return n * (3 * n - 1) / 2;
	}
	

}
