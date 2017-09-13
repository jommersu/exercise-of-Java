package exercise_chapter5;
/*
 * ´òÓ¡½ð×ÖËþ
 */
public class exercise_5_19 {

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < (7-i); j++) {
				System.out.printf("%4s", "");
			}
			for(int k = 0; k <= i; k++) {
				System.out.printf("%4d", (int)(Math.pow(2, k)));
			}
			for(int m = (i - 1); m >= 0; m--) {
				System.out.printf("%4d", (int)(Math.pow(2, m)));
			}
			System.out.print("\n");
		}

	}

}
