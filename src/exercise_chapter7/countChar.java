package exercise_chapter7;

public class countChar {

	public static void main(String[] args) {
		char[] charList = new char[10];
		charList = generateCharArray(charList);
		printArray(charList);
		
		int[] counts = new int[26];
		counts = getcounts(charList, counts);
		printArray(counts);
	}
	
	public static int[] getcounts(char[] array, int[] counts) {
		int flag = 0;
		
		for(int i = 0; i < array.length; i++) {
			flag = (int)(array[i] - 'a');
			counts[flag]++;
		}
		return counts;
	}
	
	public static void printArray(int[] array) {
		final int CHAR_PER_LINE = 10;
		int flag = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%2c", (char)(i + 'a'));
			System.out.print( array[i] + " ");
			flag++;
			if(flag % CHAR_PER_LINE == 0) {
				System.out.print("\n");				;
			}
		}
	}
	public static void printArray(char[] array) {
		final int CHAR_PER_LINE = 10;
		int flag = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			flag++;
			if(flag % CHAR_PER_LINE == 0) {
				System.out.print("\n");				;
			}
		}
	}
	public static char[] generateCharArray(char[] array) {
		for(int i = 0 ; i < array.length; i++) {
			array[i] = (char)('a' + Math.random() * ('z' - 'a'+1));
		}
		
		return array;
	}
	

}
