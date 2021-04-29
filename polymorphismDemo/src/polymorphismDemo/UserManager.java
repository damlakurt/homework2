package polymorphismDemo;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+" " + user.getMail()+" " + user.getTelnumber()+" " + "Kullanýcý Sisteme Kaydedildi ");
	
	}
	public  void delete(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+" " + user.getMail()+" " + user.getTelnumber()+" " + "Kullanýcý Sistemden Silindi");
	}

}
