package exercise_chpater10;

public class testBuffer {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("Welcome to java");
		s.insert(7, "a");
		System.out.println(s);
		s.delete(7, 8);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.setCharAt(4, 't');
		System.out.println(s);
	}

}
