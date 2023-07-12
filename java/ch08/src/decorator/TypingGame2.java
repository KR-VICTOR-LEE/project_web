package decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame2 {

	public static void main(String[] args) {
		String[] words = null;
		String data = null;
		
		try(FileReader fr = new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr)){
			while(true) {
				data = br.readLine();
				if(data == null) break;
				words = data.split(" ");
			}
			//int rand = (int)(Math.random()*words.length);
			//System.out.println(words[rand]);
			
			int n = 1;  //문제 번호
			double start, end;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("영어타자 게임, 준비되면 엔터!");
			scan.nextLine(); //엔터
			start = System.currentTimeMillis();  //게임시작
			//System.out.println(start);
			while(n < 11) {
				System.out.println("문제" + n);
				int rand = (int)(Math.random()*words.length);
				String question = words[rand]; //문제 생성(랜덤)
				System.out.println(question);  //문제 출력
				 
				String answer = scan.nextLine(); //사용자 입력
				if(answer.equals(question)) { //입력이 문제와 일치하면
					System.out.println("통과!!");
					n++;
				}else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();  //게임 종료
			System.out.printf("게임 소요 시간은 %.2f초입니다.", (end-start)/1000);
			scan.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
