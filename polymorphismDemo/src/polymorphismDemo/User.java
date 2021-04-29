package polymorphismDemo;

public class User {
	
	
	private String firstName;
	private String lastName;
	private String mail;
	private double telnumber;
	
	public User () {
		
	}

	public User(String firstName, String lastName, String mail, double telnumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.telnumber = telnumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getTelnumber() {
		return telnumber;
	}

	public void setTelnumber(double telnumber) {
		this.telnumber = telnumber;
	}
	

}
