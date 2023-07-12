package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:/file/test1.db");
		
		byte[] array = {10, 20, 30};
		
		os.write(array);
		
		os.close();
	}

}
