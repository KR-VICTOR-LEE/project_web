package fruits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나| 3.복숭아");
		System.out.println("선택>");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		Fruit fruit = null;
		if (menu == 1) {
			fruit = new Grape(); // 부모 타입(형)으로 객체 생성
		}else if (menu == 2) {
			fruit = new Banana();
			
		}else if (menu == 3) {
			fruit = new Peach();
			
		}
		fruit.showInfo();  // 각 객체의 정보 출력(가상 메서드)
		sc.close();
	}

}
