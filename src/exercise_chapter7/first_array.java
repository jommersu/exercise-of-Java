package exercise_chapter7;

public class first_array {

	public static void main(String[] args) {
		int[] myList = new int[10];
		int sum = 0;
		int index = 0;
		
		for(int i = 0; i < myList.length; i++) {
			myList[i] = (int)(1 + Math.random() * 10);
			sum += myList[i];
		}
		
		int max = myList[0];
		for(int i = 0; i < myList.length; i++) {
			if(myList[i] > max) {
				max = myList[i];
				index = i;
			}
			
		}
		
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println("\nsum is " + sum
				+"\nmax is "+ max
				+"\nindex is " + index );
		
		for(int i = myList.length - 1; i > 0; i--) {
			int j = (int)(Math.random() * (i + 1));
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
		for(int i = 0; i < myList.length; i++ ) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.print("\n");
		int temp = myList[0];
		for(int i = 1; i < myList.length; i++) {
			myList[i-1] = myList[i];
		}
		myList[myList.length - 1] = temp;
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}

}
