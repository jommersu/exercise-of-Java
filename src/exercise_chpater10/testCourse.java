package exercise_chpater10;

public class testCourse {

	public static void main(String[] args) {
		Course c1 = new Course("English");
		c1.addStudent("Tom");
		c1.addStudent("Jerry");
		System.out.println("The course1 is " + c1.getCourseName());
		System.out.println("The number of students : "
				+ c1.getNumbersOfStudents());
		System.out.println("They are: ");
		String[] students = c1.getStudents();
		for(int i = 0; i < c1.getNumbersOfStudents(); i++) {
			System.out.println(students[i]);
		}
	}

}

class Course {
	private String courseName;
	private String[] students = new String[500];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumbersOfStudents() {
		return numberOfStudents;
	}

	
	
}