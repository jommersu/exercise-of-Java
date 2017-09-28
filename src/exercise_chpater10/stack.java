package exercise_chpater10;

public class stack {

	public static void main(String[] args) {
		intStack mytest= new intStack();
		for(int i = 0; i < 5; i++) {
			mytest.push(i);
		}
		
		System.out.println("the peek is " + mytest.peek());
		
		while (mytest.getSize() != 0) {
			System.out.print(mytest.pop() + " ");
		}
	}
}

class intStack {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public intStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public intStack(int capacity) {
		elements = new int[capacity];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public void push(int number) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = number;
	}
	
	public int pop() {
		return elements[--size];
	}
	
	public int getSize() {
		return size;
	}
	
	public int peek() {
		return elements[size - 1];
	}
	
	
}
