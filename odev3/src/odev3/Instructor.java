package odev3;

public class Instructor extends User{
	
	int salary;

	public Instructor() {
	
	}

	public Instructor(int id, String name, String  password, String courseName,int salary) {
		super(id,name,password,courseName);
		this.salary = salary;
	}
	
	
	
}
