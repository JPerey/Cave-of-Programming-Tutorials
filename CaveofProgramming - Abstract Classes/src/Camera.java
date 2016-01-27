
public class Camera extends Machine{
private int cameraID;
	@Override
	public void Start() {
		
		cameraID = getId();
		System.out.println("Camera # "+ cameraID+ " Starting...");
		
	}

	@Override
	public void DoStuff() {
		System.out.println("Camera # " + cameraID + " snaps photo");
		
	}

	@Override
	public void Finish() {
		System.out.println("Camera # " +cameraID + " shuts down");
		
	}
	

}
