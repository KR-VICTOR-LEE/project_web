package interfaceex.remocon;

public class Main {

	public static void main(String[] args) {
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(12);
		rcTV.setMute(true);
		rcTV.turnOff();
	}

}
