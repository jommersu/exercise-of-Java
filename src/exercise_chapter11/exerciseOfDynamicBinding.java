package exercise_chapter11;

public class exerciseOfDynamicBinding {

	public static void main(String[] args) {
		new Person2().printPerson();
		new Student2().printPerson();

	}

}

class Student2 extends Person2 {
	@Override
	public String getInfo() {
		return "Student";
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println(super.getInfo());
		System.out.println("2333");
	}
}

class Person2 {
	public String getInfo() {
		return "Person";
	}
	
	public void printPerson() {
		System.out.println(getInfo());
	}
}
