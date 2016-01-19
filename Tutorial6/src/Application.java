import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jamesInt;
		
		System.out.println("What is your value?");
		jamesInt = input.nextInt();
		input.close();
		if (jamesInt < 30) {

			System.out.println("It's true!");

		} else if(jamesInt > 20) {
			System.out.println("It's not right!");
		}
	}
}
