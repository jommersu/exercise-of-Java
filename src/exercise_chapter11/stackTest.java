package exercise_chapter11;

import java.util.ArrayList;

public class stackTest {

	public static void main(String[] args) {
		myStake stakeTest = new myStake();		
		char ch = 'a';
		
		for(int i = 0; i < 5; i++) {
			
			String test = Character.toString(ch);
			stakeTest.push(test);
			ch++;
		}
	
		System.out.println(stakeTest);
		System.out.println("the peak is " + stakeTest.peek());
		System.out.println("the size is " + stakeTest.getSize());
		System.out.println("the list is " 
				+ (stakeTest.isEmpty() ? "empty" : "not empty"));
	}

}

class myStake {
	
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(list.size() - 1);
	}
	
	public Object pop() {
		Object object = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return object;
	}
	
	public void push(Object o) {
		list.add(o);
	}
	
	@Override
	public String toString() {
		return "stack" + list.toString();
	}
}
