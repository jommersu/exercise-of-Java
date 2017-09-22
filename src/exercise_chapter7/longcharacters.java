package exercise_chapter7;

public class longcharacters {

	public static void main(String[] args) {
		printMax(32,2,343,5);

	}
	
	public static void printMax(int ...numbers) {
		if(numbers.length == 0) {
			System.out.println("error!");
			return;
		}
		
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			max = numbers[i] > max ? numbers[i] : max;
		}
		
		System.out.println(max);
	}

}
