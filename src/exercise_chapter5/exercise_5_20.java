package exercise_chapter5;
/*
 * 打印2-1000之间的素数，每行显示8个
 */
public class exercise_5_20 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIME = 2000;
		final int NUMBER_PER_LINE = 8;
		
		int count = 0;
		int number = 2;
	
		while (number <= NUMBER_OF_PRIME) {
			Boolean isPrime = true;
			for(int i = 2; i <= (number / 2); i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				count++;
				System.out.print(number + " ");
				if(count % NUMBER_PER_LINE == 0) {
					System.out.print("\n");
				}
			}
			
			number++;
		}
		

	}

}
