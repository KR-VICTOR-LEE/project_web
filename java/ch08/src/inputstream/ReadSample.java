package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/file/test1.db");
		
		/*int readByte;
		while((readByte=is.read()) != -1) {
			System.out.println(readByte);
		}*/
		
		while(true) {
			int i = is.read();
			if(i == -1) break;
			System.out.println(i);
		}
		
		is.close();
	}

}
