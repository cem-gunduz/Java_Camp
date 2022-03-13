package odev3;

public class User {
	private int id;
	private String name;
	private String password;
	private String courseName;
	public User() {
		
	}
	public User(int id, String name, String password, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.courseName = courseName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
