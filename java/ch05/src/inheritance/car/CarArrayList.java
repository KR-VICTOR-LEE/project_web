package inheritance.car;

import java.util.ArrayList;


public class CarArrayList {

	public static void main(String[] args) {
		ArrayList<Car> car = new ArrayList<>();
		
		Car car1 = new Car("소나타", 2500);
		Car car2 = new Car("아반떼", 1600);
		Car car3 = new Car("산타페", 2000);
		
		// 자동객체저장
		
		car.add(car1);
		car.add(car2);
		car.add(car3);
		
		
//		car.add(new Car("소나타", 2000));
//		car.add(new Car("아반떼", 1600));
//		car.add(new Car("산타페", 2000));
		
		System.out.println(car.get(0).carInfo());
		
		for (int i = 0; i <car.size(); i++) {
			Car a = car.get(i);
			System.out.println(a.carInfo());
		}
		
	}

}
