package polymorphismDemo;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+" " + user.getMail()+" " + user.getTelnumber()+" " + "Kullan�c� Sisteme Kaydedildi ");
	
	}
	public  void delete(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+" " + user.getMail()+" " + user.getTelnumber()+" " + "Kullan�c� Sistemden Silindi");
	}

}
