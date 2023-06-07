package abstractex.phone;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("김기용");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
	}

}
