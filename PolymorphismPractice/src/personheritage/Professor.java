package personheritage;

public class Professor extends Person {
	public Professor (String firstName, String lastName){
		super(firstName, lastName);
	}
	
	public void Speak(){
		System.out.println("Professor Details: ");
		super.Speak();
	}

}
