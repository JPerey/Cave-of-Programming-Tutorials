
public class Car extends Machine{
public void WipeWindshield(){
	System.out.println("Wiping windshield");
}

@Override
public void start() {
	System.out.println("car will start now!!");
}
}
