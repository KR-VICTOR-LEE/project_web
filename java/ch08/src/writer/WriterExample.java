package writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		try(Writer fw = new FileWriter("data.txt")){
			fw.write("Hello Java!\n");
			fw.write("안녕!\n");
			fw.write(66); //정수는 아스키 코드값으로 인식함
			//fw.write(1.69); //실수 사용 불가
			fw.write(10); //개행 문자(줄바꿈)
			fw.write(66+1);
			
			char[] buf = {'s', 'm', 'i', 'l', 'e'};
			fw.write(buf);
			fw.write(0);
			fw.write(buf, 1, 4);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}
}
