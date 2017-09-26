package exercise_chapter8;

public class matrix {

	public static void main(String[] args) {
		//generate matrix
		
		int[][] matrix = getArray(6,4);
		printArray(matrix);
	}

	public static void printArray(int[][] matrix) {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				int flag = 0;
				System.out.printf("%4d",matrix[i][j]);
				if(j == matrix[i].length - 1) {
					System.out.print("\n");
				}

			}
		}
	}
	public static int[][] getArray(int row, int column){
		
		int[][] array = new int[row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				array[i][j] = (int)(Math.random() * 50);
			}
		}
		return array;
	}
}
