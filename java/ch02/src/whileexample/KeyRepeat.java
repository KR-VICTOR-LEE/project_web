package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 반복할까요 ? (y / n)");
			String key = sc.nextLine();
			if(key.equals("y")) {
				System.out.println("반복");
			}else if (key.equals("n")) {
				System.out.println("중단");
				break;
			}else {
				System.out.println("지원하지 않는 키 입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
