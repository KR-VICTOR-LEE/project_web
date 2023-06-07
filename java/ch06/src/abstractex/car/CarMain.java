package abstractex.car;

public class CarMain {

	public static void main(String[] args) {

		Bus bus = new Bus();
		bus.run();
		bus.takePassenger();
		bus.refuel();
		bus.stop();
	}

}
