package decorator;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {
	public static void main(String[] args) {
		//배열을 이용하여 요소를 랜덤하게 추출하기
		String[] word = null;
		String data = null;
		
		try(FileReader fr = new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr)){
			/*while(true) {
				data = br.readLine();
				if(data == null) break;
				word = data.split(" ");
			}*/
			while((data = br.readLine()) != null) {
				word = data.split(" ");
			}
			int rand = (int)(Math.random()*word.length);
			System.out.println(word[rand]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
