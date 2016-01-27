
class Break{
	public void Start() throws Exception{
		System.out.println("Starting");
	}

	
}

public class AppMain {
	public static void main(String[] args) {

	try(Break temp1 = new Break()){
		
		System.out.println("Did this run");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	}

