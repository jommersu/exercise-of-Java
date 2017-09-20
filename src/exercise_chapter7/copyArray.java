package exercise_chapter7;

public class copyArray {

	public static void main(String[] args) {
		int n = 5;
		int[] myArray = new int[n];
		for(int i = 0; i < n; i++) {
			myArray[i] = (int)(Math.random() * 10);
		}
		System.out.println("source Array is : ");
		printArray(myArray);
				
		System.out.println("\nthe copy array use arraycopy is :");
		int[] array3 = new int[5];
		System.arraycopy(myArray, 0, array3, 0, myArray.length);
		printArray(array3);

	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println("\n");
	}
	
}
