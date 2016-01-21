package personheritage;

public class Student extends Person{
	private int finalYear;
	private double gpa;
public Student(String firstName, String lastName, int finalYear, double gpa){
	super(firstName, lastName);
	this.finalYear = finalYear;
	this.gpa = gpa;
}

public void Speak(){
	System.out.println("Student Details:");
	super.Speak();
	System.out.println("year graduating: " + finalYear);
	System.out.println("final GPA: " + gpa);
}
}
