package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// Human 클래스
class Human extends Animal {
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

// Tiger 클래스
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}

// Eagle 클래스

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}

public class AnimalTset {

	public static void main(String[] args) {
		
		AnimalTset aTest = new AnimalTset();
		
		// 다형성 - 부모 타입으로 객체 형성(자동형변환)
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);

	}

	// move()메서드 를 사용할 메서드 생성 - 매개변수의 다형성
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
