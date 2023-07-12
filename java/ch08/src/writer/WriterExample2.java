package writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {
	public static void main(String[] args) {
		try(Writer fw = new FileWriter("word.txt")){
			fw.write("ant");
			fw.write(32);   //스페이스(공백 문자)
			fw.write("bear");
			fw.write(32);
			fw.write("chicken");
			fw.write(32);
			fw.write("deer");
			fw.write(32);
			fw.write("elephant");
			fw.write(32);
			fw.write("frog");
			fw.write(32);
			fw.write("horse");
			fw.write(32);
			fw.write("lion");
			fw.write(32);
			fw.write("monkey");
			fw.write(32);
			fw.write("penguin");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}
}
