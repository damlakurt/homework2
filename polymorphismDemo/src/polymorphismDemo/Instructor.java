package polymorphismDemo;

public class Instructor extends User{
	
	    private int �nstructorNumber;
	    String branch;
	
		public Instructor() {
			
		}
		
		public Instructor(int instructorNumber, String branch) {
			super();
			this.�nstructorNumber = instructorNumber;
			this.branch = branch;
		}

		public int getInstructorNumber() {
			return �nstructorNumber;
		}

		public void setInstructorNumber(int instructorNumber) {
			�nstructorNumber = instructorNumber;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}
		
		
	}


