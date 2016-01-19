
public class Application {
	public static void main(String[] args) {
		
		int ascendingValue = 0;
		int descendingValue = 100;
		
		//the while loop will run as long as the argument inside its parameters are true
		while( ascendingValue != descendingValue){
			int difference = descendingValue - ascendingValue;
			System.out.println("Difference is " + difference);
			ascendingValue = ascendingValue + 1;
			descendingValue = descendingValue - 1;
		}
		
		
	}
}
