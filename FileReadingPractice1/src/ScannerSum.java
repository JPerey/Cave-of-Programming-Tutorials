import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * this is to practice reading text from a file and converting to
 * int so that calculations can be done
 */
public class ScannerSum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileInput;
		// ArrayList<Integer> intList = new ArrayList<>(); // this didn't work
		// as
		// .add() couldn't
		// go from Scanner to ArrayList<Integer>

		int[] array1 = new int[4];
		int[] array2 = new int[4];
		int i = 0;

		fileInput = new Scanner(new BufferedReader(new FileReader(
				"D:/Reference Library/Coding/Eclipse/" + "Workspace/FileReadingPractice1/src/Test Variables.txt")));

		while (fileInput.hasNext()) {
			array1[i] = fileInput.nextInt();
			array2[i] = fileInput.nextInt();
			System.out.print("array1: " + array1[i]);
			System.out.println(" array2: " + array2[i]);
			i++;
		}
		fileInput.close();
	}
}
