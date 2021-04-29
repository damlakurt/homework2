package polymorphismDemo;

public class Student extends User{
	
	private int studentNumber;
	String schoolName;
	double classroom;
	
	public Student () {
		
	}

	public Student(int studentNumber, String schoolName, double classroom) {
		super();
		this.studentNumber = studentNumber;
		this.schoolName = schoolName;
		this.classroom = classroom;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double getClassroom() {
		return classroom;
	}

	public void setClassroom(double classroom) {
		this.classroom = classroom;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	

}
