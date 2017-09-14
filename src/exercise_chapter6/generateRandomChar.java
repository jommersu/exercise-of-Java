package exercise_chapter6;

public class generateRandomChar {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(getRandom('A' , 'Z'));
		}

	}
	
	public static char getRandom(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
}
