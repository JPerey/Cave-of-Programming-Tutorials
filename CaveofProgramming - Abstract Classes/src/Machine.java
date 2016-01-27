
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public abstract void Start();
	public abstract void DoStuff();
	public abstract void Finish();
	
	public void Run(){
		Start();
		DoStuff();
		Finish();
	}

}
