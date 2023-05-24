package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"a","b","c","d","e","f"};
		
		int n = 1;
		double start, end;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임시작(엔터)");
		sc.nextLine();
		start = System.currentTimeMillis(); // 게임시작 시간측정
		while (n <= 6) {
			int ran = (int)(Math.random()*words.length);
			System.out.println("문제"+n);
			String question = words[ran];
			System.out.println(question); // 문제표시
			
			String answer = sc.nextLine();
			if (answer.equals(question)) {
				System.out.println("통과!");
				n++;
			}else {
				System.out.println("오타 다시도전");
			}
		}
		end = System.currentTimeMillis();
		System.out.printf("게임시간 %.2f",(end-start)/1000);
		sc.close();
	}

}
