package odev3;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" eklendi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getName()+" günellendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getName()+" silindi");
	}
	public Instructor[] getAll() {

		Instructor instructor1 = new Instructor(1, "Engin", "1215", "Java", 30000);
		Instructor instructor2 = new Instructor(2, "Metin", "4845", "Python", 20000);
		Instructor[] instructors= {instructor1,instructor2};

		return instructors;
	}
}
