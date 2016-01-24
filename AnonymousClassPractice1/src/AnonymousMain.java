import java.util.*;

public class AnonymousMain {
	public static void main(String[] args) {
		int jump;
		int jumpReturn;
		Scanner input = new Scanner(System.in);
		System.out.println("How high to jump?");
		jump = Integer.parseInt(input.nextLine());

		OverrideThis override1 = new OverrideThis(jump);
		override1.jumpHigh();
		jumpReturn = override1.getJumpHeight();
		OverrideThis override2 = new OverrideThis(jump) {

			public void jumpHigh() {
				System.out.println("We are actually going to be jumping " + (jumpReturn + 5) + " ft high");
			}

		};
		override2.jumpHigh();
		override1.jumpHigh();

	}

}
