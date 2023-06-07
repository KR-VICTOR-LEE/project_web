package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		searchable.search("www.naver.com");
		rc.turnOff();
	}

}
