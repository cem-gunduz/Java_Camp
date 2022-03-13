package odev3;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getName()+" eklendi");
	}
	public void update(Student student) {
		System.out.println(student.getName()+" günellendi");
	}
	public void delete(Student student) {
		System.out.println(student.getName()+" silindi");
	}
	public Student[] getAll() {

		Student student1=new Student(1,"Cem","1234","Java","Erkek");
		Student student2=new Student(2,"Alp","2545","c#","Kadın");
		Student[] students= {student1,student2};

		return students;
	}
}
