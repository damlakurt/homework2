package polymorphismDemo;

public class Main {

	
	public static void main(String[] args) {
		Student student = new Student();
		student.setClassroom(2);
		student.setFirstName("Derin");
		student.setLastName("Ko�");
		student.setMail("derinkoc@mail.com");
		student.setSchoolName("Bursa Teknik �ni");
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
		
	
		
		
		Instructor �nstructor = new Instructor();
		�nstructor.getInstructorNumber();
		�nstructor.setBranch("Yaz�l�m");
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demirog");
		�nstructor.setMail("engindemiro@mail.com");
		�nstructor.setTelnumber(777);
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.add(�nstructor);
		�nstructorManager.delete(�nstructor);
		
	
		


	}

}
