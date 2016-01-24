import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReaderMain {
	public static void main(String[] args) throws FileNotFoundException {

		// String fileName = "D:/Reference
		// Library/Coding/Eclipse/workspace/ScannerReaderPractice1/src/Example.txt";
		String fileName = "Example.txt";

		File textFile = new File(fileName);
		Scanner fileInput = new Scanner(textFile);
		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			System.out.println(line);
		}
		fileInput.close();
	}
}
