import java.util.*;

import personheritage.*;

public class PolymorphismPrac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int classAmount = 0;
		String firstName;
		String lastName;
		int gradYear;
		double gpa;
		
		

		// Professor professor1 = new Professor("Tyene", "Sand");
		// professor1.Speak();
		// Student student1 = new Student("Ser", "Bronn", 2013, 3.7 ;__; );
		// student1.Speak();

		/*
		 * trying to understand polymorphism. will create an array that allows
		 * us to add in values from other classes into the parent class( for
		 * names)
		 * 
		 */
		System.out.println("How many people are in this course? Please input the professor last");
		classAmount = Integer.parseInt(input.nextLine()); //inputs amount of students
		Person person[] = new Person[classAmount];

		for (int i = 0; i < person.length; i++) {//this lets me input variables into each new instance
			if (i == person.length - 1) {
				System.out.println("Please input first name of Professor");
				firstName = input.nextLine();
				System.out.println("Please input the Professors' last name");
				lastName = input.nextLine();
				person[i] = new Professor(firstName, lastName);
				break;
			}
			System.out.println("Please input first name of student #" + (i+1));
			firstName = input.nextLine();
			System.out.println("Please input the students' last name");
			lastName = input.nextLine();
			System.out.println("Please input graduating year");
			gradYear = Integer.parseInt(input.nextLine());
			System.out.println(" Please input final GPA");
			gpa = Double.parseDouble(input.nextLine());
			person[i] = new Student(firstName, lastName, gradYear, gpa);

		}
		input.close();
		for (Person perso: person){//iterates through array, and gets overwritten since 
			perso.Speak(); //not all entries are of the same class type
		}
			
		

	}
}
