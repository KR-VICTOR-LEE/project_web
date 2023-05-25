package virtualfunction;

public class TestA {
	// 필드
	int num;
	
	// 메서드
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		// 인스턴스(객체) - 힙 메모리 위치
		// 메서드 - 정적영역(데이터 영역) 위치 - static
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
	}
}
