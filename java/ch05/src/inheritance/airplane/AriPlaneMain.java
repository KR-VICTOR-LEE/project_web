package inheritance.airplane;

public class AriPlaneMain {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		sa.land();
		
		// 초음속 비행
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		
		// 비행모드
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
