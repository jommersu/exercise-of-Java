package exercise_chapter6;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("the first 50 prime numbers are : ");
		printPrimeNumbers(50);
	}
	public static boolean isPrime(int number) {
		
		for(int i = 2; i <= (number / 2); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		while (count < numberOfPrimes) {
			
			if(isPrime(number)) {			
				count++;
				if(count % NUMBER_PER_LINE == 0) {
					System.out.printf("%5d\n" , number);
				}else {
				}
			}

			number++;
		}
	}

}
