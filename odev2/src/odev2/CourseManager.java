package odev2;



public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name+" eklendi");
	}
	public void update(Course course) {
		System.out.println(course.name+" güncellendi");
	}
	public void delete(Course course) {
		System.out.println(course.name+" silindi");
	}
	public Course[] getAll() {

		Course course1=new Course(1,"Java","2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",0,1);
		Course course2=new Course(2,"C#","2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",0,1);
		Course course3=new Course(3,"JavaScript","1,5 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",0,1);
		Course course4=new Course(4,"Programlamaya Giriş","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",0,1);
		Course[] courses= {course1,course2,course3,course4};

		
		
		return courses;
	}
}
