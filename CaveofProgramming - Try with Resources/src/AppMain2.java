import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppMain2 {
public static void main(String[] args){
	File file = new File("Test.txt");
	try(BufferedReader br = new BufferedReader(new FileReader(file))){
		String line;
		while( (line = br.readLine()) != null){
			System.out.println(line);
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Can't find text file: " + file.toString());
	} catch (IOException e) {
		System.out.println("File won't read: " +  file.toString());
	}
}
}
