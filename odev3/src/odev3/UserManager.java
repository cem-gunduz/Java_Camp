package odev3;



public class UserManager {
	public void add(User user) {
		System.out.println(user.getName()+" eklendi");
	}
	public void update(User user) {
		System.out.println(user.getName()+" günellendi");
	}
	public void delete(User user) {
		System.out.println(user.getName()+" silindi");
	}
	public User[] getAll() {

		User user1=new User(1,"Cem","1234","Java");
		User user2=new User(2,"Mert","25","c#");
		User[] users= {user1,user2};

		return users;
	}
}
