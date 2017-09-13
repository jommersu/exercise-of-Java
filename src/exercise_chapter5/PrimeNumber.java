package exercise_chapter5;

public class PrimeNumber {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIME = 50;
		final int NUMBER_OF_PRINT_PERLINE = 10;
		
		int count = 0;
		int number = 2;
		while (count < NUMBER_OF_PRIME) {
			//is prime
			boolean isPrime = true;
			
			for(int i = 2; i <= (number / 2); i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				count++;
				if (count % NUMBER_OF_PRINT_PERLINE == 0) {
					System.out.println(number);
				}else {
					System.out.print(number + " ");
				}
			}
			
			number ++;
		}

	}

}
