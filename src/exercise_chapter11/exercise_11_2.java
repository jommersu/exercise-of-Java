package exercise_chapter11;

public class exercise_11_2 {

	public static void main(String[] args) {
		newPerson personA = new newPerson("DAN", "XI'AN", "123", "ABC@abc.com");
		newStudent studentA = new newStudent("Li", "XI'AN", "333", "li@a.com", "´ó¶þ");
		Employee employeeA = new Employee("liu", "Shanghai", "12","liu @a.com","officeA",150000.0);
		Faculty facultyA = new Faculty("WANG", 
				"Shanghai", "12","liu @a.com","officeA",150000.0, 12);
		
		System.out.println(personA.toString());
		System.out.println(studentA.toString());
		System.out.println(employeeA.toString());
		System.out.println(facultyA.toString());
	}

}

class newPerson {
	final protected String name;
	final protected String address;
	final protected String phoneNumber;
	final protected String email;
	
	public newPerson() {
		name = "None";
		address = "None";
		phoneNumber = "None";
		email = "None";
	}
	
	public newPerson(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
		this.email = email;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected String getAddress() {
		return this.address;
	}
	
	protected String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	protected String getEmali() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return this.name + " is a Person, " + "His Address is " +
				this.address + ". His phoneNumber is " + this.phoneNumber
				+ ". His email is " + this.email;
	}
	
}

class newStudent extends newPerson{
	private String klass;
	
	public newStudent() {
		super();
	}
	
	public newStudent(String name, String address, 
			String phone, String email, String klass) {
		super(name, address, phone, email);
		this.klass = klass;
	}
	
	protected String getKlass() {
		return this.klass;
	}
	
	@Override
	public String toString() {
		return this.name + " is a Student, " + "His Address is " +
				this.address + ". His phoneNumber is " + this.phoneNumber
				+ ". His email is " + this.email
				+ ". His class is " + this.klass;
	}
}

class Employee extends newPerson{
	protected String office;
	protected double wage;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String address, 
			String phone, String email, String office, 
			 double wage) {
		super(name, address, phone, email);
		this.office = office;
		this.wage = wage;
	}
	
	protected String getOffice() {
		return this.office;
	}
	
	protected double getWage() {
		return this.wage;
	}
	
	@Override
	public String toString() {
		return this.name + " is a Employee, " + "His Address is " +
				this.address + ". His phoneNumber is " + this.phoneNumber
				+ ". His email is " + this.email
				+ ". His wage is " + this.wage;
	}
	
}

class Faculty extends Employee {
	private int rank;
	
	public Faculty() {
		super();
	}
	
	public Faculty(String name, String address, 
			String phone, String email, String office, 
		    double wage, int rank) {
		super(name, address, phone, email, office, wage);
		this.rank = rank;
	}
	
	protected int getRank() {
		return this.rank;
	}
	
	@Override
	public String toString() {
		return this.name + " is a Faluty, " + "His Address is " +
				this.address + ". His phoneNumber is " + this.phoneNumber
				+ ". His email is " + this.email
				+ ". His wage is " + this.wage 
				+ ". His rank is " + this.rank;
	}
}

  