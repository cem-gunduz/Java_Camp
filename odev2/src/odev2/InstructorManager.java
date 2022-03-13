package odev2;



public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.firstName+" eklendi");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.firstName+" güncellendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.firstName+" silindi");
	}
	public Instructor[] getAll() {

		Instructor instructor1=new Instructor(1,"Engin","Demirog");
		Instructor instructor2=new Instructor(2,"Cem","Gündüz");
		Instructor[] instuctors= {instructor1,instructor2,};

		
		
		return instuctors;
	}
}
