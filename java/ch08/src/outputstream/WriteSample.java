package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteSample {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:/file/test1.db");
		
		byte a = 10;
		byte b = 20;
		
		os.write(a);
		os.write(b);
		
		os.close();
		
		/*InputStream is = new FileInputStream("c:/file/test1.db");
		
		int readByte;
		while((readByte=is.read()) != -1) {
			System.out.println(readByte);
		}
		
		is.close();*/
	}

}
