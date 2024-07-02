public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double FinalGrade() {
		
		return grade1 + grade2 + grade3;
	}
	
	public String StudentApproval() {
		
		return FinalGrade() >= 60 ? "Pass!" : "Failed." + "\nMissing " + (60 - FinalGrade()) + " points!";
	}
	
	public String toString() {
		
		return "Final grade = "
				+ FinalGrade()
				+ StudentApproval();
	}

}
