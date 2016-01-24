
public class CitizenInitilization {
	private String name;
	private int age;
	public CitizenInitilization() {
		System.out.println("Constructor 1 running!");
		name = "Jimmy";
		age = 21;
		System.out.println(name + " : " + age );
		
	}
	
	public CitizenInitilization(String name, int age){
		System.out.println("Second constructor running!");
		this.name = name;
		System.out.println(name + " : " + age);
	
	}
}
