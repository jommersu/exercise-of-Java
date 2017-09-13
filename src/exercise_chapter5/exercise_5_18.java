package exercise_chapter5;

public class exercise_5_18 {

	public static void main(String[] args) {
		System.out.println("print picture 1:");
		for(int i = 1; i <=6 ; i ++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nprint picture 2:");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= (7 - i); j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nprint picture 3:");
		for(int i = 1; i <= 6; i ++) {
			for(int j = (6 - i); j > 0; j--) {
				System.out.print("  ");
			}
			for(int k = i ; k >=1; k--) {
				System.out.print(k + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nprint picture 4:");
		for(int i = 1; i <= 6; i++) {
			for(int j = (i - 1); j > 0; j--) {
				System.out.print("  ");
			}
			for(int k = 1; k <= (7 - i); k++) {
				System.out.print(k + " ");
			}
			System.out.print("\n");
		}
	}

}
