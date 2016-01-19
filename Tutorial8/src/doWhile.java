import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*A do while differs from the while loop in that it
		ALWAYS RUN at least once, since it checks the "While"
		condition after running
		*/
		int value;
		do{
			System.out.println("Enter a number:");
			value = input.nextInt();
		}
		while(value !=5);
		
		System.out.println("Got 5!");
	}
}
