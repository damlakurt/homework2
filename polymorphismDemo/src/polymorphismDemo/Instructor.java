package polymorphismDemo;

public class Instructor extends User{
	
	    private int ýnstructorNumber;
	    String branch;
	
		public Instructor() {
			
		}
		
		public Instructor(int instructorNumber, String branch) {
			super();
			this.ýnstructorNumber = instructorNumber;
			this.branch = branch;
		}

		public int getInstructorNumber() {
			return ýnstructorNumber;
		}

		public void setInstructorNumber(int instructorNumber) {
			ýnstructorNumber = instructorNumber;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}
		
		
	}


