package exercise_chapter7;


public class arrays {

	public static void main(String[] args) {
		int [] testList = {3,2,64,23,88,4};
		java.util.Arrays.sort(testList);
		printArrays(testList);
		
		int [] test2 = new int [5];
		java.util.Arrays.fill(test2, 0,2,3);
		printArrays(test2);
		
		int index = java.util.Arrays.binarySearch(testList, 64);
		
		System.out.println("index is " + index);
		boolean isEqual = java.util.Arrays.equals(test2, testList);
		System.out.println(isEqual);
	}
	
	public static void printArrays(int[] list) {
		
	
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
