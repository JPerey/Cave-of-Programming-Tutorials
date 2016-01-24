
public class OverrideThis {
	private int jumpHeight;
	public OverrideThis(int jumpHeight){
		this.jumpHeight = jumpHeight;
	}
	public int getJumpHeight(){
		return jumpHeight;
	}
	public void jumpHigh() {
		System.out.println("We say we are jumping " + jumpHeight + " ft high");

	}
}
