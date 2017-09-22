package exercise_chapter7;

public class linearSearching {
	public static void main(String[] args) {
		int[] myList = {1,2,34,56,2,5,76,0};
		int index1 = find(myList, 34);
		System.out.println("34 is in " + index1);
	}
	
	public static int find(int[] list, int number) {

		for(int i = 0; i < list.length; i++) {
			if(list[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	

}
