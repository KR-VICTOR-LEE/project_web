package downcasting;

import java.util.ArrayList;
import java.util.Iterator;

class Animal {
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

class Human extends Animal {
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}

	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다.");
	}

	public void hunt() {
		System.out.println("호랑이가 사냥합니다.");
	}
}

class Eagle extends Animal {
		public void breathe() {
			System.out.println("독수리가 숨을 쉽니다.");
		}

		public void fly() {
			System.out.println("독수리가 하늘을 날아갑니다.");
		}
}

		public class AnimalTest {
			static ArrayList<Animal> animalList = new ArrayList<>();

			public static void main(String[] args) {

				Animal human = new Human();
				
				animalList.add(new Human()); // 0번
				animalList.add(new Tiger()); // 1번
				animalList.add(new Eagle()); // 2번
				
				System.out.println("**** 타입 변환 ****");
				testCasting();
				
				
				// 생성된 객체를 arrayList에 저장
//				animalList.add(human);
//				
//				animalList.get(0).breathe();
////				Animal animal = new Human();
//				animal.breathe();
//
//				if (animal instanceof Human) {
//					Human man = (Human) animal;
//					man.read();
//				}
	}// main
	public static void testCasting() {
		for (int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			animal.breathe();
		}
	}
			
}
	
