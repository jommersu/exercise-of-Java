package exercise_chapter7;

public class copyArray {

	public static void main(String[] args) {
		int[] myArray = new int[5];
		System.out.println("source Array is : ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random() * 10);
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println("\nthe copy array use for loop is :");
		int[] array2 = new int[5];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = myArray[i];
			System.out.print(array2[i] + " ");
		}
		
		System.out.println("\nthe copy array use arraycopy is :");
		int[] array3 = new int[5];
		System.arraycopy(array2, 0, array3, 0, array2.length);
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] +" ");
		}
		

	}

}
