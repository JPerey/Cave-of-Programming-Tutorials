import java.util.Scanner;

public class stringArrayPractice {
	public static void main(String[] args) {
		String[] texts = new String[4];
		Scanner input = new Scanner(System.in);
		int i=0;
		
		for (String text : texts) {
			System.out.println("Please input some text");
			texts[i] = input.nextLine();
			i++;

		}
		
		for(String text2: texts) {
			System.out.println(text2);
		}
	}
}
