package polymorphismDemo;

public class Main {

	
	public static void main(String[] args) {
		Student student = new Student();
		student.setClassroom(2);
		student.setFirstName("Derin");
		student.setLastName("Koç");
		student.setMail("derinkoc@mail.com");
		student.setSchoolName("Bursa Teknik Üni");
		student.setTelnumber(9999);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		
		
		User  user = new User();
		user.setFirstName("Deniz");
		user.setLastName("Pala");
		user.setMail("denizpala@mail.com");
		user.setTelnumber(888);
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(student);
		
	
		
		
		Instructor ınstructor = new Instructor();
		ınstructor.getInstructorNumber();
		ınstructor.setBranch("Yazılım");
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demirog");
		ınstructor.setMail("engindemiro@mail.com");
		ınstructor.setTelnumber(777);
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(ınstructor);
		ınstructorManager.delete(ınstructor);
		
	
		


	}

}
