
import java.util.Scanner;

public class BigButts {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name1;
		int age1;

		// first person object
		Person personStats = new Person();
		// second person object
		Person personStats2 = new Person();

		System.out.println("Hello");
		System.out.println("There");
		System.out.println("Please input your name");
		name1 = input.nextLine();
		System.out.println("Please input your age");
		age1 = Integer.parseInt(input.nextLine()); // .nextInt consumes the next
													// scanner value that comes
													// after it. nextLine();
													// doesn't do this. What I'm
													// doing
													// right now is taking in
													// the int as a String and
													// turning it into an int
		System.out.println("Now for the second person. Please input your name");
		personStats2.name = input.nextLine();
		System.out.println("Please input your age");
		personStats2.age = Integer.parseInt(input.nextLine());

		input.close();

		personStats.name = name1;
		personStats.age = age1;

		System.out.println("My name is " + personStats.name);
		System.out.println("My age is " + personStats.age);
		personStats.speak();
		System.out.println("for the second person");
		System.out.println("My name is " + personStats2.name);
		System.out.println("My age is " + personStats2.age);
		personStats2.speak();

	}

}
