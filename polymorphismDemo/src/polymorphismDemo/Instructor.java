package polymorphismDemo;

public class Instructor extends User{
	
	    private int żnstructorNumber;
	    String branch;
	
		public Instructor() {
			
		}
		
		public Instructor(int instructorNumber, String branch) {
			super();
			this.żnstructorNumber = instructorNumber;
			this.branch = branch;
		}

		public int getInstructorNumber() {
			return żnstructorNumber;
		}

		public void setInstructorNumber(int instructorNumber) {
			żnstructorNumber = instructorNumber;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}
		
		
	}


