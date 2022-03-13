package odev3;

public class Student extends User{
	String gender;

	public Student() {
	
	}

	public Student(int id, String name, String password, String courseName,String gender) {
		super(id,name,password,courseName);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
