package odev3;

public class Main {

	public static void main(String[] args) {

		

		UserManager userManager = new UserManager();

		for (User user : userManager.getAll()) {
			userManager.add(user);
			userManager.update(user);
			userManager.delete(user);
		}
		
		InstructorManager instructorManager=new InstructorManager();
		
		for (Instructor instructor : instructorManager.getAll()) {
			instructorManager.add(instructor);
			instructorManager.update(instructor);
			instructorManager.delete(instructor);
		}
		
		StudentManager studentManager=new StudentManager();
		
		for (Student student : studentManager.getAll()) {
			studentManager.add(student);
			studentManager.update(student);
			studentManager.delete(student);
		}
		

	}
}
