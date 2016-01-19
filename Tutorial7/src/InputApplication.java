import java.util.Scanner;

public class InputApplication {
	public static void main(String[] args) {
		//this is our Scanner Object, input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a noun:");
		String noun = input.nextLine();
		System.out.println("Please enter another noun:");
		String noun2 = input.nextLine();
				System.out.println("Please enter a value:");
		int value = input.nextInt();
		
		//this turns off the scanner now that it is not used anymore
		input.close();
		
		System.out.println(noun + " has " + value + " " + noun2);
		
		
	}
}
